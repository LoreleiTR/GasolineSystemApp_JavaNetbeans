/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lorelei
 */
import javax.swing.JOptionPane;
public class GasolinePaymentProgram extends javax.swing.JFrame {

    
    public GasolinePaymentProgram() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btn_1 = new javax.swing.JButton();
        quit_btn = new javax.swing.JButton();
        calc_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JButton();
        payment_text = new javax.swing.JTextField();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        gasolineProducts = new javax.swing.JComboBox<>();
        price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_0 = new javax.swing.JButton();
        clear_all_btn2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Price per liter");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 57, 47));

        quit_btn.setText("Quit");
        quit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(quit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        calc_btn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        calc_btn.setText("Calculate");
        calc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_btnActionPerformed(evt);
            }
        });
        getContentPane().add(calc_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 170, 40));

        clear_btn.setText("🢀");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        getContentPane().add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 46, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel2.setText("Enter your payment here");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        btn_2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 57, 47));

        payment_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_textActionPerformed(evt);
            }
        });
        payment_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                payment_textKeyPressed(evt);
            }
        });
        getContentPane().add(payment_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 180, 40));

        btn_3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 57, 47));

        btn_4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 57, 47));

        btn_6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 57, 47));

        btn_5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 57, 47));

        btn_7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 57, 47));

        btn_9.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 57, 47));

        btn_8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 57, 47));

        gasolineProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unleaded", "Premium", "Vpower Gas", "Diesel", "Vpower Diesel", "Kerosene" }));
        gasolineProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gasolineProductsActionPerformed(evt);
            }
        });
        getContentPane().add(gasolineProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 119, -1));

        price.setText("63.25");
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 119, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel4.setText("Available products");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 110, 20));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel5.setText("Price per liter");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        btn_0.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 57, 47));

        clear_all_btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clear_all_btn2.setText("C");
        clear_all_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_all_btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(clear_all_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 46, -1));

        jLabel7.setBackground(new java.awt.Color(255, 102, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorelei\\Downloads\\LEI'S GAS STATION.gif")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 320, 50));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setText("PHP");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 40, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorelei\\Downloads\\Untitled design (2).jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 590));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        setSize(new java.awt.Dimension(400, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
       String user_number = payment_text.getText() + btn_1.getText();
       payment_text.setText(user_number);
       
    }//GEN-LAST:event_btn_1ActionPerformed

    private void quit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_btnActionPerformed
        
        int choice = JOptionPane.showOptionDialog(null, "Do you want to quit?", "Confirmation",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (choice == JOptionPane.YES_OPTION) {
        System.exit(0);
}       else {
       
       this.setVisible(true);
}
    }//GEN-LAST:event_quit_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        
        String backspace = null;
        if (payment_text.getText().length() > 0 ) {
            StringBuilder str = new StringBuilder (payment_text.getText());
            str.deleteCharAt(payment_text.getText().length() - 1);
            backspace = str.toString();
            payment_text.setText(backspace);
        }
    }//GEN-LAST:event_clear_btnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        
       String user_number = payment_text.getText() + btn_2.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        
        String user_number = payment_text.getText() + btn_3.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        
        String user_number = payment_text.getText() + btn_4.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        
        String user_number = payment_text.getText() + btn_6.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        
        String user_number = payment_text.getText() + btn_5.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        
       String user_number = payment_text.getText() + btn_7.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        
        String user_number = payment_text.getText() + btn_9.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        
        String user_number = payment_text.getText() + btn_8.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_8ActionPerformed

    private void payment_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_textActionPerformed
        
        
        
    }//GEN-LAST:event_payment_textActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        
    }//GEN-LAST:event_priceActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        
        String user_number = payment_text.getText() + btn_0.getText();
       payment_text.setText(user_number);
    }//GEN-LAST:event_btn_0ActionPerformed

    private void clear_all_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_all_btn2ActionPerformed
        
        payment_text.setText("");
    }//GEN-LAST:event_clear_all_btn2ActionPerformed

    private void gasolineProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gasolineProductsActionPerformed
        // CALCULATIONS
        double unleadGasPrice = 63.25;
        double premiumGasPrice = 64.75;
        double vPowerGasPrice = 66.03;
        double dieselPrice = 57.80;
        double vPowerDieselPrice = 61.45;
        double kerosenePrice = 45.07;

        String gasolineProduct = (String) gasolineProducts.getSelectedItem();

        switch (gasolineProduct){

            case "Unleaded":
            price.setText(  Double.toString(unleadGasPrice));
            break;
            case "Premium":
            price.setText( Double.toString(premiumGasPrice));
            break;
            case "Vpower Gas":
            price.setText( Double.toString(vPowerGasPrice));
            break;
            case "Diesel":
            price.setText( Double.toString(dieselPrice));
            break;
            case "Vpower Diesel":
            price.setText( Double.toString( vPowerDieselPrice));
            break;
            case "Kerosene":
            price.setText( Double.toString(kerosenePrice));
            break;
    }//GEN-LAST:event_gasolineProductsActionPerformed
    }
    private void calc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_btnActionPerformed
        
         GasolinePaymentProgram2 w2 = new GasolinePaymentProgram2();
        

    double price_gasoline = Double.parseDouble(price.getText());
    double gui_price = Double.parseDouble(payment_text.getText());
    double gui_liters = gui_price / price_gasoline;
        
    double discount = 0;
        
    if (gui_liters >= 30) 
        discount = 0.09;
             
    else if (gui_liters >= 20) 
        discount = 0.07;
            
    else if (gui_liters >= 10) 
        discount = 0.05;
    else
        discount = 0;
        
    double discounted_price = gui_price * discount;
    double total = gui_price - discounted_price;
        
    // Set the values in the GasolinePaymentProgram2 window
    w2.setGuiLiters(gui_liters);
    w2.setDiscountedPrice(discounted_price);
    w2.setTotal(total);
    w2.setCash(gui_price);
    w2.setVisible(true);
    this.setVisible(false);



    }//GEN-LAST:event_calc_btnActionPerformed

    private void payment_textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payment_textKeyPressed
        
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            payment_text.setEditable(false);
            JOptionPane.showMessageDialog(null, "You have entered a wrong input!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
            payment_text.setEditable(true);
        
    }//GEN-LAST:event_payment_textKeyPressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed
    
    
    
   
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GasolinePaymentProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton calc_btn;
    private javax.swing.JButton clear_all_btn2;
    private javax.swing.JButton clear_btn;
    private javax.swing.JComboBox<String> gasolineProducts;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField payment_text;
    private javax.swing.JTextField price;
    private javax.swing.JButton quit_btn;
    // End of variables declaration//GEN-END:variables
}
