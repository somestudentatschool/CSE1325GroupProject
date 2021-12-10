import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;
import Grades.*;
import People.*;
import DegreePlan.*;
import java.io.*;


class courseScreen extends JFrame implements ActionListener
{
    JButton close;
    JFrame courseFrame;
    courseScreen(String hours, String name, String description)
    {
        JPanel p1 = new JPanel();
        close = new JButton("Close");
        courseFrame = new JFrame("Courses");
        JLabel degreeName = new JLabel(name);
        JLabel degreeHour = new JLabel("Credit Hours = "+hours);
        JLabel degreeDesc = new JLabel(description);
        courseFrame.setDefaultCloseOperation(courseFrame.EXIT_ON_CLOSE);
        courseFrame.setSize(500,500);
        close.addActionListener(this);
        //courseFrame.setLayout(new GridLayout(3,1));
        p1.add(degreeName);
        p1.add(degreeHour);
        courseFrame.add(p1, BorderLayout.PAGE_START);
        courseFrame.add(degreeDesc, BorderLayout.CENTER);
        courseFrame.add(close, BorderLayout.PAGE_END);
        courseFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == close)
        {
            courseFrame.dispose();
        }
    }
}
class classScreen extends JFrame implements ActionListener //going to implement the class screen at 3
{
    JFrame classFrame = new JFrame("Classes");
    DegreePlan degreePlan;
    JPanel classpanel;
    JLabel degree2, message;
    String[] classList, hours, name, description;
    JButton class1 , class2, class3, class4, class5, class6, class7, class8, class9, class10, exit; //for classes
    //JLabel degreeLabel = new JLabel("Choose your degree: ");
    classScreen(DegreePlan degreeplan, People p1)
    {
        classFrame.setDefaultCloseOperation(classFrame.EXIT_ON_CLOSE);
        classFrame.setSize(1270,720);
        classFrame.setVisible(true);
        classFrame.setLayout(new GridLayout(2,3));
        degreePlan = degreeplan;
        degreePlan.getDegreePlan();
        degreePlan.readDegreePlans();
        classList = degreePlan.getLists();
        hours = degreePlan.getHours();
        name = degreePlan.getName();
        description = degreeplan.getDescription();
        degree2 = new JLabel(p1.getDegree()+" Degree Courses: ");
        classFrame.setLayout(new GridLayout(12, 1));
        class1 = new JButton(classList[0]);
        class2 = new JButton(classList[1]);
        class3 = new JButton(classList[2]);
        class4 = new JButton(classList[3]);
        class5 = new JButton(classList[4]);
        class6 = new JButton(classList[5]);
        class7 = new JButton(classList[6]);
        class8 = new JButton(classList[7]);
        class9 = new JButton(classList[8]);
        class10 = new JButton(classList[9]);
        exit = new JButton("Exit");
        exit.addActionListener(this);
        class1.addActionListener(this);
        class2.addActionListener(this);
        class3.addActionListener(this);
        class4.addActionListener(this);
        class5.addActionListener(this);
        class6.addActionListener(this);
        class7.addActionListener(this);
        class8.addActionListener(this);
        class9.addActionListener(this);
        class10.addActionListener(this);
        classFrame.add(degree2);
        classFrame.add(class1);
        classFrame.add(class2);
        classFrame.add(class3);
        classFrame.add(class4);
        classFrame.add(class5);
        classFrame.add(class6);
        classFrame.add(class7);
        classFrame.add(class8);
        classFrame.add(class9);
        classFrame.add(class10);
        classFrame.add(exit);
       // classpanel.add(degreeLabel);
        //message = new JLabel();
        //classpanel.add(message);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adding listeners
        //add(classpanel,BorderLayout.CENTER);
       // setTitle("Classes Available ");
        //setSize(450,350);
        classFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == exit)
        {
            classFrame.dispose();
        }
        else if(e.getSource() == class1)
        {
            courseScreen c1 =new courseScreen(hours[0], name[0], description[0]);
        }
        else if(e.getSource() == class2)
        {
            courseScreen c1 =new courseScreen(hours[1], name[1], description[1]);
        }
        else if(e.getSource() == class3)
        {
            courseScreen c1 =new courseScreen(hours[2], name[2], description[2]);
        }
        else if(e.getSource() == class4)
        {
            courseScreen c1 =new courseScreen(hours[3], name[3], description[3]);
        }
        else if(e.getSource() == class5)
        {
            courseScreen c1 =new courseScreen(hours[4], name[4], description[4]);
        }
        else if(e.getSource() == class6)
        {
            courseScreen c1 =new courseScreen(hours[5], name[5], description[5]);
        }
        else if(e.getSource() == class7)
        {
            courseScreen c1 =new courseScreen(hours[6], name[6], description[6]);
        }
        else if(e.getSource() == class8)
        {
            courseScreen c1 =new courseScreen(hours[7], name[7], description[7]);
        }
        else if(e.getSource() == class9)
        {
            courseScreen c1 =new courseScreen(hours[8], name[8], description[8]);
        }
        else if(e.getSource() == class10)
        {
            courseScreen c1 =new courseScreen(hours[9], name[9], description[9]);
        }
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
        JLabel degreeLabel = new JLabel("Choose your degree: ");
        JTextField userText;
        String[] degrees = {"Computer Science", "Biomedical", "Mechanical"};
        JComboBox<String> comboDegree = new JComboBox<>(degrees);
        //JPasswordField passwordText;
        JButton submit;
        String userName,item;

        loginScreen(boolean newUser)
        {
            //username labels
            userLabel = new JLabel();
            userLabel.setText("Enter your name: ");
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

    class NewUserOrNo
    {
        NewUserOrNo()
        {
            int result  = JOptionPane.showConfirmDialog(null, "Are you a new user?");
            //boolean answer = false;
            if(result == JOptionPane.YES_OPTION)
            {
                loginScreen login=new loginScreen(true);
            }
            else
            {
                loginScreen login=new loginScreen(false);
            }
        }
    }


    public class projectMain {
        public static void main(String[] args)
        {
            //creating login GUI
            NewUserOrNo n1 = new NewUserOrNo();
        }
}