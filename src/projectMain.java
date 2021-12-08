import DegreePlan.*;
import Grades.*;
import People.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class selectListener implements ActionListener { //added this for the combo box which I'll finish later-Colby
    public void actionPerformed(ActionEvent e) {

    }
}

    //Added the login screen with GUI implementation
    class loginScreen extends JFrame implements ActionListener {
        JPanel panel;
        JLabel userLabel, passwordLabel, message;
        JTextField userText;
        JPasswordField passwordText;
        JButton submit,cancel;

        loginScreen() {
            //username labels
            userLabel = new JLabel();
            userLabel.setText("Username: ");
            userText = new JTextField();

            //password labels
            passwordLabel = new JLabel();
            passwordLabel.setText("Password: ");
            passwordText = new JPasswordField();

            //Submit button
            submit = new JButton("SUBMIT");
            panel = new JPanel(new GridLayout(3, 1));
            panel.add(userLabel);
            panel.add(userText);
            panel.add(passwordLabel);
            panel.add(passwordText);
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
        public void actionPerformed(ActionEvent e) {
            String userName = userText.getText();
            String passWord = passwordText.getText();
            if(userName.trim().equals("admin") && passWord.trim().equals("admin")) {
                message.setText(" Hello "+ userName + "");
            }
            else {
                message.setText(" Invalid user...");
            }
        }
}


    public class projectMain {
        public static void main(String[] args) {
            //creating login GUI
            new loginScreen();

            //code GUI stuff here,not finished yet - Efaz
            String[] degrees = new String[]{"Computer Science", "Nursing", "Mechanical"};
            JComboBox<String> comboDegree = new JComboBox<String>(degrees); //drop down box
            JPanel panel = new JPanel(); //just in case we need a panel
            JFrame project = new JFrame();
            JLabel label = new JLabel("Choose your degree.");
            project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            project.setSize(1280, 720);
            comboDegree.addActionListener(new selectListener());
            project.setVisible(true);
        }
}