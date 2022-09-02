// program to display area of a rectangle

class area{
	public static void main(String args[]){
		int length,breadth,area,perimeter;
		length = Integer.parseInt(args[0]);
		breadth = Integer.parseInt(args[1]);
		area = length*breadth;
		perimeter = 2*(length + breadth);
		System.out.println("the length of the rectangle is "+ length);
		System.out.println("the breadth of the reactangle is "+ breadth);
		System.out.println("the area of the rectangle is "+ area);
		System.out.println("the perimeter of the rectangle is " + perimeter);
	}
}	