

/**
 *
 * @author Lorelei
 */
public class GasolinePaymentProgram2 extends javax.swing.JFrame {

    /**
     * Creates new form GasolinePaymentProgram2
     */
    public GasolinePaymentProgram2() {
        initComponents();
    }

    public void setGuiLiters(double liters) {
    liters_text.setText(String.format( "%.2f", liters));
}

    public void setDiscountedPrice(double disc_price) {
    discount_text.setText(String.format( "%.2f", disc_price));
}

    public void setTotal(double total) {
    total_text.setText(String.format( "%.2f", total));
}
    public void setCash(double price) {
    cash_text.setText(String.format( "%.2f", price));
}
    
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total_text = new javax.swing.JTextField();
        cash_text = new javax.swing.JTextField();
        discount_text = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        close_text = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        liters_text = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("LEI GAS STATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setText("Alangilan,Batangas City, Philippines");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 47, -1, -1));

        jLabel3.setText("Tel: +09355977238");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 69, -1, -1));

        jLabel4.setText("********************************************************************");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 103, 342, -1));

        jLabel5.setText("********************************************************************");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 151, 342, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("CASH RECEIPT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 125, -1, 14));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Total: PHP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 238, 73, -1));

        jLabel8.setText("Discount: PHP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 318, -1, -1));

        jLabel9.setText("Cash: PHP");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 287, -1, -1));

        total_text.setEditable(false);
        total_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_textActionPerformed(evt);
            }
        });
        getContentPane().add(total_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 221, 163, 48));

        cash_text.setEditable(false);
        getContentPane().add(cash_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 287, 161, -1));

        discount_text.setEditable(false);
        discount_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discount_textActionPerformed(evt);
            }
        });
        getContentPane().add(discount_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 315, 161, -1));

        jLabel10.setText("********************************************************************");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 349, 342, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("THANK YOU");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        close_text.setText("CLOSE");
        close_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_textActionPerformed(evt);
            }
        });
        getContentPane().add(close_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel12.setText("Liters:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 188, -1, -1));

        liters_text.setEditable(false);
        getContentPane().add(liters_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 185, 161, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorelei\\Downloads\\LEI GAS STATION.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void total_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_textActionPerformed
        
    }//GEN-LAST:event_total_textActionPerformed
// Closes the window 
    private void close_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_textActionPerformed
        
        GasolinePaymentProgram w1 = new GasolinePaymentProgram();
        w1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_close_textActionPerformed

    private void discount_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discount_textActionPerformed
        
    }//GEN-LAST:event_discount_textActionPerformed

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
            java.util.logging.Logger.getLogger(GasolinePaymentProgram2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GasolinePaymentProgram2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GasolinePaymentProgram2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GasolinePaymentProgram2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GasolinePaymentProgram2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cash_text;
    private javax.swing.JButton close_text;
    public javax.swing.JTextField discount_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField liters_text;
    public javax.swing.JTextField total_text;
    // End of variables declaration//GEN-END:variables
}
