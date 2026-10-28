/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystemm;
public class StudentInformationSystemm {
    public static void main(String[] args) {
        String name = "Auni Safa";
        String id = "S86891";
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        double markk1 = 78.0;
        double markk2 = 85.5;
        double totalMark = markk1 + markk2;
        System.out.println("Total Mark: " + totalMark);
        if (totalMark >= 160){
            System.out.println("Result: Excellent");
        }
        else if (totalMark >= 100){
        System.out.println("Result: Good");    
        }
        else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
