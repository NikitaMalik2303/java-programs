// table of the number entered by the user

class table{
	public static void main(String args[]){
		int num;
		num = Integer.parseInt(args[0]);
		for(int i = 1;i<=10;i++){
			System.out.println(num +" * " + i + " = " + num*i);
		}
	}
}
 