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
public class PanelDemandasInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelBeneficiarioInicio
     */
    public PanelDemandasInicio() {
        initComponents();
    }

    // LISTENERS

    public void anadirListenerbtBuscarBeneficiario(ActionListener listener){
        this.btConsultarDemanda.addActionListener(listener);
    }
    
    public void anadirListenerbtNuevoBeneficiario(ActionListener listener){
        this.btNuevaDemanda.addActionListener(listener);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevaDemanda = new javax.swing.JButton();
        btConsultarDemanda = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        btNuevaDemanda.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btNuevaDemanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/nuevaDemanda.jpg"))); // NOI18N
        btNuevaDemanda.setText("Nueva Demanda");
        btNuevaDemanda.setActionCommand("nuevoBeneficiario");
        btNuevaDemanda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevaDemanda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNuevaDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevaDemandaActionPerformed(evt);
            }
        });

        btConsultarDemanda.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btConsultarDemanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/buscarDemanda.png"))); // NOI18N
        btConsultarDemanda.setText("Consultar Demanda");
        btConsultarDemanda.setActionCommand("buscarBeneficiario");
        btConsultarDemanda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsultarDemanda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(126, 126, 126)
                .add(btNuevaDemanda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 225, Short.MAX_VALUE)
                .add(btConsultarDemanda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(163, 163, 163)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btConsultarDemanda, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btNuevaDemanda, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevaDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevaDemandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNuevaDemandaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarDemanda;
    private javax.swing.JButton btNuevaDemanda;
    // End of variables declaration//GEN-END:variables
}