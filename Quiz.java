package brain.quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Quiz extends JFrame implements ActionListener{
    
    //store the question and  answering then create of 2-D array//
    String questions[][] = new String[10][10];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel ques, question;
    ButtonGroup buttongroup;
    JRadioButton op1, op2, op3, op4;
    JButton next, lifeline, submit;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    String name;
    
    
    Quiz(String name) {
        this.name = name;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("brain/quiz/icons/quiz.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1380, 282, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1365, 280);
        add(image);
        
        
        ques = new JLabel();
        ques.setBounds(70, 340, 58, 30);
        ques.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(ques);
        
        
        question = new JLabel();
        question.setBounds(115, 340, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(question);
        
        setBounds(35, 0, 1295, 782);
        getContentPane().setBackground(Color.white);
        
        
        questions[0][0] = "What is the default value of a local variable in java.?";
        questions[0][1] = "Null";
        questions[0][2] = "0";
        questions[0][3] = "Depends on the data type";
        questions[0][4] = "No default value";

        questions[1][0] = "What is the size of an int in java?";
        questions[1][1] = "2 bytes";
        questions[1][2] = "4 bytes";
        questions[1][3] = "8 bytes";
        questions[1][4] = "Depends on the system";

        questions[2][0] = "Which keyword is used to prevent method overriding?";
        questions[2][1] = "static";
        questions[2][2] = "final";
        questions[2][3] = "const";
        questions[2][4] = "volatile";

        questions[3][0] = "What is the return type of the hashCode() method in java?";
        questions[3][1] = "boolean";
        questions[3][2] = "long";
        questions[3][3] = "int";
        questions[3][4] = "double";

        questions[4][0] = "What is the parent class of all java classes?";
        questions[4][1] = "Object";
        questions[4][2] = "Main";
        questions[4][3] = "System";
        questions[4][4] = "Class";

        questions[5][0] = "Which of the following is Not a feature of java?";
        questions[5][1] = "Object-Oriented";
        questions[5][2] = "Platform-Independent";
        questions[5][3] = "Support Multiple Inheritance usiing Classes";
        questions[5][4] = "Secure";

        questions[6][0] = "Which statement is true about the super keyword?";
        questions[6][1] = "It is used to call the superclass method";
        questions[6][2] = "It is used to access the superclass constructor";
        questions[6][3] = "It is used to refer to the parent class";
        questions[6][4] = "All of the above";

        questions[7][0] = "Which collection maintains insertion order?";
        questions[7][1] = "HashMap";
        questions[7][2] = "HashSet";
        questions[7][3] = "LinkedHashMap";
        questions[7][4] = "TreeSet";

        questions[8][0] = "What happens when main() method is declared as private?";
        questions[8][1] = "The program compiles but gives a runtime error";
        questions[8][2] = "The program runs normally";
        questions[8][3] = "Compilation fails";
        questions[8][4] = "The program runs but with warinings";

        questions[9][0] = "Which of the following is a marker interface in java?";
        questions[9][1] = "Serializable";
        questions[9][2] = "Cloneable";
        questions[9][3] = "Remote";
        questions[9][4] = "All of the above";
      
        answers[0][1] = "No default value";
        answers[1][1] = "4 bytes";
        answers[2][1] = "final";
        answers[3][1] = "int";
        answers[4][1] = "Object";
        answers[5][1] = "Support Multiple Inheritance using Class";
        answers[6][1] = "All of the above";
        answers[7][1] = "LinkedHashMap";
        answers[8][1] = "The program compiles but gives a runtime error";
        answers[9][1] = "All of the above";
        
        op1 = new JRadioButton();
        op1.setBounds(125, 385, 700, 30);
        op1.setBackground(Color.white);
        op1.setFont(new Font("Dialog", Font.PLAIN, 17));
        add(op1);
        
        op2 = new JRadioButton();
        op2.setBounds(125, 420, 700, 30);
        op2.setBackground(Color.WHITE);
        op2.setFont(new Font("Dialog", Font.PLAIN, 17));
        add(op2);
        
        op3 = new JRadioButton();
        op3.setBounds(125, 455, 700, 30);
        op3.setBackground(Color.WHITE);
        op3.setFont(new Font("Dialog", Font.PLAIN, 17));
        add(op3);
        
        op4 = new JRadioButton();
        op4.setBounds(125, 490, 700, 30);
        op4.setBackground(Color.WHITE);
        op4.setFont(new Font("Dialog", Font.PLAIN, 17));
        add(op4);
        
        buttongroup = new ButtonGroup();
        buttongroup.add(op1);
        buttongroup.add(op2);
        buttongroup.add(op3);
        buttongroup.add(op4);
        
        next = new JButton("Next");
        next.setBounds(1030, 410, 145, 30);
        next.setForeground(Color.white);
        next.setBackground(new Color(30, 144, 254));
        next.setFont(new Font("Tahoma", Font.PLAIN, 18));
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1030, 475, 145, 30);
        lifeline.setForeground(Color.white);
        lifeline.setBackground(new Color(30, 144, 254));
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1030, 540, 145, 30);
        submit.setBackground(new Color(30, 144, 254));
        submit.setForeground(Color.white);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        setVisible(true);
  }
   public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == next) {
            repaint();
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
            
            ans_given = 1;
            if(buttongroup.getSelection() == null) {
                useranswers[count][0] = "";
            }else {
                useranswers[count][0] = buttongroup.getSelection().getActionCommand();
            }
            
            if (count == 8) {
            next.setEnabled(false);
            submit.setEnabled(true);
        }
            
            count++;
            start(count);
            
        }else if(ae.getSource() == lifeline) {
            
            if( count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                op2.setEnabled(false);
                op3.setEnabled(false);
                
            }else {
            op1.setEnabled(false);
            op4.setEnabled(false);    
            } 
            lifeline.setEnabled(false);
        }else if(ae.getSource() == submit) {
            ans_given = 1;
            if (buttongroup.getSelection() == null) {
                   useranswers[count][0] = "";
            } else {
                   useranswers[count][0] = buttongroup.getSelection().getActionCommand();
            }
           for (int i = 0; i<useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                   score += 10;
              }else {
                   score += 0;
              }
           }
           setVisible(false); 
           new Score(name, score);
            
        }
   }
    
    public void paint(Graphics g) { // again and again frame repain//
        
        super.paint(g); // call the paint method//
        String time = "Time left - " + timer + " seconds"; //creating timer//
        g.setColor(Color.red);
         g.setFont(new Font("Tahoma", Font.BOLD, 19));
        
        if(timer > 0) {
            g.drawString(time, 1018, 390);
           
        } else {
          g.drawString(" Time up", 1050, 390);  
        }
        timer--; //14
        try {
            Thread.sleep(1000); //stop code execution 1 sec with help of thread class//
            repaint(); 
        }catch (Exception e) {
           e.printStackTrace();
        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        }else if(timer < 0) {
            timer = 15;
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9){ //submit button case//
                if (buttongroup.getSelection() == null) {
                   useranswers[count][0] = "";
            } else {
                   useranswers[count][0] = buttongroup.getSelection().getActionCommand();
            }
           for (int i = 0; i<useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                   score += 10;
              }else {
                   score += 0;
              }
           }
           setVisible(false); 
           new Score(name, score);
          } else { //next button case//
                if(buttongroup.getSelection() == null) {
                    useranswers[count][0] = "";
                }  else {
                    useranswers[count][0] = buttongroup.getSelection().getActionCommand();
                }
            }
            count++; //intial value 0
            start(count);
        }
    }
    public void start(int count ) {
        ques.setText("" + (count + 1) + ". "); //converting spcific int to string//
        question.setText(questions[count][0]);
        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);
        
        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);
        
        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);
        
        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);
        
        buttongroup.clearSelection();
           
    }

    public static void main(String args[]){
        new Quiz("user");
    
} 
}
