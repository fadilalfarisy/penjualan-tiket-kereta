
package tiket;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/* Author
kelompok 6
1. Amir Kholiluddin Ismail 
2. Ahmad Fadil Alfarisy
3. Annisa Safa
4. Assiva Nurul
5. Azzam Izzudin Hasan
*/

public class Admin extends javax.swing.JFrame {
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    public Admin() {
        initComponents();
        Koneksi.getKoneksi();
        data();
        data_harga();
        bayangan1.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        unameLabel = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        unameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTabel = new javax.swing.JTable();
        simpanBtnAdmin = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        pwTextField = new javax.swing.JPasswordField();
        bayangan1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hargaTabel = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        statusTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kelasTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hargaTextField = new javax.swing.JTextField();
        simpanBtnHarga = new javax.swing.JButton();
        notesLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        keluarMenuItem = new javax.swing.JMenuItem();
        tiketMenu = new javax.swing.JMenu();
        dataPenumpangMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N

        namaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(0, 0, 51));
        namaLabel.setText("Nama");

        unameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        unameLabel.setForeground(new java.awt.Color(0, 0, 51));
        unameLabel.setText("Username");

        pwLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pwLabel.setForeground(new java.awt.Color(0, 0, 51));
        pwLabel.setText("Password");

        adminTabel.setForeground(new java.awt.Color(0, 0, 102));
        adminTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminTabel);
        if (adminTabel.getColumnModel().getColumnCount() > 0) {
            adminTabel.getColumnModel().getColumn(3).setHeaderValue("Password");
        }

        simpanBtnAdmin.setBackground(new java.awt.Color(0, 0, 51));
        simpanBtnAdmin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        simpanBtnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        simpanBtnAdmin.setText("Simpan");
        simpanBtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnAdminActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 102, 0));
        editBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        hapusBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwLabel)
                    .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(namaTextField)
                    .addComponent(pwTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(simpanBtnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(hapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bayangan1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bayangan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(unameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hapusBtn)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(simpanBtnAdmin)
                        .addComponent(editBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Harga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 51));

        hargaTabel.setForeground(new java.awt.Color(0, 0, 51));
        hargaTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Status", "Kelas", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hargaTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hargaTabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(hargaTabel);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Status");

        statusTextField.setEditable(false);
        statusTextField.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        kelasTextField.setEditable(false);
        kelasTextField.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Kelas");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Harga");

        hargaTextField.setBackground(new java.awt.Color(255, 204, 102));

        simpanBtnHarga.setBackground(new java.awt.Color(0, 0, 51));
        simpanBtnHarga.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        simpanBtnHarga.setForeground(new java.awt.Color(255, 255, 255));
        simpanBtnHarga.setText("Simpan");
        simpanBtnHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnHargaActionPerformed(evt);
            }
        });

        notesLabel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        notesLabel.setText("*Klik untuk mengubah");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusTextField)
                            .addComponent(kelasTextField)
                            .addComponent(hargaTextField))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(simpanBtnHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(notesLabel)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kelasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(simpanBtnHarga)
                .addGap(19, 19, 19))
        );

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Admin");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiket/emblem2(1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        fileMenu.setText("File");

        keluarMenuItem.setText("Keluar");
        keluarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(keluarMenuItem);

        jMenuBar1.add(fileMenu);

        tiketMenu.setText("Tiket");
        tiketMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiketMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(tiketMenu);

        dataPenumpangMenu.setText("Data Penumpang");
        dataPenumpangMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataPenumpangMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(dataPenumpangMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void data_harga(){
     try{
            con = Koneksi.getKoneksi();
            String sql1 = "SELECT * FROM harga";
            st = con.createStatement();
            rs = st.executeQuery(sql1);
            while(rs.next()){
                DefaultTableModel model = (DefaultTableModel) hargaTabel.getModel();
                Object[] row = new Object[4];
                row[0] = rs.getString("id");
                row[1] = rs.getString("status");
                row[2] = rs.getString("kelas");
                row[3] = rs.getString("harga");                
                model.addRow(row);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     private void data(){
     try{
            con = Koneksi.getKoneksi();
            String sql1 = "SELECT * FROM admin order by id ASC";
            st = con.createStatement();
            rs = st.executeQuery(sql1);
            while(rs.next()){
                DefaultTableModel model = (DefaultTableModel) adminTabel.getModel();
                Object[] row = new Object[4];
                row[0] = rs.getString("id");
                row[1] = rs.getString("nama");
                row[2] = rs.getString("username");
                row[3] = rs.getString("password");                
                model.addRow(row);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     private void bersih(){
        namaTextField.setText("");
        unameTextField.setText("");
        pwTextField.setText("");
        bayangan1.setText("");
        statusTextField.setText("");
        kelasTextField.setText("");
        hargaTextField.setText("");
     }
    
    private void tiketMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiketMenuMouseClicked
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_tiketMenuMouseClicked

    private void dataPenumpangMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataPenumpangMenuMouseClicked
        new Penumpang().setVisible(true);
        dispose();
    }//GEN-LAST:event_dataPenumpangMenuMouseClicked

    private void keluarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarMenuItemActionPerformed
        dispose();
    }//GEN-LAST:event_keluarMenuItemActionPerformed

    private void simpanBtnHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnHargaActionPerformed
        try{
            String pass = new String(pwTextField.getPassword());
            con = Koneksi.getKoneksi();
            String sql = "UPDATE harga set harga='"+hargaTextField.getText()+"' where id='"+bayangan1.getText()+"'";
            st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null,"Berhasil");
            DefaultTableModel model = (DefaultTableModel) hargaTabel.getModel();
            model.setRowCount(0);
            data_harga();
            bersih();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_simpanBtnHargaActionPerformed

    private void hargaTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hargaTabelMouseClicked
        int i = hargaTabel.getSelectedRow();
        TableModel model = hargaTabel.getModel();
        bayangan1.setText(model.getValueAt(i, 0).toString());
        statusTextField.setText(model.getValueAt(i, 1).toString());
        kelasTextField.setText(model.getValueAt(i, 2).toString());
        hargaTextField.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_hargaTabelMouseClicked

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        try{
            String pass = new String(pwTextField.getPassword());
            con = Koneksi.getKoneksi();
            String sql = "DELETE FROM admin WHERE id='"+bayangan1.getText()+"'";
            st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null,"Berhasil");
            DefaultTableModel model = (DefaultTableModel) adminTabel.getModel();
            model.setRowCount(0);
            data();
            bersih();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try{
            String pass = new String(pwTextField.getPassword());
            con = Koneksi.getKoneksi();
            String sql = "UPDATE admin set nama='"+namaTextField.getText()+"',username='"+unameTextField.getText()+"',password='"+pass+"' where id='"+bayangan1.getText()+"'";
            st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null,"Berhasil");
            DefaultTableModel model = (DefaultTableModel) adminTabel.getModel();
            model.setRowCount(0);
            data();
            bersih();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void simpanBtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnAdminActionPerformed

        try{
            String pass = new String(pwTextField.getPassword());
            con = Koneksi.getKoneksi();
            String sql = "INSERT INTO admin (nama,username,password) VALUE('"+namaTextField.getText()+"','"+unameTextField.getText()+"','"+pass+"')";
            st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null,"Berhasil");
            DefaultTableModel model = (DefaultTableModel) adminTabel.getModel();
            model.setRowCount(0);
            data();
            bersih();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_simpanBtnAdminActionPerformed

    private void adminTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTabelMouseClicked
        int i = adminTabel.getSelectedRow();
        TableModel model = adminTabel.getModel();
        bayangan1.setText(model.getValueAt(i, 0).toString());
        namaTextField.setText(model.getValueAt(i, 1).toString());
        unameTextField.setText(model.getValueAt(i, 2).toString());
        pwTextField.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_adminTabelMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminTabel;
    private javax.swing.JTextField bayangan1;
    private javax.swing.JMenu dataPenumpangMenu;
    private javax.swing.JButton editBtn;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JTable hargaTabel;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kelasTextField;
    private javax.swing.JMenuItem keluarMenuItem;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JPasswordField pwTextField;
    private javax.swing.JButton simpanBtnAdmin;
    private javax.swing.JButton simpanBtnHarga;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JMenu tiketMenu;
    private javax.swing.JLabel unameLabel;
    private javax.swing.JTextField unameTextField;
    // End of variables declaration//GEN-END:variables
}

