package brain.quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score  extends JFrame implements ActionListener{
    String name,score;
    Score(String name, int score) {
        setLayout(null);
        setBounds(399, 150, 750, 550);
        getContentPane().setBackground(Color.white);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("brain/quiz/icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(35, 90, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank you " + name + " for playing coding quiz");
        heading.setBounds(170, 35, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        heading.setForeground(new Color(255, 140, 0));
        add(heading);
        
        JLabel Score = new JLabel("Your Score is " +score);
        Score.setBounds(380, 185, 315, 35);
        Score.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(Score);
        
        JButton play_again = new JButton("Play Again");
        play_again.setBounds(395, 260, 100, 28);
        play_again.setBackground(new Color(30, 144, 255));
        play_again.setForeground(Color.WHITE);
        play_again.addActionListener(this);
        add(play_again);
        
        setVisible(true); 
       
    }
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
        
           
    }
    public static void main(String args[]) {
        new Score("user", 0);
    }
    
}
