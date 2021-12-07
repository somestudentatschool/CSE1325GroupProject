package Grades;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.text.*;

public class GPA
{
    String grade = "";
    double credits,hours,gradeValues,gpa;
    double totalHours = 0;
    double totalHoursEarned = 0;
    double totalCredits = 0;

    public String calculateGPACredits()
    {
        for(int i = 0; i < 3; i++)
        {
            Scanner hourCheck = new Scanner(System.in);
            System.out.println("Please enter the number of hours this course was: ");
            hours = hourCheck.nextDouble();
            Scanner gradeCheck = new Scanner(System.in);
            System.out.println("Please enter your letter grade for this class: ");
            grade = gradeCheck.next();
            totalHours += hours;
            totalHoursEarned += (hours*gradeValues);
        }

        switch(grade)
        {
            case "A": case "a" : gradeValues = 4.0;
            break;
            case "B": case "b" : gradeValues = 3.0;
            break;
            case "C": case "c" : gradeValues = 2.0;
            break;
            case "D": case "d" : gradeValues = 1.0;
            break;
            case "F": case "f" : gradeValues = 0.0;
            break;

            default: gradeValues = 0;
        }
        gpa = totalCredits*gradeValues;
        return calculateGPACredits();
    }

    /*
    public GPA()
    {
        createGUI();
    }

    will work on this later, planning to arrange the GUI page for the GPA calculator, should discuss this
    // on  Tuesday 12/7- Efaz
    public void createGUI()
    {

    }
     */
}
