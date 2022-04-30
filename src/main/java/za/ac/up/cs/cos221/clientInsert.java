/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package za.ac.up.cs.cos221;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class clientInsert extends javax.swing.JFrame {

    main parentForm;
    
    /**
     * Creates new form clientInsert
     */
    public clientInsert(main parent) {
        parentForm = parent;
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

        jlblTitle = new javax.swing.JLabel();
        jbtInsert = new javax.swing.JButton();
        jlblName = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jtfSurname = new javax.swing.JTextField();
        jlblSurname = new javax.swing.JLabel();
        jlblEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlblAddress = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jtfAddress2 = new javax.swing.JTextField();
        jlblAddress2 = new javax.swing.JLabel();
        jlblDistrict = new javax.swing.JLabel();
        jtfDistrict = new javax.swing.JTextField();
        jlblCity = new javax.swing.JLabel();
        jlblPost = new javax.swing.JLabel();
        jtfPost = new javax.swing.JTextField();
        jcbxCity = new javax.swing.JComboBox<>();
        jcbxStore = new javax.swing.JComboBox<>();
        jlblStore = new javax.swing.JLabel();
        jtfPhone = new javax.swing.JTextField();
        jlblPhone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlblTitle.setText("Add Client");

        jbtInsert.setText("Insert");
        jbtInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInsertActionPerformed(evt);
            }
        });

        jlblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblName.setLabelFor(jtfName);
        jlblName.setText("First Name:");

        jlblSurname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblSurname.setLabelFor(jtfName);
        jlblSurname.setText("Last Name:");

        jlblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblEmail.setLabelFor(jtfName);
        jlblEmail.setText("Email:");

        jlblAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblAddress.setLabelFor(jtfName);
        jlblAddress.setText("Address:");

        jlblAddress2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblAddress2.setLabelFor(jtfName);
        jlblAddress2.setText("Address 2:");

        jlblDistrict.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblDistrict.setLabelFor(jtfName);
        jlblDistrict.setText("District:");

        jlblCity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblCity.setLabelFor(jtfName);
        jlblCity.setText("City:");

        jlblPost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblPost.setLabelFor(jtfName);
        jlblPost.setText("Postal Code:");

        jcbxCity.setModel(populateCities());

        jcbxStore.setModel(populateStores());

        jlblStore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblStore.setLabelFor(jtfName);
        jlblStore.setText("Store:");

        jlblPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblPhone.setLabelFor(jtfName);
        jlblPhone.setText("Phone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(155, Short.MAX_VALUE)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblAddress2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblSurname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblDistrict)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblPost)
                                    .addComponent(jlblEmail)
                                    .addComponent(jlblCity)
                                    .addComponent(jlblPhone)
                                    .addComponent(jlblStore))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbxStore, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfPhone)
                                    .addComponent(jtfPost, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(jcbxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jlblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jbtInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblName)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSurname)
                    .addComponent(jtfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAddress)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAddress2)
                    .addComponent(jtfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblDistrict)
                    .addComponent(jtfDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCity)
                    .addComponent(jcbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPost)
                    .addComponent(jtfPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPhone)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblStore)
                    .addComponent(jcbxStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jbtInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInsertActionPerformed
        // TODO add your handling code here:
        String name = jtfName.getText();
        String surname = jtfSurname.getText();
        String email = jtfEmail.getText();
        String address = jtfAddress.getText();
        String address2 = jtfAddress2.getText();
        String district = jtfDistrict.getText();
        String post = jtfPost.getText();
        String phone = jtfPhone.getText();
        
        String citySQL = "(SELECT city_id " +
                         "FROM city " +
                         "WHERE city = '" + (String)jcbxCity.getSelectedItem() + "')";
        
        if (email.length() == 0)
            email = "NULL";
        else
            email = "'" + email + "'";
        
        if (address2.length() == 0)
            address2 = "NULL";
        else
            address2 = "'" + address2 + "'";
        
        if (post.length() == 0)
            post = "NULL";
        else
            post = "'" + post + "'";
        
        Database instance = Database.instance();
        
        String sql = "INSERT INTO address " +
                     "(address, address2, district, city_id, postal_code, phone) " +
                     "VALUES('" + address + "', " + address2 + ", '" + district + "', " +
                     citySQL + ", " + post + ", '" + phone + "')";
        instance.execSQL(sql);
        
        if (address2.length() == 0)
            address2 = "IS NULL";
        else
            address2 = "= " + address2;
        
        if (post.length() == 0)
            post = "IS NULL";
        else
            post = "= " + post;
        
        String addressSQL = "(SELECT address_id " +
                            "FROM address " +
                            "WHERE address = '" + address + "' AND address2 " + address2 +
                            " AND district = '" + district + "' AND city_id = " + citySQL + 
                            " AND postal_code " + post + " AND '" + phone + "')";
        System.out.println(instance.returnArray(sql)[0]);
        
        sql = "INSERT INTO customer " +
              "(first_name, last_name, email, address_id, store_id) " +
              "VALUES('" + name + "', '" + surname + "', " + email + ", " + addressSQL +
              ", " + (String)jcbxStore.getSelectedItem() + ")";
        instance.execSQL(sql);
        JOptionPane.showMessageDialog(this, "Client added successfully.");

        clearForm();

        parentForm.refreshClients();
    }//GEN-LAST:event_jbtInsertActionPerformed

    private void clearForm()
    {
        jtfName.setText("");
        jtfSurname.setText("");
        jtfEmail.setText("");
        jtfAddress.setText("");
        jtfAddress2.setText("");
        jtfDistrict.setText("");
        jtfPost.setText("");
        jtfPhone.setText("");
        jcbxStore.setSelectedIndex(0);
        jcbxCity.setSelectedIndex(0);
    }
    
    private DefaultComboBoxModel populateCities()
    {
        Database instance = Database.instance();
        
        String sql = "SELECT city FROM city";
        
        return new DefaultComboBoxModel(instance.returnArray(sql)); 
    }
    
    private DefaultComboBoxModel populateStores()
    {
        Database instance = Database.instance();
        
        String sql = "SELECT store_id FROM store";
        
        return new DefaultComboBoxModel(instance.returnArray(sql)); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtInsert;
    private javax.swing.JComboBox<String> jcbxCity;
    private javax.swing.JComboBox<String> jcbxStore;
    private javax.swing.JLabel jlblAddress;
    private javax.swing.JLabel jlblAddress2;
    private javax.swing.JLabel jlblCity;
    private javax.swing.JLabel jlblDistrict;
    private javax.swing.JLabel jlblEmail;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblPhone;
    private javax.swing.JLabel jlblPost;
    private javax.swing.JLabel jlblStore;
    private javax.swing.JLabel jlblSurname;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfAddress2;
    private javax.swing.JTextField jtfDistrict;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPhone;
    private javax.swing.JTextField jtfPost;
    private javax.swing.JTextField jtfSurname;
    // End of variables declaration//GEN-END:variables
}
