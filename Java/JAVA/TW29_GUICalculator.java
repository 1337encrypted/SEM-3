/*
29) Design and develop a GUI application as shown below. Assume the two numbers to be integers. The application must check for invalid division condition and throw an appropriate exception.
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TW29_GUICalculator extends JFrame implements ActionListener{
    JLabel lb1,lb2,lb3;
    JTextField num1,num2,num3;
    JButton b1,b2,b3,b4;
    TW29_GUICalculator{
        this.setTitle("My first GUI");
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        lb1=new JLabel("First Number");
        lb1.setBounds(60, 100, 110, 30);
        this.add(lb1);
        
        num1=new JTextField();
        num1.setBounds(160, 100, 110, 30);
        this.add(num1);
        
        lb2=new JLabel("Second Number");
        lb2.setBounds(60, 140, 110, 30);
        this.add(lb2);
        
        num2=new JTextField();
        num2.setBounds(160, 140, 110, 30);
        this.add(num2);
        
        b1=new JButton("ADD");
        b1.setBounds(100, 200, 100, 30);
        b1.addActionListener(this);
        this.add(b1);
        
        b2=new JButton("SUBTRACT");
        b2.setBounds(210, 200, 100, 30);
        b2.addActionListener(this);
        this.add(b2);
        
        b3=new JButton("MULTIPLY");
        b3.setBounds(100, 250, 100, 30);
        b3.addActionListener(this);
        this.add(b3);
        
        b4=new JButton("DIVIDE");
        b4.setBounds(210, 250, 100, 30);
        b4.addActionListener(this);
        this.add(b4);
        
        lb3=new JLabel("Result");
        lb3.setBounds(60,300, 110, 30);
        this.add(lb3);
        
        num3=new JTextField();
        num3.setBounds(160, 300, 110, 30);
        this.add(num3);
        
        this.setVisible(true);
    }
    public static void main(String[] args){
        new Tw10();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int res;
        int a=Integer.parseInt(num1.getText());
        int b=Integer.parseInt(num2.getText());
        if(ae.getActionCommand()=="ADD"){
            res=a+b;
            num3.setText(""+res);
        }
        else if(ae.getActionCommand()=="SUBTRACT"){
            res=a-b;
            num3.setText(""+res);
        }
        else if(ae.getActionCommand()=="MULTIPLY"){
            res=a*b;
            num3.setText(""+res);
        }
        else if(ae.getActionCommand()=="DIVIDE"){
            try{
                res=a/b;
                num3.setText(""+res);
            }catch(Exception e){
                num3.setText("Division by Zero error");
            }
            
        }
        
    }    
}