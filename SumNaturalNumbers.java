
package sum.natural.numbers;

import java.util.Scanner;

public class SumNaturalNumbers {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a natural number please :");
        
        int n = input.nextInt();
        int sum =0;
        
        //for(int i =1; i<=n; i++)
        for(int i =1; i<=n; i++){
            sum +=i;
        }
        System.out.println("The sum of first ("+n+")natural number is:"+sum );
    
        
    }
    
}
