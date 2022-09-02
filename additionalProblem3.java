import java.util.Scanner;
class additionalProblem3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number of rows");
        n= sc.nextInt();
        int count=1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.print("\n");
        }
    }
}
