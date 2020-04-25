/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningJavaVol3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This program will read 3 grades from a text file and calculate their average
 * using the average() method.
 * @author Natalie Mulodjanov
 */
public class PassReturnMethodParams2 {
    public static void main(String[] args)throws FileNotFoundException {
        File grades = new File("C:\\Users\\ntali\\Documents\\NetBeansProjects\\LearningJava\\src\\LearningJavaVol3\\grades.txt");
        Scanner inputFile = new Scanner(grades);
        
        while(inputFile.hasNext()){
            double grade1 = inputFile.nextDouble();//storing grades in variables individually
            double grade2 = inputFile.nextDouble();
            double grade3 = inputFile.nextDouble();
        
            double average = average(grade1, grade2, grade3);  
            
            System.out.println("The first grade is: " + grade1);
            System.out.println("The second grade is: " + grade2);
            System.out.println("The third grade is: " + grade3);
            System.out.println("The average of the 3 grades is: " + average);
       }
         
    }
    public static double average(double x, double y, double z){
        double average = (x + y + z) / 3;
        return average;
  }
    
}
