import java.util.Scanner;
import java.lang.Exception;
import java.io.*;

public class randomAceessFile {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        File f = new File("Abc.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        RandomAccessFile r = new RandomAccessFile(f, "rw");
        while (true) {
            int ch;
            System.out.println("enter choice");
            ch = sc.nextInt();
            int val;
            switch (ch) {
                case 1:
                    sc.nextLine();
                    String str = sc.nextLine();
                    // long t = r.seek();
                    // System.out.println(t);
                    r.seek(0);
                    byte b[] = str.getBytes();
                    r.write(b);
                    break;
                case 2:
                    System.out.println("REading");
                    r.seek(0);
                    while ((val = r.read()) != -1) {
                        System.out.print((char) val);
                    }
                    System.out.println();
                    break;
                case 3:
                    sc.nextLine();
                    str = sc.nextLine();
                    b = str.getBytes();
                    // System.out.println(r.length());
                    r.seek(r.length());
                    r.write(b);
                    break;
                case 4:
                    return;

            }
        }
        // r.close();
    }
}
