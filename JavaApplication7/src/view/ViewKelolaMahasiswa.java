/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hilmi EA
 */
public class ViewKelolaMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form ViewKelolaMahasiswa
     */
    public ViewKelolaMahasiswa() {
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

        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tambahnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tambahjk = new javax.swing.JComboBox<>();
        tambahsimpan = new javax.swing.JButton();
        tambahbatal = new javax.swing.JButton();
        tambahnim = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        editnamabaru = new javax.swing.JTextField();
        editnim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        editsimpan = new javax.swing.JButton();
        editbatal = new javax.swing.JButton();
        editjk = new javax.swing.JComboBox<>();
        editcari = new javax.swing.JButton();
        editnimbaru = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hapusnim = new javax.swing.JTextField();
        hapushapus = new javax.swing.JButton();
        hapusbatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lihatdatamahasiswa = new javax.swing.JButton();
        keluarkelolamahasiswa = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(":");

        tambahnama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tambahnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tambahnamaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText(":");

        tambahjk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahjk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));

        tambahsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahsimpan.setText("Simpan");

        tambahbatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahbatal.setText("Batal");

        tambahnim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tambahnim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tambahnimKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("NIM");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel15))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambahsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahbatal))
                    .addComponent(tambahnama, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahjk, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahnim, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambahjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambahbatal)
                            .addComponent(tambahsimpan)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(tambahnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tambah Mahasiswa", jPanel1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("NIM");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nama");

        editnamabaru.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editnamabaru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editnamabaruKeyTyped(evt);
            }
        });

        editnim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editnim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editnimKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText(":");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Jenis Kelamin");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText(":");

        editsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editsimpan.setText("Simpan");

        editbatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editbatal.setText("Batal");

        editjk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editjk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));

        editcari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editcari.setText("Cari");

        editnimbaru.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editnimbaru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editnimbaruKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NIM");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(67, 67, 67))
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editnimbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(editsimpan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(editbatal))
                                .addComponent(editjk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editnamabaru))
                            .addComponent(editcari)
                            .addComponent(editnim, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(editnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editcari)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editnimbaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editnamabaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editsimpan)
                    .addComponent(editbatal))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit Mahasiswa", jPanel2);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("NIM");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText(":");

        hapusnim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hapusnim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hapusnimKeyTyped(evt);
            }
        });

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
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hapushapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusbatal))
                    .addComponent(hapusnim))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(hapusnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapushapus)
                    .addComponent(hapusbatal))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hapus Mahasiswa", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("PENGELOLAAN MAHASISWA");

        lihatdatamahasiswa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lihatdatamahasiswa.setText("Lihat Data Mahasiswa");

        keluarkelolamahasiswa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        keluarkelolamahasiswa.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keluarkelolamahasiswa))
                    .addComponent(lihatdatamahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(keluarkelolamahasiswa))
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lihatdatamahasiswa)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahnimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahnimKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep();  
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan angka");
            evt.consume();  
        }
    }//GEN-LAST:event_tambahnimKeyTyped

    private void editnimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editnimKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep();  
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan angka");
            evt.consume();  
        }
    }//GEN-LAST:event_editnimKeyTyped

    private void editnimbaruKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editnimbaruKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan angka");
            evt.consume();  
        }
    }//GEN-LAST:event_editnimbaruKeyTyped

    private void hapusnimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hapusnimKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan angka");
            evt.consume();  
        }
    }//GEN-LAST:event_hapusnimKeyTyped

    private void tambahnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahnamaKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= 'a') && (karakter <= 'z') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan huruf");
            evt.consume();  
        }
    }//GEN-LAST:event_tambahnamaKeyTyped

    private void editnamabaruKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editnamabaruKeyTyped
        char karakter = evt.getKeyChar();  
        if(!(((karakter >= 'a') && (karakter <= 'z') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){  
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Hanya menerima inputan huruf");
            evt.consume();  
        }
    }//GEN-LAST:event_editnamabaruKeyTyped

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
        return editnim;
    }

    public void setEditnama(JTextField editnama) {
        this.editnim = editnama;
    }

    public JTextField getEditnamabaru() {
        return editnamabaru;
    }

    public void setEditnamabaru(JTextField editnamabaru) {
        this.editnamabaru = editnamabaru;
    }

    public JButton getEditsimpan() {
        return editsimpan;
    }

    public void setEditsimpan(JButton editsimpan) {
        this.editsimpan = editsimpan;
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
        return hapusnim;
    }

    public void setHapusnama(JTextField hapusnama) {
        this.hapusnim = hapusnama;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JButton getTambahbatal() {
        return tambahbatal;
    }

    public void setTambahbatal(JButton tambahbatal) {
        this.tambahbatal = tambahbatal;
    }

    public JComboBox<String> getTambahjk() {
        return tambahjk;
    }

    public void setTambahjk(JComboBox<String> tambahjk) {
        this.tambahjk = tambahjk;
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

    public JComboBox<String> getEditjk() {
        return editjk;
    }

    public void setEditjk(JComboBox<String> editjk) {
        this.editjk = editjk;
    }

    public JButton getKeluarkelolamahasiswa() {
        return keluarkelolamahasiswa;
    }

    public void setKeluarkelolamahasiswa(JButton keluarkelolamahasiswa) {
        this.keluarkelolamahasiswa = keluarkelolamahasiswa;
    }

    public JButton getLihatdatamahasiswa() {
        return lihatdatamahasiswa;
    }

    public void setLihatdatamahasiswa(JButton lihatdatamahasiswa) {
        this.lihatdatamahasiswa = lihatdatamahasiswa;
    }

    public JButton getEditcari() {
        return editcari;
    }

    public void setEditcari(JButton editcari) {
        this.editcari = editcari;
    }

    public JTextField getEditnim() {
        return editnim;
    }

    public void setEditnim(JTextField editnim) {
        this.editnim = editnim;
    }

    public JTextField getEditnimbaru() {
        return editnimbaru;
    }

    public void setEditnimbaru(JTextField editnimbaru) {
        this.editnimbaru = editnimbaru;
    }

    public JTextField getHapusnim() {
        return hapusnim;
    }

    public void setHapusnim(JTextField hapusnim) {
        this.hapusnim = hapusnim;
    }

    public JTextField getTambahnim() {
        return tambahnim;
    }

    public void setTambahnim(JTextField tambahnim) {
        this.tambahnim = tambahnim;
    }
    
    
    
    
    
    public void addActionListener(ActionListener ae){
        tambahsimpan.addActionListener(ae);
        tambahbatal.addActionListener(ae);
        editsimpan.addActionListener(ae);
        editbatal.addActionListener(ae);
        hapushapus.addActionListener(ae);
        hapusbatal.addActionListener(ae);
        keluarkelolamahasiswa.addActionListener(ae);
        lihatdatamahasiswa.addActionListener(ae);
        editcari.addActionListener(ae);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editbatal;
    private javax.swing.JButton editcari;
    private javax.swing.JComboBox<String> editjk;
    private javax.swing.JTextField editnamabaru;
    private javax.swing.JTextField editnim;
    private javax.swing.JTextField editnimbaru;
    private javax.swing.JButton editsimpan;
    private javax.swing.JButton hapusbatal;
    private javax.swing.JButton hapushapus;
    private javax.swing.JTextField hapusnim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton keluarkelolamahasiswa;
    private javax.swing.JButton lihatdatamahasiswa;
    private javax.swing.JButton tambahbatal;
    private javax.swing.JComboBox<String> tambahjk;
    private javax.swing.JTextField tambahnama;
    private javax.swing.JTextField tambahnim;
    private javax.swing.JButton tambahsimpan;
    // End of variables declaration//GEN-END:variables
}
