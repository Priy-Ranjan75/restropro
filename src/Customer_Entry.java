
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;
import java.util.*;
import java.util.TreeSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class Customer_Entry extends javax.swing.JFrame {

    int tablecount = 0;
    /**
     * Creates new form Customer_Entry
     */
    ArrayList<String> lt=new ArrayList<>();
    String foodName="";
    String orderid = "";
    String fnm = "";
    String qty = "";
    int chargefood1 = 0;

    String chargetable = "";

    public Customer_Entry() {
        initComponents();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restro", "root", "saulty");
            Statement st = con.createStatement();
            String query = "select fname from food";
            ResultSet rs = st.executeQuery(query);

            DefaultListModel list = new DefaultListModel();

            try {
                Set<String> s = new TreeSet<>();

                while (rs.next()) {
                    s.add(rs.getString("fname"));
                   
                }
                Iterator<String> itr = s.iterator();
                while (itr.hasNext()) {
                    list.addElement(itr.next());
                }

                jList1.setModel(list);
            } catch (Exception e) {

            }

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString());
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restro", "root", "saulty");
            Statement st = con.createStatement();
            String query = "select ttype from restrotable";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String itm = rs.getString("ttype");
                jComboBox2.addItem(itm);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString());
        }

    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 650));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(850, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 510, 60));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 340, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 340, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 340, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 340, 30));

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 110, 30));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Food Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, 20));

        jButton2.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 110, 30));

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OrderId");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, 30));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 120, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 80, 30));

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Table Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 130, -1));

        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 441, 330, 30));

        jButton3.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 204));
        jButton3.setText("Order Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 330, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1_exit.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 60, 50));

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 220, 130));

        jButton5.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 204));
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 80, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forallpages.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(850, 700));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cid = jTextField1.getText();
        String name = jTextField2.getText();
        String contact = jTextField3.getText();
        String OrderId = jTextField4.getText();
        orderid = jTextField4.getText();
        
       
        String quantity = jTextField6.getText();
        qty = quantity;
        String ttype = (String) jComboBox2.getSelectedItem();
         insert(cid, name, contact, OrderId, foodName, quantity, ttype);
       


    }//GEN-LAST:event_jButton1ActionPerformed
    public void insert(String cid, String name, String contact, String OrderId, String foodName, String quantity, String ttype) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restro", "root", "saulty");
            Statement st = con.createStatement();
            String query = "insert into customer values('" + cid + "','" + name + "','" + contact + "','" + OrderId + "','" + foodName + "','" + quantity + "','" + ttype + "')";
            st.executeUpdate(query);
            JOptionPane.showConfirmDialog(this, "Data inserted successfully");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString());
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        setVisible(false);

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restro", "root", "saulty");
            Statement st = con.createStatement();
            String getSelected = jComboBox2.getSelectedItem() + "";
            String query = "select * from restrotable where ttype='" + getSelected + "'";
            
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                // System.out.println("rs  value is ");

                chargetable = rs.getString("charge");
            }

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString());
        }

        int ch1 = chargefood1;
        int ch2 = Integer.parseInt(chargetable);
        int total = ch1 + ch2;
        //System.out.println("Overall  price is " + total);

        new Payment_Details(orderid, lt, qty, String.valueOf(total)).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        new IndexPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String quantity = jTextField6.getText();
        
        qty = quantity;
        int q = Integer.parseInt(qty);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restro", "root", "saulty");
            Statement st = con.createStatement();
            // String getSelected = jComboBox1.getSelectedItem() + "";
            String getSelected = jList1.getSelectedValue();
            lt.add(getSelected);
            String query = "select * from food where fname='" + getSelected + "'";
            foodName =foodName+" , "+ jList1.getSelectedValue();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                //System.out.println("rs  value is ");
                
                chargefood1 = chargefood1 + (Integer.parseInt(rs.getString("price")) * q);
            }

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString());
        }

        //chargefood1=chargefood1*q;
       // System.out.println("Total food priceing is " + chargefood1);
        //System.out.println("all items are "+lt);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
