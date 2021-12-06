package Grades;
import java.util.Scanner;

public class GPA
{
    String grade = "";
    String grades = "";
    double credit,gpa,gradeValues,points;
    double totalPoints = 0;
    double totalCredits = 0;

    public String enterCreditsGrades()
    {
        for(int i = 0; i < 3; i++)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the amount of credits for class " + i + ": ");
            credit = keyboard.nextDouble();
            System.out.println("Please enter your grade for class "+ i + ": (In letter form) ");
            grade = keyboard.nextLine();
            grades += grade;
        }
        return grades;
    }

    //Changed how it should check for what letter grade someone has and the points attributed to it, might be buggy
    //just doing some rough proto-coding - Efaz
    public double calculateGPA()
    {
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
        return totalPoints += totalCredits*gradeValues;
    }

    //will work on this later, planning to arrange the GUI page for the GPA calculator, should discuss this
    // on  Tuesday 12/7- Efaz
    public void GPA_GUI()
    {

    }
}
