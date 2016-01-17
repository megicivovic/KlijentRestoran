/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.konobar;

import javax.swing.JCheckBox;
import util.ButtonEditorNarudzbinaDetalji;
import util.ButtonEditorObrisiNarudzbinu;
import util.ButtonRenderer;
import util.NarudzbinaModelTabeleKonobar;
import util.SingletonHolder;

/**
 *
 * @author Megi
 */
public class FNarudzbine extends javax.swing.JPanel {

    /**
     * Creates new form FNarudzbine
     */
    public FNarudzbine() {
        initComponents();
        srediFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblNarudzbine = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Narudžbine");

        jtblNarudzbine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblNarudzbine);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblNarudzbine;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        jtblNarudzbine.setModel(new NarudzbinaModelTabeleKonobar(SingletonHolder.getInstance().getNarudzbine(SingletonHolder.getInstance().getUlogovaniKorisnik())));
        jtblNarudzbine.getColumn("Detalji").setCellRenderer(new ButtonRenderer());

        jtblNarudzbine.getColumn("Detalji").setCellEditor(new ButtonEditorNarudzbinaDetalji(new JCheckBox(),
                jtblNarudzbine));
        jtblNarudzbine.getColumn("Obriši").setCellRenderer(new ButtonRenderer());

        jtblNarudzbine.getColumn("Obriši").setCellEditor(new ButtonEditorObrisiNarudzbinu(new JCheckBox(),
                jtblNarudzbine));

    }
}
