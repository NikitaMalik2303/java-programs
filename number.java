import java.util.Scanner;
class factorial{
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}

class num{
    int val;
    num(){
        val =0;
    }
    void isStrong(){
        int n = val;
        int res=0;
        while(n>0){
            res = res + factorial.fact(n%10);
            n/=10;
        }
        if(res==val){
            System.out.println("The number is a strong number");
        }
        else{
            System.out.println("It's not a strong number");
        }
    }
    void isFriendly(int x){
        int sum1,sum2;
        sum1=sum2=0;
        for(int i=1;i<val;i++){
            if(val%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<x;i++){
            if(x%i==0){
                sum2+=i;
            }
        }
        if(sum1/val == sum2/x){
            System.out.println("It's a friendly pair");
        }
        else{
            System.out.println("It's not a friendly pair");
        }
    }
}

class number{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of n");
        n = sc.nextInt();
        num arr[] = new num[n];
        for(int i=0;i<n;i++){
            arr[i] = new num();
            int ch ;
            System.out.println("Enter the value of the attribute val");
            arr[i].val = sc.nextInt();
            System.out.println("Press 1 if you want to execute is strong function");
            System.out.println("Press 2 if you want to execute is friendly function");
            System.out.println("Press 3 if you want to execute both the functions");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    arr[i].isStrong();
                    break;
                case 2:
                    System.out.println("enter the second number");
                    int x = sc.nextInt();
                    arr[i].isFriendly(x);
                    break;
                case 3:
                    System.out.println("enter the second number");
                    x = sc.nextInt();
                    arr[i].isStrong();
                    arr[i].isFriendly(x);
                    break;
                default:
                    break;
            }
            
        }
    }
}

