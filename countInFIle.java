import java.util.Scanner;
import java.lang.Exception;
import java.io.*;

class count {
    static int vowels, characters, lines, words;

    count() {
        vowels = characters = lines = words = 0;
    }

    public static void countthings(String str) {
        lines++;
        char arr[] = str.toCharArray();
        characters += arr.length;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                words++;
            } else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowels++;
            }
        }
    }

    static void display() {
        System.out.println("Words : " + words);
        System.out.println("Lines : " + lines);
        System.out.println("characters : " + characters);
        System.out.println("vowels : " + vowels);
    }
}

public class countInFIle {
    public static void main(String args[]) throws Exception {
        File f = new File("Abc.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        FileReader fin = new FileReader(f);
        BufferedReader br = new BufferedReader(fin);
        String str, alt;
        int words;
        while ((str = br.readLine()) != null) {
            count.countthings(str);
        }
        count.display();

    }
}
