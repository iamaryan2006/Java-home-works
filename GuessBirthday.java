package guess.birthday;

import java.util.Scanner;

public class GuessBirthday {
    
    public static void main(String[] args) {
       
        String set1 =
                "01 03 05 07\n"+
                "09 11 13 15\n"+
                "17 19 21 23\n"+
                "25 27 29 31";
        
        String set2 =
                "02 03 06 07\n"+
                "10 11 14 15\n"+
                "18 19 22 23\n"+
                "26 27 30 31";
        
        String set3 =
                "04 05 06 07\n"+
                "12 13 14 15\n"+
                "20 21 22 23\n"+
                "28 29 30 31";
        
        String set4 =
                "08 09 10 11\n"+
                "12 13 14 15\n"+
                "24 25 26 27\n"+
                "28 29 30 31";
        
        String set5 =
                "16 17 18 19\n"+
                "20 21 22 23\n"+
                "24 25 26 27\n"+
                "28 29 30 31";
        
        int Day = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("is your birthday in set1 ?");
        System.out.println("set1 :\n"+set1);
        System.out.println("enter 1 for yes\nenter 0 for no");
        int answer = input.nextInt();
        if (answer == 1)
            Day += 1;
        
        System.out.println("is your birthday in set2 ?");
        System.out.println("set2 :\n"+set2);
        System.out.println("enter 1 for yes\nenter 0 for no");
         answer = input.nextInt();
        if (answer == 1)
            Day += 2;
        
        System.out.println("is your birthday in set3 ?");
        System.out.println("set3 :\n"+set3);
        System.out.println("enter 1 for yes\nenter 0 for no");
         answer = input.nextInt();
        if (answer == 1)
            Day += 4;
        
        System.out.println("is your birthday in set4 ?");
        System.out.println("set4 :\n"+set4);
        System.out.println("enter 1 for yes\nenter 0 for no");
         answer = input.nextInt();
        if (answer == 1)
            Day += 8;
        
        System.out.println("is your birthday in set5 ?");
        System.out.println("set5 :\n"+set5);
        System.out.println("enter 1 for yes\nenter 0 for no");
         answer = input.nextInt();
        if (answer == 1)
            Day += 16;
        
        System.out.println("\nyour birthday is "+Day + "!");
        
                
                        
    }
    
}
