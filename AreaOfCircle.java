
package area.of.circle;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the radius of circle:");
        
       double radius = input.nextDouble();
       double Area = radius * radius * 3.14159;
       
        System.out.println("the area of circle is:"+Area);
              
    }
    
}
