package Grades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.text.*;

public class GPA implements ActionListener
{
    // Omair's addition to gpacal
    char grades;
    double gpa;
    int credits,hours,gradeValue;
    double totalHours = 0.00;
    double totalHoursEarned = 0.00;
    int totalCredits = 40;
    JButton _4hour,_3hour,_2hour,_1hour,Agrade,Bgrade,Cgrade,Dgrade,Fgrade,Submit,exitout;

    public GPA()
    {
        JFrame calculator = new JFrame("GPA CAL");
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel chours = new JLabel("HOW MANY CREDIT HOURS IS THE COURSE?");
        JLabel cgrade = new JLabel("WHAT GRADE DID YOU EARN?");
        calculator.setLayout(new GridLayout(3, 2));
        calculator.setSize(800, 550);
        calculator.setVisible(true);
        JPanel topleft = new JPanel();
        JPanel topright = new JPanel();
        topleft.add(chours, BorderLayout.CENTER);
        topright.add(cgrade, BorderLayout.CENTER);
        calculator.add(topleft);
        calculator.add(topright);
        JPanel left1 = new JPanel(new GridLayout(4, 1));
        JPanel right1 = new JPanel(new GridLayout(5, 1));
        JPanel left2 = new JPanel();
        JPanel right2 = new JPanel();
        _4hour = new JButton("4");
        _4hour.setFont(new Font("Vendera", Font.BOLD, 30));
        _4hour.setBackground(Color.GREEN);
        _4hour.setBorder(new LineBorder(Color.BLACK, 2));
        _4hour.addActionListener(this);
        left1.add(_4hour);
        //
        _3hour = new JButton("3");
        _3hour.setFont(new Font("Vendera", Font.BOLD, 30));
        _3hour.setBackground(Color.cyan);
        _3hour.setBorder(new LineBorder(Color.BLACK, 2));
        _3hour.addActionListener(this);
        left1.add(_3hour);
        //
        _2hour = new JButton("2");
        _2hour.setFont(new Font("Vendera", Font.BOLD, 30));
        _2hour.setBackground(Color.pink);
        _2hour.setBorder(new LineBorder(Color.BLACK, 2));
        _2hour.addActionListener(this);
        left1.add(_2hour);
        //
        _1hour = new JButton("1");
        _1hour.setFont(new Font("Vendera", Font.BOLD, 30));
        _1hour.setBackground(Color.RED);
        _1hour.setBorder(new LineBorder(Color.BLACK, 2));
        _1hour.addActionListener(this);
        left1.add(_1hour);
        //
        calculator.add(left1);
        //
        Agrade = new JButton("A");
        Agrade.setFont(new Font("Vendera", Font.BOLD, 30));
        Agrade.setBackground(Color.GREEN);
        Agrade.setBorder(new LineBorder(Color.BLACK, 2));
        Agrade.addActionListener(this);
        right1.add(Agrade);
        //
        Bgrade = new JButton("B");
        Bgrade.setFont(new Font("Vendera", Font.BOLD, 30));
        Bgrade.setBackground(Color.CYAN);
        Bgrade.setBorder(new LineBorder(Color.BLACK, 2));
        Bgrade.addActionListener(this);
        right1.add(Bgrade);
        //
        Cgrade = new JButton("C");
        Cgrade.setFont(new Font("Vendera", Font.BOLD, 30));
        Cgrade.setBackground(Color.pink);
        Cgrade.setBorder(new LineBorder(Color.BLACK, 2));
        Cgrade.addActionListener(this);
        right1.add(Cgrade);
        //
        Dgrade = new JButton("D");
        Dgrade.setFont(new Font("Vendera", Font.BOLD, 30));
        Dgrade.setBackground(Color.RED);
        Dgrade.setBorder(new LineBorder(Color.BLACK, 2));
        Dgrade.addActionListener(this);
        right1.add(Dgrade);
        //
        Fgrade = new JButton("F");
        Fgrade.setFont(new Font("Vendera", Font.BOLD, 30));
        Fgrade.setBackground(Color.ORANGE);
        Fgrade.setBorder(new LineBorder(Color.BLACK, 2));
        Fgrade.addActionListener(this);
        right1.add(Fgrade);
        //
        calculator.add(right1);
        //
        exitout = new JButton("CLOSE");
        exitout.setFont(new Font("Vendera", Font.BOLD, 20));
        exitout.addActionListener(this);
        left2.add(exitout);
        calculator.add(left2);
        //
        Submit = new JButton("Submit");
        Submit.setFont(new Font("Vendera", Font.BOLD, 20));
        Submit.addActionListener(this);
        right2.add(Submit);
        calculator.add(right2);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exitout)
        {
            System.exit(0);
        }
            //Scanner hourCheck = new Scanner(System.in);
            System.out.println("Please enter the number of hours this course was: ");
            //hours = hourCheck.nextInt();
            if(e.getSource()==_4hour)
            {
                hours=4;
            }
            else if(e.getSource()==_3hour)
            {
                hours=3;
            }
            else if(e.getSource()==_2hour)
            {
                hours=2;
            }
            else if(e.getSource()==_1hour)
            {
                hours=1;
            }

            //Scanner gradeCheck = new Scanner(System.in);
            System.out.println("Please enter your letter grade for this class: ");
            //grades = gradeCheck.next().charAt(0);


            if(e.getSource()==Agrade)
            {
                gradeValue=4;
            }
            else if(e.getSource()==Bgrade)
            {
                gradeValue=3;
            }
            else if(e.getSource()==Cgrade)
            {
                gradeValue=2;
            }
            else if(e.getSource()==Dgrade)
            {
                gradeValue=1;
            }
            else if(e.getSource()==Fgrade)
            {
                gradeValue=0;
            }
            if(e.getSource() == Submit) {
                totalHours+=hours;
                totalHoursEarned = totalHoursEarned + gradeValue;
                System.out.println("Grade: "+gradeValue+"\nHours: "+hours);
                gpa = (gradeValue / totalHours)*4;
                System.out.printf("Your GPA is " +gpa);
            }
    }

}
