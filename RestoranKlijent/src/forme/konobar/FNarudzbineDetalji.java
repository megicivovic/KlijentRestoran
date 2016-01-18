/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.konobar;

import domen.Narudzbina;
import domen.StavkaNarudzbine;
import util.SingletonHolder;
import util.StavkeNarudzbineModelTabele;

/**
 *
 * @author Megi
 */
public class FNarudzbineDetalji extends javax.swing.JFrame {

    private Narudzbina narudzbina;

    /**
     * Creates new form FNarudzbineDetalji
     */
    public FNarudzbineDetalji() {
        initComponents();

    }

    public FNarudzbineDetalji(Narudzbina narudzbina) {
        initComponents();
        this.narudzbina = narudzbina;
        srediFormu();

        //to do -stavke model i greske svuda
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtSto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtPlaceno = new javax.swing.JTextField();
        jbtnUkloniStavku = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblStavke = new javax.swing.JTable();
        jbtnDodajStavku = new javax.swing.JButton();
        jbtnObelezi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Narudzbina");

        jLabel1.setText("Sto");

        jLabel2.setText("Plaćeno");

        jbtnUkloniStavku.setText("- Ukloni stavke");
        jbtnUkloniStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUkloniStavkuActionPerformed(evt);
            }
        });

        jtblStavke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblStavke);

        jbtnDodajStavku.setText("+ Dodaj stavku");
        jbtnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajStavkuActionPerformed(evt);
            }
        });

        jbtnObelezi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtnObelezi.setText("Obeleži sve stavke");
        jbtnObelezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObeleziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtPlaceno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtSto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jbtnObelezi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jbtnDodajStavku)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnUkloniStavku))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtSto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtPlaceno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnObelezi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDodajStavku)
                    .addComponent(jbtnUkloniStavku))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajStavkuActionPerformed
        FStavkaNarudzbine fsn = new FStavkaNarudzbine(jtblStavke);
        fsn.setVisible(true);
    }//GEN-LAST:event_jbtnDodajStavkuActionPerformed

    private void jbtnUkloniStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUkloniStavkuActionPerformed
        for (int i = 0; i < ((StavkeNarudzbineModelTabele) jtblStavke.getModel()).vratiListu().size(); i++) {
            StavkaNarudzbine sn = ((StavkeNarudzbineModelTabele) jtblStavke.getModel()).vratiListu().get(i);
            if (sn.isPlaceno()) {
                ((StavkeNarudzbineModelTabele) jtblStavke.getModel()).vratiListu().remove(sn);
            }
        }
        jtblStavke.revalidate();
        jtblStavke.repaint();

    }//GEN-LAST:event_jbtnUkloniStavkuActionPerformed

    private void jbtnObeleziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObeleziActionPerformed
        for (int i = 0; i < ((StavkeNarudzbineModelTabele) jtblStavke.getModel()).vratiListu().size(); i++) {
            ((StavkeNarudzbineModelTabele) jtblStavke.getModel()).vratiListu().get(i).setPlaceno(true);
        }

    }//GEN-LAST:event_jbtnObeleziActionPerformed

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
            java.util.logging.Logger.getLogger(FNarudzbineDetalji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FNarudzbineDetalji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FNarudzbineDetalji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FNarudzbineDetalji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FNarudzbineDetalji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDodajStavku;
    private javax.swing.JButton jbtnObelezi;
    private javax.swing.JButton jbtnUkloniStavku;
    private javax.swing.JTable jtblStavke;
    private javax.swing.JTextField jtxtPlaceno;
    private javax.swing.JTextField jtxtSto;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        jtxtSto.setText(narudzbina.getSto());
        if (narudzbina.getStavke().size() == 0) {
            jtxtPlaceno.setText("da");
        } else {
            jtxtPlaceno.setText("ne");
        }
        jtblStavke.setModel(new StavkeNarudzbineModelTabele(narudzbina.getStavke()));
        if (SingletonHolder.getInstance().getUlogovaniKorisnik().getKorisnickoIme().equals("admin")) {
            jtxtSto.setEnabled(false);
            jtxtPlaceno.setEnabled(false);
            jbtnDodajStavku.setVisible(false);
            jbtnUkloniStavku.setVisible(false);
            jtblStavke.setEnabled(false);
        }
    }

}
