import java.util.Scanner;

class student{
    static Scanner in = new Scanner(System.in);
    int regNo;
    String firstName;
    String lastName;
    String degree;
    student(){
        System.out.println("enter the details");
        regNo = in.nextInt();
        in.nextLine();
        firstName = in.nextLine();
        lastName = in.nextLine();
        degree = in.nextLine();
    }
    static void search(student arr[],int n){
        String fName ;
        fName = in.nextLine();
        for(int i=0;i<n;i++){
            if(arr[i].firstName.equals(fName) || arr[i].lastName.equals(fName)){
                System.out.println("Student found");
                return;
            }
        }
        System.out.println("Student not found");

    }

}

public class StringSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student arr[] = new student[n];
        for(int i = 0;i<n;i++){
            arr[i] = new student();
        }
        student.search(arr, n);
    }
}
