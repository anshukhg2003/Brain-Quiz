package brain.quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{ //using inheritance method//
    JButton rules, close;
    JTextField ftextfield;
    
    //create constructor//
     Login() {
         setLayout(null);
         getContentPane().setBackground(Color.WHITE); //frame background color change//
         getContentPane().setForeground(Color.white);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("brain/quiz/icons/brainquiz.jpg"));
         Image i2 = i1.getImage().getScaledInstance(570,420, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0, 0, 570,420);
         add(image);
         
         JLabel heading = new JLabel("Coding Quiz");
         heading.setBounds(725, 50, 300, 45);
         heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 36));
         heading.setForeground(new Color(30, 144, 254));
         add(heading);
         
         JLabel name = new JLabel("Enter your name");
         name.setBounds(770, 123, 300, 22);
         name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
         name.setForeground(new Color(30, 144, 254));
         add(name);
         
         ftextfield = new JTextField();
         ftextfield.setBounds(689, 188, 300, 25);
         ftextfield.setFont(new Font("Times New Roman", Font.BOLD, 20));
         add(ftextfield);
         
         rules = new JButton("Rules");
         rules.setBounds(689, 250, 105, 30);
         rules.setForeground(Color.white);
         rules.setBackground(new Color(30, 144, 254));
         rules.addActionListener(this);
         add(rules);
         
         close = new JButton("Close");
         close.setBounds(885, 250, 105, 30);
         close.setForeground(Color.white);
         close.setBackground(new Color(30, 144, 254));
         close.addActionListener(this);
         add(close);
         
         
         
         setSize(1100, 460);
         setLocation(120, 125);
         //setUndecorated(true);
         setVisible(true);
         
         
     }
     
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == rules){
             String name = ftextfield.getText(); //user get enter value//
             setVisible(false); //open the rule frame//
             new Rules(name);
             
         }else if (ae.getSource() == close) {
             setVisible(false);
         }
     }
    public static void main(String[] args) {
        //create object of login class//
        new Login();
    }
    
}
