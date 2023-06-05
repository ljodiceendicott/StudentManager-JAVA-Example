/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.endicott.mocean.studentmanager;

import java.util.ArrayList;

/**
 *  Super-class of Student AND Instructor
 * every CollegePerson has a name, id and schedule
 * @author mocea
 */
public class CollegePerson {
    protected String firstName;
    protected String lastName;
    protected String id;
        
    protected ArrayList<Course> currentSchedule;
    
    CollegePerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        currentSchedule = new ArrayList();
    }
    
    public void setName(String first, String last){
        firstName = first;
        lastName = last;
    }

    @Override
    public String toString(){
        return "First Name: " + firstName + "\tLast Name: " + lastName +"\tID:" + id + "\n";
    }
}
