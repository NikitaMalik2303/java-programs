import java.util.Scanner;

public class concateString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextLine();
        }
        String res ="";
        for(int i=0;i<5;i++){
            res += arr[i];
        }
        System.out.println(res);
    }
}
