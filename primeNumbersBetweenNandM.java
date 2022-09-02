import java.util.Scanner;
class primeNumbersBetweenNandM {
    public static void main(String args[]){
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the two numbers");
        n = sc.nextInt();
        m = sc.nextInt();
        
        for(int i=n;i<=m;i++){
            int flag =1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                System.out.print(i+"\t");
            }
        }        
        
    }
}
