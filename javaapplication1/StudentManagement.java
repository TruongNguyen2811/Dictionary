/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author afkda
 */
public class StudentManagement {
    
    /**
     * @param args the command line arguments
     */
    public static boolean sameGroup(student s1, student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
    }
    public static student[] arr = new student[100];
    public void addStudent(student newStudent) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newStudent;
            
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        
    }

}
