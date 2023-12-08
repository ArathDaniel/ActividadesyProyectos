
package Practicas;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Practica1B extends JFrame{
  
    JPanel contenedor;
    public Practica1B(){
       
        contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));
      
        
        for(int i=0;i<5;i++){
            contenedor.add(new JButton("boton "+(1+1)));
        }
      
        add(contenedor);
        setSize(300,300);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        Practica1B p=new Practica1B();
    }
   
}
