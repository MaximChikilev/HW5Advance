import java.io.*;
import java.util.Arrays;

public class FileManager {
    public static boolean checkingFilesForIdentity(File firstFile, File secondFile) {
        long f1 = firstFile.length();
        long f2 = secondFile.length();

        if (firstFile.length() == secondFile.length()) {
            byte[] firstFileArray = new byte[400];
            byte[] secondFileArray = new byte[400];
            try (InputStream firstInputStream = new FileInputStream(firstFile); InputStream secondInputStream = new FileInputStream(firstFile)) {
                while (firstInputStream.read(firstFileArray) != -1) {
                    secondInputStream.read(secondFileArray);
                    if (!Arrays.equals(firstFileArray,secondFileArray)) return false;

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else return false;
        return true;
    }
}
