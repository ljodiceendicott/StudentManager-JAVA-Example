/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.endicott.mocean.studentmanager;

/**
 *
 * @author mocea
 */
public class Student extends CollegePerson{

    private double gpa; // because Java hates me if I use floats
    private int numClasses;
    
    private static int totalNumberOfStudents = 0;
    
    public Student(String firstName, String lastName, double gpa, int numClasses){
        this(firstName, lastName);
        
        this.gpa = gpa;
        this.numClasses = numClasses;
    }

    public Student(String firstName, String lastName){
        super(firstName, lastName);

        totalNumberOfStudents++;
        gpa = 0;
        numClasses = 0;
    }
    
    public static int getNumberOfStudents( ){
        return totalNumberOfStudents;
    }
        
    public boolean setGpa(double newGpa){
        if(newGpa < 0){
            System.err.println("Bad GPA entered");
            return false;
        }
        else if(newGpa > 5){
            System.err.println("Bad GPA entered");
            return false;
        }
        this.gpa = newGpa;
        return true;
    }    
    
    public void setNumClasses(int numClasses){
        this.numClasses = numClasses;
    }
    
    
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\n" +
                "GPA: " + gpa + "\n" +
                "number of classes: " + numClasses + "\n" +
                "\n";
    }
}
