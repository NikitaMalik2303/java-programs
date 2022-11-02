import java.util.Arrays;
import java.util.Scanner;

class stringOperations{
    static void palindrome(String str){
        char array[] = str.toCharArray();
        boolean flag = true;
        for(int i=0;i<array.length;i++){
            if(array[i]!=array[array.length - i -1]){
                flag = false;
                return;
            }
        }
        if(flag){
            System.out.println("The String is a palindrome");
        }
        else{
            System.out.println("The Sting is not a palindrome");
        }
    }
    static void reverseStr(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("The string in reversed order is " + rev);
    }
    static void concat(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        String ans = str+rev;
        System.out.println("The original String and the reverse String concatenated together are " + ans);
    }
    static void alphabeticalOrder(String str){
        String rev ="";
        char array [] = str.toCharArray();
        Arrays.sort(array);
        System.out.println("The string in alphabetical order is " + (new String(array)));
    }

}

public class StringMenuDrivenPrg {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println("Press 1 to check if the input string is a palindrome or not");
        System.out.println("Press 2 to reverse the string");
        System.out.println("Press 3 to concatenate the original string and the reverse of the string");
        System.out.println("Press 4 to print the string in alphabetical order");
        System.out.println("Press 0 to exit");
        int ch = sc.nextInt();
        do{
            switch (ch){
                case 1:
                    stringOperations.palindrome(str);
                    break;
                case 2:
                    stringOperations.reverseStr(str);
                    break;
                case 3:
                    stringOperations.concat(str);
                    break;
                case 4:
                    stringOperations.alphabeticalOrder(str);
                    break;
                default :
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println("Press 0 to exit");
            ch = sc.nextInt();
        }while(ch!=0);
    }
    
}
