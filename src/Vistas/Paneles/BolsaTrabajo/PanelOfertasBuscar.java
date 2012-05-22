/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.BolsaTrabajo;

import Vistas.Paneles.Beneficiario.*;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/**
 *
 * @author psylock
 */
public class PanelOfertasBuscar extends javax.swing.JPanel {
  
    
    /**
     * Creates new form PanelBeneficiarioBuscar
     */
    public PanelOfertasBuscar() {
        initComponents();
    }
    
    public JButton getBTEliminar(){
        return BTEliminar;
    }
    
    public JButton getBTModificar(){
        return BTModificar;
    }
    
    public JButton getBTBuscar(){
        return BTBuscar;
    }
    
    public String getcbAntiguedad(){
        return cbAntiguedad.getSelectedItem().toString();
    }
    
    public String getcbSector(){
        return cbSector.getSelectedItem().toString();
    }
    
    public void settablaBusquedaOferta(JTableHeader Oferta){
        tablaBusquedaOferta.setTableHeader(Oferta);
    }
    
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        tablaBusquedaOferta = new javax.swing.JTable();
        jLabel64 = new javax.swing.JLabel();
        cbSector = new javax.swing.JComboBox();
        jLabel65 = new javax.swing.JLabel();
        cbAntiguedad = new javax.swing.JComboBox();
        BTEliminar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();
        BTBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        tablaBusquedaOferta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"F12344322", "Reformas chapuza", "Construccion", "12/01/2012"},
                {null, null, null, null}
            },
            new String [] {
                "CIF", "Razon Social", "Sector", "Fecha Demanda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaBusquedaOferta);

        jLabel64.setText("Sector Busqueda");

        cbSector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Construccion", "Electricidad", "Carpinteria", "Fontaneria", " " }));

        jLabel65.setText("Antiguedad");

        cbAntiguedad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 mes", "2 meses", "3 meses", "4 meses", "5 meses", "6 meses", "7 meses", "8 meses", "9 meses", "10 meses", "11 meses", "12 meses", "mas de 1 año", " " }));

        BTEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        BTModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/modificar.png"))); // NOI18N

        BTBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/consultar.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .add(BTBuscar)
                .add(18, 18, 18)
                .add(BTModificar)
                .add(18, 18, 18)
                .add(BTEliminar)
                .add(389, 389, 389))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 948, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(62, 62, 62)
                        .add(jLabel64)
                        .add(18, 18, 18)
                        .add(cbSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(46, 46, 46)
                        .add(jLabel65)
                        .add(18, 18, 18)
                        .add(cbAntiguedad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(51, 51, 51)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel64)
                    .add(cbSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel65)
                    .add(cbAntiguedad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jScrollPane5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .add(87, 87, 87)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(BTEliminar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(BTModificar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(BTBuscar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBuscar;
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTModificar;
    private javax.swing.JComboBox cbAntiguedad;
    private javax.swing.JComboBox cbSector;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaBusquedaOferta;
    // End of variables declaration//GEN-END:variables
}
