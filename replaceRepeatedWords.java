import java.util.Scanner;

public class replaceRepeatedWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a;
        char b;
        a = sc.nextLine();
        b = sc.next().charAt(0);
        char arr[] = a.toCharArray();
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            int index = a.lastIndexOf(c);
            
            if(index!=i && index!=-1){
                arr[index] = b;
            }
        }
        a = new String(arr);
        System.out.println(a);
    }
}
