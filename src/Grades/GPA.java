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
    double hours,gradeValue;
    double totalHours,credits = 0.00;
    JFrame calculator = new JFrame("GPA CAL");
    JButton _4hour,_3hour,_2hour,_1hour,Agrade,Bgrade,Cgrade,Dgrade,Fgrade,Submit,exitout;
    JLabel chours,cgrade,outputty;
    public GPA()
    {
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chours = new JLabel("HOW MANY CREDIT HOURS IS THE COURSE?:");
        cgrade = new JLabel("WHAT GRADE DID YOU EARN?:");
        outputty=new JLabel("Your GPA IS :");
        calculator.setLayout(new GridLayout(3, 2));
        calculator.setSize(800, 550);
        calculator.setVisible(true);
        JPanel topleft = new JPanel(new GridLayout(2,1));
        JPanel topright = new JPanel(new GridLayout(2,1));
        topleft.add(chours);
        topleft.add(outputty);
        topright.add(cgrade);
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

    public void changeVisible()
    {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==exitout)
        {
            calculator.dispose();
        }
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

            if(e.getSource()==Agrade)
            {
                gradeValue=1;
            }
            else if(e.getSource()==Bgrade)
            {
                gradeValue=(0.75);
            }
            else if(e.getSource()==Cgrade)
            {
                gradeValue=(0.5);
            }
            else if(e.getSource()==Dgrade)
            {
                gradeValue=(0.25);
            }
            else if(e.getSource()==Fgrade)
            {
                gradeValue=0;
            }
            if(e.getSource() == Submit)
            {
                //totalHoursEarned = totalHoursEarned + gradeValue;
                totalHours=totalHours+hours;
                credits=credits+(hours*gradeValue);
                System.out.println("Total hours = "+totalHours);
                chours.setText("HOW MANY CREDIT HOURS IS THE COURSE?:"+hours);
                System.out.printf("\n");
                System.out.println("Grade: "+(gradeValue*hours)+"\nHours: "+hours);
                cgrade.setText("WHAT GRADE DID YOU EARN?:"+(hours*gradeValue));
                gpa = (credits/totalHours)*4;
                System.out.printf("Your GPA is " +gpa);
                outputty.setText("Your GPA IS :"+gpa);
            }
    }

}
