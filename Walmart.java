/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 * This program will answer question number 61 in the book.
 * the class encapsulates the concept of a store with a single member variable 
 * and outputs the domain of the company. 
 * @author Natalie 
 */
class Client3{
    public static void main(String[] args) {
    
        Walmart walmartMontreal = new Walmart("WalmartMontreal"); 
        
        walmartMontreal.setName("WalmartStLaurent");
        System.out.println(walmartMontreal.getName());
        
        System.out.println(walmartMontreal.toDomain());
   } 
}

class Walmart {
    String name;

    Walmart (String nm){
        name = nm;
    }

    void setName(String x){
        name = x;
    }

    String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "This walmart name is: " + name;
    }

    @Override
    public boolean equals(Object x){
        if(!(x instanceof Walmart))
            return false;
        else{
            Walmart example = (Walmart) x;
            if(name.equals(example.name))
                return true;
            else return false;
        }
    }
    
    public String toDomain(){
        return "www." + name + ".com";  
    }
}//end of class
