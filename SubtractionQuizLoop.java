
package subtractionquizloop;

import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        final int NUM_OF_QUISTION =5;
        int correct_count = 0;
        int count = 0;
        long stime = System.currentTimeMillis();
        String output = " ";
        
        while(count<NUM_OF_QUISTION){
            
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            
            if (num1<num2){
                 int q = num1;
                 num1 = num2;
                 num2 = q;
            }
            System.out.print("What is " + num1 + " – " + num2 + "? ");
            int answer = in.nextInt();
            
        if (num1-num2 == answer){
            System.out.println("You are correct!");
            correct_count++;
        }else {
            System.out.println("Your answer is wrong.\n" + num1+ " – " + num2 + " should be " + (num1 - num2));
            count++;
            
            output += "\n" + number1 + "–" + number2 + "=" + answer +((number1 – number2 == answer) ? " correct": " wrong");
        }
          long etime = System.currentTimeMillis();
          int ttime = stime-etime; 
          
            System.out.println("Correct count is " + correct_count +"\nTest time is " + ttime / 1000 + " seconds\n" ); 
            
       }
    }
}
