import java.util.Scanner;

class result{
    Scanner sc = new Scanner(System.in);
    int smarks[][] = new int[3][3];
    int hmarks[] = new int[3];
    result(){

    }
    public
    void getdata(){
        for(int i=0;i<3;i++){
            System.out.println("Enter the value of "+(i+1)+"th student");
            for(int j=0;j<3;j++){
                smarks[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            hmarks[i]=0;
            for(int j=0;j<3;j++){
                hmarks[i] +=smarks[i][j];
            }
        }
    }
    void shighest(){
        for(int i=0;i<3;i++){
            int highest = smarks[0][i];
            int rollno =0;
            for(int j=0;j<3;j++){
                if(smarks[j][i]>highest){
                    highest = smarks[j][i];
                    rollno = j;
                }
            }
            System.out.println("The highest marks for "+(i+1)+"th subject is "+highest+" obtained by rollno "+ rollno);
        }
    }
    void thighest(){
        int highest = hmarks[0];
        int rollno =0;
        for(int i=0;i<3;i++){
            if(hmarks[i]>highest){
                highest = hmarks[i];
                rollno =i;
            }
        }
        System.out.println("The highest marks are obtained by student "+ rollno+" whose marks are "+ highest);
    }
}

class marks {
    public static void main(String args[]){
        result r = new result();
        r.getdata();
        r.shighest();
        r.thighest();
    }
}
