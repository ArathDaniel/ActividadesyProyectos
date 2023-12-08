
package Practicas;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
       public static void main(String args[]){
        
        PrintWriter    out;
        BufferedReader in;
        boolean band = true;
        Conexion hilo;
        
        try {
            Scanner consola = new Scanner(System.in);
            Socket cliente = new Socket("127.0.0.1",3000);
            
            in  = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            out = new PrintWriter(cliente.getOutputStream(),true);
            
            hilo = new Conexion(in);
            hilo.start();
            
            String mensaje = "";
            while(band){
                mensaje = consola.nextLine();
                out.println(mensaje);
                
                if (mensaje.equals("ADIOS.")){
                    hilo.salir();
                    band = false;
                }
            }
           
            cliente.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

class Conexion extends Thread{
    
    private BufferedReader in;
    private boolean band=true;
    
    public Conexion(BufferedReader _in){
        in = _in;
    }
    
    public void run(){
        while(band){
            try {
                System.out.println(in.readLine());
            } catch (IOException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void salir(){
        band = false;
    }
}