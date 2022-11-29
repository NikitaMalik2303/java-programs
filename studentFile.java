import java.util.Scanner;
import java.lang.Exception;
import java.io.*;

class student {
    int regno;
    String name;
    int marks;

    student(int a, String b, int c) {
        regno = a;
        name = b;
        marks = c;
    }

    student() {

    }
}

public class studentFile {
    public static void main(String args[]) throws Exception, IOException {
        File f = new File("Abc.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        FileReader fin = new FileReader(f);
        BufferedReader bf = new BufferedReader(fin);
        String str;
        student arr[] = new student[3];
        int indx = 0;
        while ((str = bf.readLine()) != null) {
            String a[] = new String[3];
            a = str.split(":");
            arr[indx++] = new student(Integer.parseInt(a[0]), a[1], Integer.parseInt(a[2]));
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < 3; j++) {
                if (arr[i].marks < arr[i].marks) {
                    student c = new student();
                    c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }

        System.out.println(arr[0].name + "  " + arr[0].marks + "  " + arr[0].regno);
    }
}
