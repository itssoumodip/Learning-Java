/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Soumodip Das
 */
public class Update extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rst;
    Statement stmt;
    int id;
    String pass, name, phNo;
    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        t4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b1.setText("Show");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Enter the ID : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("User Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Phone No. :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Passwiord :");

        b2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b2.setText("Update");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        t4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t3)
                            .addComponent(t2)
                            .addComponent(t4))
                        .addGap(102, 102, 102))))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(b1)
                .addGap(0, 134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1)
                    .addComponent(b1))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t3)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t4))
                        .addGap(42, 42, 42)))
                .addComponent(b2)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>                        

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup?useSSL=false","root","yoursoumodip14");
            id = Integer.parseInt(t1.getText());
            String query = "select * from userData where userId='"+id+"'";
            stmt=this.con.createStatement();
            rst = stmt.executeQuery(query);
            while (rst.next()){
                name = rst.getString("userName");
                phNo = rst.getString("userPhoneNo");
                pass = rst.getString("userPassword");
            }
            t2.setText(name);
            t3.setText(phNo);
            t4.setText(pass);
        }
        catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Connection Error !!"+e);
            t4.setText("");        
        }
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup?useSSL=false","root","yoursoumodip14");
            name = t2.getText();
            phNo = t3.getText();
            pass = t4.getText();
            String query = "update userData set userName='"+name+"', userPhoneNo='"+phNo+"', userPassword='"+pass+"' where userId='"+id+"'";
            pst=this.con.prepareStatement(query);
            int x = pst.executeUpdate();
            if (x==1){
                JOptionPane.showConfirmDialog(rootPane, "Updated Sucessfully !!");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
            else {
                JOptionPane.showConfirmDialog(rootPane, "Update Unsucessfull !!");
                t4.setText("");           
            }
        }
        catch(Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Connection Error !!"+e);
            t4.setText("");
        }
        
    }                                  

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration                   
}
