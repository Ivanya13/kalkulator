/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author Asus
 */
public class TambahAngka extends javax.swing.JFrame {

    /**
     * Creates new form TambahAngka
     */
    public TambahAngka() {
        initComponents();
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
        PANEL_LBL = new javax.swing.JLabel();
        PANEL1 = new javax.swing.JPanel();
        ANGKAPERTAMA_LBL = new javax.swing.JLabel();
        ANGKAPERTAMA_TEXT = new javax.swing.JTextField();
        PANEL2 = new javax.swing.JPanel();
        ANGKAKEDUA_LBL = new javax.swing.JLabel();
        ANGKAKEDUA_TEXT = new javax.swing.JTextField();
        PANEL3 = new javax.swing.JPanel();
        HASIL_LBL = new javax.swing.JLabel();
        HASIL_TEXT = new javax.swing.JTextField();
        TAMBAH_BUTTON = new javax.swing.JButton();
        CLEAR_BUTTON = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(56, 102, 65));

        jPanel1.setBackground(new java.awt.Color(56, 102, 65));

        PANEL_LBL.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        PANEL_LBL.setForeground(java.awt.Color.white);
        PANEL_LBL.setText("Aplikasi Pertambahan");

        PANEL1.setBackground(new java.awt.Color(106, 153, 78));

        ANGKAPERTAMA_LBL.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        ANGKAPERTAMA_LBL.setForeground(java.awt.Color.white);
        ANGKAPERTAMA_LBL.setText("Angka Pertama");

        ANGKAPERTAMA_TEXT.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        ANGKAPERTAMA_TEXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ANGKAPERTAMA_TEXT.setText("0");
        ANGKAPERTAMA_TEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKAPERTAMA_TEXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL1Layout = new javax.swing.GroupLayout(PANEL1);
        PANEL1.setLayout(PANEL1Layout);
        PANEL1Layout.setHorizontalGroup(
            PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ANGKAPERTAMA_LBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(ANGKAPERTAMA_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PANEL1Layout.setVerticalGroup(
            PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ANGKAPERTAMA_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANGKAPERTAMA_LBL))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PANEL2.setBackground(new java.awt.Color(167, 201, 87));

        ANGKAKEDUA_LBL.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        ANGKAKEDUA_LBL.setForeground(java.awt.Color.white);
        ANGKAKEDUA_LBL.setText("Angka Kedua");

        ANGKAKEDUA_TEXT.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        ANGKAKEDUA_TEXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ANGKAKEDUA_TEXT.setText("0");

        javax.swing.GroupLayout PANEL2Layout = new javax.swing.GroupLayout(PANEL2);
        PANEL2.setLayout(PANEL2Layout);
        PANEL2Layout.setHorizontalGroup(
            PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ANGKAKEDUA_LBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ANGKAKEDUA_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PANEL2Layout.setVerticalGroup(
            PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ANGKAKEDUA_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANGKAKEDUA_LBL))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PANEL3.setBackground(new java.awt.Color(188, 71, 73));

        HASIL_LBL.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        HASIL_LBL.setForeground(java.awt.Color.white);
        HASIL_LBL.setText("Hasil");

        HASIL_TEXT.setEditable(false);
        HASIL_TEXT.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        HASIL_TEXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HASIL_TEXT.setText("0");

        javax.swing.GroupLayout PANEL3Layout = new javax.swing.GroupLayout(PANEL3);
        PANEL3.setLayout(PANEL3Layout);
        PANEL3Layout.setHorizontalGroup(
            PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HASIL_LBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HASIL_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PANEL3Layout.setVerticalGroup(
            PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(HASIL_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HASIL_LBL))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        TAMBAH_BUTTON.setBackground(new java.awt.Color(242, 232, 207));
        TAMBAH_BUTTON.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        TAMBAH_BUTTON.setText("Tambah");
        TAMBAH_BUTTON.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TAMBAH_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAMBAH_BUTTONActionPerformed(evt);
            }
        });

        CLEAR_BUTTON.setBackground(new java.awt.Color(242, 232, 207));
        CLEAR_BUTTON.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        CLEAR_BUTTON.setText("Clear");
        CLEAR_BUTTON.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CLEAR_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR_BUTTONActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(PANEL_LBL))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PANEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PANEL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PANEL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TAMBAH_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(CLEAR_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PANEL_LBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANEL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(PANEL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(PANEL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TAMBAH_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLEAR_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TAMBAH_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAMBAH_BUTTONActionPerformed
        // TODO add your handling code here:
        double angka1 = Double.parseDouble(ANGKAPERTAMA_TEXT.getText());
        double angka2 = Double.parseDouble(ANGKAKEDUA_TEXT.getText());
        int HASIL = (int) angka1 + (int) angka2;

        HASIL_TEXT.setText(Integer.toString(HASIL));
    }//GEN-LAST:event_TAMBAH_BUTTONActionPerformed

    private void CLEAR_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEAR_BUTTONActionPerformed
        // TODO add your handling code here:
        ANGKAPERTAMA_TEXT.setText("0");
        ANGKAKEDUA_TEXT.setText("0");
        HASIL_TEXT.setText("0");
    }//GEN-LAST:event_CLEAR_BUTTONActionPerformed

    private void ANGKAPERTAMA_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKAPERTAMA_TEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANGKAPERTAMA_TEXTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TambahAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANGKAKEDUA_LBL;
    private javax.swing.JTextField ANGKAKEDUA_TEXT;
    private javax.swing.JLabel ANGKAPERTAMA_LBL;
    private javax.swing.JTextField ANGKAPERTAMA_TEXT;
    private javax.swing.JButton CLEAR_BUTTON;
    private javax.swing.JLabel HASIL_LBL;
    private javax.swing.JTextField HASIL_TEXT;
    private javax.swing.JPanel PANEL1;
    private javax.swing.JPanel PANEL2;
    private javax.swing.JPanel PANEL3;
    private javax.swing.JLabel PANEL_LBL;
    private javax.swing.JButton TAMBAH_BUTTON;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
