/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.admin;

import domen.Narudzbina;
import domen.StavkaNarudzbine;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import util.ButtonEditorNarudzbinaDetalji;
import util.ButtonRenderer;
import util.DateLabelFormatter;
import util.NarudzbinaModelTabeleAdministrator;
import util.SingletonHolder;

/**
 *
 * @author Megi
 */
public class FNarudzbine extends javax.swing.JPanel {

    private JDatePickerImpl datePicker;
    boolean kategorijaPromenjena;
    boolean potkategorijaPromenjena;
    boolean stavkaMenijaPromenjena;

    /**
     * Creates new form FKorisnici
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
        jtxtSto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtKonobar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtnPronadji = new javax.swing.JButton();
        comboPotkategorija = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboKategorija = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        comboStavkaMenija = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblNarudzbine = new javax.swing.JTable();
        jpnlDatum = new javax.swing.JPanel();
        jBtnPonisti = new javax.swing.JButton();

        jLabel1.setText("Dan");

        jLabel2.setText("Sto");

        jLabel3.setText("Konobar");

        jbtnPronadji.setText("Pronađi");
        jbtnPronadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPronadjiActionPerformed(evt);
            }
        });

        jLabel7.setText("Potkategorija");

        jLabel8.setText("Kategorija");

        jLabel9.setText("Stavka menija");

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

        javax.swing.GroupLayout jpnlDatumLayout = new javax.swing.GroupLayout(jpnlDatum);
        jpnlDatum.setLayout(jpnlDatumLayout);
        jpnlDatumLayout.setHorizontalGroup(
            jpnlDatumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        jpnlDatumLayout.setVerticalGroup(
            jpnlDatumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jBtnPonisti.setText("X   Poništi filtere");
        jBtnPonisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPonistiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(comboKategorija, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jpnlDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPotkategorija, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboStavkaMenija, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtKonobar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnPronadji)
                .addGap(104, 104, 104)
                .addComponent(jBtnPonisti)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtKonobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnlDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPotkategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboStavkaMenija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPonisti, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPronadji, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPronadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPronadjiActionPerformed
        List<Narudzbina> narudzbine = ((NarudzbinaModelTabeleAdministrator) jtblNarudzbine.getModel()).vratiListu();
        jtblNarudzbine.setModel(new NarudzbinaModelTabeleAdministrator(narudzbine));
        List<Narudzbina> narudzbinePretraga = new ArrayList<Narudzbina>(narudzbine);

        if ((java.util.Date) datePicker.getModel().getValue() != null) {
            for (int i = narudzbinePretraga.size() - 1; i >= 0; i--) {
                Narudzbina n = narudzbinePretraga.get(i);
                GregorianCalendar dan = new GregorianCalendar();
                dan.setTime((java.util.Date) datePicker.getModel().getValue());

                GregorianCalendar dan2 = new GregorianCalendar();
                dan2.setTime((java.util.Date) n.getVreme());

                if (!(dan.get(GregorianCalendar.DAY_OF_MONTH) == dan2.get(GregorianCalendar.DAY_OF_MONTH) && dan.get(GregorianCalendar.MONTH) == dan2.get(GregorianCalendar.MONTH))) {
                    narudzbinePretraga.remove(n);
                }
            }
        }

        if (!jtxtSto.getText().equals("")) {
            for (int i = narudzbinePretraga.size() - 1; i >= 0; i--) {
                Narudzbina n1 = narudzbinePretraga.get(i);

                if (!n1.getSto().contains(jtxtSto.getText())) {
                    narudzbinePretraga.remove(n1);
                }
            }
        }

        if (!jtxtSto.getText().equals("")) {
            for (int i = 0; i < narudzbinePretraga.size(); i++) {
                Narudzbina n = narudzbinePretraga.get(i);

                if (!n.getSto().contains(jtxtSto.getText())) {
                    narudzbinePretraga.remove(n);
                }
            }
        }

        if (!jtxtKonobar.getText().equals("")) {
         for (int i = narudzbinePretraga.size() - 1; i >= 0; i--) {
                Narudzbina n = narudzbinePretraga.get(i);

                if (!n.getKonobar().getIme().contains(jtxtKonobar.getText())) {
                    narudzbinePretraga.remove(n);
                }
            }
        }

        if (kategorijaPromenjena) {
           for (int i = narudzbinePretraga.size() - 1; i >= 0; i--) {
                Narudzbina n = narudzbinePretraga.get(i);

                for (int j = 0; j < n.getStavke().size(); j++) {
                    StavkaNarudzbine sm = n.getStavke().get(j);
                    if (!sm.getStavkaMenija().getPotkategorija().getKategorija().equals(comboKategorija.getSelectedItem())) {
                        narudzbinePretraga.remove(n);
                    }
                }
            }

        }
        if (potkategorijaPromenjena) {
            for (int i = narudzbinePretraga.size() - 1; i >= 0; i--) {
                Narudzbina n = narudzbinePretraga.get(i);
                for (int j = 0; j < n.getStavke().size(); j++) {
                    StavkaNarudzbine sm = n.getStavke().get(j);
                    if (!sm.getStavkaMenija().getPotkategorija().equals(comboPotkategorija.getSelectedItem())) {
                        narudzbinePretraga.remove(n);
                    }
                }
            }

        }

        if (stavkaMenijaPromenjena) {
           for (int i = narudzbinePretraga.size() - 1; i >= 0; i--) {
                Narudzbina n = narudzbinePretraga.get(i);
                for (int j = 0; j < n.getStavke().size(); j++) {
                    StavkaNarudzbine sm = n.getStavke().get(j);
                    if (!sm.equals(comboStavkaMenija.getSelectedItem())) {
                        narudzbinePretraga.remove(n);
                    }
                }
            }

        }

        jtblNarudzbine.setModel(new NarudzbinaModelTabeleAdministrator(narudzbinePretraga));
        jtblNarudzbine.revalidate();
        jtblNarudzbine.repaint();
        jtblNarudzbine.getColumn("Detalji").setCellRenderer(new ButtonRenderer());

        jtblNarudzbine.getColumn("Detalji").setCellEditor(new ButtonEditorNarudzbinaDetalji(new JCheckBox(),
                jtblNarudzbine));

        if (narudzbinePretraga.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nema narudžbina koje zadovoljavaju rezultate pretrage!", "Pretraga", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jbtnPronadjiActionPerformed

    private void jBtnPonistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPonistiActionPerformed
        jtblNarudzbine.setModel(new NarudzbinaModelTabeleAdministrator(SingletonHolder.getInstance().getNarudzbine()));
        jtxtKonobar.setText("");
        jtxtSto.setText("");
        datePicker.revalidate();
        datePicker.repaint();
        kategorijaPromenjena = false;
        potkategorijaPromenjena = false;
        stavkaMenijaPromenjena = false;
        jtblNarudzbine.getColumn("Detalji").setCellRenderer(new ButtonRenderer());

        jtblNarudzbine.getColumn("Detalji").setCellEditor(new ButtonEditorNarudzbinaDetalji(new JCheckBox(),
                jtblNarudzbine));
    }//GEN-LAST:event_jBtnPonistiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboKategorija;
    private javax.swing.JComboBox comboPotkategorija;
    private javax.swing.JComboBox comboStavkaMenija;
    private javax.swing.JButton jBtnPonisti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnPronadji;
    private javax.swing.JPanel jpnlDatum;
    private javax.swing.JTable jtblNarudzbine;
    private javax.swing.JTextField jtxtKonobar;
    private javax.swing.JTextField jtxtSto;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        jtblNarudzbine.setModel(new NarudzbinaModelTabeleAdministrator(SingletonHolder.getInstance().getNarudzbine()));
        jtblNarudzbine.getColumn("Detalji").setCellRenderer(new ButtonRenderer());

        jtblNarudzbine.getColumn("Detalji").setCellEditor(new ButtonEditorNarudzbinaDetalji(new JCheckBox(),
                jtblNarudzbine));
        comboKategorija.setModel(new DefaultComboBoxModel(SingletonHolder.getInstance().getKategorije().toArray()));
        comboPotkategorija.setModel(new DefaultComboBoxModel(SingletonHolder.getInstance().getPotkategorije().toArray()));
        comboStavkaMenija.setModel(new DefaultComboBoxModel(SingletonHolder.getInstance().getStavkeMenija().toArray()));

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setVisible(true);

        jpnlDatum.setLayout(new BorderLayout());

        jpnlDatum.add(datePicker, BorderLayout.CENTER);

        datePicker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(datePicker.getParent().getParent(), "Nema rezervacija za traženi dan", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        comboKategorija.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                kategorijaPromenjena = true;
            }

        });
        comboPotkategorija.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                potkategorijaPromenjena = true;
            }

        });
        comboStavkaMenija.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                stavkaMenijaPromenjena = true;
            }

        });
    }
}
