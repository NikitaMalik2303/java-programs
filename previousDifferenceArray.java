import java.util.Scanner;


class previousDifferenceArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int diff = arr[0]-arr[1];
        for(int i=2;i<n;i++){
            if(arr[i]==diff){
                System.out.print(arr[i]+"\t");
            }
            diff = arr[i-1]-arr[i];
        }
    }
}
