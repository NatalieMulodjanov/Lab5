/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 * This program will take 2 integer inputs from the user and calculate the greatest 
 * common divisor. 
 * @author Natalie Mulodjanov 
 */
public class Lab5Q2 {
    public static void main(String[] args) {    
      
        System.out.println("*****GREATEST COMMON DIVISOR*****");
        int int1 = collectInt();
        int int2 = collectInt();


        int gcd = gcd(int1, int2);
        System.out.println("The Greatest Common Divisor of the numbers " + int1 + " and " + int2 + " is: " + gcd);
     
    }
/**
 * A method to collect an integer from the user and store it in int. only type safe input
 * @return int user input
 * 
 */ 
public static int collectInt(){ 
    
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any integer here:  ");

        while (! input.hasNextInt()){
                input.nextLine();
                System.out.println("This input is invalid, Please enter any integer here: ");
            }
        int a = input.nextInt();

        return a;
}
/**
 * A method to calculate the greatest common divisor
 * @return int the common greatest divisor 
 * 
 */ 
public static int gcd(int a, int b){    //method to fing greatest common divisor
    
        int divisor;
        if(a > b) divisor = b;
        else divisor = a;

        while ((a % divisor != 0) || (b % divisor != 0)){
            divisor--;
       }
        return divisor;
}

}
