/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();
        showSelecteds();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCartLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        backButtonSerie = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        emptyCartButton = new javax.swing.JButton();
        jTotalLabel = new javax.swing.JLabel();
        jEuroLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        BackToMovie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCartLabel.setText("Cart");

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        backButtonSerie.setText("Back to Serie");
        backButtonSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonSerieActionPerformed(evt);
            }
        });

        paymentButton.setText("Payment");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        emptyCartButton.setText("Empty Cart");
        emptyCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyCartButtonActionPerformed(evt);
            }
        });

        jTotalLabel.setText("Total");

        jEuroLabel.setText("€");

        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title", "Catergory", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCart);

        BackToMovie.setText("Back To Movie");
        BackToMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeButton)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jTotalLabel)
                                .addGap(48, 48, 48)
                                .addComponent(jEuroLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(backButtonSerie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BackToMovie)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentButton)
                            .addComponent(emptyCartButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jCartLabel)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeButton)
                        .addGap(89, 89, 89)
                        .addComponent(emptyCartButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jCartLabel)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalLabel)
                    .addComponent(jEuroLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButtonSerie)
                            .addComponent(BackToMovie))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(paymentButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonSerieActionPerformed
        new SeriePage().setVisible(true);//show the WelcomePage when the button is clicked
        dispose();//close the current screen
    }//GEN-LAST:event_backButtonSerieActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new WelcomePage().setVisible(true); //show the WelcomePage when the button is clicked
        dispose(); //close the current screen
    }//GEN-LAST:event_homeButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        Payment pay = new Payment();

        System.out.println(total);
        //Opening Payment Screen
        new Payment().setVisible(true);
        //Bringing the taking the total
           pay.setValue(total);
        //Closing the current window
        dispose();
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void emptyCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyCartButtonActionPerformed
        emptyCart();
    }//GEN-LAST:event_emptyCartButtonActionPerformed

    private void BackToMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMovieActionPerformed
      new MoviePage().setVisible(true);//show the WelcomePage when the button is clicked
        dispose();//close the current screen
    }//GEN-LAST:event_BackToMovieActionPerformed

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }
    public void showSelecteds() {
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT * FROM Priscilla_2019217.cart;";

            Statement command = con.createStatement(); // to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Show the search resuts
            DefaultTableModel model;
            model = (DefaultTableModel) jTableCart.getModel();
            model.setNumRows(0);
            while (result.next()) {
                model.addRow(new Object[]{
                    result.getString("title"),
                    result.getString("category"),
                    result.getDouble("price"),});
            }
            showTotal();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private double total;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMovie;
    private javax.swing.JButton backButtonSerie;
    private javax.swing.JButton emptyCartButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jCartLabel;
    private javax.swing.JLabel jEuroLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCart;
    private javax.swing.JLabel jTotalLabel;
    private javax.swing.JButton paymentButton;
    // End of variables declaration//GEN-END:variables

private void showTotal() {
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT price FROM Priscilla_2019217.cart;";

            Statement command = con.createStatement(); // to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Storing thw result of price into the variable total, and count when adding a new price into the table.
            while (result.next()) {
                total += result.getDouble("price");
            }
            //show the calculation of the price
            jEuroLabel.setText(Double.toString(total));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
  private void emptyCart() {
        try {
            //open the connection
            Connection con = Connect.getConnection();
            //SQL query delet
            String sql = "DELETE FROM cart";

            PreparedStatement ps = con.prepareStatement(sql);// to excute the Database command without any parameters
            //executing
            ps.execute();
            showSelecteds();
            //deleting the value showed
            jEuroLabel.setText(Double.toString(0.00));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
