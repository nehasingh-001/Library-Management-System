
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author neha3
 */
public class issueBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form issueBook
     */
    public issueBook() {
        initComponents();
    }
    Connection con;
    PreparedStatement pst;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Sid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ddate = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

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

        setPreferredSize(new java.awt.Dimension(690, 449));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("BookID");

        Bid.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Sid.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jLabel3.setText("Due Date");

        jButton2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jButton2.setText("Update Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bid)
                    .addComponent(Sid)
                    .addComponent(Ddate, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Bid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Sid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Ddate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String bid=Bid.getText();
        int id=Integer.parseInt(bid);  
        
        String sid=Sid.getText();
        int ids=Integer.parseInt(sid); 
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/SOE_1_library","root","Neha@1234");
            pst = con.prepareStatement("select issueStatus from info where bookID="+id);
            
            ResultSet rs = pst.executeQuery();
            rs.next();
            boolean is = rs.getBoolean(1);
            if(is)
            {
                JOptionPane.showMessageDialog(this, "Book already taken...");
            }
            else
            {
                int count=0;
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery("select bookID from info where studentID="+ids);

                while (resultSet.next()) {
                    count++;
                }
                if(count>=4){
                    Bid.setText("");
                    Sid.setText("");
                    JOptionPane.showMessageDialog(this, "Already 4 books taken...can't take more...");
                    
                }
                else{
                   
                    JOptionPane.showMessageDialog(null,"Enter due date...");
                }
            }
            
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(addEntry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       String bid=Bid.getText();
        int id=Integer.parseInt(bid);  
        
        String sid=Sid.getText();
        int ids=Integer.parseInt(sid); 
        
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(Ddate.getDate());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/SOE_1_library","root","Neha@1234");
            pst = con.prepareStatement("update info set issueStatus=?,studentID=?,dueDate=? where bookID="+id);
            
            pst.setBoolean(1, true);
            pst.setInt(2, ids);
            pst.setString(3, date);
            pst.executeUpdate();
            
             pst = con.prepareStatement("select bookName,authorName from info where bookID ="+id);
            ResultSet rs = pst.executeQuery();
            String bn="";
            String an="";
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Record not Found");
            }
            else
            {
                 bn = rs.getString("bookName");
                 an = rs.getString("authorName");
            }
            
            pst = con.prepareStatement("insert into issuedBooks(bookID,bookName,authorName,studentID,issueDate) values(?,?,?,?,sysdate())");
            
            pst.setInt(1, id);
            pst.setString(2, bn);
            pst.setString(3, an);
            pst.setInt(4, ids);
            
            pst.executeUpdate();
            
            Bid.setText("");
            Sid.setText("");
            
            JOptionPane.showMessageDialog(null,"Book issued.....");
            
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(addEntry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bid;
    private com.toedter.calendar.JDateChooser Ddate;
    private javax.swing.JTextField Sid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
