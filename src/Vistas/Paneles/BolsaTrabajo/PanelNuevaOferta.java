/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.BolsaTrabajo;

import Vistas.Paneles.Beneficiario.*;
import javax.swing.JButton;

/**
 *
 * @author psylock
 */
public class PanelNuevaOferta extends javax.swing.JPanel {
  
    
    /**
     * Creates new form PanelBeneficiarioBuscar
     */
    public PanelNuevaOferta() {
        initComponents();
    }
    
    public JButton getBTEliminar1(){
        return BTEliminar1;
    }
    
    public JButton getBTGuardar(){
        return BTGuardar;
    }
    
    public JButton getBTGuardarSector(){
        return BTGuardarSector;
    }
    
    public JButton getBTLimpiar(){
        return BTLimpiar;
    }
    
    public String getTextDuracionContrato(){
        return TextDuracionContrato.getText();
    }
    
    public String getTextNIF1(){
        return TextNIF1.getText();
    }
    
    public String getTextNPuestos(){
        return TextNPuestos.getText();
    }
    
    public String getTextNuevoSector(){
        return TextNuevoSector.getText();
    }
    
    public String getcbSector(){
        return cbSector.getSelectedItem().toString();
    }
    
    public String getcbTipoContrato(){
        return cbTipoContrato.getSelectedItem().toString();
    }
    
    public String gettaCualificacion(){
        return taCualificacion.getText();
    }
    
    public String gettaPuestoOfertado(){
        return taPuestoOfertado.getText();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTLimpiar = new javax.swing.JButton();
        BTGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPuestoOfertado = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        TextNPuestos = new javax.swing.JTextField();
        cbTipoContrato = new javax.swing.JComboBox();
        jLabel75 = new javax.swing.JLabel();
        TextDuracionContrato = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        cbSector = new javax.swing.JComboBox();
        TextNIF1 = new javax.swing.JTextField();
        BTEliminar1 = new javax.swing.JButton();
        TextNuevoSector = new javax.swing.JTextField();
        BTGuardarSector = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taCualificacion = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        BTLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/limpiar.png"))); // NOI18N

        BTGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel64.setText("Descripcion del puesto ofertado");

        jLabel65.setText("Nº de puestos");

        taPuestoOfertado.setColumns(20);
        taPuestoOfertado.setRows(5);
        taPuestoOfertado.setText("Descripción completa del puesto de trabajo");
        taPuestoOfertado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jScrollPane1.setViewportView(taPuestoOfertado);

        jLabel73.setText("Tipo de contrato");

        jLabel74.setText("Duracion de contrato");

        TextNPuestos.setText("Nº");

        cbTipoContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fijo", "Temporal" }));

        jLabel75.setText("Meses");

        TextDuracionContrato.setText("12");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel64)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel65)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(TextNPuestos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(53, 53, 53)
                                .add(jLabel73)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(cbTipoContrato, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(39, 39, 39)
                                .add(jLabel74)
                                .add(18, 18, 18)
                                .add(TextDuracionContrato, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel75)))
                        .add(0, 333, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel64)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel65)
                    .add(jLabel73)
                    .add(jLabel74)
                    .add(TextNPuestos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbTipoContrato, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel75)
                    .add(TextDuracionContrato, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel66.setText("CIF/ NIF");

        jLabel72.setText("Sector");

        cbSector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economico" }));

        TextNIF1.setText("CIF/ NIF");

        BTEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        TextNuevoSector.setText("Nuevo Sector");

        BTGuardarSector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jLabel66)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(TextNIF1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(106, 106, 106)
                .add(jLabel72)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cbSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(BTEliminar1)
                .add(18, 18, 18)
                .add(TextNuevoSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(BTGuardarSector)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(BTGuardarSector)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(21, 21, 21)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(TextNIF1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel66)
                                .add(cbSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel72)))
                        .add(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .add(BTEliminar1))
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(21, 21, 21)
                            .add(TextNuevoSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel68.setForeground(java.awt.Color.red);
        jLabel68.setText("Datos Empresa");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel69.setForeground(java.awt.Color.red);
        jLabel69.setText("Datos Oferta");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setForeground(java.awt.Color.red);
        jLabel71.setText("Cualificacion Requerida");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        taCualificacion.setColumns(20);
        taCualificacion.setRows(5);
        taCualificacion.setText("Descripción completa de la cualificacion necesria");
        taCualificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jScrollPane2.setViewportView(taCualificacion);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(BTGuardar)
                        .add(18, 18, 18)
                        .add(BTLimpiar)
                        .add(389, 389, 389))
                    .add(layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(jLabel71))
                    .add(layout.createSequentialGroup()
                        .add(30, 30, 30)
                        .add(jLabel69))
                    .add(layout.createSequentialGroup()
                        .add(31, 31, 31)
                        .add(jLabel68)))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .add(jLabel68)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel69)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel71)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(BTGuardar)
                    .add(BTLimpiar))
                .add(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEliminar1;
    private javax.swing.JButton BTGuardar;
    private javax.swing.JButton BTGuardarSector;
    private javax.swing.JButton BTLimpiar;
    private javax.swing.JTextField TextDuracionContrato;
    private javax.swing.JTextField TextNIF1;
    private javax.swing.JTextField TextNPuestos;
    private javax.swing.JTextField TextNuevoSector;
    private javax.swing.JComboBox cbSector;
    private javax.swing.JComboBox cbTipoContrato;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taCualificacion;
    private javax.swing.JTextArea taPuestoOfertado;
    // End of variables declaration//GEN-END:variables
}
