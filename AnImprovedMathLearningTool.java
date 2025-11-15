
package an.improved.math.learning.tool;

import java.util.Scanner;
import java.util.Random;
public class AnImprovedMathLearningTool {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        Scanner input = new Scanner (System.in);
        
        
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);
        
        System.out.println("What is"+number1+"-"+number2+"=?");
        int answer =input.nextInt();
        
        if(answer==number1-number2){
            System.out.println("correct!");
            
        }else{
            System.out.println("wrong!\ncorrect answer is:"+(number1-number2));
            
        }
    }
    
}
