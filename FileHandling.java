import java.io.*;
import java.lang.Exception;
import java.util.Scanner;

public class FileHandling {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        File f1 = new File("Abc.txt");
        File f2 = new File("xyz.txt");

        if (!f1.exists()) {
            f1.createNewFile();
        }
        if (!f2.exists()) {
            f2.createNewFile();
        }

        int ch;
        int val;
        System.out.println("1.Write to a file");
        System.out.println("2.Read from a file");
        System.out.println("3.Copy Bytes from one file to another");

        ch = sc.nextInt();

        switch (ch) {
            case 1:
                FileOutputStream fout = new FileOutputStream(f1, true);
                System.out.println(">>");
                sc.nextLine();
                String str = sc.nextLine();
                System.out.println("dfsd");
                byte buff[] = str.getBytes();
                fout.write(buff);
                fout.write('\n');
                fout.flush();
                fout.close();
                break;
            case 2:
                FileInputStream fin = new FileInputStream(f1);
                System.out.println("Reading...");
                while ((val = fin.read()) != -1) {
                    System.out.print((char) val);
                }
                fin.close();
                break;
            case 3:
                FileInputStream fin2 = new FileInputStream(f1);
                FileOutputStream fout2 = new FileOutputStream(f2, true);
                while ((val = fin2.read()) != -1) {
                    fout2.write(val);
                }
                fin2.close();
                fout2.close();
                break;

        }
        sc.close();
    }
}
