import java.util.Scanner;

interface areaOfShapes{
    void area(double a , double b);
}

class rectangle implements areaOfShapes{
    public void area(double a, double b){
        System.out.println("The area of the rectangle is " + (a*b));
    }
}

class circle implements areaOfShapes{
    public void  area(double a, double b){
        System.out.println("The area of the rectangle is " + (a*b*a));
    }
}

public class interfaceArea {
    public static void main(String args[]){
        areaOfShapes r;
        rectangle a =  new rectangle();
        circle b = new circle();
        r=a;
        r.area(4, 5);
        r=b;
        r.area(7, Math.PI);
    }
}
