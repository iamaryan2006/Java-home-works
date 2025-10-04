
package chinese.zodiac;

import java.util.Scanner;

public class ChineseZodiac {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
         
         System.out.println("Enter your birth year... ");
         int year = input.nextInt();
         
         switch (year%12){
             case 0: System.out.println("You were born in the year of (monkey)"); break;
             case 1: System.out.println("You were born in the year of (rooster)"); break;
             case 2: System.out.println("You were born in the year of (dog)"); break;
             case 3: System.out.println("You were born in the year of (pig)"); break;
             case 4: System.out.println("You were born in the year of (rat)"); break;
             case 5: System.out.println("You were born in the year of (ox)"); break;
             case 6: System.out.println("You were born in the year of (tiger)"); break;
             case 7: System.out.println("You were born in the year of (rabbit)"); break;
             case 8: System.out.println("You were born in the year of (drgon)"); break;
             case 9: System.out.println("You were born in the year of (snake)"); break;
             case 10: System.out.println("You were born in the year of (horse)"); break;
             case 11: System.out.println("You were born in the year of (sheep)");
         }
         
         
    

    }
}