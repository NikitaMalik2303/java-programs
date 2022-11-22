import java.util.Scanner;

public class negativeArraySize {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = -9;
        System.out.println("Enter the sixe of array");
        //n = sc.nextInt();
        try{
            if(n<0){
                throw new MyException();
            }
            System.out.println("Valid array Size");
        }
        catch(MyException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Exiting");
        }
        
    }
}

class MyException extends Exception{
    public String toString(){
        return "Array size is less than 0";
    }
}
