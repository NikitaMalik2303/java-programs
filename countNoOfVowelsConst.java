import java.util.Scanner;

class count{
    static int vowels,characters,words,lines;
    count(){
        vowels = characters =lines =0;
        words = 1;
    }
    static void funct(String str){
        for(char i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122 || str.charAt(i)>=65 && str.charAt(i)<=90){
                characters++;
                if(str.charAt(i)=='A' || str.charAt(i)=='a' || str.charAt(i)=='E' || str.charAt(i)=='e' || str.charAt(i)=='I' || str.charAt(i)=='i' || str.charAt(i)=='O' || str.charAt(i)=='o' || str.charAt(i)=='U' || str.charAt(i)=='u'){
                    vowels++;
                }
            }
            
            if(str.charAt(i)==32){
                words++;
            }
        }
        System.out.println("The number of characters are " + characters);
        System.out.println("The number of vowels are " + vowels);
        System.out.println("The number of words are " + words+1);
    }
    
}

class countNoOfVowelsConst{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        count.funct(str);;

        
    }

}