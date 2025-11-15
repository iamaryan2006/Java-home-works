
package finding.angle.of.triangle;

import java.util.Scanner;
public class FindingAngleOfTriangle {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter the cordinat of triangle ");
        
        System.out.println("x1");
        double x1 = input.nextDouble();
        System.out.println("y1");
        double y1 = input.nextDouble();
        System.out.println("x2");
        double x2 = input.nextDouble();
        System.out.println("y2");
        double y2 = input.nextDouble();
        System.out.println("x3");
        double x3 = input.nextDouble();
        System.out.println("y3");
        double y3 = input.nextDouble();
        
        double a = Math.sqrt(((y3-y2) * (y3-y2))+((x3-x2) * (x3-x2)));
        double b = Math.sqrt(((y3-y1) * (y3-y1))+((x3-x1) * (x3-x1)));
        double c = Math.sqrt(((y2-y1) * (y2-y1))+((x2-x1) * (x2-x1)));
        
       // double A = Math.toDegrees(Math.acos(b*b+c*c-a*a)/(2*b*c));
       // double B = Math.toDegrees(Math.acos(a*a+c*c-b*b)/(2*a*c));
       // double C = Math.toDegrees(Math.acos(b*b+a*a-c*c)/(2*b*a));
        
        double A = Math.acos(Math.toRadians((b*b+c*c-a*a)/(2*b*c)));
        double B = Math.acos(Math.toRadians((a*a+c*c-b*b)/(2*a*c)));
        double C = Math.acos(Math.toRadians((b*b+a*a-c*c)/(2*b*a)));
        
        System.out.println("A : " +A);
        System.out.println("B : " +B);
        System.out.println("C : " +C);
        
        
        
        
    }
    
}
