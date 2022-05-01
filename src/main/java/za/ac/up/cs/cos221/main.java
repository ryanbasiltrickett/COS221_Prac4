/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package za.ac.up.cs.cos221;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Ryan
 */
public class main extends javax.swing.JFrame {

    TableRowSorter staffSorter;
    TableRowSorter filmSorter;
    TableRowSorter reportSorter;
    TableRowSorter clientSorter;
    filmsInsert fI = null;
    clientInsert cI = null;
    clientUpdate cU = null;
    
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        
        this.setResizable(false);
        
        staffSorter = new TableRowSorter(jtblStaff.getModel());
        jtblStaff.setRowSorter(staffSorter);
        jtblStaff.setDefaultEditor(Object.class, null);
        
        filmSorter = new TableRowSorter(jtblFilms.getModel());
        jtblFilms.setRowSorter(filmSorter);
        jtblFilms.setDefaultEditor(Object.class, null);
        
        clientSorter = new TableRowSorter(jtblClients.getModel());
        jtblClients.setRowSorter(clientSorter);
        jtblClients.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpMenu = new javax.swing.JTabbedPane();
        jplStaff = new javax.swing.JPanel();
        jtfLastName = new javax.swing.JTextField();
        jlbLastName = new javax.swing.JLabel();
        jspStaff = new javax.swing.JScrollPane();
        jtblStaff = new javax.swing.JTable();
        jplFilms = new javax.swing.JPanel();
        jspFilms = new javax.swing.JScrollPane();
        jtblFilms = new javax.swing.JTable();
        jbtInsertFilm = new javax.swing.JButton();
        jplInventory = new javax.swing.JPanel();
        jspInventory = new javax.swing.JScrollPane();
        jtblInventory = new javax.swing.JTable();
        jbtReport = new javax.swing.JButton();
        jplClients = new javax.swing.JPanel();
        jspClients = new javax.swing.JScrollPane();
        jtblClients = new javax.swing.JTable();
        jbtInsert = new javax.swing.JButton();
        jbtDelete = new javax.swing.JButton();
        jbtUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COS221 Prac 4");
        setMaximumSize(new java.awt.Dimension(1163, 530));
        setMinimumSize(new java.awt.Dimension(1163, 530));

        jtpMenu.setName("tabbedPane"); // NOI18N

        jtfLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfLastNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfLastNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfLastNameKeyTyped(evt);
            }
        });

        jlbLastName.setLabelFor(jtfLastName);
        jlbLastName.setText("Search Last Name:");

        jtblStaff.setModel(populateStaff());
        jspStaff.setViewportView(jtblStaff);
        if (jtblStaff.getColumnModel().getColumnCount() > 0) {
            jtblStaff.getColumnModel().getColumn(9).setHeaderValue("Active");
        }

        javax.swing.GroupLayout jplStaffLayout = new javax.swing.GroupLayout(jplStaff);
        jplStaff.setLayout(jplStaffLayout);
        jplStaffLayout.setHorizontalGroup(
            jplStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplStaffLayout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jlbLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
            .addGroup(jplStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jplStaffLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jplStaffLayout.setVerticalGroup(
            jplStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplStaffLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jplStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLastName)
                    .addComponent(jtfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(439, Short.MAX_VALUE))
            .addGroup(jplStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplStaffLayout.createSequentialGroup()
                    .addContainerGap(67, Short.MAX_VALUE)
                    .addComponent(jspStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jtpMenu.addTab("Staff", jplStaff);

        jtblFilms.setModel(populateFilms());
        jspFilms.setViewportView(jtblFilms);
        if (jtblFilms.getColumnModel().getColumnCount() > 0) {
            jtblFilms.getColumnModel().getColumn(3).setHeaderValue("Language");
            jtblFilms.getColumnModel().getColumn(4).setHeaderValue("Rental Duration");
            jtblFilms.getColumnModel().getColumn(5).setHeaderValue("Length");
            jtblFilms.getColumnModel().getColumn(6).setHeaderValue("Replacement Cost");
            jtblFilms.getColumnModel().getColumn(7).setHeaderValue("Rating");
            jtblFilms.getColumnModel().getColumn(8).setHeaderValue("Special Features");
        }

        jbtInsertFilm.setText("Insert Film");
        jbtInsertFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInsertFilmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplFilmsLayout = new javax.swing.GroupLayout(jplFilms);
        jplFilms.setLayout(jplFilmsLayout);
        jplFilmsLayout.setHorizontalGroup(
            jplFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplFilmsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspFilms, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplFilmsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtInsertFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );
        jplFilmsLayout.setVerticalGroup(
            jplFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplFilmsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspFilms, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtInsertFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jtpMenu.addTab("Films", jplFilms);

        jtblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jspInventory.setViewportView(jtblInventory);

        jbtReport.setText("Load Inventory Report");
        jbtReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplInventoryLayout = new javax.swing.GroupLayout(jplInventory);
        jplInventory.setLayout(jplInventoryLayout);
        jplInventoryLayout.setHorizontalGroup(
            jplInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspInventory)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplInventoryLayout.createSequentialGroup()
                .addContainerGap(438, Short.MAX_VALUE)
                .addComponent(jbtReport, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );
        jplInventoryLayout.setVerticalGroup(
            jplInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplInventoryLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbtReport, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtpMenu.addTab("Inventory", jplInventory);

        jtblClients.setModel(populateClients());
        jspClients.setViewportView(jtblClients);

        jbtInsert.setText("Add Client");
        jbtInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInsertActionPerformed(evt);
            }
        });

        jbtDelete.setText("Remove Client");
        jbtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDeleteActionPerformed(evt);
            }
        });

        jbtUpdate.setText("Update Client Information");
        jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplClientsLayout = new javax.swing.GroupLayout(jplClients);
        jplClients.setLayout(jplClientsLayout);
        jplClientsLayout.setHorizontalGroup(
            jplClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspClients, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jplClientsLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jbtInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jbtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jbtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jplClientsLayout.setVerticalGroup(
            jplClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspClients, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jbtDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jtpMenu.addTab("Clients", jplClients);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpMenu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpMenu)
                .addContainerGap())
        );

        jtpMenu.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLastNameKeyReleased
        // TODO add your handling code here:
        filterRows();
    }//GEN-LAST:event_jtfLastNameKeyReleased

    private void jtfLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLastNameKeyPressed
        // TODO add your handling code here:
        filterRows();
    }//GEN-LAST:event_jtfLastNameKeyPressed

    private void jtfLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLastNameKeyTyped
        // TODO add your handling code here:
        filterRows();
    }//GEN-LAST:event_jtfLastNameKeyTyped

    private void jbtInsertFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInsertFilmActionPerformed
        // TODO add your handling code here:
        if (fI == null)
            fI = new filmsInsert(this);
        fI.setVisible(true);
    }//GEN-LAST:event_jbtInsertFilmActionPerformed

    private void jbtReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtReportActionPerformed
        // TODO add your handling code here:
        jtblInventory.setModel(generateReport());
        reportSorter = new TableRowSorter(jtblInventory.getModel());
        jtblInventory.setRowSorter(reportSorter);
        jtblInventory.setDefaultEditor(Object.class, null);
    }//GEN-LAST:event_jbtReportActionPerformed

    private void jbtInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInsertActionPerformed
        // TODO add your handling code here:
        if (cI == null)
            cI = new clientInsert(this);
        cI.setVisible(true);
    }//GEN-LAST:event_jbtInsertActionPerformed

    private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed
        // TODO add your handling code here:
        if (jtblClients.getSelectionModel().isSelectionEmpty() == true)
            JOptionPane.showMessageDialog(this, "Please select a client to remove.");
        else
        {
            int index = jtblClients.getSelectedRow();
            String name = (String)jtblClients.getValueAt(index, 0);
            String surname = (String)jtblClients.getValueAt(index, 1);
            String email = (String)jtblClients.getValueAt(index, 2);
            String address = (String)jtblClients.getValueAt(index, 3);
            String address2 = (String)jtblClients.getValueAt(index, 4);
            String district = (String)jtblClients.getValueAt(index, 5);
            String city = (String)jtblClients.getValueAt(index, 6);
            String post = (String)jtblClients.getValueAt(index, 7);
            String phone = (String)jtblClients.getValueAt(index, 8);
            String store = (String)jtblClients.getValueAt(index, 9);
            String active = (String)jtblClients.getValueAt(index, 10);
            
            int input = JOptionPane.showConfirmDialog(this, "You sure you want to remove customer:\n" + 
                                                        "First Name: " + name + "\n" +
                                                        "Last Name: " + surname + "\n" +
                                                        "Email: " + email + "\n" +
                                                        "Address: " + address + "\n" +
                                                        "Address 2: " + address2 + "\n" +
                                                        "Distinct: " + district + "\n" +
                                                        "City: " + city + "\n" +
                                                        "Postal Code: " + post + "\n" +
                                                        "Phone: " + phone + "\n" +
                                                        "Store Name: " + store + "\n" +
                                                        "Active: " + active);
            
            if (input == 0)
            {
                if (email.length() == 0)
                    email = " IS NULL OR email = ''";
                else
                    email = "= '" + email + "'";
                
                if (address2.length() == 0)
                    address2 = "IS NULL OR address2 = ''";
                else
                    address2 = "= '" + address2 + "'";

                if (post.length() == 0)
                    post = "IS NULL OR postal_code = ''";
                else
                    post = "= '" + post + "'";
                
                Database instance = Database.instance();
                
                String citySQL = "(SELECT city_id " +
                                 "FROM city " +
                                 "WHERE city = '" + city + "')";
                
                String addressSQL = "(SELECT address_id " +
                                    "FROM address " +
                                    "WHERE address = '" + address + "' AND address2 " + address2 +
                                    " AND district = '" + district + "' AND city_id = " + citySQL + 
                                    " AND postal_code " + post + " AND phone = '" + phone + "')";
                
                String sql = "DELETE FROM customer " +
                             "WHERE customer_id = (SELECT customer_id " + 
                             "FROM customer " +
                             "WHERE first_name = '" + name + "' AND last_name = '" + surname + 
                             "' AND email " + email + " AND address_id = " + addressSQL + 
                             " AND active = " + active + " AND store_id = " + store + ")";
                instance.execSQL(sql);
                JOptionPane.showMessageDialog(this, "Client removed successfully.");
                
                refreshClients();
            }
        }
    }//GEN-LAST:event_jbtDeleteActionPerformed

    private void jbtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateActionPerformed
        // TODO add your handling code here:
        if (jtblClients.getSelectionModel().isSelectionEmpty() == true)
            JOptionPane.showMessageDialog(this, "Please select a client to update.");
        else
        {
            if (cU == null)
                cU = new clientUpdate(this, jtblClients);
            else
            {
                cU.dispatchEvent(new WindowEvent(cU, WindowEvent.WINDOW_CLOSING));
                cU = new clientUpdate(this, jtblClients);
            }
            cU.setVisible(true);
        }
    }//GEN-LAST:event_jbtUpdateActionPerformed

    private void filterRows()
    {
        staffSorter.setRowFilter(new rowFilter(jtfLastName.getText()));
    }
    
    private DefaultTableModel populateStaff()
    {
        String[] headers = {"First Name", "Last Name", "Address", "Address 2", "District", "City", "Postal Code", "Phone", 
                            "Store", "Active"};
        
        Database instance = Database.instance();
        
        String sql = "SELECT first_name, last_name, address, address2, district, city, postal_code, phone, store_id, active " +
                     "FROM staff, address, city " +
                     "WHERE staff.address_id = address.address_id AND address.city_id = city.city_id";
        
        return new DefaultTableModel(instance.returnRows(sql), headers);
    }
    
    private DefaultTableModel populateFilms()
    {
        String[] headers = {"Title", "Description", "Release Year", "Language", "Rental Duration", "Length", "Replacement Cost", 
                            "Rating", "Special Features"};
        
        Database instance = Database.instance();
        
        String sql = "SELECT title, description, release_year, name, rental_duration, length, replacement_cost, rating, special_features " +
                     "FROM film, language " +
                     "WHERE film.language_id = language.language_id";
        
        return new DefaultTableModel(instance.returnRows(sql), headers);
    }
    
    private DefaultTableModel generateReport()
    {
        String[] headers = {"Store Name", "Genre Name", "Number in Stock"};
        
        Database instance = Database.instance();
        
        String sql = "SELECT store_id, name, COUNT(*) " +
                     "FROM inventory, category, film_category " +
                     "WHERE inventory.film_id = film_category.film_id AND film_category.category_id = category.category_id " + 
                     "GROUP BY store_id, name";
        
        return new DefaultTableModel(instance.returnRows(sql), headers);
    }
    
    private DefaultTableModel populateClients()
    {
        String[] headers = {"First Name", "Last Name", "Email", "Address", "Address 2", "District", "City", "Postal Code", "Phone", 
                            "Store Name", "Active"};
        
        Database instance = Database.instance();
        
        String sql = "SELECT first_name, last_name, email, address, address2, district, city, postal_code, phone, store_id, active " +
                     "FROM address, customer, city " +
                     "WHERE customer.address_id = address.address_id AND address.city_id = city.city_id";
        
        return new DefaultTableModel(instance.returnRows(sql), headers);
    }
    
    public void refreshFilms()
    {
        jtblFilms.setModel(populateFilms());
        filmSorter = new TableRowSorter(jtblFilms.getModel());
        jtblFilms.setRowSorter(filmSorter);
    }
    
    public void refreshClients()
    {
        jtblClients.setModel(populateClients());
        clientSorter = new TableRowSorter(jtblClients.getModel());
        jtblClients.setRowSorter(clientSorter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtInsert;
    private javax.swing.JButton jbtInsertFilm;
    private javax.swing.JButton jbtReport;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JLabel jlbLastName;
    private javax.swing.JPanel jplClients;
    private javax.swing.JPanel jplFilms;
    private javax.swing.JPanel jplInventory;
    private javax.swing.JPanel jplStaff;
    private javax.swing.JScrollPane jspClients;
    private javax.swing.JScrollPane jspFilms;
    private javax.swing.JScrollPane jspInventory;
    private javax.swing.JScrollPane jspStaff;
    public javax.swing.JTable jtblClients;
    public javax.swing.JTable jtblFilms;
    public javax.swing.JTable jtblInventory;
    public javax.swing.JTable jtblStaff;
    private javax.swing.JTextField jtfLastName;
    private javax.swing.JTabbedPane jtpMenu;
    // End of variables declaration//GEN-END:variables
}
