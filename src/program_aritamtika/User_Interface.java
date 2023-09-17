/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_aritamtika;

//Import Package
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Xeon
 */
public class User_Interface extends JFrame{
    JFrame jf = new JFrame();
    
//    items 1
    JTextField tx1 = new JTextField();
    JLabel op = new JLabel("+");
    JTextField tx2 = new JTextField();
    JTextField rs = new JTextField();
    JLabel sm = new JLabel("=");
    
//    Oprator Button
    JButton btn1 = new JButton("+");
    JButton btn2 = new JButton("-");
    JButton btn3 = new JButton("x");
    JButton btn4 = new JButton(":");
    
//    Method UI
   public void User_Interface(){
        
//        Set JFrame
        jf.setTitle("Program Aritmatika");
        jf.setSize(290, 300);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLayout(null);
        
//        items
        tx1.setBounds(20, 20, 230, 35);
        jf.add(tx1);
        
        op.setBounds(125, 40, 50, 50);
        op.setFont(new Font("Serif", Font.BOLD, 18));
        jf.add(op);
        
        tx2.setBounds(20, 80, 230, 35);
        jf.add(tx2);
        
        rs.setBounds(50, 130, 200, 35);
//        rs.setEditable(false);
        jf.add(rs);
        
        sm.setBounds(30, 120, 50, 50);
        sm.setFont(new Font("Serif", Font.BOLD, 18));
        jf.add(sm);
        
//        Oprator Button
        btn1.setBounds(20, 180, 50, 50);
        btn1.setFont(new Font("Serif", Font.BOLD, 18));
        btn1.setBackground(Color.white);
        btn1.setBorder(null);
        jf.add(btn1);
        
//        Action Buttton
        btn1.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                String text1, text2;
                text1 = tx1.getText();
                text2 = tx2.getText();
                
                int a, b, c;
                
                a = Integer.parseInt(text1);
                b = Integer.parseInt(text2);
                
                c = a + b;
                
                rs.setText(String.valueOf(c));
                System.out.println(c);
            }
        });
        
        btn2.setBounds(80, 180, 50, 50);
        btn2.setFont(new Font("Serif", Font.BOLD, 18));
        btn2.setBackground(Color.white);
        btn2.setBorder(null);
        jf.add(btn2);
                
//        Action Buttton
        btn2.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                String text1, text2;
                text1 = tx1.getText();
                text2 = tx2.getText();
                
                double a, b, c;
                
                a = Integer.parseInt(text1);
                b = Integer.parseInt(text2);
                
                c = a - b;
                
                rs.setText(String.valueOf(c));
                System.out.println(c);
            }
        });
        
        btn3.setBounds(140, 180, 50, 50);
        btn3.setFont(new Font("Serif", Font.BOLD, 18));
        btn3.setBackground(Color.white);
        btn3.setBorder(null);
        jf.add(btn3);
                
//        Action Buttton
        btn3.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                String text1, text2;
                text1 = tx1.getText();
                text2 = tx2.getText();
                
                int a, b, c;
                
                a = Integer.parseInt(text1);
                b = Integer.parseInt(text2);
                
                c = a * b;
                
                rs.setText(String.valueOf(c));
                System.out.println(c);
            }
        });
        
        btn4.setBounds(200, 180, 50, 50);
        btn4.setFont(new Font("Serif", Font.BOLD, 18));
        btn4.setBackground(Color.white);
        btn4.setBorder(null);
        jf.add(btn4);
                
//        Action Buttton
        btn4.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                String text1, text2;
                text1 = tx1.getText();
                text2 = tx2.getText();
                
                double a, b, c;
                
                a = Integer.parseInt(text1);
                b = Integer.parseInt(text2);
                
                c = a / b;
                
                rs.setText(String.valueOf(c));
                System.out.println(c);
            }
        }); 
    }
    
//    Method Main
        public static void main(String args[]){
            User_Interface ui = new User_Interface();
            ui.User_Interface();
        }
}