package recognizing.a.phone.number;

import java.util.Scanner;
public class RecognizingAPhoneNumber {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an afghan phone number: \nfor example 07XXXXXXXX");
    
       int n = input.nextInt();
      
       switch (n/10000000){
       
           case 78 : System.out.println("0"+n+" is an ETISALAT number ! ");break;
           case 73 : System.out.println("0"+n+" is an ETISALAT number ! ");break;
           case 76 : System.out.println("0"+n+"  is an ATOMA number ! ");break;
           case 77 : System.out.println("0"+n+"  is an ATOMA number ! ");break;
           case 70 : System.out.println("0"+n+"  is an AWCC number ! ");break;
           case 71 : System.out.println("0"+n+" is an AWCC number ! ");break;
           case 79 : System.out.println("0"+n+" is an ROSHAN number ! ");break;
           case 72 : System.out.println("0"+n+" is an ROSHAN number ! ");break;
           case 74 : System.out.println("0"+n+" is an SALAM number ! ");break;
           case 75 : System.out.println("0"+n+" is an A-TELLCOM number ! ");
           default : System.out.println("incorrect entry !\nplease try again.");
        }
    
    }
}
