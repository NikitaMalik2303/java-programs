import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "The number is less than 100";
    }
}
        
class program{
    public static void checkNum(int n) throws MyException{
        if(n<100){
            throw new MyException();
        }
        else{
            System.out.println("The number is greater than 100");
        }
    }
    public static void changeString(StringBuffer a,String b){
        char arr[] = b.toCharArray();
        for(int i=0;i<a.length();i++){
            for(int j=0;j<arr.length;j++){
                if(a.charAt(i)==arr[j]){
                    a.deleteCharAt(i);
                }
            }
        }
        System.out.println("The new String is " + a.toString());
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        try{
            checkNum(a);
        }
        catch(MyException e){
            System.out.println(e);
        }
        String x = sc.nextLine();
        StringBuffer str = new StringBuffer(x);
        String b = sc.nextLine();
        changeString(str,b);
    }
}