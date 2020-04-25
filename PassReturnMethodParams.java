/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningJavaVol3;

import java.util.Scanner;

/**
 * This program will take 2 integer inputs from the user and will use the compare()
 * method to return the larger value. 
 * @author Natali Mulodjanov
 */
public class PassReturnMethodParams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the first integer between 1 and 100");
        
        while (! input.hasNextInt()){
            input.nextLine();
            System.out.println("This input is invalid Please enter a number between 1 and 100");
        }
        
        int num1 = input.nextInt();
        
        System.out.println("Please enter the second integer between 1 and 100");
        
         while (! input.hasNextInt()){
            input.nextLine();
            System.out.println("This input is invalid Please enter a number between 1 and 100");
        }
        
        int num2 = input.nextInt();
        
        int answer = compare(num1, num2);
        System.out.println("The first number you entered is: " + num1);
        System.out.println("The second number you entered is: " + num2);
        System.out.println("The larger number is: " + answer);
        
      
    }
    
    public static int compare(int x,int y){
       
        if (x > y) return x;
        else return y;
    }
}
