import java.util.Scanner;
import java.lang.Exception;
import java.io.*;

class fibonnaci extends Thread {
    static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    for(

    int i = 0;i<500;i++)
    {
        System.out.println(fib(i));
    }

}

class prime extends Thread{
    for(int i =1;i<500;i++){
        int flag =1;
        for(int j=2;j<i;j++){
            if(i%j==0){
                flag =0;
            }
        }
        if(flag == 0){
            System.out.println(i);
        }
    }
}

class common extends Thread{
    for(int i=0;i<500;i++){
        if(isPrime(i) && fib(i)){
            System.out.println(i);
        }
    }
}

public class ThreeThreads {
    public static void main(String args[]){

    }
}
