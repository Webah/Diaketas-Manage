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
public class PanelOfertasInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelBeneficiarioInicio
     */
    public PanelOfertasInicio() {
        initComponents();
    }

    // LISTENERS

    public void anadirListenerbtConsultarOfertas(ActionListener listener){
        this.btConsultarOfertas.addActionListener(listener);
    }
    
    public void anadirListenerbtNuevaOferta(ActionListener listener){
        this.btNuevaOferta.addActionListener(listener);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevaOferta = new javax.swing.JButton();
        btConsultarOfertas = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        btNuevaOferta.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btNuevaOferta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/nuevaOferta.png"))); // NOI18N
        btNuevaOferta.setText("Nueva Oferta");
        btNuevaOferta.setToolTipText("");
        btNuevaOferta.setActionCommand("nuevoBeneficiario");
        btNuevaOferta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevaOferta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNuevaOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevaOfertaActionPerformed(evt);
            }
        });

        btConsultarOfertas.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btConsultarOfertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/buscarOferta.png"))); // NOI18N
        btConsultarOfertas.setText("Consultar Oferta");
        btConsultarOfertas.setActionCommand("buscarBeneficiario");
        btConsultarOfertas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsultarOfertas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(126, 126, 126)
                .add(btNuevaOferta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 225, Short.MAX_VALUE)
                .add(btConsultarOfertas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(163, 163, 163)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btConsultarOfertas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btNuevaOferta, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevaOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevaOfertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNuevaOfertaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarOfertas;
    private javax.swing.JButton btNuevaOferta;
    // End of variables declaration//GEN-END:variables
}
