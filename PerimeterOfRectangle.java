
package perimeter.of.rectangle;

import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the length of rectangle:");
        double length = input.nextDouble();
        
        System.out.println("Enter the width of rectangle:");
        double width = input.nextDouble();
        
        double perimeter = (width + length) * 2;
        
        System.out.println("the perimeter of rectangle is:" +perimeter);
        
    }
    
}
