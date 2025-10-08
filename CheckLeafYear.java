
package check.leaf.year;

import java.util.Scanner;

public class CheckLeafYear {

    public static void main(String[] args) {
       
        System.out.println("please enter year :");
         Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        
       if(year%100!=0 && year%4==0||year%400==0){
        System.out.println(year+" is a leaf year");}
       
       else {System.out.println("sorry it is not a leaf year");}
       
        
    }
    
}
