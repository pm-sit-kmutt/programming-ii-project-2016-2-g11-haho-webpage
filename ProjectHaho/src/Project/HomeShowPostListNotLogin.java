/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author USER
 */
public class HomeShowPostListNotLogin extends javax.swing.JFrame {

    /**
     * Creates new form HomeShowPostListNotLogin
     */
    public HomeShowPostListNotLogin() {
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

        panelBG = new javax.swing.JPanel();
        panelBar = new javax.swing.JPanel();
        lb_home = new javax.swing.JLabel();
        kmutt = new javax.swing.JLabel();
        lb_addTopic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_kmutt = new javax.swing.JLabel();
        nav = new javax.swing.JPanel();
        pic_book = new javax.swing.JLabel();
        CommunityForum = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        line = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showPostList = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nav2 = new javax.swing.JPanel();
        line2 = new javax.swing.JPanel();
        topic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        register = new javax.swing.JButton();
        line3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBG.setBackground(new java.awt.Color(255, 255, 255));
        panelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBar.setBackground(new java.awt.Color(255, 102, 0));
        panelBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_home.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_home.setForeground(new java.awt.Color(255, 102, 0));
        lb_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_home.setText("HOME");
        panelBar.add(lb_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 130, -1));

        kmutt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kmutt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/kmutt1.png"))); // NOI18N
        panelBar.add(kmutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 100));

        lb_addTopic.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_addTopic.setForeground(new java.awt.Color(255, 255, 255));
        lb_addTopic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_addTopic.setText("ADD TOPIC");
        panelBar.add(lb_addTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 230, 130, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBar.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 140, 40));

        panelBG.add(panelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 530));

        lb_kmutt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_kmutt.setForeground(new java.awt.Color(255, 102, 0));
        lb_kmutt.setText("King Mongkut's University of Technology Thonburi ");
        panelBG.add(lb_kmutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 460, 40));

        nav.setBackground(new java.awt.Color(204, 204, 204));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/open-book.png"))); // NOI18N
        nav.add(pic_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        CommunityForum.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        CommunityForum.setText("Community Forum");
        nav.add(CommunityForum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        search.setBackground(new java.awt.Color(204, 204, 204));
        search.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 102, 0));
        search.setText(" Search");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        nav.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 150, 30));

        panelBG.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 770, 60));

        line.setBackground(new java.awt.Color(255, 102, 0));
        line.setMaximumSize(new java.awt.Dimension(2147483647, 2147480000));
        line.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBG.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 780, 2));

        jScrollPane1.setBorder(null);

        showPostList.setBackground(new java.awt.Color(255, 255, 255));
        showPostList.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout showPostListLayout = new javax.swing.GroupLayout(showPostList);
        showPostList.setLayout(showPostListLayout);
        showPostListLayout.setHorizontalGroup(
            showPostListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showPostListLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        showPostListLayout.setVerticalGroup(
            showPostListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPostListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(showPostList);

        panelBG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 770, 330));

        nav2.setBackground(new java.awt.Color(255, 102, 0));

        line2.setBackground(new java.awt.Color(204, 204, 204));
        line2.setPreferredSize(new java.awt.Dimension(730, 5));

        javax.swing.GroupLayout line2Layout = new javax.swing.GroupLayout(line2);
        line2.setLayout(line2Layout);
        line2Layout.setHorizontalGroup(
            line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line2Layout.setVerticalGroup(
            line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        topic.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        topic.setForeground(new java.awt.Color(255, 255, 255));
        topic.setText("Topic");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Writer");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recent Post");

        javax.swing.GroupLayout nav2Layout = new javax.swing.GroupLayout(nav2);
        nav2.setLayout(nav2Layout);
        nav2Layout.setHorizontalGroup(
            nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(line2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nav2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(topic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(149, 149, 149)
                .addComponent(jLabel4)
                .addGap(71, 71, 71))
        );
        nav2Layout.setVerticalGroup(
            nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav2Layout.createSequentialGroup()
                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nav2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nav2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topic)
                        .addContainerGap())))
        );

        panelBG.add(nav2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 730, 40));

        login.setBackground(new java.awt.Color(255, 102, 0));
        login.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Sign in");
        panelBG.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 80, 30));

        register.setBackground(new java.awt.Color(204, 204, 204));
        register.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 102, 0));
        register.setText("Sing Up");
        panelBG.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 80, 30));

        line3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout line3Layout = new javax.swing.GroupLayout(line3);
        line3.setLayout(line3Layout);
        line3Layout.setHorizontalGroup(
            line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        line3Layout.setVerticalGroup(
            line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelBG.add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 2, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomeShowPostListNotLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeShowPostListNotLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeShowPostListNotLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeShowPostListNotLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeShowPostListNotLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommunityForum;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmutt;
    private javax.swing.JLabel lb_addTopic;
    private javax.swing.JLabel lb_home;
    private javax.swing.JLabel lb_kmutt;
    private javax.swing.JPanel line;
    private javax.swing.JPanel line2;
    private javax.swing.JPanel line3;
    private javax.swing.JButton login;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel nav2;
    private javax.swing.JPanel panelBG;
    private javax.swing.JPanel panelBar;
    private javax.swing.JLabel pic_book;
    private javax.swing.JButton register;
    private javax.swing.JTextField search;
    private javax.swing.JPanel showPostList;
    private javax.swing.JLabel topic;
    // End of variables declaration//GEN-END:variables
}