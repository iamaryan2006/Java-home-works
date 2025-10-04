
package monetary.units;

import java.util.Scanner;

public class MonetaryUnits {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter amount ($)");
        double amount =input.nextDouble();
        
        int remainingAmount = (int)Math.round(amount*100);
        
        int dollars = remainingAmount/100;
        remainingAmount%=100;
        
        int quarters = remainingAmount/25;
        remainingAmount%=25;
        
        int dimes = remainingAmount/10;
        remainingAmount%=10;
        
        int nickels = remainingAmount/5;
        remainingAmount%=5;
        
        int pennies = remainingAmount;
        
        
        System.out.println("dollars"+dollars);
        System.out.println("quarters"+quarters);
        System.out.println("dimes"+dimes);
        System.out.println("nickels"+nickels);
        System.out.println("pennies"+pennies);
    }
    
}
