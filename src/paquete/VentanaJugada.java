/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Random;

/**
 *
 * @author Ignacio
 */
public class VentanaJugada extends javax.swing.JFrame {

    Mano jugada;
    boolean iniciar = false;
    
    public VentanaJugada() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPJugador = new javax.swing.JPanel();
        jBPiedraJugador = new javax.swing.JButton();
        jBPapelJugador = new javax.swing.JButton();
        jBTijeraJugador = new javax.swing.JButton();
        jPOrdenador = new javax.swing.JPanel();
        jBPiedraOrdenador = new javax.swing.JButton();
        jBPapelOrdenador = new javax.swing.JButton();
        jBTijeraOrdenador = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFWinPlayer = new javax.swing.JTextField();
        jTFWinPC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFJugada = new javax.swing.JTextField();
        jBIniciar = new javax.swing.JButton();
        jBOpciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Piedra Papel Tijera");

        jPJugador.setBorder(javax.swing.BorderFactory.createTitledBorder("Jugador"));

        jBPiedraJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Piedra.png"))); // NOI18N
        jBPiedraJugador.setEnabled(false);
        jBPiedraJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPiedraJugadorActionPerformed(evt);
            }
        });

        jBPapelJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Papel.png"))); // NOI18N
        jBPapelJugador.setEnabled(false);
        jBPapelJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPapelJugadorActionPerformed(evt);
            }
        });

        jBTijeraJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tijera.png"))); // NOI18N
        jBTijeraJugador.setEnabled(false);

        javax.swing.GroupLayout jPJugadorLayout = new javax.swing.GroupLayout(jPJugador);
        jPJugador.setLayout(jPJugadorLayout);
        jPJugadorLayout.setHorizontalGroup(
            jPJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBPiedraJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPapelJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTijeraJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPJugadorLayout.setVerticalGroup(
            jPJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTijeraJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPapelJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPiedraJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPOrdenador.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenador"));

        jBPiedraOrdenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Piedra.png"))); // NOI18N
        jBPiedraOrdenador.setEnabled(false);

        jBPapelOrdenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Papel.png"))); // NOI18N
        jBPapelOrdenador.setEnabled(false);

        jBTijeraOrdenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tijera.png"))); // NOI18N
        jBTijeraOrdenador.setEnabled(false);

        javax.swing.GroupLayout jPOrdenadorLayout = new javax.swing.GroupLayout(jPOrdenador);
        jPOrdenador.setLayout(jPOrdenadorLayout);
        jPOrdenadorLayout.setHorizontalGroup(
            jPOrdenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOrdenadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBPiedraOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPapelOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTijeraOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPOrdenadorLayout.setVerticalGroup(
            jPOrdenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOrdenadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPOrdenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTijeraOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPapelOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPiedraOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Marcador:");

        jTFWinPlayer.setEditable(false);
        jTFWinPlayer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFWinPlayer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFWinPlayer.setText("0");

        jTFWinPC.setEditable(false);
        jTFWinPC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFWinPC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFWinPC.setText("0");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Restantes:");

        jTFJugada.setEditable(false);
        jTFJugada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFJugada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFJugada.setText("0");
        jTFJugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFJugadaActionPerformed(evt);
            }
        });

        jBIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nueva_Partida.png"))); // NOI18N
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });

        jBOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Option.png"))); // NOI18N
        jBOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFWinPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTFWinPC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFJugada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFWinPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFWinPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTFJugada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed
        //Si la Partida ya esta Iniciada -> Reiniciamos 
        if (iniciar)
            reinicarPartida();
        //Si la Partida esta Parada -> Iniciamos
        else
            iniciarPartida();            
    }//GEN-LAST:event_jBIniciarActionPerformed
    private void reinicarPartida(){
        jTFWinPlayer.setText("0");
        jTFJugada.setText("0");
        jBPiedraJugador.setEnabled(false);
        jBPapelJugador.setEnabled(false);
        jBTijeraJugador.setEnabled(false);
        iniciar = false;        
        jBIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/Nueva_Partida.png")));
    }    
    private void iniciarPartida(){
        jBPiedraJugador.setEnabled(true);
        jBPapelJugador.setEnabled(true);
        jBTijeraJugador.setEnabled(true);
        iniciar = true;        
        jBIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/Restart.png")));
    }
    
    private int getJugadaOrdenador(){
        Random generadorNum = new Random();
        return generadorNum.nextInt(3) + 1;
    }
    
    private void setNombreJugador(String nombreJugador){
        jPJugador.setBorder(javax.swing.BorderFactory.createTitledBorder(nombreJugador));
    }
    
    
    private void jBOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBOpcionesActionPerformed

    private void jTFJugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFJugadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFJugadaActionPerformed

    private void jBPapelJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPapelJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPapelJugadorActionPerformed

    private void jBPiedraJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPiedraJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPiedraJugadorActionPerformed


    
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
            java.util.logging.Logger.getLogger(VentanaJugada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJugada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJugada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJugada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJugada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIniciar;
    private javax.swing.JButton jBOpciones;
    private javax.swing.JButton jBPapelJugador;
    private javax.swing.JButton jBPapelOrdenador;
    private javax.swing.JButton jBPiedraJugador;
    private javax.swing.JButton jBPiedraOrdenador;
    private javax.swing.JButton jBTijeraJugador;
    private javax.swing.JButton jBTijeraOrdenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPJugador;
    private javax.swing.JPanel jPOrdenador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFJugada;
    private javax.swing.JTextField jTFWinPC;
    private javax.swing.JTextField jTFWinPlayer;
    // End of variables declaration//GEN-END:variables
}
