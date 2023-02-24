/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicalucation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class simpleGUI1 implements ActionListener {
    JFrame frame;
    JLabel number1,number2,result;
    JButton add,Subtraction,multiplication,division;
    JTextField jtfnumber1,jtfnumber2,jtfresult;
    
    public simpleGUI1() {
         frame = new JFrame("Table Calculator");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        number1 = new JLabel("Number 1:");
        number2 = new JLabel("Number 2:");
        result = new JLabel("Result:");
        
        number1.setBounds(50, 50, 200, 20);
        number2.setBounds(50, 100, 200, 20);
        result.setBounds(50, 200, 200, 20);
        add = new JButton("+");
        Subtraction = new JButton("-");
        multiplication = new JButton("*");
        division = new JButton("/");
        
        add.setBounds(50, 150, 50, 20);
        Subtraction.setBounds(130, 150, 50, 20);
        multiplication.setBounds(210, 150, 50, 20);
        division.setBounds(290, 150, 50, 20);
        
        jtfnumber1 = new JTextField();
        jtfnumber2 = new JTextField();
        jtfresult = new JTextField();
        
        jtfnumber1.setBounds(150, 50, 190, 20);
        jtfnumber2.setBounds(150, 100, 190, 20);
        jtfresult.setBounds(150, 200, 190, 20);
        
        add.addActionListener(this);
        Subtraction.addActionListener(this);
        multiplication.addActionListener(this);
        division.addActionListener(this);
        
        frame.add(number1);
        frame.add(number2);
        frame.add(result);
        frame.add(add);
        frame.add(Subtraction);
        frame.add(multiplication);
        frame.add(division);
        frame.add(jtfnumber1);
        frame.add(jtfnumber2);
        frame.add(jtfresult);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         int firstnumber = Integer.parseInt(jtfnumber1.getText());
         int secondnumber = Integer.parseInt(jtfnumber2.getText());
         if(ae.getSource()==add){
             jtfresult.setText(firstnumber+secondnumber+"");
         }
         else if(ae.getSource()==Subtraction){
             jtfresult.setText(firstnumber-secondnumber+"");
         }
         else if(ae.getSource()==multiplication){
             jtfresult.setText(firstnumber*secondnumber+"");
         }
         else{
              if(secondnumber!=0){
                  jtfresult.setText(1.0*firstnumber/secondnumber+"");
              }
              else{
                  jtfresult.setText("Invalid!!!");
              }
         }
    }
    public static void main(String[] args) {
     new simpleGUI1();
    }
    
    
}
