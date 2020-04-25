/* * To change this license header, choose License Headers inProject Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningJavaVol3;

/**
 *
 * @author ntali
 */
public class ClassMethodsWithParams {
    public static void main(String[] args) {
        groceryStoreNoConstructor houstonStore = new groceryStoreNoConstructor();    //creates new object of type groceryStore 
        groceryStoreNoConstructor seattleStore = new groceryStoreNoConstructor();    //nameClass nameObject = new nameClass(); the () is because the class is located down 
        groceryStoreNoConstructor orlandoStore = new groceryStoreNoConstructor();
        
        houstonStore.appleSoldYearly = 534; 
        houstonStore.pricePerApple = 0.99;
        houstonStore.orangeSoldYearly = 429;
        houstonStore.pricePerOrange = 0.87;
        
        System.out.println("The amount of apples needed to make 952.26$ Revenue from apples in the Houston store is: " + 
                            houstonStore.targetRevenueApple(952.26));   //will return an integer amount of apples 
        
        seattleStore.appleSoldYearly = 765;
        seattleStore.pricePerApple = 0.86;
        seattleStore.orangeSoldYearly = 842;
        seattleStore.pricePerOrange = 0.91;
        
        System.out.println("The amount of oranges needed to make 589.23$ Rvenue from oranges in the Seattle store is: " + 
                            seattleStore.targetRevenueOrange(589.23));
        
        orlandoStore.appleSoldYearly = 402;
        orlandoStore.pricePerApple = 0.77;
        orlandoStore.orangeSoldYearly = 398;
        orlandoStore.pricePerOrange = 0.79;
        
    }
    
}

