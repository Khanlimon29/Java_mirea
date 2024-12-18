import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class RandomHTTP {
    private static final int PORT = 33;
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Random Number HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());

        String line = in.readLine();
        if (line == null) return;

        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String path = requestParts[1];

        if (method.equals("GET") && path.startsWith("/random")) {
            handleRandomNumberRequest(path, out);
        } else {
            handleNotFound(out);
        }

        out.flush();
    }

    private static void handleRandomNumberRequest(String path, PrintWriter out) {
        try {
            Map<String, String> queryParams = parseQueryParams(path);
            if (!queryParams.containsKey("min") || !queryParams.containsKey("max")) {
                sendHttpResponse(out, 400, "<html><body><h1>Missing parameters</h1></body></html>");
                return;
            }

            int min = Integer.parseInt(queryParams.get("min"));
            int max = Integer.parseInt(queryParams.get("max"));

            if (min > max) {
                sendHttpResponse(out, 400, "<html><body><h1>Invalid range: min > max</h1></body></html>");
                return;
            }

            int randomNum = new Random().nextInt(max - min + 1) + min;
            sendHttpResponse(out, 200, "<html><body><h1>Случайное число: " + randomNum + "</h1><h2>Разработал: Ахметов Алихан Солтанович, Шифр: 22И0134</h2></body></html>");
        } catch (NumberFormatException e) {
            sendHttpResponse(out, 400, "<html><body><h1>Invalid parameters</h1></body></html>");
        }
    }

    private static Map<String, String> parseQueryParams(String path) {
        Map<String, String> queryParams = new HashMap<>();
        int queryStart = path.indexOf("?");
        if (queryStart == -1) return queryParams;

        String query = path.substring(queryStart + 1);
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) {
                queryParams.put(keyValue[0], keyValue[1]);
            }
        }
        return queryParams;
    }

    private static void handleNotFound(PrintWriter out) {
        sendHttpResponse(out, 404, "<html><body><h1>404 Not Found</h1></body></html>");
    }

    private static void sendHttpResponse(PrintWriter out, int statusCode, String body) {
        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/html; charset=UTF-8");
        out.println("Content-Length: " + body.getBytes(StandardCharsets.UTF_8).length);
        out.println();
        out.println(body);
    }

}
