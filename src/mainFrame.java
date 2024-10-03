
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class mainFrame extends javax.swing.JFrame {

    Connection conn = null;
    JFileChooser fileChooser = new JFileChooser();
    File selectedFile;

    public mainFrame() {

        initComponents();

        myConnection();
        customTable();
        glassPaneCustom();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popView = new javax.swing.JPopupMenu();
        viewMenu = new javax.swing.JMenuItem();
        showDatabase2 = new javax.swing.JMenuItem();
        suggestionPopup = new javax.swing.JPopupMenu();
        use = new javax.swing.JMenuItem();
        popShow = new javax.swing.JPopupMenu();
        showTable = new javax.swing.JMenuItem();
        showDatabase = new javax.swing.JMenuItem();
        exportPanel = new javax.swing.JPanel();
        dummyLabel = new javax.swing.JLabel();
        exportButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        importPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        importButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pathField = new javax.swing.JTextField();
        choose = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        importQueryField = new javax.swing.JTextArea();
        backgroundPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        start = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        queryField = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nameTable = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        viewMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/data.png"))); // NOI18N
        viewMenu.setText("View Data");
        viewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMenuActionPerformed(evt);
            }
        });
        popView.add(viewMenu);

        showDatabase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/database.png"))); // NOI18N
        showDatabase2.setText("Show Databases");
        showDatabase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDatabase2ActionPerformed(evt);
            }
        });
        popView.add(showDatabase2);

        use.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/database.png"))); // NOI18N
        use.setText("Use Database");
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });
        suggestionPopup.add(use);

        showTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/database-table.png"))); // NOI18N
        showTable.setText("Show Tables");
        showTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTableActionPerformed(evt);
            }
        });
        popShow.add(showTable);

        showDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/database.png"))); // NOI18N
        showDatabase.setText("Show Databases");
        showDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDatabaseActionPerformed(evt);
            }
        });
        popShow.add(showDatabase);

        exportPanel.setBackground(new java.awt.Color(204, 102, 0));
        exportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        exportPanel.add(dummyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 550, 20));

        exportButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        exportButton.setText("Export Now");
        exportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });
        exportPanel.add(exportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 173, 440, 40));

        nameLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("File name");
        exportPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, 30));

        nameField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        exportPanel.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 440, 40));

        importPanel.setBackground(new java.awt.Color(204, 102, 0));
        importPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        importPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 670, 20));

        importButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        importButton.setText("Import Now");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });
        importPanel.add(importButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 380, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("File path name");
        importPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 230, 30));

        pathField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pathField.setFocusable(false);
        importPanel.add(pathField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 580, 40));

        choose.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        choose.setText("Choose File");
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });
        importPanel.add(choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 170, 30));

        importQueryField.setColumns(20);
        importQueryField.setRows(5);
        jScrollPane4.setViewportView(importQueryField);

        importPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 580, 80));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(204, 102, 0));
        backgroundPanel.setForeground(new java.awt.Color(91, 91, 91));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setRowHeight(25);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
        }

        backgroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1290, 290));

        output.setColumns(20);
        output.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        output.setLineWrap(true);
        output.setRows(5);
        output.setTabSize(10);
        output.setFocusable(false);
        jScrollPane2.setViewportView(output);

        backgroundPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 1280, 60));

        start.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        start.setText("Start Query");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        backgroundPanel.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 350, 40));

        queryField.setColumns(20);
        queryField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        queryField.setRows(5);
        queryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                queryFieldKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(queryField);

        backgroundPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1290, 170));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Output:");
        backgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 60, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Creator :Kent Jerone Ramos");
        backgroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 200, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Update Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        backgroundPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 350, 180, 30));

        nameTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTableActionPerformed(evt);
            }
        });
        nameTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTableKeyPressed(evt);
            }
        });
        backgroundPanel.add(nameTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 250, 30));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Import");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        backgroundPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 140, 30));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("Export");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        backgroundPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 590, 140, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logoDatabase.png"))); // NOI18N
        jLabel5.setText("Mini Query");
        backgroundPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Write your query");
        backgroundPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 270, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Write your query");
        backgroundPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 270, 40));

        getContentPane().add(backgroundPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1336, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        queryFunction();
    }//GEN-LAST:event_startActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fieldUpdate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTableActionPerformed
        fieldUpdate();

    }//GEN-LAST:event_nameTableActionPerformed
   String undo;
    private void queryFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_queryFieldKeyPressed
    
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_ENTER) {
            queryFunction();
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_U) {
            fieldUpdate();

        }
      
        if(evt.isShiftDown()&&evt.getKeyCode()==KeyEvent.VK_C){
         undo =queryField.getText();
            queryField.setText("");
        }
        if(evt.isControlDown()&&evt.getKeyCode()==KeyEvent.VK_B){
             
            queryField.setText(undo);
        }
        
        
    }//GEN-LAST:event_queryFieldKeyPressed

    private void nameTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTableKeyPressed
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_U) {
            fieldUpdate();

        }
    }//GEN-LAST:event_nameTableKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        onGlass();
        UIManager.put("OptionPane.okButtonText", "CLOSE");
        JOptionPane.showMessageDialog(null, exportPanel, "Export", JOptionPane.PLAIN_MESSAGE);
        UIManager.put("OptionPane.okButtonText", "OK");
        offGlass();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        functionExport();
    }//GEN-LAST:event_exportButtonActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed

        if (SwingUtilities.isRightMouseButton(evt)) {
            if (table.getColumnName(0).contains("Tables_in_")) {
                popView.show(table, evt.getX(), getY());
            } else if (table.getColumnName(0).equals("Database")) {
                suggestionPopup.show(table, evt.getX(), evt.getY());
            } else {
                popShow.show(table, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tableMousePressed

    private void useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String name = table.getValueAt(table.getSelectedRow(), 0).toString();
        try (PreparedStatement pst = conn.prepareStatement("Use " + name)) {
            pst.executeUpdate();
            PreparedStatement pstShowTables = conn.prepareStatement("show tables");
            ResultSet rs = pstShowTables.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            output.setText(e.toString());
        }
    }//GEN-LAST:event_useActionPerformed

    private void viewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMenuActionPerformed
        String name = table.getValueAt(table.getSelectedRow(), 0).toString();
        try (PreparedStatement pst = conn.prepareStatement("Select*from " + name)) {
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_viewMenuActionPerformed

    private void showTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTableActionPerformed
        showingTables();
    }//GEN-LAST:event_showTableActionPerformed

    private void showDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDatabaseActionPerformed
        showingDatabases();
    }//GEN-LAST:event_showDatabaseActionPerformed

    private void showDatabase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDatabase2ActionPerformed
        showingDatabases();
    }//GEN-LAST:event_showDatabase2ActionPerformed

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile().getAbsoluteFile();
            pathField.setText(selectedFile.toString());
        }

    }//GEN-LAST:event_chooseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        onGlass();
        UIManager.put("OptionPane.okButtonText", "CLOSE");
        JOptionPane.showMessageDialog(null, importPanel, "Export", JOptionPane.PLAIN_MESSAGE);
        UIManager.put("OptionPane.okButtonText", "OK");
        offGlass();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        if(pathField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select a file first to import");
            return;
        }
        if(queryField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please write query to import");
            return;
        }
        String query = importQueryField.getText();
        char c = '?';
        int count = 0;
        for (int a = 0; a < query.length(); a++) {
            if (query.charAt(a) == c) {
                count++;
            }
        }

        try {
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(selectedFile));
            XSSFSheet sheet = workbook.getSheetAt(0);
            PreparedStatement pst = conn.prepareStatement(query);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < count; j++) {
                    pst.setString(j + 1, row.getCell(j).getStringCellValue());

                }
                pst.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Successfully Imported");

        } catch (HeadlessException | IOException | SQLException e) {
            System.err.println(e);
            output.setText(e.toString());
        }
    }//GEN-LAST:event_importButtonActionPerformed
    void fieldUpdate() {
        try (PreparedStatement pst = conn.prepareStatement("Select*from " + nameTable.getText())) {
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            output.setText(e.toString());
        }
        customTable();
    }

    void showingDatabases() {
        try (PreparedStatement pst = conn.prepareStatement("show databases")) {
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            output.setText(e.toString());
        }

    }

    void showingTables() {
        try (PreparedStatement pst = conn.prepareStatement("show tables")) {
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            output.setText(e.toString());
        }
    }

    void myConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
            output.setText("Connected.");
            showingDatabases();
        } catch (ClassNotFoundException | SQLException e) {
            output.setText("");
            output.setText("");
            output.setText(e.toString() + "\n" + e.getMessage());
        }

    }

    void queryFunction() {
        String c = queryField.getText().trim();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        output.setText("");

        try (PreparedStatement pst = conn.prepareStatement(queryField.getText().trim())) {

            if (c.startsWith("use", 0) || c.startsWith("Use", 0) || c.startsWith("USE", 0)) {
                pst.executeUpdate();
                output.setText("Using" + c.substring(3));
                model.setRowCount(0);
                model.addRow(new Object[]{c.substring(3)});

            } else if (c.contains("drop database") || c.contains("Drop database") || c.contains("drop Database")
                    || c.contains("DROP database") || c.contains("drop DATABASE") || c.contains("DROP DATABASE")) {
                pst.executeUpdate();
                output.setText("Successfully drop the" + c.substring(4));
                showingDatabases();

            } else if (c.contains("create database") || c.contains("Create database") || c.contains("create Database")
                    || c.contains("CREATE database") || c.contains("create DATABASE") || c.contains("CREATE DATABASE")) {
                pst.executeUpdate();
                output.setText("Successfully created database" + c.substring(15));
                showingDatabases();

            } else if (c.contains("drop table") || c.contains("Drop table") || c.contains("drop Table")
                    || c.contains("DROP table") || c.contains("drop TABLE") || c.contains("DROP TABLE")) {
                pst.executeUpdate();
                output.setText("Successfully drop the" + c.substring(4));
                showingTables();
            } else if (c.contains("create table") || c.contains("Create table") || c.contains("create Table")
                    || c.contains("CREATE database") || c.contains("create TABLE") || c.contains("CREATE TABLE")) {
                pst.executeUpdate();
                output.setText("Successfully created table" + c.substring(10));
            } else {
                if (c.contains("delete") || c.contains("Delete") || c.contains("DELETE")) {
                    pst.executeUpdate();
                    model.setRowCount(0);
                    output.setText("Successfully Deleted");
                } else if (c.contains("update") || c.contains("Update") || c.contains("create table") || c.contains("insert")) {
                    pst.executeUpdate();
                    model.setRowCount(0);
                    output.setText("Successfully Updated");
                } else {
                    ResultSet rs = pst.executeQuery();
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }

            }

        } catch (Exception e) {

            output.setText(e.getMessage());

        }
        customTable();

    }

    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new mainFrame().setVisible(true);
        });
    }

    void functionExport() {
        String location = System.getProperty("user.home") + "/OneDrive/Desktop/";
        String name = nameField.getText().trim() + ".xlsx";
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Database Data");
            PreparedStatement pst = conn.prepareStatement(queryField.getText());
            ResultSet rs = pst.executeQuery();
            Row headerRow = sheet.createRow(0);
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                headerRow.createCell(i - 1).setCellValue(rs.getMetaData().getColumnName(i));

            }
            int rowNumber = 1;
            while (rs.next()) {
                Row row = sheet.createRow(rowNumber++);
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    row.createCell(i - 1).setCellValue(rs.getString(i));

                }
            }
            workbook.write(new FileOutputStream(location + name));
            workbook.close();
            JOptionPane.showMessageDialog(null, "Successfully Export");
            nameField.setText("");
            queryField.setText("");

        } catch (HeadlessException | IOException | SQLException e) {
            output.setText(e.toString());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton choose;
    private javax.swing.JLabel dummyLabel;
    private javax.swing.JButton exportButton;
    private javax.swing.JPanel exportPanel;
    private javax.swing.JButton importButton;
    private javax.swing.JPanel importPanel;
    private javax.swing.JTextArea importQueryField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTable;
    private javax.swing.JTextArea output;
    private javax.swing.JTextField pathField;
    private javax.swing.JPopupMenu popShow;
    private javax.swing.JPopupMenu popView;
    private javax.swing.JTextArea queryField;
    private javax.swing.JMenuItem showDatabase;
    private javax.swing.JMenuItem showDatabase2;
    private javax.swing.JMenuItem showTable;
    private javax.swing.JButton start;
    private javax.swing.JPopupMenu suggestionPopup;
    private javax.swing.JTable table;
    private javax.swing.JMenuItem use;
    private javax.swing.JMenuItem viewMenu;
    // End of variables declaration//GEN-END:variables

    void onGlass() {
        rootPane.getGlassPane().setVisible(true);
    }

    void offGlass() {
        rootPane.getGlassPane().setVisible(false);
    }

    void glassPaneCustom() {
        rootPane.setGlassPane(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(new Color(15, 15, 15, 180));
                g.fillRect(0, 0, getWidth(), getHeight());
            }

        });
    }

    void customTable() {

        for (int i = 0; i < table.getColumnCount(); i++) {
            if (table.getColumnName(i).contains("_id") && table.getColumnCount() > 5) {
                table.getColumnModel().getColumn(i).setMaxWidth(70);
            }
            if (table.getColumnName(i).contains("title_name")) {
                table.getColumnModel().getColumn(i).setPreferredWidth(250);

            }
        }
        System.out.println(table.getColumnName(0));

        table.setDefaultEditor(Object.class, null);
        table.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object value, boolean bln, boolean bln1, int i, int column) {
                super.getTableCellRendererComponent(jtable, value, bln, bln1, i, column);
                if (column != 4) {
                    setHorizontalAlignment(JLabel.LEFT);

                }

                setFont(new Font("Mono-space", Font.BOLD, 20));
                setBorder(new MatteBorder(0, 0, 1, 1, new Color(0, 120, 215)));
                
                if(value!=null&&value.toString().contains("Database")){
                    setIcon(new ImageIcon(getClass().getResource("/image/database.png/")));
                }else{
                    setIcon(null);
                }
                return this;
            }

        });

        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                setBorder(new MatteBorder(0, 0, 1, 1, new Color(230, 230, 230)));
                if(table.getColumnName(0).contains("Tables_in_")){
                    setIcon(new ImageIcon(getClass().getResource("/image/database-table.png/")));
                }else{
                    setIcon(null);
                }
        
                return this;
            }

        });

    }

}
