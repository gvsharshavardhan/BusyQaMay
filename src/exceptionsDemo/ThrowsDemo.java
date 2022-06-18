package exceptionsDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

    public static void fileHandle() throws FileNotFoundException {
        File f = new File("abcd.txt");
        FileInputStream fis = new FileInputStream(f);
    }

    public static void main(String[] args) {
        try {
            fileHandle();
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        }
    }
}
