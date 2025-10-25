package repeat.addition.until.correct;

import java.util.Scanner;

public class RepeatAdditionUntilCorrect {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N1 = (int)(Math.random() * 10);
        int N2 = (int)(Math.random() * 10);
        
        System.out.println("What is "+ N1 +"+"+N2+"?");
        int answer = in.nextInt();
        
        while(N1+N2 != answer){
            System.out.println("your answer is wrong please try agin \nWhat is "+ N1 +"+"+N2+"?");
            answer = in.nextInt();
        }
        System.out.println("you got it !");
    }
    
}
