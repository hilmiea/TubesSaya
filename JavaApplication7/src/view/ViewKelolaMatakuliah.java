/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hilmi EA
 */
public class ViewKelolaMatakuliah extends javax.swing.JFrame {

    /**
     * Creates new form ViewKelolaMatakuliah
     */
    public ViewKelolaMatakuliah() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tambahkode = new javax.swing.JTextField();
        tambahsks = new javax.swing.JTextField();
        tambahsimpan = new javax.swing.JButton();
        tambahbatal = new javax.swing.JButton();
        tambahnama = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        editkode = new javax.swing.JTextField();
        editsks = new javax.swing.JTextField();
        editsimpan = new javax.swing.JButton();
        editbatal = new javax.swing.JButton();
        editnamabaru = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        editcari = new javax.swing.JButton();
        editkode1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        editkode2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hapusnama = new javax.swing.JTextField();
        hapushapus = new javax.swing.JButton();
        hapusbatal = new javax.swing.JButton();
        keluarkelolamatkul = new javax.swing.JButton();
        lihatdatamatakuliah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("PENGELOLAAN MATA KULIAH");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama Mata Kuliah");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("SKS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(":");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText(":");

        tambahkode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tambahsks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tambahsks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tambahsksKeyTyped(evt);
            }
        });

        tambahsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahsimpan.setText("Simpan");

        tambahbatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahbatal.setText("Batal");

        tambahnama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tambahnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tambahnamaKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Kode Mata Kuliah");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahkode, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tambahnama))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tambahsks)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tambahsimpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tambahbatal)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahsks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahsimpan)
                    .addComponent(tambahbatal))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tambah Mata Kuliah", jPanel1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kode Mata Kuliah");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("SKS Baru");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText(":");

        editkode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        editsks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editsks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editsksKeyTyped(evt);
            }
        });

        editsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editsimpan.setText("Simpan");

        editbatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editbatal.setText("Batal");

        editnamabaru.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editnamabaru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editnamabaruKeyTyped(evt);
            }
        });

        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Nama Baru");

        editcari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editcari.setText("Cari");
        editcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcariActionPerformed(evt);
            }
        });

        editkode1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Kode Mata Kuliah");

        editkode2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Kode Mata Kuliah");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editkode1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editkode, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(editcari))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editnamabaru, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editsks, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(editsimpan)
                                .addGap(6, 6, 6)
                                .addComponent(editbatal))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editkode2)))
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editkode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16)
                            .addComponent(jLabel8))))
                .addGap(6, 6, 6)
                .addComponent(editcari)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editkode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(editnamabaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editsks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editsimpan)
                    .addComponent(editbatal))
                .addGap(100, 100, 100))
        );

        jTabbedPane1.addTab("Edit Mata Kuliah", jPanel2);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Kode Mata Kuliah");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText(":");

        hapusnama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        hapushapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hapushapus.setText("Hapus");

        hapusbatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hapusbatal.setText("Batal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hapushapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusbatal))
                    .addComponent(hapusnama))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(hapusnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapushapus)
                    .addComponent(hapusbatal))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hapus Mata Kuliah", jPanel3);

        keluarkelolamatkul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        keluarkelolamatkul.setText("Kembali");

        lihatdatamatakuliah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lihatdatamatakuliah.setText("Lihat Data Mata Kuliah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keluarkelolamatkul))
                    .addComponent(lihatdatamatakuliah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(keluarkelolamatkul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lihatdatamatakuliah)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editcariActionPerformed

    private void tambahnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahnamaKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= 'a') && (karakter <= 'z') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan huruf");
            evt.consume();  
        }
    }//GEN-LAST:event_tambahnamaKeyTyped

    private void tambahsksKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahsksKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan angka");
            evt.consume();  
        }
    }//GEN-LAST:event_tambahsksKeyTyped

    private void editnamabaruKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editnamabaruKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= 'a') && (karakter <= 'z') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan huruf");
            evt.consume();  
        }
    }//GEN-LAST:event_editnamabaruKeyTyped

    private void editsksKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editsksKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan angka");
            evt.consume();  
        }
    }//GEN-LAST:event_editsksKeyTyped

    /**
     * @param args the command line arguments
     */

    public JButton getEditbatal() {
        return editbatal;
    }

    public void setEditbatal(JButton editbatal) {
        this.editbatal = editbatal;
    }

    public JTextField getEditnama() {
        return editkode;
    }

    public void setEditnama(JTextField editnama) {
        this.editkode = editnama;
    }

    public JButton getEditsimpan() {
        return editsimpan;
    }

    public void setEditsimpan(JButton editsimpan) {
        this.editsimpan = editsimpan;
    }

    public JTextField getEditsks() {
        return editsks;
    }

    public void setEditsks(JTextField editsks) {
        this.editsks = editsks;
    }

    public JButton getHapusbatal() {
        return hapusbatal;
    }

    public void setHapusbatal(JButton hapusbatal) {
        this.hapusbatal = hapusbatal;
    }

    public JButton getHapushapus() {
        return hapushapus;
    }

    public void setHapushapus(JButton hapushapus) {
        this.hapushapus = hapushapus;
    }

    public JTextField getHapusnama() {
        return hapusnama;
    }

    public void setHapusnama(JTextField hapusnama) {
        this.hapusnama = hapusnama;
    }

    public JButton getKeluarkelolamatkul() {
        return keluarkelolamatkul;
    }

    public void setKeluarkelolamatkul(JButton keluarkelolamatkul) {
        this.keluarkelolamatkul = keluarkelolamatkul;
    }

    public JButton getTambahbatal() {
        return tambahbatal;
    }

    public void setTambahbatal(JButton tambahbatal) {
        this.tambahbatal = tambahbatal;
    }

    public JTextField getTambahnama() {
        return tambahnama;
    }

    public void setTambahnama(JTextField tambahnama) {
        this.tambahnama = tambahnama;
    }

    public JButton getTambahsimpan() {
        return tambahsimpan;
    }

    public void setTambahsimpan(JButton tambahsimpan) {
        this.tambahsimpan = tambahsimpan;
    }

    public JTextField getTambahsks() {
        return tambahsks;
    }

    public void setTambahsks(JTextField tambahsks) {
        this.tambahsks = tambahsks;
    }

    public JTextField getEditnamabaru() {
        return editnamabaru;
    }

    public void setEditnamabaru(JTextField editnamabaru) {
        this.editnamabaru = editnamabaru;
    }

    public JButton getEditcari() {
        return editcari;
    }

    public void setEditcari(JButton editcari) {
        this.editcari = editcari;
    }

    public JButton getLihatdatamatakuliah() {
        return lihatdatamatakuliah;
    }

    public void setLihatdatamatakuliah(JButton lihatdatamatakuliah) {
        this.lihatdatamatakuliah = lihatdatamatakuliah;
    }


    public JTextField getEditkode1() {
        return editkode1;
    }

    public void setEditkode1(JTextField editkode1) {
        this.editkode1 = editkode1;
    }

    public JTextField getEditkode2() {
        return editkode2;
    }

    public void setEditkode2(JTextField editkode2) {
        this.editkode2 = editkode2;
    }

    public JTextField getTambahkode() {
        return tambahkode;
    }

    public void setTambahkode(JTextField tambahkode) {
        this.tambahkode = tambahkode;
    }

    public JTextField getTambahnama1() {
        return tambahnama;
    }

    public void setTambahnama1(JTextField tambahnama1) {
        this.tambahnama = tambahnama1;
    }
    
    
    
    
    
    public void addActionListener(ActionListener ae){
        keluarkelolamatkul.addActionListener(ae);
        tambahsimpan.addActionListener(ae);
        tambahbatal.addActionListener(ae);
        editsimpan.addActionListener(ae);
        editbatal.addActionListener(ae);
        hapushapus.addActionListener(ae);
        hapusbatal.addActionListener(ae);
        editcari.addActionListener(ae);
        lihatdatamatakuliah.addActionListener(ae);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editbatal;
    private javax.swing.JButton editcari;
    private javax.swing.JTextField editkode;
    private javax.swing.JTextField editkode1;
    private javax.swing.JTextField editkode2;
    private javax.swing.JTextField editnamabaru;
    private javax.swing.JButton editsimpan;
    private javax.swing.JTextField editsks;
    private javax.swing.JButton hapusbatal;
    private javax.swing.JButton hapushapus;
    private javax.swing.JTextField hapusnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton keluarkelolamatkul;
    private javax.swing.JButton lihatdatamatakuliah;
    private javax.swing.JButton tambahbatal;
    private javax.swing.JTextField tambahkode;
    private javax.swing.JTextField tambahnama;
    private javax.swing.JButton tambahsimpan;
    private javax.swing.JTextField tambahsks;
    // End of variables declaration//GEN-END:variables
}
