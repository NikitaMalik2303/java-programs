import java.util.Scanner;
import java.io.*;
import java.lang.Exception;

class OnlyExt implements FilenameFilter {
    String ext;

    OnlyExt(String ext) {
        this.ext = ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

public class displayFiles {
    public static void main(String args[]) throws Exception {
        File f = new File("D:\\class");
        FilenameFilter on = new OnlyExt("er");
        String arr[] = f.list(on);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
