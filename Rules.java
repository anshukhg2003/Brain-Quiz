package brain.quiz.application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener {
    String name; //gloabal declare//
    JButton start, back;
    Rules(String name){
        this.name = name;
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " To Coding Quiz");
        heading.setBounds(190, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 32));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rule = new JLabel();
        rule.setBounds(35, 10, 740, 495);
        rule.setFont(new Font("Tahoma", Font.PLAIN, 17));
        rule.setText(
        "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer." + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Hey Hari Ram." + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted." + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>");
        add(rule);
        
        start = new JButton("Start");
        start.setBounds(260, 480, 105, 30);
        start.setForeground(Color.white);
        start.setBackground(new Color(30, 144, 254));
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(427, 480, 105, 30);
        back.setForeground(Color.white);
        back.setBackground(new Color(30, 144, 254));
        back.addActionListener(this);
        add(back);
        
        getContentPane().setBackground(new Color(230, 230, 250));
        setSize(835, 620);
        setLocation(280, 70);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
            
        }else if(ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[]) {
        new Rules("user");
    }
    
}
