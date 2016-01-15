/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.admin;

import javax.swing.JCheckBox;
import util.ButtonEditorIzmeniKategoriju;
import util.ButtonEditorIzmeniPotkategoriju;
import util.ButtonEditorIzmeniStavkuMenija;
import util.ButtonEditorObrisiKategoriju;
import util.ButtonEditorObrisiPotkategoriju;
import util.ButtonEditorObrisiStavkuMenija;
import util.ButtonRenderer;
import domen.Kategorija;
import util.KategorijaModelTabele;
import util.PotkategorijaModelTabele;
import util.SingletonHolder;
import util.StavkaMenijaModelTabele;

/**
 *
 * @author Megi
 */
public class FJelovnik extends javax.swing.JPanel {

    /**
     * Creates new form FJelovnik
     */
    public FJelovnik() {
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblKategorije = new javax.swing.JTable();
        jbtnKategorija = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtnPotkategorija = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblPotkategorije = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jbtnStavkaMenija = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblStavke = new javax.swing.JTable();

        jLabel1.setText("Kategorije");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Jelovnik");

        jtblKategorije.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblKategorije);

        jbtnKategorija.setText("+ Dodaj kategoriju");
        jbtnKategorija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKategorijaActionPerformed(evt);
            }
        });

        jLabel3.setText("Potkategorije");

        jbtnPotkategorija.setText("+ Dodaj potkategoriju");
        jbtnPotkategorija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPotkategorijaActionPerformed(evt);
            }
        });

        jtblPotkategorije.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtblPotkategorije);

        jLabel4.setText("Stavke menija");

        jbtnStavkaMenija.setText("+ Dodaj stavku menija");
        jbtnStavkaMenija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnStavkaMenijaActionPerformed(evt);
            }
        });

        jtblStavke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtblStavke);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel2)
                        .addGap(0, 315, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnPotkategorija))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnKategorija)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnStavkaMenija))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbtnKategorija))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbtnPotkategorija))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jbtnStavkaMenija))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnKategorijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKategorijaActionPerformed
        FKategorija kategorijaForma = new FKategorija(jtblKategorije);
        kategorijaForma.setVisible(true);
    }//GEN-LAST:event_jbtnKategorijaActionPerformed

    private void jbtnPotkategorijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPotkategorijaActionPerformed
        FPotkategorija potkategorijaForma = new FPotkategorija(jtblPotkategorije);
        potkategorijaForma.setVisible(true);
    }//GEN-LAST:event_jbtnPotkategorijaActionPerformed

    private void jbtnStavkaMenijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStavkaMenijaActionPerformed
        FStavkaMenija stavkaMenijaForma = new FStavkaMenija(jtblStavke);
        stavkaMenijaForma.setVisible(true);
    }//GEN-LAST:event_jbtnStavkaMenijaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnKategorija;
    private javax.swing.JButton jbtnPotkategorija;
    private javax.swing.JButton jbtnStavkaMenija;
    private javax.swing.JTable jtblKategorije;
    private javax.swing.JTable jtblPotkategorije;
    private javax.swing.JTable jtblStavke;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        
        //tabela kategorije
       
        jtblKategorije.setModel(new KategorijaModelTabele(SingletonHolder.getInstance().getKategorije()));
        jtblKategorije.getColumn("Izmeni").setCellRenderer(new ButtonRenderer());

        jtblKategorije.getColumn("Izmeni").setCellEditor(new ButtonEditorIzmeniKategoriju(new JCheckBox(),
                jtblKategorije));
        jtblKategorije.getColumn("Obriši").setCellRenderer(new ButtonRenderer());

        jtblKategorije.getColumn("Obriši").setCellEditor(new ButtonEditorObrisiKategoriju(new JCheckBox(),
                jtblKategorije));
        
         //tabela potkategorije
       
        jtblPotkategorije.setModel(new PotkategorijaModelTabele(SingletonHolder.getInstance().getPotkategorije()));
        jtblPotkategorije.getColumn("Izmeni").setCellRenderer(new ButtonRenderer());

        jtblPotkategorije.getColumn("Izmeni").setCellEditor(new ButtonEditorIzmeniPotkategoriju(new JCheckBox(),
                jtblPotkategorije));
        jtblPotkategorije.getColumn("Obriši").setCellRenderer(new ButtonRenderer());

        jtblPotkategorije.getColumn("Obriši").setCellEditor(new ButtonEditorObrisiPotkategoriju(new JCheckBox(),
                jtblPotkategorije));
        
         //tabela stavke menija
       
        jtblStavke.setModel(new StavkaMenijaModelTabele(SingletonHolder.getInstance().getStavkeMenija()));
        jtblStavke.getColumn("Izmeni").setCellRenderer(new ButtonRenderer());

        jtblStavke.getColumn("Izmeni").setCellEditor(new ButtonEditorIzmeniStavkuMenija(new JCheckBox(),
                jtblStavke));
        jtblStavke.getColumn("Obriši").setCellRenderer(new ButtonRenderer());

        jtblStavke.getColumn("Obriši").setCellEditor(new ButtonEditorObrisiStavkuMenija(new JCheckBox(),
                jtblStavke));
        
    }
}
