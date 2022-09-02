import java.util.Scanner;
class arraySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the size of the array");
        n= sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched for");
        int key;
        key = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("the element you enetered id present at "+ i);
            }
        }

    }
}
