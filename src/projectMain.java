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

    public class projectMain {
        public static void main(String[] args) {
            //code GUI stuff here
            //not finished yet - Efaz
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
