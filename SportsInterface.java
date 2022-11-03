import java.util.Scanner;

interface sports{
    final static Scanner sc = new Scanner(System.in);
    void getNumberOfGoals();
    void dispTeam();
}

class hockey implements sports{
    int noOfGoals;
    String arr[] = new String[3];
    hockey(){
        System.out.println("Enter the details of the team members");
        for(int i =0;i<3;i++){
            arr[i] = sc.nextLine();
        }
    }
    public void getNumberOfGoals(){
        System.out.println("Enter the number of goals");
        noOfGoals = sc.nextInt();
        System.out.println("The number of goals scored by the team are "+ noOfGoals);       
    }
    public void dispTeam(){
        System.out.println("The details of the team members are :");
        for(int i =0;i<3;i++){
            System.out.println("Team member " + i +" : " + arr[i]);
        }
    }
}

class football implements sports{
    int noOfGoals;
    String arr[] = new String[3];
    football(){
        System.out.println("Enter the details of the team members");
        for(int i=0;i<3;i++){
            arr[i] = sc.nextLine();
        }
    }
    public void getNumberOfGoals(){
        System.out.println("Enter the number of goals by the given team");
        noOfGoals = sc.nextInt();
        System.out.println("the number of goals by the team are " + noOfGoals);
    }
    public void dispTeam(){
        System.out.println("The details of the team members are : ");
        for(int i=0;i<3;i++){
            System.out.println("Team member "+i+" : " + arr[i]);
        }

    }
}

public class SportsInterface {
    public static void main(String args[]){
        sports r;
        hockey a = new hockey();
        football b = new football();
        r = a;
        r.getNumberOfGoals();
        r.dispTeam();

        r=b;
        r.getNumberOfGoals();
        r.dispTeam();
    }
}
