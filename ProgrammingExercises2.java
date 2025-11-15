
package programming.exercises.pkg2;

import java.util.Scanner;

public class ProgrammingExercises2 {

    public static void main(String[] args) {
       
            Scanner in = new Scanner (System.in);
            
            //2.1(Convert Celsius to Fahrenheit)
//            System.out.println("Enter a degree in Celsius:");
//            double c = in.nextDouble();
//            double f = (9.0/5) * c + 32;
//            System.out.println(c+" Celsius is "+f+" Fahrenheit");

            //2.2(Compute the volume and area of a cylinder)
//               System.out.println("Enter the  radius of a cylinder:");
//               double r =in.nextDouble();
//               System.out.println("Enter the  length of a cylinder:");
//               double l =in.nextDouble();
//               double a = r * r *Math.PI;
//               double v = a * l;
//               System.out.printf("The area is %.5f\n",a);
//               System.out.printf("The volume is %.5f\n",v);
           
            // 2.3(Convert feet into meters)
//               System.out.println("Enter a value for feet:");
//               double f =in.nextDouble();
//               double m =f * 0.305;
//               System.out.println(f+" feet is "+m+" meters");

            // 2.4(Convert pounds into kilograms)
//               System.out.println(" Enter a number in pounds:");
//               double p =in.nextDouble();
//               double k =p * 0.454;
//               System.out.println(p+" pounds is "+k+" kilograms");

            // 2.5(Financial application: calculate tips)
//                 System.out.println("Enter the subtotal :");
//                 double s = in.nextDouble();
//                 System.out.println("Enter the gratuity rate:");
//                 double g = in.nextDouble();
//                 double e = g/s;
//                 double t = e+s;
//                 System.out.println("The gratuity is $"+e+" and total is $"+t);
                 
            //2.6 (Sum the digits in an integer)
//                   System.out.println("Enter a number between 0 and 1000:");
//                   int n = in.nextInt();
//                   int d3 =n/100;
//                   int d = n/10;
//                   int d2= d%10;
//                   int d1 = n %10;
//                   int t = d1+d2+d3;
//                   System.out.println("The sum of the digits is "+t);
             
             //2.7 (Find the number of years) 
//                  System.out.println("Enter the number of minutes:");
//                    double e = in.nextInt();
//                    double m = e%525600;
//                    double d = m/1440;
//                    double y = e/525600;
//                  System.out.println(e+"minutes is approximately "+y+" years and"+ d+" days");
                    
              //2.8 (Current time)
//                   System.out.println(" Enter the time zone offset to GMT:");
//                   System.out.println("hours...");
//                   int h = in.nextInt();
//                   System.out.println("minutes...");
//                   int m = in.nextInt();
//                   long ct = System.currentTimeMillis();
//                   long ts = ct/1000;
//                   long cs = ts%60;
//                   long tm = ts/60;
//                   long cm = m+(tm%60);
//                   long th = tm/60;
//                   long ch = h+(th%24);
//                   System.out.println("current time = "+ch+":"+cm+":"+cs);

               //2.9(Physics: acceleration)
//                    System.out.println(" Enter v0 :");
//                    double v0 = in.nextDouble();
//                    System.out.println(" Enter v1 :");
//                    double v1 = in.nextDouble();
//                    System.out.println(" Enter t :");
//                    double t = in.nextDouble();
//                    double a = (v1-v0)/t;
//                    System.out.println("The average acceleration is ="+a);

               //2.10(Science: calculating energy)
//                     System.out.println(" Enter the amount of water in kilograms:");
//                     double m = in.nextDouble();
//                     System.out.println("Enter the initial temperature:");
//                     double t1 = in.nextDouble();
//                     System.out.println("Enter the final temperature:");
//                     double t2 = in.nextDouble();
//                     double q  = m * (t2-t1)*4184;
//                     System.out.println("The energy needed is "+q);

               // 2.11 (Population projection)
//                      System.out.println("Enter the number of years:");
//                      int y = in.nextInt();
//                      int p=312032486;
//                      int d = 365;
//                      int h = 24;
//                      int m = 60;
//                      int s = 60;
//                      int ts = y*d*h*m*s;
//                      double cp = ts/7+ts/45-ts/13+p;
//                      System.out.printf("the population of USA is now %.0f\n",cp); 
                    
                // 2.12 (Physics: finding runway length)
//                       System.out.println("Enter speed of airplane in (m/s) :");
//                       double v = in.nextDouble();
//                       System.out.println("Enter  acceleration of airplane in (m/s*s) :");
//                       double a = in.nextDouble();
//                       double l = (v*v)/(2*a);
//                       System.out.printf("The minimum runway length for this airplane is%.3f ",l);
                       
                //2.13 (Financial application: compound value) 
//                System.out.println("Enter the monthly saving amount:");
//                double s = in.nextDouble();
//                System.out.println("Enter time in month");
//                int m = in.nextInt();
//                System.out.println("Enter annual interest rate in %");
//                int e = in.nextInt();
//                double n = e /1200d;
//                double x = 1+n;
//                double sum = 0;
//                 double p=0;
//                for(int t=1;t<=m ; t++){
//                    sum +=s*x;
//                     p = ((s+sum)*x);
//                }
//                System.out.println("After "+m+" month , the accountr value is "+p);
 
                //2.14 (Health application: computing BMI)
//                       System.out.println("Enter weight in pounds:");
//                       double w = in.nextDouble();
//                       System.out.println("Enter height in inches:");
//                       double h = in.nextDouble();
//                       double x = w * 0.45359237;
//                       double y = h * 0.0254;
//                       double bmi = x/(y*y);
//                       System.out.println(" BMI is "+bmi);
            
                // 2.15 (Geometry: distance of two points)
//                   System.out.println("Enter x1");
//                   double x1 = in.nextDouble();
//                   System.out.println("Enter y1");
//                   double y1 = in.nextDouble();
//                   System.out.println("Enter x2");
//                   double x2 = in.nextDouble();
//                   System.out.println("Enter y2");
//                   double y2 = in.nextDouble();
//                   double d = Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
//                   System.out.println("The distance between the two points is "+d);

                //2.16 (Geometry: area of a hexagon)
//                     System.out.println("Enter the length of the side:");
//                     double s = in.nextDouble();
//                     double a = (s*s)*(3*(Math.sqrt(3)))/2;
//                     System.out.println("The area of the hexagon is " +a);

                //2.17 (Science: wind-chill temperature)
//                       System.out.println(" Enter the temperature in Fahrenheit between -58°F and 41°F: ");
//                       double t = in.nextDouble();
//                       System.out.println("Enter the wind speed (>=2) in miles per hour:");
//                       double v = in.nextDouble();
//                       double wc = 35.74 + 0.6215*t - 35.75 *Math.pow(v, 0.16) + 0.4275 *t *Math.pow(v, 0.16);
//                       System.out.println("The wind chill index is "+wc);

                //2.18 (Print a table) 
//                     System.out.println("a       b     a^b");
//                     for(int a= 1;a<=5;a++){
//                        int b = a+1;
//                        int r =(int) Math.pow(a, b);
//                        System.out.println(a+"\t"+b+"\t"+r); 
//                     }

                 //2.19 (Geometry: area of a triangle)
//                       System.out.println(" Enter the coordinates of three points separated by spaces\n like x1 y1 x2 y2 x3 y3:"); 
//                       System.out.println("x1");
//                       double x1 = in.nextDouble();
//                       System.out.println("y1");
//                       double y1 = in.nextDouble();
//                       System.out.println("x2");
//                       double x2 = in.nextDouble();
//                       System.out.println("y2");
//                       double y2 = in.nextDouble();
//                       System.out.println("x3");
//                       double x3 = in.nextDouble();
//                       System.out.println("y3");
//                       double y3 = in.nextDouble();
//                       double s1 =Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
//                       double s2 =Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
//                       double s3 =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
//                       double s = (s1+s2+s3)/2d;
//                       double a = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
//                       System.out.printf("The area of the triangle is %.2f",a);

                  //2.20 (Financial application: calculate interest)
//                        System.out.println("Enter balance ");
//                        double b = in.nextDouble();
//                        System.out.println("Enter  interest rate ");
//                        double r = in.nextDouble();
//                        double i = b*(r/1200d);
//                        System.out.printf("The interest is%.5f ",i);

                  //2.21 (Financial application: calculate future investment value)
//                         System.out.println(" Enter investment amount: ");
//                         double ia = in.nextDouble();
//                         System.out.println("Enter annual interest rate in percentage:");
//                         double r = in.nextDouble();
//                         System.out.println("Enter number of years:");
//                         double y = in.nextDouble();
//                         double x = y*12;
//                         double d = r/1200;
//                         double g = 1+d;
//                         double f = ia *(Math.pow(g, x));
//                         System.out.println("Future value is "+f);
                         
                  //2.22 (Financial application: monetary units)
//                          System.out.println("Enter money amount ");
//                          int m = in.nextInt();
//                          int d = m /100;
//                          int c = m%100;
//                          System.out.println("you have "+d+"$ "+c+" cents");
                            
                   //2.23 (Cost of driving) 
//                         System.out.println(" Enter the driving distance(in mile:");
//                         double d = in.nextDouble();
//                         System.out.println(" Enter miles per gallon:");
//                         double m = in.nextDouble();
//                         System.out.println(" Enter price per gallon:");
//                         double g = in.nextDouble();
//                         double s = d/m*g;
//                         System.out.println("The cost of driving is "+s);           
    }
    
}
