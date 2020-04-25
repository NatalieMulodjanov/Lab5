/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjavavol3new;

/**
 *  This program will instantiate objects with constructors and will call methods from class groceryStoreWithConstructor.
 * @author Natalie Mulodjanov
 */
public class UseConstructor {
    public static void main(String[] args) {
        
        groceryStoreWithConstructor houstonStore = new groceryStoreWithConstructor(534, 0.99, 429, 0.87);
        groceryStoreWithConstructor seattleStore = new groceryStoreWithConstructor(765, 0.86, 842, 0.91);
        groceryStoreWithConstructor orlandoStore = new groceryStoreWithConstructor(402, 0.77, 398, 0.79);
     
        System.out.println("\nThe gross yearly revenue of the Houston Store is: " + houstonStore.grossYearlyRevenu());
        System.out.println("The gross yearly revenue of the Seattle Store is: " + seattleStore.grossYearlyRevenu());
        System.out.println("The gross yearly revenue of the Orlando Store is: " + orlandoStore.grossYearlyRevenu());
        
        System.out.println("\nTo make 1000$ worth of apples, the Houston store will have to sell: " + houstonStore.targetRevenueApple(1000) + " apples");
        System.out.println("To make 1000$ worth of apples, the Seattle store will have to sell: " + seattleStore.targetRevenueApple(1000) + " apples");
        System.out.println("To make 1000$ worth of apples, the Orlando store will have to sell: " + orlandoStore.targetRevenueApple(1000) + " apples");
    
        System.out.println("\nTo make 800$ worth of oranges, the Houston store will have to sell: " + houstonStore.targetRevenueOrange(800) + " oranges");
        System.out.println("To make 800$ worth of oranges, the Seattle store will have to sell: " + seattleStore.targetRevenueOrange(800) + " oranges");
        System.out.println("To make 800$ worth of oranges, the Orlando store will have to sell: " + orlandoStore.targetRevenueOrange(800) + " oranges");
    
    } 
}
