/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Voluntario;

/**
 *
 * @author Alberto
 */
public class PanelVoluntarioColaboraciones extends javax.swing.JPanel {

    /**
     * Creates new form PanelVoluntarioColaboraciones
     */
    public PanelVoluntarioColaboraciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAñadirColaboraciones = new javax.swing.JButton();
        btComprobarPagos = new javax.swing.JButton();

        btAñadirColaboraciones.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btAñadirColaboraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/colaborador_1.jpg"))); // NOI18N
        btAñadirColaboraciones.setText("Añadir Colaboraciones");
        btAñadirColaboraciones.setActionCommand("nuevoBeneficiario");
        btAñadirColaboraciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAñadirColaboraciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btComprobarPagos.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btComprobarPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/formadepago_1.jpg"))); // NOI18N
        btComprobarPagos.setText("Comprobar Pagos");
        btComprobarPagos.setActionCommand("buscarBeneficiario");
        btComprobarPagos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btComprobarPagos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btAñadirColaboraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(btComprobarPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btComprobarPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAñadirColaboraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAñadirColaboraciones;
    private javax.swing.JButton btComprobarPagos;
    // End of variables declaration//GEN-END:variables
}