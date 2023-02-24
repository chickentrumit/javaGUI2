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
 *///label:nhan
//button
//JTextFlied

public class GUIcalucation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Calculator");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel number1 = new JLabel("Number 1:");
        JLabel number2 = new JLabel("Number 2:");
        JLabel result = new JLabel("Result:");
        
        number1.setBounds(50, 50, 200, 20);
        number2.setBounds(50, 100, 200, 20);
        result.setBounds(50, 200, 200, 20);
        JButton add = new JButton("+");
        JButton Subtraction = new JButton("-");
        JButton multiplication = new JButton("*");
        JButton division = new JButton("/");
        add.setBounds(50, 150, 50, 20);
        Subtraction.setBounds(130, 150, 50, 20);
        multiplication.setBounds(210, 150, 50, 20);
        division.setBounds(290, 150, 50, 20);
        JTextField jtfnumber1 = new JTextField();
        JTextField jtfnumber2 = new JTextField();
        JTextField jtfresult = new JTextField();
        
        jtfnumber1.setBounds(150, 50, 190, 20);
        jtfnumber2.setBounds(150, 100, 190, 20);
        jtfresult.setBounds(150, 200, 190, 20);
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
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              int firstnumber = Integer.parseInt(jtfnumber1.getText());
              int secondnumber = Integer.parseInt(jtfnumber2.getText());
              jtfresult.setText(firstnumber+secondnumber+"");
            }
        });
        Subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int firstnumber = Integer.parseInt(jtfnumber1.getText());
              int secondnumber = Integer.parseInt(jtfnumber2.getText());
              jtfresult.setText(firstnumber-secondnumber+"");
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                  int firstnumber = Integer.parseInt(jtfnumber1.getText());
              int secondnumber = Integer.parseInt(jtfnumber2.getText());
              jtfresult.setText(firstnumber*secondnumber+"");
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                  int firstnumber = Integer.parseInt(jtfnumber1.getText());
              int secondnumber = Integer.parseInt(jtfnumber2.getText());
              if(secondnumber!=0){
                  jtfresult.setText(1.0*firstnumber/secondnumber+"");
              }
              else{
                  jtfresult.setText("Invalid!!!");
              }
            }
        });
    }
    
}
