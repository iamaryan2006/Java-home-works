package guessing.numbers;

import java.util.Scanner;

public class GuessingNumbers {

    public static void main(String[] args) {
       
        int com = (int)(Math.random()*100);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a guess number between 0-100");
        
        int num = 1;
        while(num!=com){
            System.out.println("Enter your guess");
          
        num = in.nextInt();
        
        if (num==com)
            System.out.println("your guess is correct number was "+com);
        else if(num>com)
            System.out.println("your guess is higher than number");
        else if(num<com)
            System.out.println("your guess is lower than number");
        }
        
    }
    
}
