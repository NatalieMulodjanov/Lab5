/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningJavaVol3;

/**
 * Creates a class grocery store 
 * @author Natalie Mulodjanov
 */

class groceryStoreNoConstructor{ //creates class of type groceryStore
    int appleSoldYearly;    //creates 4 member variables 
    double pricePerApple;
    int orangeSoldYearly;
    double pricePerOrange;
    
    
   /**
    * Method to calculate gross yearly revenue from apples and oranges 
    * 
    */
    double grossYearlyRevenu(){   //no public static before void when method is inside class 
        double grossYearlyRevenu = ((appleSoldYearly * pricePerApple) + (orangeSoldYearly * pricePerOrange));
        return grossYearlyRevenu;
    
    }
    /**
    * Method to calculate how many apples the store has to sell yearly to make a certain amount of revenue
    * @return the number of apples needed 
    */
    int targetRevenueApple(double targetRevWanted){
        double numOfApple = targetRevWanted / pricePerApple;
        return (int)numOfApple;     //converted to int because apples are only integers (1 full)
    }
    /**
    * Method to calculate how many oranges the store has to sell yearly to make a certain amount of revenue
    * @return the number of oranges needed 
    */
    int targetRevenueOrange (double targetRevWanted){
        double numOrange = targetRevWanted / pricePerOrange;
        return (int) numOrange;
    }

}
    

