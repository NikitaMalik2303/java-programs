import java.util.Scanner;

class digits {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int num;
        System.out.println("Enter a three digit number");
        num = sc.nextInt();
        int arr[] = new int[3];
        int j=0;
        while(num>0){
            arr[j++]= num%10;
            num = num/10;
        }
        if(arr[2]+arr[1]==arr[0]){
            for(int i=1;i<=arr[0];i++){
                if(arr[0]%i==0){
                    System.out.print(i+"\t");
                }
            }
            System.out.println();
        }
        else{
            System.out.println(arr[1]+arr[2]);
        }
    }
}
