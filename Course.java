/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 * This program will encapsulate the concept of Courses
 * @author Natalie Mulodjanov
 */
class Client2{
    public static void main(String[] args) {
        
        Course prog = new Course("PRG", "programming course", 5);
        Course math = new Course("MTH", "math course", 3);
        
        prog.setCode("MTH");
        System.out.println(prog.getCode());
        
        math.setCode("MTH");
        System.out.println(math.getCode());
        
        prog.setDescription("math course");
        System.out.println(prog.getDescription());
        
        math.setDescription("math course");
        System.out.println(math.getDescription());
        
        prog.setCredit(3);
        System.out.println(prog.getCredit());
        
        math.setCredit(3);
        System.out.println(math.getCredit());
        
        System.out.println(prog.toString());
        System.out.println(math.toString());
        
        System.out.println("prog and math are equal?: " + prog.equals(math));

    }    
}//end of class

class Course {
    
    private String code;
    private String description;
    private int credit;
    
    Course(String a, String b, int c){
        code = a;
        description = b;
        credit = c;
    }
    
    void setCode(String cd){
        code = cd;
    }
    
    void setDescription(String dsc){
        description = dsc;
    }

    void setCredit(int crt){
        credit = crt;
    }
    
    String getCode(){
        return code;
    }
    
    String getDescription(){
        return description;
    }
    
    int getCredit(){
        return credit;
    }
    
    @Override
    public String toString(){
        //Course example = new Course("CS1", "this is my example", 4);
        return "Code Of Course: " + code +
               "\nDescription Of Course: " + description + 
               "\nCredits Of Course: " + credit; 
    }
    
    public boolean equals(Object x){
        if (!(x instanceof Course))
            return false;
        else {
        Course example = (Course) x;
        if (code.equals(example.code))
            return true;
        if (description.equals(example.description))
            return true;
        if (credit == example.credit)
            return true;
        else return false;
        }
    }
}//end of class
