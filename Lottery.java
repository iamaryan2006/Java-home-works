
package lottery;

import java.util.Scanner;
import java.util.Random;

public class Lottery {

    
    public static void main(String[] args) {
       
       
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int lottery =rand.nextInt(90)+10;
        
          System.out.println("write a number (2 digit)");
        int number = input.nextInt();
        
        int lotteryD1 = lottery/10;
        int lotteryD2 = lottery%10;
        int numberD1 = number/10;
        int numberD2 = number%10;
        
        System.out.println("the lottery number is : "+lottery);
        
        
        if(number == lottery){
            System.out.println("you win 10000$");
           
        }else if ((lotteryD1==numberD2)&&(lotteryD2==numberD1)){
             System.out.println("you win 3000$");
            
        }else if ((lotteryD1==numberD2)||(lotteryD1==numberD1)||(lotteryD2==numberD2)||(lotteryD2==numberD1)){
            System.out.println("you win 1000$");
            
        }else {
            System.out.println("Unfortunately you lost!");
        }
        
    }
    
}
