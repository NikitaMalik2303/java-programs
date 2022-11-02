import java.util.Scanner;
import java.util.Arrays;

public class StringAlphabeticalOrder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
