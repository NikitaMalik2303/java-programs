// WAP to print factorial of a given number

class findFactorial{
	public static void main(String args[]){
		int num,fact=1;
		num = Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++){
			fact *= i;
		}
		System.out.println("the factorial of the given number is " + fact);
	}
}