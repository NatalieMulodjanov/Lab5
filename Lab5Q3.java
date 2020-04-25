/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 * This program will answer question number 3 from lab 5
 * The class will encapsulate the concept of books.
 * @author Natalie Mulodjanov
 */
public class Lab5Q3 {
    public static void main(String[] args) {
        Book javaIlluminated = new Book("Java Illuminated", "Julie & Herve", "978-1284140996", 2018);
        Book cinderella = new Book("Cinderella", "WaltDisney", "978-0141313634", 1995);
        
        javaIlluminated.setTitle("Java Illuminated 5th edition");
        System.out.println("The title of the first book is: " + javaIlluminated.getTitle());
        
        cinderella.setAuthor("Walt Disney");
        System.out.println("The author name of the second book is: " + cinderella.getAuthor());
        
        javaIlluminated.setISBN("978-1284140995");
        System.out.println("The ISBN of the first book is: " + javaIlluminated.getISBN());
        
        cinderella.setYearOfPublish(1990);
        System.out.println("The year of publish of the second book is: " + cinderella.getYearOfPublish());
        
        javaIlluminated.toString();
        
        cinderella.toString();
        
        System.out.println("Are both books equal ? " + javaIlluminated.equals(cinderella));
        
        System.out.println("The amount of books is: " + Book.amountOfBooks);
        
    }
    
}//end of class 

class Book{
    private String title;
    private String author;
    private String ISBN;
    private int yearOfPublish;
    private static String publisher = "Vanier";
    static int amountOfBooks = 0;
    
    Book(String t, String a, String IS, int y){
        title = t;
        author = a;
        ISBN = IS;
        yearOfPublish = y;
        amountOfBooks++;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    
    public void setYearOfPublish(int year){
        yearOfPublish = year;
    }
    
    public String getTitle(){
        return "The title is: " + title;
    }
    
    public String getAuthor(){
        return "The author name is: " + author;
    }
    
    public String getISBN(){
        return "The ISBN is: " + ISBN;
    }
    
    public String getYearOfPublish(){
        return "The year of publish is: " + yearOfPublish; 
    }
    
    @Override
    public String toString(){
        return "Books title: " + title +
               "Books author: " + author + 
               "Books ISBN: "  + ISBN + 
               "Books: " + yearOfPublish; 
    }
    
    public boolean equals(Book other){
        if (! (other instanceof Book))
            return false;
        else {
            if (ISBN.equals(other.ISBN))
                return true;
            else return false;
                }
   }
    
    public int getAmountOfBooks(){
        return amountOfBooks;
    }
}//end of class 