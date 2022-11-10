import java.util.Scanner;

public class stringVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        boolean flag = false;
        if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")) {
            flag = true;
        }
        if (flag = true) {
            System.out.println("Contains all the vowels");
            int a = str.indexOf("a");
            int e = str.indexOf("e");
            int i = str.indexOf("i");
            int o = str.indexOf("o");
            int u = str.indexOf("u");
            int arr[] = { a, e, i, o, u };
            int max = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.println("The maximum number of elemenst searched is " + max);

        } else {
            System.out.println("does not contain all the vowels");
        }

    }
}
