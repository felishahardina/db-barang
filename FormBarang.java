/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.BarangController;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class FormBarang extends javax.swing.JFrame {

    BarangController cb;
    /**
     * Creates new form FormBarang
     */
    public FormBarang() {
        initComponents();
        TxtNo.setEditable(false);
        TxtNo.setEnabled(false);
        cb = new BarangController(this);
        cb.isiTable();
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
        TxtNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        TxtHarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtStok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelBarang = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        TxtCari = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Management Stok");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 140, 16);

        jLabel2.setText("No");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 40, 60, 16);

        TxtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNo);
        TxtNo.setBounds(130, 40, 180, 22);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 70, 60, 16);
        getContentPane().add(TxtNama);
        TxtNama.setBounds(130, 70, 180, 22);
        getContentPane().add(TxtHarga);
        TxtHarga.setBounds(130, 100, 180, 22);

        jLabel4.setText("Harga");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 60, 16);

        jLabel5.setText("Stok");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 130, 70, 16);
        getContentPane().add(TxtStok);
        TxtStok.setBounds(130, 130, 180, 22);

        TabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Harga", "Stok"
            }
        ));
        TabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelBarang);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 370, 180);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(330, 40, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(330, 70, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(330, 100, 72, 23);
        getContentPane().add(TxtCari);
        TxtCari.setBounds(150, 160, 148, 22);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(330, 160, 72, 23);

        jLabel6.setText("Cari Nama Barang");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 160, 96, 16);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(330, 130, 72, 23);

        setSize(new java.awt.Dimension(451, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        cb.reset();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        cb.insert();
        cb.isiTable();
        cb.reset();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        cb.delete();
        cb.isiTable();
        cb.reset();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelBarangMouseClicked
        // TODO add your handling code here:
        cb.isiField(TabelBarang.getSelectedRow());
    }//GEN-LAST:event_TabelBarangMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        cb.update();
        cb.isiTable();
        cb.reset();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        cb.cariNama();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void TxtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNoActionPerformed

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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelBarang;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtNo;
    private javax.swing.JTextField TxtStok;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelBarang() {
        return TabelBarang;
    }

    public void setTabelBarang(JTable TabelBarang) {
        this.TabelBarang = TabelBarang;
    }

    public JTextField getTxtCari() {
        return TxtCari;
    }

    public void setTxtCari(JTextField TxtCari) {
        this.TxtCari = TxtCari;
    }

    public JTextField getTxtHarga() {
        return TxtHarga;
    }

    public void setTxtHarga(JTextField TxtHarga) {
        this.TxtHarga = TxtHarga;
    }

    public JTextField getTxtNama() {
        return TxtNama;
    }

    public void setTxtNama(JTextField TxtNama) {
        this.TxtNama = TxtNama;
    }

    public JTextField getTxtNo() {
        return TxtNo;
    }

    public void setTxtNo(JTextField TxtNo) {
        this.TxtNo = TxtNo;
    }

    public JTextField getTxtStok() {
        return TxtStok;
    }

    public void setTxtStok(JTextField TxtStok) {
        this.TxtStok = TxtStok;
    }

    public JButton getBtnCari() {
        return btnSearch;
    }

    public void setBtnCari(JButton btnCari) {
        this.btnSearch = btnCari;
    }

    public JButton getBtnHapus() {
        return btnDelete;
    }

    public void setBtnHapus(JButton btnHapus) {
        this.btnDelete = btnHapus;
    }

    public JButton getBtnPerbarui() {
        return btnUpdate;
    }

    public void setBtnPerbarui(JButton btnPerbarui) {
        this.btnUpdate = btnPerbarui;
    }

    public JButton getBtnTambah() {
        return btnInsert;
    }

    public void setBtnTambah(JButton btnTambah) {
        this.btnInsert = btnTambah;
    } 
}

