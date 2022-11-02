import java.util.Scanner;

public class StringProblem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String num ;
        num = sc.nextLine();
        String areaCode, token1, token2;
        areaCode = num.substring(0,3);
        token1 = num.substring(3, 6);
        token2 = num.substring(6, 10);
        System.out.println("AreaCode : " + areaCode);
        System.out.println("Token 1 : " + token1);
        System.out.println("Token 2 : " + token2);
    }
}
