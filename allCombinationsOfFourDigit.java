import java.util.Scanner;
class allCombinationsOfFourDigit {
    public static void main(String args[]){
        int arr[] = new int [4];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digits");
        // for(int i=0;i<4;i++){
        //     arr[i]=sc.nextInt();
        // }
        // duplication is allowed
        // int count =0;
        // for(int i=1;i<5;i++){
        //     int num =0;
        //     for(int j=1;j<5;j++){
        //         for(int k=1;k<5;k++){
        //             for(int l=1;l<5;l++){
        //                 num = i*1000+j*100+k*10+l;
        //                 System.out.println(num);
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // System.out.println("the total number of numbers is "+count);


        //duplication is not allowed
        int count =0;
        for(int i=1;i<5;i++){
            int num =0;
            for(int j=i;j<5;j++){
                for(int k=j;k<5;k++){
                    for(int l=k;l<5;l++){
                        if(i!=j && j!=k && k!=l){
                            
                        num = i*1000+j*100+k*10+l;
                        System.out.println(num);
                        count++;
                        }
                    }
                }
            }
        }
        System.out.println("the total number of numbers is "+count);


    }
}
