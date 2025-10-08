package body.mass.index;

import java.util.Scanner;

public class BodyMassIndex {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter your height (m)");
        double hight = input.nextDouble();
        
        System.out.println("enter your weight (kg)");
        double weight = input.nextDouble();
        
        double BMI = weight/(hight * hight);
        
        if (BMI < 18.5){
            System.out.println("you are underweight");
        }else if (BMI>=18.5 && BMI<25.0){
            System.out.println("you are normal");
        }else if (BMI>=25.0 && BMI<30.0){
            System.out.println("you are overweight");
        }else if (BMI>=30.0){
        System.out.println("you are obese");
    
    }
    }
    
}
