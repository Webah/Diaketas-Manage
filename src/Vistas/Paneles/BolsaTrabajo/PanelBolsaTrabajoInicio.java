/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.BolsaTrabajo;

import Vistas.Paneles.Beneficiario.*;
import java.awt.event.ActionListener;

/**
 *
 * @author psylock
 */
public class PanelBolsaTrabajoInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelBeneficiarioInicio
     */
    public PanelBolsaTrabajoInicio() {
        initComponents();
    }

    // LISTENERS

    public void anadirListenerbtDemandasEmpleo(ActionListener listener){
        this.btDemandasEmpleo.addActionListener(listener);
    }
    
    public void anadirListenerbtOfertasEmpleo(ActionListener listener){
        this.btOfertadeEmpleo.addActionListener(listener);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btOfertadeEmpleo = new javax.swing.JButton();
        btDemandasEmpleo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        btOfertadeEmpleo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btOfertadeEmpleo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/ofertas.jpg"))); // NOI18N
        btOfertadeEmpleo.setActionCommand("nuevoBeneficiario");
        btOfertadeEmpleo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btOfertadeEmpleo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btOfertadeEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOfertadeEmpleoActionPerformed(evt);
            }
        });

        btDemandasEmpleo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btDemandasEmpleo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/demandas.jpg"))); // NOI18N
        btDemandasEmpleo.setActionCommand("buscarBeneficiario");
        btDemandasEmpleo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDemandasEmpleo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(126, 126, 126)
                .add(btOfertadeEmpleo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 251, Short.MAX_VALUE)
                .add(btDemandasEmpleo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(163, 163, 163)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btDemandasEmpleo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btOfertadeEmpleo))
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btOfertadeEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOfertadeEmpleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btOfertadeEmpleoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDemandasEmpleo;
    private javax.swing.JButton btOfertadeEmpleo;
    // End of variables declaration//GEN-END:variables
}
