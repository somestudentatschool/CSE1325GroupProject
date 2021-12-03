package Grades;
import java.util.Scanner;

public class GPA
{
    String grade = "";
    double credit,gpa,gradeValues,points
    double totalPoints = 0;
    double totalCredits = 0;

    public String enterCreditsGrades()
    {
        for(int i = 0; i < 3; i++)
        {
            Scanner enterInfo = new Scanner();
            System.out.println("Please enter the amount of credits for class " + i + ": ");
            credit = enterInfo.nextDouble();
            System.out.println("Please enter your grade for class "+ i+ ": (In letter form) ");
            grade = enterInfo.next();
        }
    }

    public double calculateGPA()
    {
        if(grade.equals("A"))
    }


}
