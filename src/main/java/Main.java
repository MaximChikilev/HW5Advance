import java.io.File;

public class Main {
    public static void main(String[] args) {
        File firstFile;
        File secondFile;
        File anotherFile;
        if (args.length == 0) {
            firstFile = new File("./src/main/resources/Fristfile.xlsx");
            secondFile = new File("./src/main/resources/Secondfile.xlsx");
            anotherFile = new File("./src/main/resources/Anotherfile.xlsx");
        } else {
            firstFile = new File(args[0]);
            secondFile = new File(args[1]);
            anotherFile = new File(args[2]);
        }

        if (FileManager.checkingFilesForIdentity(firstFile, secondFile)) {
            System.out.println("Files are equal");
        } else System.out.println("Files aren't equal");
        if (FileManager.checkingFilesForIdentity(secondFile, anotherFile)) {
            System.out.println("Files are equal");
        } else System.out.println("Files aren't equal");
    }
}
