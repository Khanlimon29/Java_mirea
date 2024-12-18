public class Main {
    public static void main(String[] args) {
        Directory rootDirectory = new Directory("Root");

        Directory subDirectory1 = new Directory("Sub Directory 1");
        Directory subDirectory2 = new Directory("Sub Directory 2");
        Directory subDirectory3 = new Directory("Sub Directory 3");

        File file1 = new File("File A.txt");
        File file2 = new File("File B.txt");
        File file3 = new File("File C.txt");
        File file4 = new File("File D.txt");
        File file5 = new File("File E.txt");
        File file6 = new File("File F.txt");
        File file7 = new File("File G.txt");

        rootDirectory.add(file1);
        rootDirectory.add(file7);

        rootDirectory.add(subDirectory1);

        subDirectory1.add(file2);
        subDirectory1.add(file3);

        subDirectory1.add(subDirectory2);

        subDirectory2.add(file4);

        subDirectory2.add(subDirectory3);

        subDirectory3.add(file5);
        subDirectory3.add(file6);

        rootDirectory.showDetails("");
    }
}