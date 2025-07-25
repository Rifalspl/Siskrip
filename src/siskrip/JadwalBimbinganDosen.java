/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siskrip;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class JadwalBimbinganDosen extends javax.swing.JFrame {

    /**
     * Creates new form JadwalBimbinganDosen
     */
    public JadwalBimbinganDosen() {
        initComponents();
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum", "Selesai" }));
        tampilkanJadwalBimbingan();
    }
    
   
    private void tampilkanJadwalBimbingan() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("NIM");
    model.addColumn("Tanggal");
    model.addColumn("Waktu");    // <--- Ganti dari "Jam"
    model.addColumn("Status");

    try {
        Connection conn = Koneksi.getConnection();
        String sql = "SELECT id_jadwal, nim, tanggal, waktu, status FROM jadwal_bimbingan ORDER BY tanggal DESC, waktu DESC";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_jadwal"),
                rs.getString("nim"),
                rs.getString("tanggal"),
                rs.getString("waktu"),   // <--- Ganti dari "jam"
                rs.getString("status")
            });
        }
        tblKalender.setModel(model);
        rs.close();
        stmt.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal menampilkan jadwal: " + ex.getMessage());
    }
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKalender = new javax.swing.JTable();
        txtCariNIM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTanggal = new javax.swing.JTextField();
        txtWaktu = new javax.swing.JTextField();
        txtNIM = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(119, 190, 240));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JADWAL TAMBAHAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 203, 97))); // NOI18N

        tblKalender.setBackground(new java.awt.Color(255, 137, 79));
        tblKalender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKalender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKalenderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKalender);

        jButton1.setText("CARI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton3.setBackground(new java.awt.Color(234, 91, 111));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("TAMBAH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(234, 91, 111));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("EDIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(234, 91, 111));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("HAPUS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Cari Nim Anda :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tentukan Tanggal Dan Waktu :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Masukkan Nim :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Pilih Status :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(159, 159, 159)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(txtWaktu))
                        .addComponent(txtNIM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCariNIM, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2))))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCariNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton3)
                .addGap(30, 30, 30))
        );

        jMenu5.setText("KEMBALI");

        jMenuItem9.setText("BACK");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    String nim = txtNIM.getText().trim();
    String tanggal = txtTanggal.getText().trim();
    String jam = txtWaktu.getText().trim();
    String status = cmbStatus.getSelectedItem().toString();

    if(nim.isEmpty() || tanggal.isEmpty() || jam.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Lengkapi data jadwal bimbingan!");
        return;
    }

    try {
        Connection conn = Koneksi.getConnection();
        String sql = "INSERT INTO jadwal_bimbingan (nim, tanggal, waktu, status) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, nim);
        pst.setString(2, tanggal);
        pst.setString(3, jam);
        pst.setString(4, status);

        pst.executeUpdate();
        pst.close();

        JOptionPane.showMessageDialog(this, "Jadwal berhasil ditambah!");
        tampilkanJadwalBimbingan();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal tambah jadwal: " + ex.getMessage());
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    int row = tblKalender.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data jadwal yang akan diedit!");
        return;
    }
    String id = tblKalender.getValueAt(row, 0).toString();
    String nim = txtNIM.getText().trim();
    String tanggal = txtTanggal.getText().trim();
    String waktu = txtWaktu.getText().trim();
    String status = cmbStatus.getSelectedItem().toString();

    if(nim.isEmpty() || tanggal.isEmpty() || waktu.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Lengkapi data jadwal bimbingan!");
        return;
    }

    try {
        Connection conn = Koneksi.getConnection();
        String sql = "UPDATE jadwal_bimbingan SET nim=?, tanggal=?, waktu=?, status=? WHERE id_jadwal=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, nim);
        pst.setString(2, tanggal);
        pst.setString(3, waktu);
        pst.setString(4, status);
        pst.setString(5, id);

        pst.executeUpdate();
        pst.close();

        JOptionPane.showMessageDialog(this, "Jadwal berhasil diupdate!");
        tampilkanJadwalBimbingan();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal update jadwal: " + ex.getMessage());
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    int row = tblKalender.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data jadwal yang akan dihapus!");
        return;
    }
    String id = tblKalender.getValueAt(row, 0).toString();

    int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin hapus jadwal ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (konfirmasi != JOptionPane.YES_OPTION) return;

    try {
        Connection conn = Koneksi.getConnection();
        String sql = "DELETE FROM jadwal_bimbingan WHERE id_jadwal=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, id);

        pst.executeUpdate();
        pst.close();

        JOptionPane.showMessageDialog(this, "Jadwal berhasil dihapus!");
        tampilkanJadwalBimbingan();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal hapus jadwal: " + ex.getMessage());
    }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String cariNIM = txtCariNIM.getText().trim();
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("NIM");
    model.addColumn("Tanggal");
    model.addColumn("Waktu");
    model.addColumn("Status");

    try {
        Connection conn = Koneksi.getConnection();
        String sql = "SELECT id_jadwal, nim, tanggal, waktu, status FROM jadwal_bimbingan WHERE nim = ? ORDER BY tanggal DESC, jam DESC";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, cariNIM);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_jadwal"),
                rs.getString("nim"),
                rs.getString("tanggal"),
                rs.getString("waktu"),
                rs.getString("status")
            });
        }
        tblKalender.setModel(model);
        rs.close();
        pst.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal filter jadwal: " + ex.getMessage());
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tampilkanJadwalBimbingan();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblKalenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKalenderMouseClicked

    int row = tblKalender.getSelectedRow();
    if (row != -1) {
        txtNIM.setText(tblKalender.getValueAt(row, 1).toString());
        txtTanggal.setText(tblKalender.getValueAt(row, 2).toString());
        txtWaktu.setText(tblKalender.getValueAt(row, 3).toString());
        cmbStatus.setSelectedItem(tblKalender.getValueAt(row, 4).toString());
    }

    }//GEN-LAST:event_tblKalenderMouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        DosenJadwal newWin = new DosenJadwal();
        newWin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(JadwalBimbinganDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JadwalBimbinganDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JadwalBimbinganDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JadwalBimbinganDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JadwalBimbinganDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKalender;
    private javax.swing.JTextField txtCariNIM;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
