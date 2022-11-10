import java.util.Scanner;

class invalidRegistrationNumber extends Exception {

    public String toString(String str) {
        return "INVALID registration Number";
    }
}

public class exceptionHandling {

    static void check(int num) throws invalidRegistrationNumber {
        if (num >= 10 && num <= 100) {
            System.out.println("Valid registration number");
        } else {
            throw new invalidRegistrationNumber();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the registration number");
        int num = sc.nextInt();
        try {
            check(num);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
