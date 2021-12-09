import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;
import Grades.*;
import People.*;
import DegreePlan.*;
import java.io.*;

class classScreen extends JFrame implements ActionListener //going to implement the class screen at 3
{
    JFrame classFrame = new JFrame("Classes");
    DegreePlan degreePlan;
    JPanel classpanel;
    JLabel degree2, message;
    String[] classList, hours, name;
    JButton class1 , class2, class3, class4, class5, class6, class7, class8, class9, class10; //for classes
    //JLabel degreeLabel = new JLabel("Choose your degree: ");
    classScreen(DegreePlan degreeplan, People p1)
    {
        degreePlan = degreeplan;
        degreePlan.getDegreePlan();
        //degreePlan.readDegreePlans();
        classList = degreePlan.getLists();
        hours = degreePlan.getHours();
        name = degreePlan.getName();
        degree2 = new JLabel(p1.getDegree()+" Degree Courses: ");
        classpanel = new JPanel(new GridLayout(10, 1));
        classpanel.add(degree2);
       // classpanel.add(degreeLabel);
        message = new JLabel();
        classpanel.add(message);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adding listeners
        add(classpanel,BorderLayout.CENTER);
        setTitle("Classes Available ");
        setSize(450,350);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);

    }
}


//OMAIR'S Additon GUI
    class menuinterface extends JFrame implements ActionListener
    {
        People user;
        DegreePlan degreeplan;
        Degree degree1;
        String degree;
        String userName;
        JFrame cool = new JFrame("Welcome");
        JButton homebutton = new JButton("HOME");
        JButton classbutton = new JButton("Classes");
        JButton gpacalbutton = new JButton("MY GPA");

        menuinterface(String userName, String degree)
        {
            this.userName=userName;
            user = new People(userName, degree);
            this.degree = degree;
            if(degree.equals("Computer Science"))
            {
                System.out.println("Degree is comp Sci");
                degree1 = Degree.CSE;
                degreeplan = new DegreePlan(degree1);
            }
            else if(degree.equals("Biomedical"))
            {
                System.out.println("Degree is bio");
                degree1 = Degree.BIOMED;
                degreeplan = new DegreePlan(degree1);
            }
            else
            {
                System.out.println("Degree is mechanical");
                degree1 = Degree.MECHANICAL;
                degreeplan = new DegreePlan(degree1);
            }
            cool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cool.setSize(1270,720);
            cool.setVisible(true);
            cool.setLayout(new GridLayout(2,3));
            JLabel lite = new JLabel();
            lite.setText(lite.getText()+"        Welcome "+userName);
            lite.setFont(new Font("Verdana",Font.PLAIN,25));
            lite.setBorder(new LineBorder(Color.BLUE,20));
            cool.add(lite);
            JPanel homebox = new JPanel(new GridLayout(1, 3));
            JPanel classbox = new JPanel(new GridLayout(1, 3));
            JPanel gpacal = new JPanel(new GridLayout(1, 3));
            homebutton.setFont(new Font("Verdana",Font.BOLD,25));
            homebutton.setBackground(Color.orange);
            homebutton.setBorder(new LineBorder(Color.DARK_GRAY,20));
            homebox.add(homebutton);
            cool.add(homebox);
            classbutton.setBackground(Color.orange);
            classbutton.setFont(new Font("Verdana",Font.BOLD,25));
            classbutton.setBorder(new LineBorder(Color.DARK_GRAY,20));
            classbox.add(classbutton);
            cool.add(classbox);
            gpacalbutton.setFont(new Font("Verdana",Font.BOLD,25));
            gpacalbutton.setBorder(new LineBorder(Color.DARK_GRAY,20));
            gpacalbutton.setBackground(Color.orange);
            gpacal.add(gpacalbutton);
            cool.add(gpacal);
            classbutton.addActionListener(this);
            gpacalbutton.addActionListener(this);
            homebutton.addActionListener(this);
        }


        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == classbutton)
            {
                classScreen classes = new classScreen(degreeplan, user);

            }
            else if(e.getSource()==gpacalbutton)
            {
                new GPA();
            }
            else if(e.getSource()==homebutton)
            {
                new menuinterface(userName,degree);
            }
        }
    }
    //Added the login screen with GUI implementation
    class loginScreen extends JFrame implements ActionListener
    {
        JPanel panel;
        JLabel userLabel, message;
        JLabel degreeLabel = new JLabel("Choose you degree: ");
        JTextField userText;
        String[] degrees = {"Computer Science", "Biomedical", "Mechanical"};
        JComboBox<String> comboDegree = new JComboBox<>(degrees);
        //JPasswordField passwordText;
        JButton submit;
        String userName,item;

        loginScreen()
        {
            //username labels
            userLabel = new JLabel();
            userLabel.setText("Enter you name: ");
            //degreeLabel.setText("Choose your degree: ");
            userText = new JTextField();

            //Submit button
            submit = new JButton("SUBMIT");
            panel = new JPanel(new GridLayout(3, 2));
            panel.add(userLabel);
            panel.add(userText);
            panel.add(degreeLabel);
            panel.add(comboDegree);
            //panel.add(passwordLabel);
            //panel.add(passwordText);
            message = new JLabel();
            panel.add(message);
            panel.add(submit);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //adding listeners
            submit.addActionListener(this);
            add(panel,BorderLayout.CENTER);
            setTitle("Please enter your login credentials!");
            setSize(450,350);
            setVisible(true);
        }


        @Override
        public void actionPerformed(ActionEvent e)
        {
            userName = userText.getText();
            System.out.println(userText.getText());
            item = (String)comboDegree.getSelectedItem();
            System.out.println(item);
            setVisible(false);
            menuinterface menu = new menuinterface(userName, item);
        }
        public String getUserName()
        {
            return userName;
        }

        public String getDegree()
        {
            return item;
        }
}


    public class projectMain {
        public static void main(String[] args)
        {
            //creating login GUI
            loginScreen login=new loginScreen();
        }
}