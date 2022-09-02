//WAP a program to check wheather a number is palindrome or not

class palindrome{
	public static void main(String args[]){
		int num,lastDigit,rev = 0,orgNum;
		num = Integer.parseInt(args[0]);
		orgNum = num;
		while(num>0){
			lastDigit = num %10;
			num = num /10;
			rev = rev*10 +lastDigit ;
		}
		if(rev == orgNum){
			System.out.println("the number is a palindrome");
		}
		else{
			System.out.println("the number is not a palindrome");
		}
	}
}