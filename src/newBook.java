import Project.ConnectionProvider;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dnedk
 */
public class newBook extends javax.swing.JFrame {

    /**
     * Creates new form newBook
     */
    public newBook() {
        initComponents();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from book");
            booksTable.setModel(DbUtils.resultSetToTableModel(rs));
            booksTable.getColumnModel().getColumn(0).setMinWidth(0);
            booksTable.getColumnModel().getColumn(0).setMaxWidth(0);
            booksTable.getColumnModel().getColumn(0).setWidth(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
        delBtn.setEnabled(false);
        editBtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookISBNLbl = new javax.swing.JLabel();
        bookTitleLbl = new javax.swing.JLabel();
        authorLbl = new javax.swing.JLabel();
        genreLbl = new javax.swing.JLabel();
        yearLbl = new javax.swing.JLabel();
        ISBNTF = new javax.swing.JTextField();
        titleTF = new javax.swing.JTextField();
        authorTF = new javax.swing.JTextField();
        genreTF = new javax.swing.JTextField();
        yearTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 80));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookISBNLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookISBNLbl.setText("Book ISBN:");
        getContentPane().add(bookISBNLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 49, 165, 31));

        bookTitleLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookTitleLbl.setText("Title:");
        getContentPane().add(bookTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 98, 165, 31));

        authorLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        authorLbl.setText("Author:");
        getContentPane().add(authorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 149, 165, 31));

        genreLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genreLbl.setText("Genre:");
        getContentPane().add(genreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 191, 165, 38));

        yearLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yearLbl.setText("Year:");
        getContentPane().add(yearLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 240, 165, 38));
        getContentPane().add(ISBNTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 49, 265, 38));
        getContentPane().add(titleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 100, 265, 31));
        getContentPane().add(authorTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 142, 265, 38));
        getContentPane().add(genreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 191, 265, 38));
        getContentPane().add(yearTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 240, 265, 38));

        booksTable.setBorder(new javax.swing.border.MatteBorder(null));
        booksTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ISBN", "Title", "Author", "Genre", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectBook(evt);
            }
        });
        jScrollPane1.setViewportView(booksTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 749, 243));

        addBtn.setText("ADD NEW BOOK");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 48, 222, 38));

        editBtn.setText("EDIT SELECTED BOOK");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookInfo(evt);
            }
        });
        getContentPane().add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 92, 222, 39));

        searchBtn.setText("SEARCH BOOK");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBook(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 142, 222, 38));

        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 191, 222, 38));

        delBtn.setText("DELETE SELECTED BOOK");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBook(evt);
            }
        });
        getContentPane().add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 240, 222, 38));

        closeBtn.setText("CLOSE");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 208, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dnedk\\Downloads\\wp2297919.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void clearFields() {
        ISBNTF.setText("");
        titleTF.setText("");
        authorTF.setText("");
        genreTF.setText("");
        yearTF.setText("");
    }

    private void updateTable() {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from book");
            booksTable.setModel(DbUtils.resultSetToTableModel(rs));
            booksTable.getColumnModel().getColumn(0).setMinWidth(0);
            booksTable.getColumnModel().getColumn(0).setMaxWidth(0);
            booksTable.getColumnModel().getColumn(0).setWidth(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:String personalNumber = PersonalNumberTF.getText();
        String ISBN = ISBNTF.getText();
        String title = titleTF.getText();
        String author = authorTF.getText();
        String genre = genreTF.getText();
        String year = yearTF.getText();

        if (!ISBN.isEmpty() && !title.isEmpty() && !author.isEmpty() && !genre.isEmpty() &&  !year.isEmpty()) {
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("insert into book(isbn,title,author,genre,year) values('" + ISBN + "','" + title + "','" + author + "','" + genre + "', '"+year+"')");
                JOptionPane.showMessageDialog(null, "Successfully updated");
                clearFields();
                updateTable();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid data!");
                clearFields();
                updateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid data!");
            clearFields();
            updateTable();
        }
    }//GEN-LAST:event_addBtnActionPerformed
    int bookID;
    private void SelectBook(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectBook
        // TODO add your handling code here:
         addBtn.setEnabled(false);
         editBtn.setEnabled(true);
         delBtn.setEnabled(true);

        int row = booksTable.getSelectedRow();
        Object idObject = booksTable.getValueAt(row, 0);
        String ids = idObject.toString();
        bookID = Integer.parseInt(ids);

        if (evt.getClickCount() >= 1) {
            ISBNTF.setText(booksTable.getValueAt(row, 1).toString());
            titleTF.setText(booksTable.getValueAt(row, 2).toString());
            authorTF.setText(booksTable.getValueAt(row, 3).toString());
            genreTF.setText(booksTable.getValueAt(row, 4).toString());
            yearTF.setText(booksTable.getValueAt(row, 5).toString()); 
       }
    }//GEN-LAST:event_SelectBook

    private void searchBook(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBook
        // TODO add your handling code here:
        
        String ISBN = ISBNTF.getText();
        String title = titleTF.getText();
        String author = authorTF.getText();
        String genre = genreTF.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            if (ISBN.isEmpty() && title.isEmpty() && author.isEmpty() && genre.isEmpty()) {
                ResultSet rs = st.executeQuery("select * from book");
                booksTable.setModel(DbUtils.resultSetToTableModel(rs));
                booksTable.getColumnModel().getColumn(0).setMinWidth(0);
                booksTable.getColumnModel().getColumn(0).setMaxWidth(0);
                booksTable.getColumnModel().getColumn(0).setWidth(0);
            } else {
                ResultSet rs = st.executeQuery("select * from book where isbn = '" + ISBN + "' or title ="
                        + " '" + title + "' or author = '" + author + "' or genre = '"+genre+"'");
                booksTable.setModel(DbUtils.resultSetToTableModel(rs));
                booksTable.getColumnModel().getColumn(0).setMinWidth(0);
                booksTable.getColumnModel().getColumn(0).setMaxWidth(0);
                booksTable.getColumnModel().getColumn(0).setWidth(0);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_searchBook

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        addBtn.setEnabled(true);
        delBtn.setEnabled(false);
        editBtn.setEnabled(false);
        booksTable.clearSelection();
        clearFields();
        bookID = 0;
         try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from book");
                booksTable.setModel(DbUtils.resultSetToTableModel(rs));
                booksTable.getColumnModel().getColumn(0).setMinWidth(0);
                booksTable.getColumnModel().getColumn(0).setMaxWidth(0);
                booksTable.getColumnModel().getColumn(0).setWidth(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBook(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBook
        // TODO add your handling code here:
         try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement st = con.prepareStatement("DELETE FROM book WHERE id = '" + bookID + "'");
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Deleted!");
            clearFields();
            updateTable();
            booksTable.clearSelection();
            delBtn.setEnabled(false);
            editBtn.setEnabled(false);
            addBtn.setEnabled(true);
            bookID = 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Book doesn't exist");
            clearFields();
            updateTable();
            booksTable.clearSelection();
            delBtn.setEnabled(false);
            editBtn.setEnabled(false);
            addBtn.setEnabled(true);
            bookID = 0;
        }
    }//GEN-LAST:event_deleteBook

    private void EditBookInfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBookInfo
        // TODO add your handling code here:
        String ISBN = ISBNTF.getText();
        String title = titleTF.getText();
        String author = authorTF.getText();
        String genre = genreTF.getText();
        String year = yearTF.getText();
        if (!ISBN.isEmpty() && !title.isEmpty() && !author.isEmpty() && !genre.isEmpty() && !year.isEmpty()) {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement st = con.prepareStatement("UPDATE BOOK SET ISBN = '" + ISBN + "', title = '" + title + "',"
                        + " author = '" + author + "', genre = '" + genre + "',year = '"+year+"' WHERE id = '" + bookID + "'");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully Updated!");

                clearFields();
                updateTable();
                booksTable.clearSelection();
                delBtn.setEnabled(false);
                editBtn.setEnabled(false);
                addBtn.setEnabled(true);
                bookID = 0;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid data!");
                 clearFields();
                updateTable();
                booksTable.clearSelection();
                delBtn.setEnabled(false);
                editBtn.setEnabled(false);
                addBtn.setEnabled(true);
                bookID = 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid data!");
            clearFields();
            updateTable();
        }
    }//GEN-LAST:event_EditBookInfo

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ISBNTF;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel authorLbl;
    private javax.swing.JTextField authorTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bookISBNLbl;
    private javax.swing.JLabel bookTitleLbl;
    public javax.swing.JTable booksTable;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel genreLbl;
    private javax.swing.JTextField genreTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField titleTF;
    private javax.swing.JLabel yearLbl;
    private javax.swing.JTextField yearTF;
    // End of variables declaration//GEN-END:variables
}
