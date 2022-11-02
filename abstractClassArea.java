import java.util.Scanner;

abstract class areaOfShapes{
    abstract void area (double a, double b);
}

class rectangle extends areaOfShapes{
    void area(double a,double b){
        System.out.println("The area of the rectangle is " + (a*b));
    }
}

class circle extends areaOfShapes{
    void area(double rad,double pi){
        System.out.println("The area of the circle is " + (pi*rad*rad));
    }
}

public class abstractClassArea {
    public static void main(String args[]){
        areaOfShapes r;
        rectangle a = new rectangle();
        circle b = new circle();
        r = a;
        r.area(4,5);
        r = b;
        r.area(7,Math.PI);

    }
}
