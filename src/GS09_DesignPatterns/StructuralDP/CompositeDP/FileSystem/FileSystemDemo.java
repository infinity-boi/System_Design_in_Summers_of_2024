package GS09_DesignPatterns.StructuralDP.CompositeDP.FileSystem;

public class FileSystemDemo {
    public static void main(String[] args) {
        // Creating individual files
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");

        // Creating directories and adding files to them
        Directory dir1 = new Directory("dir1");
        dir1.addComponent(file1);

        Directory dir3 = new Directory("dir2");
        dir3.addComponent(file3);
        dir3.addComponent(file4);

        Directory dir2 = new Directory("dir3");
        dir2.addComponent(dir3);
        dir2.addComponent(file2);

        // Creating the root directory and adding other directories and files to it
        Directory rootDir = new Directory("root");
        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);

        // Showing the details of the file system
        rootDir.showDetails();
    }
}

