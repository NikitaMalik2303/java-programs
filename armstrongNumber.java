import java.util.Scanner;
class armstrongNumber {
    public static void main(String args[]){
        int a,lastdigit,sum,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        a= sc.nextInt();
        c=a;
        sum=0;
        while(a>0){
            lastdigit = a%10;
            a = a/10;
            sum+=lastdigit*lastdigit*lastdigit;
        }
        if(sum==c){
            System.out.println("it is an armstrong number"); 
        }
        else{
            System.out.println("it is not an armstrong number");
        }
    }    
}
