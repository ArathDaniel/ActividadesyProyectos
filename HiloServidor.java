
package chats;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Vector;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


public class HiloServidor extends Thread{
    private DataInputStream entrada;
    private DataOutputStream salida;
    
    private Servidor server;
    private Socket Cliente;

    private String nombre;
    private ObjectOutputStream salidaObjeto;
    
    public static Vector <HiloServidor> usuarioActivo = new Vector();
    public static Vector <HiloServidor> usuarioDesconectado = new Vector();

    public HiloServidor (Socket socketcliente, String nombre, Servidor serv) {
        this.Cliente = socketcliente;
        this.server = serv;
        this.nombre = nombre;
        usuarioActivo.add(this);
        
        for (int i = 0; i < usuarioActivo.size(); i++) {
            try {
                usuarioActivo.get(i).enviosMensajes(nombre + " Se a conectado exitosamente");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void run(){
        String mensaje = " ";
        while (true) {
            try {
                entrada  = new DataInputStream(Cliente.getInputStream());
                mensaje = entrada.readUTF();
                
                
                for (int i = 0; i < usuarioActivo.size(); i++) {
                    usuarioActivo.get(i).enviosMensajes(mensaje);
                    server.mensajeria("mensaje enviado");
                }
                
            }catch (Exception error ){
                break;
            } 
        }
        
        usuarioActivo.removeElement(this);
        server.mensajeria("El usuario se ha desconectado....");
        
        try{
            Cliente.close();
                        
        }catch (IOException ex){
            
        }
    }

    public void enviosMensajes(String msg) throws Exception {
            salida = new DataOutputStream(Cliente.getOutputStream());
            salida.writeUTF(msg);
            DefaultListModel modelo = new DefaultListModel();
            
            for (int i = 0; i < usuarioActivo.size(); i++) {
                modelo.addElement(usuarioActivo.get(i).nombre);
                
            }
            
            salidaObjeto = new ObjectOutputStream(Cliente.getOutputStream());
            salidaObjeto.writeObject(modelo);
    }    
}