import java.util.Scanner;
class areaAndCircumference {
    public static void main(String args[]){
		int length,breadth,area,perimeter;
        Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		breadth = sc.nextInt();
		area = length*breadth;
		perimeter = 2*(length + breadth);
		System.out.println("the length of the rectangle is "+ length);
		System.out.println("the breadth of the reactangle is "+ breadth);
		System.out.println("the area of the rectangle is "+ area);
		System.out.println("the perimeter of the rectangle is " + perimeter);
	}
}
