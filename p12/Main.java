public class Main {
    public static void main(String[] args) {
        IGUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            factory = new WinGUIFactory();
        } 
        else {
            factory = new MacGUIFactory();
        }

        Application app = new Application(factory);
        app.render();
    } 
}
