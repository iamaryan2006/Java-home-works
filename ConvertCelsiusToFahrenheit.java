
package convert.celsius.to.fahrenheit;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
        System.out.println("Enter thr digree of temperature(in celsius):");
        double celsius = input.nextDouble();
        
        //in formol number.0
        double fahrenheit = (9.0/5.0)*celsius +32;
        
        System.out.println("Result: "+fahrenheit+  "digree of fahrenheit ");
        
    }
    
}
