import java.util.Scanner;
class die{
    double sideUp;
    public
    double getSideUp(){
        return sideUp;
    }
    void roll(){
        sideUp = Math.floor(Math.random()*6+1) ;
    }
}

class dice {
    
    public static void main(String args[]){
        die a =new die();
        die b = new die();
        a.roll();
        b.roll();
        double x = a.getSideUp() + b.getSideUp();
        System.out.println(x);
    }

}
