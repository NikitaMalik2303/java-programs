import java.util.Scanner;
import java.lang.Exception;
import java.io.*;

class student implements Serializable {
    int rollno;
    char grade;
    int percentage;

    student(int a, char c, int b) {
        rollno = a;
        grade = c;
        percentage = b;
    }

    void display() {
        System.out.println(rollno + "  " + grade + "  " + percentage);
    }
}

public class empFile {
    public static void main(String args[]) throws Exception {
        File f = new File("Abc.txt");

        if (!f.exists()) {
            f.createNewFile();
        }

        ObjectOutputStream oob = new ObjectOutputStream(new FileOutputStream((f)));
        student s = new student(40, 'O', 100);
        oob.writeObject(s);

        oob.close();

        ObjectInputStream ooi = new ObjectInputStream(new FileInputStream(f));
        student c = (student) ooi.readObject();
        System.out.println(c.rollno);

    }
}
