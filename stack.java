import java.util.Scanner;

class stackImplementation{
    int arr[];
    int top;
    int n;
    stackImplementation(int n){
        arr=new int[n];
        top = -1;
        this.n=n;
    }
    boolean isEmpty(){
        return (top==-1);
    }
    boolean isFull(){
        return (top==n-1);
    }
    void push(int x){
        if(isFull()){
            System.out.println("Stack is Full");
            return ;
        }
        arr[++top]=x;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Overflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack Overflow");
            return -1;
        }
        return arr[top];
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        for(int i=0;i<top;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
class stack{

    public static void main(String args[]){

        stackImplementation s = new stackImplementation(10);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.display();
        s.pop();
        s.display();

    }

}