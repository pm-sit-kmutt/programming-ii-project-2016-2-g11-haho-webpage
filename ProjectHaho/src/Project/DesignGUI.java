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
public class DesignGUI extends javax.swing.JFrame {

    /**
     * Creates new form DesignGUI
     */
    public DesignGUI() {
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
        kmutt = new javax.swing.JLabel();
        lb_home = new javax.swing.JLabel();
        lb_addTopic = new javax.swing.JLabel();
        lb_profile = new javax.swing.JLabel();
        lb_kmutt = new javax.swing.JLabel();
        nav = new javax.swing.JPanel();
        line = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBG.setBackground(new java.awt.Color(255, 255, 255));
        panelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBar.setBackground(new java.awt.Color(255, 102, 0));
        panelBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kmutt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kmutt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/kmutt1.png"))); // NOI18N
        panelBar.add(kmutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 100));

        lb_home.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_home.setForeground(new java.awt.Color(255, 255, 255));
        lb_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_home.setText("HOME");
        panelBar.add(lb_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 130, -1));

        lb_addTopic.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_addTopic.setForeground(new java.awt.Color(255, 255, 255));
        lb_addTopic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_addTopic.setText("ADD TOPIC");
        panelBar.add(lb_addTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 230, 130, -1));

        lb_profile.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_profile.setForeground(new java.awt.Color(255, 255, 255));
        lb_profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_profile.setText("PROFILE");
        panelBar.add(lb_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 130, -1));

        panelBG.add(panelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 530));

        lb_kmutt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_kmutt.setForeground(new java.awt.Color(255, 102, 0));
        lb_kmutt.setText("King Mongkut's University of Technology Thonburi ");
        panelBG.add(lb_kmutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 460, 40));

        nav.setBackground(new java.awt.Color(204, 204, 204));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBG.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 770, 60));

        line.setBackground(new java.awt.Color(255, 102, 0));
        line.setMaximumSize(new java.awt.Dimension(2147483647, 2147480000));
        line.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBG.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 780, 2));

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
            java.util.logging.Logger.getLogger(DesignGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kmutt;
    private javax.swing.JLabel lb_addTopic;
    private javax.swing.JLabel lb_home;
    private javax.swing.JLabel lb_kmutt;
    private javax.swing.JLabel lb_profile;
    private javax.swing.JPanel line;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel panelBG;
    private javax.swing.JPanel panelBar;
    // End of variables declaration//GEN-END:variables
}