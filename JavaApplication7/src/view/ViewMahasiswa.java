/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author Hilmi EA
 */
public class ViewMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form ViewMahasiswa
     */
    public ViewMahasiswa() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableregistrasi = new javax.swing.JTable();
        registrasi = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        lihatmatakuliah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("REGISTRASI MATA KULIAH");

        tableregistrasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableregistrasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kelas", "Mata Kuliah"
            }
        ));
        jScrollPane1.setViewportView(tableregistrasi);

        registrasi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrasi.setText("Resigtrasi");

        keluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        lihatmatakuliah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lihatmatakuliah.setText("Lihat Mata Kuliah yang Di ambil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(248, 248, 248)
                        .addComponent(keluar))
                    .addComponent(registrasi)
                    .addComponent(lihatmatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(keluar))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(registrasi)
                .addGap(6, 6, 6)
                .addComponent(lihatmatakuliah)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluarActionPerformed

    public JButton getKeluar() {
        return keluar;
    }

    public void setKeluar(JButton keluar) {
        this.keluar = keluar;
    }

    public JButton getRegistrasi() {
        return registrasi;
    }

    public void setRegistrasi(JButton registrasi) {
        this.registrasi = registrasi;
    }

    public JTable getTableregistrasi() {
        return tableregistrasi;
    }

    public void setTableregistrasi(JTable tableregistrasi) {
        this.tableregistrasi = tableregistrasi;
    }

    public JButton getLihatmatakuliah() {
        return lihatmatakuliah;
    }

    public void setLihatmatakuliah(JButton lihatmatakuliah) {
        this.lihatmatakuliah = lihatmatakuliah;
    }
    
    
    
    public void addActionListener(ActionListener ae){
        registrasi.addActionListener(ae);
        keluar.addActionListener(ae);
        lihatmatakuliah.addActionListener(ae);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton lihatmatakuliah;
    private javax.swing.JButton registrasi;
    private javax.swing.JTable tableregistrasi;
    // End of variables declaration//GEN-END:variables
}
