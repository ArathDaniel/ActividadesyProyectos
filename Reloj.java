
package multihilos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Toby_
 */
public class Reloj extends javax.swing.JFrame {
   
    
    HiloDisplay display; 
    
    public Reloj() {
        initComponents();
        display = new HiloDisplay(this);    
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbReloj = new javax.swing.JTabbedPane();
        pnlDigital = new javax.swing.JPanel();
        lbDigital = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDigital.setFont(new java.awt.Font("Menlo", 1, 36)); // NOI18N
        lbDigital.setText("12:00:00");

        javax.swing.GroupLayout pnlDigitalLayout = new javax.swing.GroupLayout(pnlDigital);
        pnlDigital.setLayout(pnlDigitalLayout);
        pnlDigitalLayout.setHorizontalGroup(
            pnlDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDigitalLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lbDigital)
                .addGap(30, 30, 30))
        );
        pnlDigitalLayout.setVerticalGroup(
            pnlDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDigitalLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lbDigital, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        tbReloj.addTab("Digital", pnlDigital);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        tbReloj.addTab("", jPanel2);

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnDetener.setText("Detener");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tbReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnIniciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetener)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tbReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnDetener))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        if (this.display.isAlive()){
            this.display.continuar();
        } else {
            this.display.start();
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
            this.display.pausar();
    }//GEN-LAST:event_btnDetenerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reloj reloj = new Reloj();
                reloj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbDigital;
    private javax.swing.JPanel pnlDigital;
    private javax.swing.JTabbedPane tbReloj;
    // End of variables declaration//GEN-END:variables

}

class HiloDisplay extends Thread {
    SimpleDateFormat formatter;  
    Date date;
    Reloj reloj;
    
    private volatile boolean running = true;
    private volatile boolean paused = false;
    private final Object pauseLock = new Object();
    
    HiloDisplay(Reloj _reloj){
        this.reloj = _reloj;
        this.formatter = new SimpleDateFormat("HH:mm:ss");  
        this.date = new Date();         
    }
    
    @Override
    public void run() {
        while (running) {
            synchronized (pauseLock) {
                if (!running) { // may have changed while waiting to
                    // synchronize on pauseLock
                    break;
                }
                if (paused) {
                    try {
                        pauseLock.wait(); 
                        // will cause this Thread to block until 
                        // another thread calls pauseLock.notifyAll()
                        // Note that calling wait() will 
                        // relinquish the synchronized lock that this 
                        // thread holds on pauseLock so another thread
                        // can acquire the lock to call notifyAll()
                        // (link with explanation below this code)
                    } catch (InterruptedException ex) {
                        break;
                    }
                    if (!running) { // 
                        break;
                    }
                }
            }
            this.date = new Date();
            this.reloj.lbDigital.setText(this.formatter.format(this.date));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }           
    }
    
    public void detener() {
        running = false;

        continuar();

    }

    public void pausar() {
        // you may want to throw an IllegalStateException if !running
        paused = true;
    }

    public void continuar() {
        synchronized (pauseLock) {
            paused = false;
            pauseLock.notifyAll(); // Desbloquea el hilo
        }
    }
}
