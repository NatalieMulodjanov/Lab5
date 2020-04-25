/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 * This program will answer question 56 of chapter 7 in the book.
 * The class will encapsulate the concept of TV. 
 * @author Natalie Mulodjanov
 */

class client {
    static public void main(String[] args){    
    
    TV natalie = new TV("samsung", 595.26);
    TV stephanie = new TV("rca", 486.36);
    
        natalie.setBrand("sony");
        System.out.println("Natalies brand is: " + natalie.getBrand());
        
        natalie.setPrice(423.36);
        System.out.println("Natalies price is: " +natalie.getPrice());
        
        stephanie.setBrand("lg");
        System.out.println("Stephanies brand is: " + stephanie.getBrand());
        
        stephanie.setPrice(471.85);
        System.out.println("Stephanies price is: " + stephanie.getPrice());
        
        System.out.println(natalie.toString());
        System.out.println(stephanie.toString());
        
        System.out.println("Natalie and Stephanie are equal: " + natalie.equals(stephanie));
        
    }     
}//end of class 

class TV {
    private String brand;
    private double price;

    TV (String a, double b){    //constructor
        brand = a;
        price = b;
    }

    public void setBrand(String x){     //mutators (setters)
        brand = x;
    }
    
    public void setPrice(double y){    
        price = y;
    }

    public String getBrand(){        //accessor (getter)
        return brand;
    }

    public double getPrice(){
        return price; 
    }
    
    @Override
    public String toString(){       //toString method
        TV client = new TV("samsung", 450.00);
        return "brand: " + brand +
               ">>> price: " + price;
    }
    
    @Override
    public boolean equals(Object x){        //equals method
        if(!(x instanceof TV))
            return false;
        else{ 
            TV client = (TV) x;
            if(brand.equals(client.brand))
                return true;   
            if (price == client.price)
                return true;
            else return false;
        }
    }
}//end of class
