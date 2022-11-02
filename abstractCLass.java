import java.util.Scanner;

abstract class areaOfShapes{
    abstract void area(double a,double b);
}

class rectangle extends areaOfShapes{
    void area(double a,double b){
        System.out.println("The area of rectangle is "+(a*b));
    }
}

class triangle extends areaOfShapes{
    void area(double a,double b){
        System.out.println("The area of rectangle is "+(0.5*a*b));
    }
}

public class abstractCLass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        areaOfShapes r;
        rectangle a = new rectangle();
        triangle b = new triangle();
        r=a;
        r.area(4,5);
        r=b;
        r.area(4,5);
    }

}
