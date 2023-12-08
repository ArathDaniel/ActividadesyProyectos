
package  Practicas;

 

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

 


public class Server {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket server;
        BufferedReader in;
        PrintWriter  out;
        
        try {
            server = new ServerSocket(3000);
            System.out.println("Iniciando server");
            while (true){
                Socket socket = server.accept();
                
                System.out.println("Aceptando conexion desde "+socket.getInetAddress());
                
                out = new PrintWriter(socket.getOutputStream(),true);
                in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                
                out.println("Hola y adios");
                
                socket.close();
                
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
 