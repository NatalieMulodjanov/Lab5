/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningJavaVol3;

/**
 * This program creates a class groceryStore, and instantiates 3 objects from that class,
 * assigns values for each member data and makes calculations with this data.
 * @author Natalie Mulodjanov
 */
public class CreateObjectAssignValues {
    public static void main(String[] args) {
      
        groceryStoreNoConstructor houstonStore = new groceryStoreNoConstructor();    //creates new object of type groceryStore 
        groceryStoreNoConstructor seattleStore = new groceryStoreNoConstructor();    //nameClass nameObject = new nameClass(); the () is for constructor, default values of constructor is 0 
        groceryStoreNoConstructor orlandoStore = new groceryStoreNoConstructor();
        
        houstonStore.appleSoldYearly = 534; 
        houstonStore.pricePerApple = 0.99;
        houstonStore.orangeSoldYearly = 429;
        houstonStore.pricePerOrange = 0.87;
        
        double yearlyGrossRevenu = ((houstonStore.appleSoldYearly * houstonStore.pricePerApple) + 
                                    (houstonStore.orangeSoldYearly * houstonStore.pricePerOrange));     //calculating the yearly gross revenue of the houston store
        System.out.println("The gross revenue made by the Houston store is: " + yearlyGrossRevenu + "USD");
        
        System.out.println("THE HOUSTON STORE");
        System.out.println("The amount of apples sold per year: " + houstonStore.appleSoldYearly);
        System.out.println("The price per apple: " + houstonStore.pricePerApple);
        System.out.println("The amount of oranges sold per year is : " + houstonStore.orangeSoldYearly);
        System.out.println("The price per orange is: " + houstonStore.pricePerOrange);
        
        seattleStore.appleSoldYearly = 765;
        seattleStore.pricePerApple = 0.86;
        seattleStore.orangeSoldYearly = 842;
        seattleStore.pricePerOrange = 0.91;
        
        orlandoStore.appleSoldYearly = 402;
        orlandoStore.pricePerApple = 0.77;
        orlandoStore.orangeSoldYearly = 398;
        orlandoStore.pricePerOrange = 0.79;
        
    }
    
}

