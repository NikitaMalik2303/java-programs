import java.util.Scanner;

class Words{
    static int count(String str){
        String arr[] = str.split(" ");
        int len = arr.length;
        return len;
    }
}

class Tutor {
    Scanner sc = new Scanner(System.in);;
    String S;
    long time;
    int error;

    Tutor() {
        time = 0;
        error = 0;
        S = "";
    }

    void Practice() {
        System.out.println("Welcome to practice");
        System.out.println("Type the text displayed below: ");
        //String arr
        String arr[] = new String[5];
        arr[0] = "Education is an important tool which is very useful in everybodys life.";
        arr[1] = "An education is the most powerful weapon you can possibly have, and with it, you can make all of your dreams come true.";
        arr[2] = "Education is something that’s not only needed on a personal level, but also on a global level.";
        arr[3] = "Your level of education is often considered a way to prove your knowledge";
        arr[4] = "Education can mold people into functional members of society with the right kinds of values.";

        int randomNum = (int)Math.floor(Math.random()*5);

        String str = arr[randomNum];
        int wordsCount = Words.count(str);

        System.out.println(str);
        long start = System.currentTimeMillis();
        S = sc.nextLine();
        long end = System.currentTimeMillis();
        time = end - start;
        error = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != S.charAt(i)) {
                error++;
            }
        }
        System.out.println("Number of Errors: " + error);
        System.out.println("Time taken: " + time);
        double speed = (((double)wordsCount/time)*1000*60);
        System.out.println("Words per minute typed : " + speed);
        return;
    }

    void Test() {
        System.out.println("All the Best for your Test.");
        System.out.println("Type the text displayed below: ");
        
        //String arr
        String arr[] = new String[5];
        arr[0] = "Education is an important tool which is very useful in everybodys life.";
        arr[1] = "An education is the most powerful weapon you can possibly have, and with it, you can make all of your dreams come true.";
        arr[2] = "Education is something that’s not only needed on a personal level, but also on a global level.";
        arr[3] = "Your level of education is often considered a way to prove your knowledge";
        arr[4] = "Education can mold people into functional members of society with the right kinds of values.";

        int randomNum = (int)Math.floor(Math.random()*5);

        String str = arr[randomNum];
        int wordsCount = Words.count(str);

        System.out.println(str);
        long start = System.currentTimeMillis();
        S = sc.nextLine();
        long end = System.currentTimeMillis();
        time = end - start;
        error = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != S.charAt(i)) {
                error++;
            }
        }

        if (error > 0) {
            System.out.println("Test FAILED!!");
            System.out.println("Number of Errors: " + error);
        } else {
            System.out.println("Test PASSED!!");
        }
        System.out.println("Time taken: " + time + " milliseconds");
        double speed = (((double)wordsCount/time)*1000*60);
        System.out.println("Words per minute typed : " + speed);
        return;
    }

    void Tips() {
        System.out.println("Better Learning Tips: ");
        System.out.println("\n1. Use the correct starting positions for your fingers.");
        System.out.println("2. Don't look down at your hands.");
        System.out.println("3. Maintain good Posture.");
        System.out.println("4. Find a comfortable position for your hands.");
        System.out.println("5. Your speed is: " + time + " milliseconds. You can improve your speed with practice.");
        System.out.println("You made " + error + " errors. You can improve your accuracy.");
        return;
    }

}

class Typing_Tutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Typing Tutor !!");
        System.out.println("Enter 1 to start Learning");
        int ch = sc.nextInt();
        while (ch == 1) {
            
            System.out.println("Enter:\n1 to take Typing Test\n2 to Practice Typing");
            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    int x = 1;
                    while (x == 1) {
                        Tutor T = new Tutor();
                        T.Test();
                        System.out.println("Enter 1 to take a test again: ");
                        x = sc.nextInt();
                    }

                    System.out.println("Enter 0 to get better learning tips: ");
                    x = sc.nextInt();

                    if (x == 0) {
                        Tutor T = new Tutor();
                        T.Tips();
                    }
                    break;
                }

                case 2: {
                    int x = 1;
                    while (x == 1) {
                        Tutor T = new Tutor();
                        T.Practice();
                        System.out.println("Enter 1 to practice again: ");
                        x = sc.nextInt();
                    }

                    System.out.println("Enter 0 to get better learning tips: ");
                    x = sc.nextInt();

                    if (x == 0) {
                        Tutor T = new Tutor();
                        T.Tips();
                    }
                    break;
                }

                default:
                    System.out.println("Invalid Choice. ");
            }

            System.out.println("Enter 1 to continue with Typing Tutor");
            ch = sc.nextInt();
        }
        System.out.println("Hope you had a Great Learning Experience.");

        sc.close();
    }
}
