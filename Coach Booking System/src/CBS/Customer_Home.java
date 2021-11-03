/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CBS;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
/**
 *
 * @author Geethan
 */
public class Customer_Home extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Home
     */
    public Customer_Home() {
        initComponents();
        fillComboBox();
        fillComboBox2();
        showUserTable1();
    }

    GUI_Methods gui = new GUI_Methods();
    private boolean dashboard=true,adr=false,set=false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_side = new javax.swing.JPanel();
        sidepnl_top = new javax.swing.JPanel();
        btn_Dashboard = new javax.swing.JPanel();
        leftpnl_dashboard_btn = new javax.swing.JPanel();
        lbl_dashboard_btn = new javax.swing.JLabel();
        btn_tripbooking = new javax.swing.JPanel();
        leftpnl_addroutes_btn = new javax.swing.JPanel();
        lbl_manageroutes_btn1 = new javax.swing.JLabel();
        btn_Logout = new javax.swing.JPanel();
        leftpnl_settings_btn = new javax.swing.JPanel();
        lbl_settings_btn = new javax.swing.JLabel();
        pnl_center = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnl_dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnl_addroutes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_filter = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_side.setBackground(new java.awt.Color(21, 25, 28));
        pnl_side.setPreferredSize(new java.awt.Dimension(480, 720));
        pnl_side.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepnl_top.setBackground(new java.awt.Color(21, 25, 28));
        sidepnl_top.setPreferredSize(new java.awt.Dimension(480, 165));

        javax.swing.GroupLayout sidepnl_topLayout = new javax.swing.GroupLayout(sidepnl_top);
        sidepnl_top.setLayout(sidepnl_topLayout);
        sidepnl_topLayout.setHorizontalGroup(
            sidepnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        sidepnl_topLayout.setVerticalGroup(
            sidepnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        pnl_side.add(sidepnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        btn_Dashboard.setBackground(new java.awt.Color(34, 40, 44));
        btn_Dashboard.setPreferredSize(new java.awt.Dimension(480, 55));
        btn_Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DashboardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_DashboardMousePressed(evt);
            }
        });

        leftpnl_dashboard_btn.setBackground(new java.awt.Color(0, 102, 255));
        leftpnl_dashboard_btn.setPreferredSize(new java.awt.Dimension(5, 55));

        javax.swing.GroupLayout leftpnl_dashboard_btnLayout = new javax.swing.GroupLayout(leftpnl_dashboard_btn);
        leftpnl_dashboard_btn.setLayout(leftpnl_dashboard_btnLayout);
        leftpnl_dashboard_btnLayout.setHorizontalGroup(
            leftpnl_dashboard_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        leftpnl_dashboard_btnLayout.setVerticalGroup(
            leftpnl_dashboard_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_dashboard_btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_dashboard_btn.setForeground(new java.awt.Color(204, 204, 204));
        lbl_dashboard_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_dashboard_btn.setText("Dashboard");
        lbl_dashboard_btn.setPreferredSize(new java.awt.Dimension(116, 55));

        javax.swing.GroupLayout btn_DashboardLayout = new javax.swing.GroupLayout(btn_Dashboard);
        btn_Dashboard.setLayout(btn_DashboardLayout);
        btn_DashboardLayout.setHorizontalGroup(
            btn_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_DashboardLayout.createSequentialGroup()
                .addComponent(leftpnl_dashboard_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(lbl_dashboard_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        btn_DashboardLayout.setVerticalGroup(
            btn_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftpnl_dashboard_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_dashboard_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_side.add(btn_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, -1, -1));

        btn_tripbooking.setBackground(new java.awt.Color(21, 25, 28));
        btn_tripbooking.setPreferredSize(new java.awt.Dimension(480, 55));
        btn_tripbooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tripbookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tripbookingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tripbookingMousePressed(evt);
            }
        });

        leftpnl_addroutes_btn.setBackground(new java.awt.Color(21, 25, 28));
        leftpnl_addroutes_btn.setPreferredSize(new java.awt.Dimension(5, 55));

        javax.swing.GroupLayout leftpnl_addroutes_btnLayout = new javax.swing.GroupLayout(leftpnl_addroutes_btn);
        leftpnl_addroutes_btn.setLayout(leftpnl_addroutes_btnLayout);
        leftpnl_addroutes_btnLayout.setHorizontalGroup(
            leftpnl_addroutes_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        leftpnl_addroutes_btnLayout.setVerticalGroup(
            leftpnl_addroutes_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        lbl_manageroutes_btn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_manageroutes_btn1.setForeground(new java.awt.Color(204, 204, 204));
        lbl_manageroutes_btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_manageroutes_btn1.setText("Trip Booking");

        javax.swing.GroupLayout btn_tripbookingLayout = new javax.swing.GroupLayout(btn_tripbooking);
        btn_tripbooking.setLayout(btn_tripbookingLayout);
        btn_tripbookingLayout.setHorizontalGroup(
            btn_tripbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_tripbookingLayout.createSequentialGroup()
                .addComponent(leftpnl_addroutes_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(lbl_manageroutes_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        btn_tripbookingLayout.setVerticalGroup(
            btn_tripbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftpnl_addroutes_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_manageroutes_btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_side.add(btn_tripbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        btn_Logout.setBackground(new java.awt.Color(21, 25, 28));
        btn_Logout.setPreferredSize(new java.awt.Dimension(480, 55));
        btn_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_LogoutMousePressed(evt);
            }
        });

        leftpnl_settings_btn.setBackground(new java.awt.Color(21, 25, 28));
        leftpnl_settings_btn.setPreferredSize(new java.awt.Dimension(5, 55));

        javax.swing.GroupLayout leftpnl_settings_btnLayout = new javax.swing.GroupLayout(leftpnl_settings_btn);
        leftpnl_settings_btn.setLayout(leftpnl_settings_btnLayout);
        leftpnl_settings_btnLayout.setHorizontalGroup(
            leftpnl_settings_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        leftpnl_settings_btnLayout.setVerticalGroup(
            leftpnl_settings_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_settings_btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_settings_btn.setForeground(new java.awt.Color(204, 204, 204));
        lbl_settings_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_settings_btn.setText("Log Out");

        javax.swing.GroupLayout btn_LogoutLayout = new javax.swing.GroupLayout(btn_Logout);
        btn_Logout.setLayout(btn_LogoutLayout);
        btn_LogoutLayout.setHorizontalGroup(
            btn_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_LogoutLayout.createSequentialGroup()
                .addComponent(leftpnl_settings_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(lbl_settings_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        btn_LogoutLayout.setVerticalGroup(
            btn_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftpnl_settings_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_settings_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        pnl_side.add(btn_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        getContentPane().add(pnl_side, java.awt.BorderLayout.WEST);

        pnl_center.setBackground(new java.awt.Color(34, 40, 44));
        pnl_center.setPreferredSize(new java.awt.Dimension(1440, 815));
        pnl_center.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(34, 40, 44));

        pnl_dashboard.setBackground(new java.awt.Color(34, 40, 44));
        pnl_dashboard.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Dashboard");

        jPanel5.setPreferredSize(new java.awt.Dimension(925, 5));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookingID", "userID", "routeID", "dayID", "seatNo", "deptDate", "bookingDate"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Your Trips");

        javax.swing.GroupLayout pnl_dashboardLayout = new javax.swing.GroupLayout(pnl_dashboard);
        pnl_dashboard.setLayout(pnl_dashboardLayout);
        pnl_dashboardLayout.setHorizontalGroup(
            pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dashboardLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnl_dashboardLayout.setVerticalGroup(
            pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dashboardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", pnl_dashboard);

        pnl_addroutes.setBackground(new java.awt.Color(34, 40, 44));
        pnl_addroutes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Trip Booking");
        pnl_addroutes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 27, -1, -1));

        jPanel6.setPreferredSize(new java.awt.Dimension(925, 5));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        pnl_addroutes.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 78, -1, -1));

        btn_filter.setBackground(new java.awt.Color(0, 102, 255));
        btn_filter.setForeground(new java.awt.Color(204, 204, 204));
        btn_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_filterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_filterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_filterMousePressed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Filter");

        javax.swing.GroupLayout btn_filterLayout = new javax.swing.GroupLayout(btn_filter);
        btn_filter.setLayout(btn_filterLayout);
        btn_filterLayout.setHorizontalGroup(
            btn_filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_filterLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        btn_filterLayout.setVerticalGroup(
            btn_filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnl_addroutes.add(btn_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 110, 30));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnl_addroutes.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 170, -1));

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        pnl_addroutes.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setText("Depature :");
        pnl_addroutes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 120, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnl_addroutes.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel4.setText("Date :");
        pnl_addroutes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 90, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnl_addroutes.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel5.setText("Destination :");
        pnl_addroutes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "routeID", "deptCT", "destCT", "destTime", "price", "capacity"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        pnl_addroutes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 920, 550));

        jTabbedPane1.addTab("tab2", pnl_addroutes);

        pnl_center.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1060, 900));

        getContentPane().add(pnl_center, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DashboardMouseEntered
        // TODO add your handling code here:
        gui.hoverset_sidebar_button(btn_Dashboard);
    }//GEN-LAST:event_btn_DashboardMouseEntered

    private void btn_DashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DashboardMouseExited
        // TODO add your handling code here:
        if(dashboard==false){
            gui.hoverreset_sidebar_button(btn_Dashboard);
        }
    }//GEN-LAST:event_btn_DashboardMouseExited

    private void btn_DashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DashboardMousePressed
        // TODO add your handling code here:
        gui.setcolor_sidebar_button(btn_Dashboard,leftpnl_dashboard_btn);
        gui.resetcolor_sidebar_button(btn_tripbooking,leftpnl_addroutes_btn);
        gui.resetcolor_sidebar_button(btn_Logout,leftpnl_settings_btn);
        dashboard = true;
        adr = false;
        set = false;
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btn_DashboardMousePressed

    private void btn_tripbookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tripbookingMouseEntered
        // TODO add your handling code here:
        gui.hoverset_sidebar_button(btn_tripbooking);
    }//GEN-LAST:event_btn_tripbookingMouseEntered

    private void btn_tripbookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tripbookingMouseExited
        // TODO add your handling code here:
        if(adr==false){
            gui.hoverreset_sidebar_button(btn_tripbooking);
        }
    }//GEN-LAST:event_btn_tripbookingMouseExited

    private void btn_tripbookingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tripbookingMousePressed
        // TODO add your handling code here:
        gui.setcolor_sidebar_button(btn_tripbooking,leftpnl_addroutes_btn);
        gui.resetcolor_sidebar_button(btn_Dashboard,leftpnl_dashboard_btn);
        gui.resetcolor_sidebar_button(btn_Logout,leftpnl_settings_btn);
        adr = true;
        dashboard = false;
        set = false;
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_tripbookingMousePressed

    private void btn_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseEntered
        // TODO add your handling code here:
        gui.hoverset_sidebar_button(btn_Logout);
    }//GEN-LAST:event_btn_LogoutMouseEntered

    private void btn_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseExited
        // TODO add your handling code here:
        if(set==false){
            gui.hoverreset_sidebar_button(btn_Logout);
        }
    }//GEN-LAST:event_btn_LogoutMouseExited

    private void btn_LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMousePressed
        // TODO add your handling code here:
        
        gui.setcolor_sidebar_button(btn_Logout,leftpnl_settings_btn);
        gui.resetcolor_sidebar_button(btn_Dashboard,leftpnl_dashboard_btn);
        gui.resetcolor_sidebar_button(btn_tripbooking,leftpnl_addroutes_btn);
        
        set = true;
        adr=false;
        dashboard = false;
        //jTabbedPane1.setSelectedIndex(4);
        logout();
        
       
    }//GEN-LAST:event_btn_LogoutMousePressed

    private void btn_filterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filterMouseEntered
        // TODO add your handling code here:
        gui.hoverset_pnlcenter_button(btn_filter);
    }//GEN-LAST:event_btn_filterMouseEntered

    private void btn_filterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filterMouseExited
        // TODO add your handling code here:
        gui.hoverreset_pnlcenter_addbutton(btn_filter);
    }//GEN-LAST:event_btn_filterMouseExited

    private void btn_filterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filterMousePressed
        // TODO add your handling code here:
        userData();
        showUserTable();
    }//GEN-LAST:event_btn_filterMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
         DatePicker dp = new DatePicker(this);
         jTextField1.setText(dp.setPickedDate());
    }//GEN-LAST:event_jButton1MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int i=jTable1.getSelectedRow();
         JFrame f;
         TableModel model=jTable1.getModel();
         String userid ="1";
         String routeid = (String) model.getValueAt(i,0).toString();
         String dayid = "1";
         String seatno = "3";
         String deptdate = jTextField1.getText();
         String bookingdate = jTextField1.getText();

         //TableModel model=jTable1.getModel();
         //  String sql="INSERT INTO bookingtable(userid,routeid,dayid,seatno,deptdate,bookingdate) VALUES  ('" + userid + "','" + routeid + "','"+dayid+"','"+seatno+"','"+deptdate+"','"+bookingdate+"')";
        try 
        {
         String sql="INSERT INTO bookingtable(userid,routeid,dayid,seatno,deptdate,bookingdate) VALUES  ('" + userid + "','" + routeid + "','"+dayid+"','"+seatno+"','"+deptdate+"','"+bookingdate+"')";
         DB_Connection sqlObj=new DB_Connection();
         sqlObj.Insert(sql);  
         f=new JFrame();  
         JOptionPane.showMessageDialog(f,"Insert Succefull");  
        } catch( Exception e ){
           e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    
    
     public void fillComboBox(){
      try{
        String selectQuery="select * from routetable";
        DB_Connection selectobj=new DB_Connection();
        ResultSet rs=selectobj.Select(selectQuery);
        while(rs.next())
            {
                jComboBox1.addItem(rs.getString("deptCT"));
                
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }
     
         public void fillComboBox2(){
      try{
        String selectQuery="select * from routetable";
        DB_Connection selectobj=new DB_Connection();
        ResultSet rs=selectobj.Select(selectQuery);
        while(rs.next())
            {
                jComboBox2.addItem(rs.getString("destCT"));
                
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }
    
     public ArrayList<ModelRoute> routeList(){
         String deptCT =(String) jComboBox1.getSelectedItem();
         String destCT =(String) jComboBox2.getSelectedItem();
         ArrayList<ModelRoute> routeList =new ArrayList<>();
        try{
            String selectQuery="select * from routetable WHERE deptCT = '"+deptCT+"' && destCT='"+destCT+"'  ";
           // String selectQuery = "SELECT routetable.routeID,routetable.deptCT,routetable.destCT,routetable.deptTime,routedaytable.dayid FROM routetable INNER JOIN routedaytable ON routetable.routeid=routedaytable.routeid WHERE routetable.deptCT='" + routeID + "' && routetable.destCT='" + routeID + "' && routedaytable.dayis='" + routeID + "';";
            DB_Connection selectobj=new DB_Connection();
            ResultSet rs=selectobj.Select(selectQuery);
            ModelRoute modelRoute;
        while(rs.next())
            {
                modelRoute=new ModelRoute(rs.getInt("routeID"),rs.getString("deptCT"),rs.getString("destCT"),rs.getString("deptTime"),rs.getString("price"),rs.getInt("capacity"));
                routeList.add(modelRoute);
            }
        
   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return routeList;
    }
    
        public void showUserTable(){
           ArrayList<ModelRoute> List =routeList();
           DefaultTableModel model;
           model = (DefaultTableModel)jTable1.getModel();
           Object[] row=new Object[6];
           for(int i=0;i<List.size();i++){
            row[0]=List.get(i).routeID();
            row[1]=List.get(i).getDeptCT();
            row[2]=List.get(i).getDestCT();
            row[3]=List.get(i).getDeptTime();
            row[4]=List.get(i).getPrice();
            row[5]=List.get(i).getCapacity();
            model.addRow(row);
           }
    
    }
        
        
        
            public ArrayList<ModelBooking> bookingList1(){
            ArrayList<ModelBooking> bookingList1 =new ArrayList<>();
             try{
            String selectQuery="select * from bookingtable";
            DB_Connection selectobj=new DB_Connection();
            ResultSet rs=selectobj.Select(selectQuery);
            ModelBooking modelBooking;
            while(rs.next())
            {
                modelBooking=new ModelBooking(rs.getInt("bookingid"),rs.getInt("userid"),rs.getInt("routeid"),rs.getInt("dayid"),rs.getInt("seatno"),rs.getString("deptdate"),rs.getString("bookingdate"));
                bookingList1.add(modelBooking);
            }
        
   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return bookingList1;
    }
    
        public void showUserTable1(){
           ArrayList<ModelBooking> List = bookingList1();
           DefaultTableModel model;
           model = (DefaultTableModel)jTable2.getModel();
           Object[] row=new Object[7];
           for(int i=0;i<List.size();i++){
            row[0]=List.get(i).bookingID();
            row[1]=List.get(i).userID();
            row[2]=List.get(i).routeID();
            row[3]=List.get(i).dayID();
            row[4]=List.get(i).seatNO();
            row[5]=List.get(i).deptDate();
            row[6]=List.get(i).bookingDate();
            
            model.addRow(row);
           }
    
    }
        public void userData(){
         
          
        try{
      
         String date =jTextField1.getText();
         Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date); 
         
         LocalDate localDate = LocalDate.of(2020, 12, 22);
         java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
         
         System.out.println("Day of week in number:"+dayOfWeek.getValue());
         System.out.println("Day of week in text:"+dayOfWeek.toString());
   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        }
        
        public void logout(){
        System.out.println("Hello");
        String id="1";
        String loginid;
        String lo="0";
        try{
        String selectQuery="select * from logs WHERE islogin='"+id+"' ";
       
        DB_Connection selectobj=new DB_Connection();
        ResultSet rs=selectobj.Select(selectQuery);
        while(rs.next())
            {
                //selectedId=Integer.toString(rs.getInt("routeid"));
                loginid=rs.getString("logid");
                String update="UPDATE logs SET islogin= '"+lo+"'  WHERE  logid = '" + loginid + "' ";
                selectobj.update(update);
                Login logo = new Login();
                logo.setVisible(true);
                this.setVisible(false);
                
            }   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
      
    
    }
    
    
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
            java.util.logging.Logger.getLogger(Customer_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_Dashboard;
    private javax.swing.JPanel btn_Logout;
    private javax.swing.JPanel btn_filter;
    private javax.swing.JPanel btn_tripbooking;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_dashboard_btn;
    private javax.swing.JLabel lbl_manageroutes_btn1;
    private javax.swing.JLabel lbl_settings_btn;
    private javax.swing.JPanel leftpnl_addroutes_btn;
    private javax.swing.JPanel leftpnl_dashboard_btn;
    private javax.swing.JPanel leftpnl_settings_btn;
    private javax.swing.JPanel pnl_addroutes;
    private javax.swing.JPanel pnl_center;
    private javax.swing.JPanel pnl_dashboard;
    private javax.swing.JPanel pnl_side;
    private javax.swing.JPanel sidepnl_top;
    // End of variables declaration//GEN-END:variables
}
