
package two.digits.after.decimal.point;

import java.util.Scanner;

public class TwoDigitsAfterDecimalPoint {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the price :");
        double price = input.nextDouble();
        
        System.out.println("Enter the taxrate :");
        double tax_rate = input.nextDouble();
        
        double tax = price * tax_rate;
        
        System.out.printf("your tax is : %.2f",tax);
        
    }
    
}
