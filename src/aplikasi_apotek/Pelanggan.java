/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_apotek;
import javax.swing.JOptionPane;  // membuat pesan dialog
import java.sql.*;  // untuk menampilkan data dara perintah query
import java.util.*;

import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS
 */
public class Pelanggan extends javax.swing.JFrame {
    String JudulKolom[]={"No","ID Pelanggan","Nama Pelanggan","Kontak","Alamat Pelanggan"};
    String SqlPelanggan="SELECT*FORM Pelanggan";
    int lebarKolom[]={100,300,150,100,150,200,400,100};
    

    /**
     * Creates new form Pelanggan
     */
    public Pelanggan() {
        initComponents();
        this.setLocationRelativeTo(null);        
    new ConfigDB().tampilTabel(JudulKolom, SqlPelanggan, JTable_Pelanggan);
    new ConfigDB().aturLebarKolom(JTable_Pelanggan, lebarKolom);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txt_ID_Pelanggan = new javax.swing.JTextField();
        Txt_Nama_Pelanggan = new javax.swing.JTextField();
        Txt_Kontak = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txt_Alamat_Pelanggan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Pelanggan = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Txt_Pencarian = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("ID Pelanggan");

        jLabel4.setText("Nama Pelanggan");

        jLabel5.setText("Kontak");

        Txt_Nama_Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Nama_PelangganActionPerformed(evt);
            }
        });

        jLabel6.setText("Alamat Pelanggan");

        jButton1.setText("TAMBAH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_ID_Pelanggan)
                            .addComponent(Txt_Kontak)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Alamat_Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Nama_Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 24, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Txt_ID_Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Txt_Nama_Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Txt_Kontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Alamat_Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JTable_Pelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        JTable_Pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_PelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Pelanggan);

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("REFRESH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Txt_Pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PencarianActionPerformed(evt);
            }
        });

        jLabel2.setText("PENCARIAN NAMA PELANGGAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(96, 96, 96))
        );

        jLabel1.setText("Tambah Data Pelanggan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_Nama_PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Nama_PelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Nama_PelangganActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
if(Txt_ID_Pelanggan.getText().isEmpty()){
JOptionPane.showMessageDialog(null,"id Pelanggan belum diisi");
Txt_ID_Pelanggan.requestFocus();
}else
if(Txt_Nama_Pelanggan.getText().isEmpty()){
JOptionPane.showMessageDialog(null,"Nama Pelanggan  belum diisi");
Txt_Nama_Pelanggan.requestFocus();
  
}else
if(Txt_Kontak.getText().isEmpty()){
JOptionPane.showMessageDialog(null,"Kontak belum diisi");
Txt_Kontak.requestFocus();   
}else
 if(Txt_Alamat_Pelanggan.getText().isEmpty()){
JOptionPane.showMessageDialog(null,"Alamat Pelanggan belum diisi");
Txt_Alamat_Pelanggan.requestFocus();   
}else
if (new ConfigDB().duplikasiData("anggota","ID Pelanggan",Txt_ID_Pelanggan.getText())==true){
JOptionPane.showMessageDialog(null,"ID Anggota sudah terdaftar");
Statement st = new ConfigDB().koneksi.createStatement();
ResultSet rs = st.executeQuery("SELECT*FROM anggota WHERE IDAnggota='"+Txt_ID_Pelanggan.getText()+"'");
if(rs.next()){
Txt_Nama_Pelanggan.setText(rs.getString("nama pelanggan"));
Txt_Kontak.setText(rs.getString("kontak"));
Txt_Alamat_Pelanggan.setText(rs.getString("alamat"));

}       
}
else{
String SQL ="INSERT INTO Pelanggan VALUES ('"+Txt_ID_Pelanggan.getText()+"','"+Txt_Nama_Pelanggan.getText()+"','"+Txt_Kontak.getText()+"','"+Txt_Alamat_Pelanggan.getText()
+"','"+"')";
new ConfigDB().simpanData(SQL);
new ConfigDB().tampilTabel(JudulKolom, SqlPelanggan, JTable_Pelanggan);
new ConfigDB().aturLebarKolom(JTable_Pelanggan, lebarKolom);
}
} catch (Exception e) {
System.out.print(e.toString());
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
if (
(Txt_ID_Pelanggan.getText().isEmpty()) &&(Txt_Nama_Pelanggan.getText().isEmpty()) 
 &&(Txt_Kontak.getText().isEmpty())&&(Txt_Alamat_Pelanggan.getText().isEmpty()
) ){ 
JOptionPane.showMessageDialog(null,"Silahkan pilih data sebelum proses ubah ");
JTable_Pelanggan.requestFocus();           
} else{
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
String SQL="UPDATE anggota SET tempat_lahir='"+Txt_Nama_Pelanggan.getText()+"',tgl_lahir='" 
+"',alamat='"+Txt_Kontak.getText()+"', telp='"+Txt_Alamat_Pelanggan.getText()+"' WHERE IDAnggota='"+Txt_ID_Pelanggan.getText()+"'";
new ConfigDB().ubahData(SQL);
new ConfigDB().tampilTabel(JudulKolom, SqlPelanggan, JTable_Pelanggan);
new ConfigDB().aturLebarKolom(JTable_Pelanggan, lebarKolom);
}
} catch (Exception e) {
System.out.print(e.toString());
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            if (
            (Txt_ID_Pelanggan.getText().isEmpty()) &&(Txt_Nama_Pelanggan.getText().isEmpty()) && 
            (Txt_Kontak.getText().isEmpty())   &&  (Txt_Alamat_Pelanggan.getText().isEmpty())
            ) {
            JOptionPane.showMessageDialog(null,"Silahkan   pilih   data   sebelum   proses hapus ");
            JTable_Pelanggan.requestFocus();           
            } else{
            String SQL="DELETE FROM anggota WHERE IDPelanggan='"+Txt_ID_Pelanggan.getText()+"'";
            new ConfigDB().ubahData(SQL);
            new ConfigDB().tampilTabel(JudulKolom, SqlPelanggan, JTable_Pelanggan);
            new ConfigDB().aturLebarKolom(JTable_Pelanggan, lebarKolom);
            }
            } catch (Exception e) {
            System.out.print(e.toString());
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new ConfigDB().tampilTabel(JudulKolom, SqlPelanggan, JTable_Pelanggan);
        new ConfigDB().aturLebarKolom(JTable_Pelanggan, lebarKolom);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Txt_ID_Pelanggan.setText(null);
        Txt_Nama_Pelanggan.setText(null);
        Txt_Kontak.setText(null);
        Txt_Alamat_Pelanggan.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Txt_PencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PencarianActionPerformed
        // TODO add your handling code here:
        try {
String SQL="SELECT*FROM anggota WHERE nama like '%"+Txt_Pencarian.getText()+"%'";
new ConfigDB().cariData(JudulKolom, SQL, JTable_Pelanggan); 
new ConfigDB().aturLebarKolom(JTable_Pelanggan, lebarKolom); 
} catch (Exception e) {
System.out.print(e.toString());
}

    }//GEN-LAST:event_Txt_PencarianActionPerformed

    private void JTable_PelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_PelangganMouseClicked
        // TODO add your handling code here:
        try {
int baris =JTable_Pelanggan.getSelectedRow();
Txt_ID_Pelanggan.setText(String.valueOf(JTable_Pelanggan.getValueAt(baris,0)));
Txt_Nama_Pelanggan.setText(String.valueOf(JTable_Pelanggan.getValueAt(baris,1)));
Txt_Kontak.setText(String.valueOf(JTable_Pelanggan.getValueAt(baris,2)));
Txt_Alamat_Pelanggan.setText(String.valueOf(JTable_Pelanggan.getValueAt(baris, 3)));
} catch (Exception e) {
System.out.print(e.toString());
}
    }//GEN-LAST:event_JTable_PelangganMouseClicked

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
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_Pelanggan;
    private javax.swing.JTextField Txt_Alamat_Pelanggan;
    private javax.swing.JTextField Txt_ID_Pelanggan;
    private javax.swing.JTextField Txt_Kontak;
    private javax.swing.JTextField Txt_Nama_Pelanggan;
    private javax.swing.JTextField Txt_Pencarian;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
