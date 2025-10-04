
package even.or.odd.number;

import java.util.Scanner;
public class EvenOrOddNumber {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number :");
        
        int number = input.nextInt();
        
        //if (number%2==0)
         if (number%2==0){
         System.out.println("this number is EVEN...");
         } else{
         System.out.println("this number is ODD...");
         }
         
    }
}        
    
    

