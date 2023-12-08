
package Practicas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Practica1 {
    
    public static void main(String[] args) {
        
        JFrame frame;
        frame = new JFrame("Practica 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLayout(new BorderLayout());
        
        JLabel lbl;
        lbl = new JLabel("Escribe un nombre para saludar");
        
        
        JTextField textField;
        textField = new JTextField("            ");
        
        
        JButton btn;
        btn = new JButton("Saludar!");
        
        
        frame.add(lbl,BorderLayout.NORTH);
        frame.add(textField,BorderLayout.CENTER);
        frame.add(btn,BorderLayout.SOUTH);
        
        frame.setVisible(true);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null, "Hola! "+textField.getText());
            }
        });
    }
    
}
