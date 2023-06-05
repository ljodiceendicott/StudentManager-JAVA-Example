/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.endicott.mocean.studentmanager;

import javax.swing.JOptionPane;

/**
 *
 * @author mocea
 */
public class MainClass {

    public static Student makeStudent(){
                        
        String fName = JOptionPane.showInputDialog("Enter the first name for the student:");
        String lName = JOptionPane.showInputDialog("Enter the last name for the student:");

        String strGpa = JOptionPane.showInputDialog("What is the student's GPA?");        
        
        String strNumClasses = JOptionPane.showInputDialog("How many classes has the student taken?");

        Student tmpStudent = new Student(fName, lName, 
                                            Double.parseDouble(strGpa),
                                            Integer.parseInt(strNumClasses));

        return tmpStudent;
    }
    
    public static void main(String[] args){
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        
//        Student someStudent; // declaring a variable of type Student
//        String finalMessage = "";
//        
//        someStudent = makeStudent();
//        finalMessage = finalMessage + someStudent.getStudentInfo();
//        // second student
//        someStudent = makeStudent();
//        finalMessage = finalMessage + someStudent.getStudentInfo();
//        // third student ... hey, a loop would be better....
//        someStudent = makeStudent();
//        finalMessage = finalMessage + someStudent.getStudentInfo();
//
//        JOptionPane.showMessageDialog(null, finalMessage);
//        
//        System.out.println("TOTAL CREATED: " + Student.getNumberOfStudents() );        

    }
    
}
