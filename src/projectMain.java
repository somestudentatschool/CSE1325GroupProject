import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;
import Grades.*;
import People.*;
import DegreePlan.*;
import java.io.*;

class selectListener implements ActionListener
{ //added this for the combo box which I'll finish later-Colby
    public void actionPerformed(ActionEvent e)
    {

    }
}

//OMAIR'S Additon GUI
    class menuinterface extends JFrame
    {
        menuinterface(String userName, String degree)
        {

            JFrame cool = new JFrame("Welcome");
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
            JButton homebutton = new JButton("HOME");
            homebutton.setFont(new Font("Verdana",Font.BOLD,25));
            homebutton.setBackground(Color.orange);
            homebutton.setBorder(new LineBorder(Color.DARK_GRAY,20));
            homebox.add(homebutton);
            cool.add(homebox);
            JButton classbutton = new JButton("Classes");
            classbutton.setBackground(Color.orange);
            classbutton.setFont(new Font("Verdana",Font.BOLD,25));
            classbutton.setBorder(new LineBorder(Color.DARK_GRAY,20));
            classbox.add(classbutton);
            cool.add(classbox);
            JButton gpacalbutton = new JButton("MY GPA");
            gpacalbutton.setFont(new Font("Verdana",Font.BOLD,25));
            gpacalbutton.setBorder(new LineBorder(Color.DARK_GRAY,20));
            gpacalbutton.setBackground(Color.orange);
            gpacal.add(gpacalbutton);
            cool.add(gpacal);
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
        String userName, item;
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
            GPA calci=new GPA();


            //code GUI stuff here,not finished yet - Efaz
           /* String[] degrees = new String[]{"Computer Science", "Nursing", "Mechanical"};
            JComboBox<String> comboDegree = new JComboBox<String>(degrees); //drop down box
            JPanel panel = new JPanel(); //just in case we need a panel
            JFrame project = new JFrame();
            JLabel label = new JLabel("Choose your degree.");
            project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            project.setSize(1280, 720);
            comboDegree.addActionListener(new selectListener());
            project.setVisible(true);*/
        }
}