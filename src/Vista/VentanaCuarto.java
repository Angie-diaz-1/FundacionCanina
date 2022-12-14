/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorCuarto;
import Modelos.Cuarto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class VentanaCuarto extends javax.swing.JFrame implements ActionListener
{

    JButton [] botones;
    private  ControladorCuarto controladorCuarto;
    VentanaModulos ventanaModulos;
    
    public VentanaCuarto( VentanaModulos ventanaModulos) {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorCuarto = new ControladorCuarto();
        this.ventanaModulos=ventanaModulos;
        botones = new  JButton[5];
        CargarBotones();
        validarPosiciones();
    }

    public ControladorCuarto getControladorCuarto() {
        return controladorCuarto;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCuarto = new javax.swing.JPanel();
        btnRegresarAmodulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegresarAmodulo.setText("Regresar  \na Modulos");
        btnRegresarAmodulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarAmoduloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuartoLayout = new javax.swing.GroupLayout(panelCuarto);
        panelCuarto.setLayout(panelCuartoLayout);
        panelCuartoLayout.setHorizontalGroup(
            panelCuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuartoLayout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(btnRegresarAmodulo)
                .addGap(196, 196, 196))
        );
        panelCuartoLayout.setVerticalGroup(
            panelCuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnRegresarAmodulo)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarAmoduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarAmoduloActionPerformed
         ventanaModulos.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnRegresarAmoduloActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//             
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarAmodulo;
    private javax.swing.JPanel panelCuarto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
     for (int i =0;i<botones.length;i++){
               if (e.getSource().equals(botones[i])){
                   Cuarto cuarto = controladorCuarto.obtenerCuarto(i);
                   if (cuarto.getEstado().equals(Cuarto.DISPONIBLE)){
                       VentanaPerro ventanaPerro  = new VentanaPerro(this,i);
                        ventanaPerro.setVisible(true);
                        this.dispose();
                       
                       
                       
                               
                   
                   } else {
                        
                       
                       String mensaje = "El cuarto ya se encuentra ocupado por otro canino, cuyo nombre es: "+cuarto.getPerro().getNombre()
                                + "Edad " + cuarto.getPerro().getEdad()
                                +" raza  "+ cuarto.getPerro().getRaza();
                   
                       
                       JOptionPane.showMessageDialog(null, mensaje);
                                              
                        
                       
                     
                       }       
                   }
                       
               }
    }
    
    
     private void CargarBotones() {
       int ancho = 60;
        int alto = 40;
        int separado = 20;
        int texto =1;
        
        for (int i =0;i<botones.length;i++){
            
                botones[i]= new JButton();
                
                //setBounds posX posY ancho y alto 
                botones[i].setBounds(    
                (i*ancho + separado),
                        (i*alto + separado ),
                        ancho, alto
                
                );
                
                botones[i].setText(String.valueOf(texto));
                botones[i].addActionListener(this);
                
                panelCuarto.add(botones[i]);
                texto++;
            }
        }

    private void validarPosiciones() {
         
         for (int i =0;i<botones.length;i++){
    
            Cuarto  cuarto = controladorCuarto.obtenerCuarto(i);
            if (cuarto.getEstado().equals(cuarto.DISPONIBLE)){
                botones[i].setBackground(Color.blue);
                
            } else{
                botones [i].setBackground(Color.white);
                //botones [i][j].setVisible(false);
                botones[i].setText(cuarto.getEstado());
                 botones[i].setText(cuarto.getPerro().getNombre());
                  botones[i].setText(cuarto.getPerro().getEstado());
            }
                    
            
        } 
    }

   
    
}
