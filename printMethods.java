/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningJavaVol3;

import java.util.Scanner;

/**
 * This program will ask the user to tell their favorite season and will 
 * call the proper method according to the selection. These methods are simple
 * print methods that will print a line on the screen. This program is reading a 
 * type safe integer input only. 
 * @author Natalie Mulodjanov
 */
public class printMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer;
       
        do{
            System.out.println("Please select your favorit season by entering the number: "
                    + "\n1 for spring"
                    + "\n2 for summer"
                    + "\n3 for fall"
                    + "\n4 for winter");

            while(! input.hasNextInt()){
                input.nextLine();//collecting the invalid input and throwing it away 
                System.out.println("This is an invalid input please enter 1,2,3 or 4");//message for invalid input 
            }

            answer = input.nextInt();
            switch(answer){
                case 1: 
                    spring();
                    break;
                case 2: 
                    summer();
                    break;
                case 3: 
                    fall();
                    break;
                case 4:
                    winter();
                    break;
                default:
                    System.out.println("not a selection");
                    input.nextLine();
            }
            }while(answer > 4);
        }
   
    public static void spring(){
        System.out.println("The season is spring and flowers are blooming");
    }
    
    public static void summer(){
        System.out.println("The season is summer and it is getting hot!");
    }

    public static void fall(){
        System.out.println("The season is fall and leaves are falling");
    }

    public static void winter(){
        System.out.println("The season is winter and it is snowing");
    }


}
