
package maximum.of.two.numbers;

import java.util.Scanner;
public class MaximumOfTwoNumbers {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number :");
        int num1 = input.nextInt();
        
        System.out.println("Enter the second number :");
        int num2 = input.nextInt();
        
        //if (num1>num2)
        if (num1>num2){
            System.out.println("This number is maximum: "+num1);
        } else if (num1<num2){
            System.out.println("This number is maximum: "+num2);
            
                    }else {
            System.out.println("This numbers are equal");
           
        }
        
    }
    
}
