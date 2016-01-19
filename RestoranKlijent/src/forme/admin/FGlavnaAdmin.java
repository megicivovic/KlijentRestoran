/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.admin;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.SingletonHolder;

/**
 *
 * @author Megi
 */
public class FGlavnaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FGlavna
     */
    public FGlavnaAdmin() {
        initComponents();
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                SingletonHolder.getInstance().odstampajPodatke();

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnJelovnik = new javax.swing.JButton();
        jbtnKorisnici = new javax.swing.JButton();
        jbtnNarudzbine = new javax.swing.JButton();
        jbtnPocetna = new javax.swing.JButton();
        jbtnOdjava = new javax.swing.JButton();
        jbtnNalog = new javax.swing.JButton();
        jpnlGlavna = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnJelovnik.setText("Jelovnik");
        jbtnJelovnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnJelovnikActionPerformed(evt);
            }
        });

        jbtnKorisnici.setText("Korisnici ");
        jbtnKorisnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKorisniciActionPerformed(evt);
            }
        });

        jbtnNarudzbine.setText("Narudžbine");
        jbtnNarudzbine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNarudzbineActionPerformed(evt);
            }
        });

        jbtnPocetna.setText("Početna");
        jbtnPocetna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPocetnaActionPerformed(evt);
            }
        });

        jbtnOdjava.setText("Odjava");
        jbtnOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOdjavaActionPerformed(evt);
            }
        });

        jbtnNalog.setText("Moj nalog");
        jbtnNalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNalogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlGlavnaLayout = new javax.swing.GroupLayout(jpnlGlavna);
        jpnlGlavna.setLayout(jpnlGlavnaLayout);
        jpnlGlavnaLayout.setHorizontalGroup(
            jpnlGlavnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jpnlGlavnaLayout.setVerticalGroup(
            jpnlGlavnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnJelovnik, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnKorisnici, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPocetna, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNarudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnOdjava, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNalog, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlGlavna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtnPocetna, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnJelovnik, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnKorisnici, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnNarudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnNalog, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnOdjava, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlGlavna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbtnJelovnik, jbtnKorisnici, jbtnNalog, jbtnNarudzbine, jbtnOdjava, jbtnPocetna});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOdjavaActionPerformed

        int n = JOptionPane.showConfirmDialog(jpnlGlavna, "Da li ste sigurni da želite da se odjavite?", "Odjava",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            FLogin loginForma = new FLogin();
            loginForma.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jbtnOdjavaActionPerformed

    private void jbtnPocetnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPocetnaActionPerformed
        jpnlGlavna.removeAll();
        jpnlGlavna.repaint();
    }//GEN-LAST:event_jbtnPocetnaActionPerformed

    private void jbtnJelovnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnJelovnikActionPerformed
        jpnlGlavna.removeAll();
        jpnlGlavna.repaint();
        JPanel jpnlJelovnik = new FJelovnik();
        jpnlJelovnik.setSize(jpnlGlavna.getWidth(), jpnlGlavna.getHeight());
        jpnlGlavna.add(jpnlJelovnik);
        jpnlGlavna.validate();
        this.validate();
    }//GEN-LAST:event_jbtnJelovnikActionPerformed

    private void jbtnKorisniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKorisniciActionPerformed
        jpnlGlavna.removeAll();
        jpnlGlavna.repaint();
        JPanel jpnlKorisnici = new FKorisnici();
        jpnlKorisnici.setSize(jpnlGlavna.getWidth(), jpnlGlavna.getHeight());
        jpnlGlavna.add(jpnlKorisnici);
        jpnlGlavna.validate();
        this.validate();

    }//GEN-LAST:event_jbtnKorisniciActionPerformed

    private void jbtnNarudzbineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNarudzbineActionPerformed
        jpnlGlavna.removeAll();
        jpnlGlavna.repaint();
        JPanel jpnlNarudzbine = new FNarudzbine();
        jpnlNarudzbine.setSize(jpnlGlavna.getWidth(), jpnlGlavna.getHeight());
        jpnlGlavna.add(jpnlNarudzbine);
        jpnlGlavna.validate();
        this.validate();

    }//GEN-LAST:event_jbtnNarudzbineActionPerformed

    private void jbtnNalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNalogActionPerformed
        jpnlGlavna.removeAll();
        jpnlGlavna.repaint();
        JPanel jpnlMojNalog = new FMojNalog();
        jpnlMojNalog.setSize(jpnlGlavna.getWidth(), jpnlGlavna.getHeight());
        jpnlGlavna.add(jpnlMojNalog);
        jpnlGlavna.validate();
        this.validate();

    }//GEN-LAST:event_jbtnNalogActionPerformed

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
            java.util.logging.Logger.getLogger(FGlavnaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FGlavnaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FGlavnaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FGlavnaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FGlavnaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnJelovnik;
    private javax.swing.JButton jbtnKorisnici;
    private javax.swing.JButton jbtnNalog;
    private javax.swing.JButton jbtnNarudzbine;
    private javax.swing.JButton jbtnOdjava;
    private javax.swing.JButton jbtnPocetna;
    private javax.swing.JPanel jpnlGlavna;
    // End of variables declaration//GEN-END:variables
}
