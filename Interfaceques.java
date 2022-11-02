interface areaOfShapes{
    void area(double a,double b);
}

class rectangle implements areaOfShapes{
    public void area(double a, double b){
        System.out.println("The area of the rectangle is " + (a*b));
    }
}

class triangle implements areaOfShapes{
    public void  area(double a,double b){
        System.out.println("The area of the triangle is " + (0.5*a*b));
    }
}

public class Interfaceques {
    public static void main(String args[]){
        areaOfShapes r;
        rectangle a = new rectangle();
        triangle b = new triangle();
        r=a;
        r.area(4,5);
        r=b;
        r.area(4,5);
    }
}
