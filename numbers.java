// input 10 numbers and print the number of positive , negative and zero numbers

class numbers{
	public static void main(String args[]){
		int arr[];
		arr = new int[10];
		for( int i=0;i<10;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		int posNum=0, negNum=0 , zeroNum=0 ;
		for(int i=0;i<10;i++){
			if(arr[i]==0){
				zeroNum++;
			}
			else if( arr[i]>0){
				posNum ++;
			}
			else{
				negNum++;
			}
		}
		System.out.println("the number of positive integers is "+ posNum);
		System.out.println("the number of negative integers is " + negNum);
		System.out.println("the number of zero numbers is " + zeroNum);
	}
}
