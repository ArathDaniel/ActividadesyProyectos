
package Practicas;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Practica1A {
    JFrame frame;
    
    JButton btn;
    JButton btn2;
    JButton btn3;
    
    JPanel panel;

    JLabel label;

    
    public Practica1A() {
        frame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("Practica 1A (FlowLayout)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        label = new JLabel("¿Desea iniciar el programa?");
        btn = new JButton("Iniciar");
        btn2 = new JButton("Finalizar");
        btn3 = new JButton ("Opcion...");
     
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        panel.add(label);
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);
       
    btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Usted a inciado el programa");
            }
    });
    
    btn2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "Usted a finalizado el programa");
            System.exit(0);
        }
    });

    btn3.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Usted a entrado en el menu de opciones...");
        }
    });

    }
    
    public void run(){
        frame.setVisible(true);
        frame.add(panel);
        frame.pack();
        frame.add(label, FlowLayout.LEADING);
        
    }

    public static void main(String[] args) {

         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica1A().run();
            }
        });
   
        
    }
}
