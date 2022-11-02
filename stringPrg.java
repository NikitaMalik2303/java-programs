import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class stringOperations{
    static void compare(String a , String b){
        int res = a.compareTo(b);
        System.out.println(res);
        if(res == 0){
            System.out.println("Both the strings are equal");
        }
        else if(res<0){
            System.out.println("String a is lower than string b");
        }
        else{
            System.out.println("String a is higher than string b");
        }
    }

    static void convertTO(String str){
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                c -= 32;
            }
            else{
                c += 32;
            }
        }
        System.out.println("The new string is " + str);
    }

    static void checkSubstr(String a,String b){
        if(a.contains(b)){
            System.out.println("The given string is a substring of the second string");
        }
        else{
            System.out.println("The given string is not a substring");
        }
    }

    static void replaceSubstr(String a,String b){
        System.out.println(a.contains(b));
        if(a.contains(b)){
            String str = a.replace(b,"Hello");
            System.out.println("The new string is " + str);
        }
        else{
            System.out.println("The strings are not substrings");
        }
    }
}

public class stringPrg {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Press 1 to compare two strings");
        System.out.println("Press 2 to togggle the case of strings");
        System.out.println("Press 3 to check if a given string is a substring of the other or not");
        System.out.println("Press 4 to replace the substring with hello");
        System.out.println("Press 0 to exit");
        int ch = sc.nextInt();

        do{
            switch (ch){
                case 1:
                    String a,b;
                    a = sc.nextLine();
                    sc.nextLine();
                    b = sc.nextLine();
                    stringOperations.compare(a,b);
                    break;
                case 2:
                    String str;
                    str = sc.nextLine();
                    sc.nextLine();
                    stringOperations.convertTO(str);
                    break;
                case 3:
                    a = sc.nextLine();
                    sc.nextLine();
                    b= sc.nextLine();
                    stringOperations.checkSubstr(a,b);
                    break;
                case 4:
                    a = sc.nextLine();
                    sc.nextLine();
                    b= sc.nextLine();
                    stringOperations.replaceSubstr(a, b);
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
