// check if  a year is a leap year or not

class leapYear{
	public static void main(String args[]){
	int year;
	Scanner in = new Scanner(System.in);
	System.out.println("enter the year");
	year = in.nextInt();
	boolean flag ;
	if(year%4 == 0){
		flag = true;
	}
	else{
		if(year % 100 !=0){
			flag = true;
		}
		else{
			if(year%400!=0){
				flag = false;
			}
			else{
				flag = true;
			}
		}
	}
}

