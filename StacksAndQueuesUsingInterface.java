import java.util.Scanner;

interface stackAndQueue{
    void push(int num);
    int pop();
    int peek();
    void display();
}

class stack implements stackAndQueue{
    int top;
    int arr[];
    int n;
    stack(int n){
        top = -1;
        this.n = n;
        arr = new int[n];
    }
    public void push(int num){
        if(top==n){
            System.out.println("The stack is full");
            return;
        }
        arr[++top] = num;
    }
    public int pop(){
        if(top==-1){
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(top==-1){
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[top];
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i] + " ");
        }
    }
}

class queue implements stackAndQueue{
    int front,rear;
    int arr[];
    int n;
    queue(int n){
        front =rear = -1;
        this.n = n;
        arr = new int[n];
    }
    public void push(int num){
        if(rear==n){
            System.out.println("The stack is full");
            return;
        }
        arr[++rear] = num;
    }
    public int pop(){
        if(front==-1){
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[front--];
    }
    public int peek(){
        if(front==-1){
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[front];
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i] + " ");
        }
    }
}


public class StacksAndQueuesUsingInterface {
    public static void main (String args[]){
        stackAndQueue r;
        stack a = new stack(10);
        queue b = new queue(10);
        r =a;
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.pop());
        a.display();

    }
}
