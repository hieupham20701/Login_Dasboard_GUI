import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.MouseInputListener;
public class Dashboard_Frame extends javax.swing.JFrame {

        //default boader for menu Items
        Border default_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(255,102,51));
        //yellow boader for menu Item
        
        Border yellow_border = BorderFactory.createMatteBorder(1, 0, 1, 0, Color.yellow);
       
        JLabel[] menuLabel = new JLabel[6];
        
        JPanel[] pnItem = new JPanel[6];
    
        
    public Dashboard_Frame() {
        super("Dashboard");
        initComponents();
        setLocationRelativeTo(null);
        //setLogo
        lblAppLogo.setIcon(new ImageIcon(getClass().getResource("Image/logo1.png")));
        Border borderTitle = BorderFactory.createMatteBorder(0, 0, 4, 0, Color.yellow);
        pnTitle.setBorder(borderTitle);
        //set Border for pnContainer
        
        Border borderContainer = BorderFactory.createMatteBorder(1, 2, 1, 1, Color.yellow);
        pnContainer.setBorder(borderContainer);
        menuLabel[0] = lblHome;
        menuLabel[1] = lblUser;        
        menuLabel[2] = lblProduct;
        menuLabel[3] = lblSettings;
        menuLabel[4] = lblContact;
        menuLabel[5] = lblCalender;

        pnItem[0] = pnHome;
        pnItem[1] = pnUser;
        pnItem[2] = pnProduct;
        pnItem[3] = pnSettings;
        pnItem[4] = pnContact;
        pnItem[5] = pnCalendar;
//        pnItem[6] = pnDasboard;        
        for(JPanel panel : pnItem){
            panel.setVisible(false);
        }
        addActiontoMenuLabel();
        
    }
    private void setBackroundMenu(JLabel label){
        for(JLabel menuItem : menuLabel){
            menuItem.setBackground(new Color(255,102,51));
            menuItem.setForeground(Color.WHITE);
        }
        label.setBackground(Color.white);
        label.setForeground(new Color(255,102,51));
    }
    private void hideItemDashboard(){
        pnHomeitem.setVisible(false);
        pnProductItem.setVisible(false);
        pnProfits.setVisible(false);
        pnRevenue.setVisible(false);
        pnSale.setVisible(false);
        pnRefund.setVisible(false);
    }
    private void showPanelSelected(JPanel pnSelected){
        for(JPanel panel : pnItem){
            panel.setVisible(false);
        }
        pnSelected.setVisible(true);

    }
    public void addActiontoMenuLabel(){
        //get lable in pnMenu
        Component[] components = pnMenu.getComponents();
        
        for(Component component : components){
            if(component instanceof JLabel){
               JLabel label = (JLabel) component;
               
               label.addMouseListener(new MouseInputListener() {
                   @Override
                   public void mouseClicked(MouseEvent e) {
                       setBackroundMenu(label);
                       if(label.getText().trim()=="Home"){
                           showPanelSelected(pnHome);
                           hideItemDashboard();
                       }else if(label.getText().trim() =="Product"){
                           showPanelSelected(pnProduct);
                           hideItemDashboard();
                       }else if(label.getText().trim() =="User"){
                           showPanelSelected(pnUser);
                           hideItemDashboard();
                       }else if(label.getText().trim() =="Settings"){
                           showPanelSelected(pnSettings);
                           hideItemDashboard();
                       }else if(label.getText().trim() =="Contact"){
                           showPanelSelected(pnContact);
                           hideItemDashboard();
                       }else if(label.getText().trim() =="Calendar"){
                           showPanelSelected(pnCalendar);
                           hideItemDashboard();
                       }
                   }

                   @Override
                   public void mousePressed(MouseEvent e) {
                   }

                   @Override
                   public void mouseReleased(MouseEvent e) {
                   }

                   @Override
                   public void mouseEntered(MouseEvent e) {
                       label.setBorder(yellow_border);
                   }

                   @Override
                   public void mouseExited(MouseEvent e) {
                      label.setBorder(default_border);
                   }

                   @Override
                   public void mouseDragged(MouseEvent e) {
                   }

                   @Override
                   public void mouseMoved(MouseEvent e) {
                   }
               });
            }
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        pnTitle = new javax.swing.JPanel();
        lblAppLogo = new javax.swing.JLabel();
        lblAppName = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblCalender = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        pnDasboard = new javax.swing.JPanel();
        pnCalendar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnProductItem = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnHomeitem = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnRevenue = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnProfits = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnRefund = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnSale = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnHome = new javax.swing.JPanel();
        lblhome = new javax.swing.JLabel();
        pnUser = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        pnProduct = new javax.swing.JPanel();
        lblproduct = new javax.swing.JLabel();
        pnSettings = new javax.swing.JPanel();
        lblsettings = new javax.swing.JLabel();
        pnContact = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnContainer = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        pnMenu.setBackground(new java.awt.Color(255, 102, 51));

        pnTitle.setBackground(new java.awt.Color(255, 153, 153));

        lblAppLogo.setBackground(new java.awt.Color(153, 255, 204));
        lblAppLogo.setOpaque(true);

        lblAppName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblAppName.setForeground(new java.awt.Color(255, 255, 255));
        lblAppName.setText("MyApp");

        javax.swing.GroupLayout pnTitleLayout = new javax.swing.GroupLayout(pnTitle);
        pnTitle.setLayout(pnTitleLayout);
        pnTitleLayout.setHorizontalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAppLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnTitleLayout.setVerticalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lblProduct.setBackground(new java.awt.Color(255, 102, 51));
        lblProduct.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblProduct.setForeground(new java.awt.Color(255, 255, 255));
        lblProduct.setText("Product");
        lblProduct.setOpaque(true);

        lblHome.setBackground(new java.awt.Color(255, 102, 51));
        lblHome.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setText("Home");
        lblHome.setOpaque(true);

        lblSettings.setBackground(new java.awt.Color(255, 102, 51));
        lblSettings.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSettings.setForeground(new java.awt.Color(255, 255, 255));
        lblSettings.setText("Settings");
        lblSettings.setOpaque(true);

        lblUser.setBackground(new java.awt.Color(255, 102, 51));
        lblUser.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("User");
        lblUser.setOpaque(true);

        lblCalender.setBackground(new java.awt.Color(255, 102, 51));
        lblCalender.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblCalender.setForeground(new java.awt.Color(255, 255, 255));
        lblCalender.setText("Calendar");
        lblCalender.setOpaque(true);

        lblContact.setBackground(new java.awt.Color(255, 102, 51));
        lblContact.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblContact.setForeground(new java.awt.Color(255, 255, 255));
        lblContact.setText("Contact");
        lblContact.setOpaque(true);

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCalender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addComponent(pnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCalender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnDasboard.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setText("Calendar");

        javax.swing.GroupLayout pnCalendarLayout = new javax.swing.GroupLayout(pnCalendar);
        pnCalendar.setLayout(pnCalendarLayout);
        pnCalendarLayout.setHorizontalGroup(
            pnCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCalendarLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel3)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        pnCalendarLayout.setVerticalGroup(
            pnCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCalendarLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel3)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pnProductItem.setBackground(new java.awt.Color(51, 51, 255));

        jLabel8.setBackground(new java.awt.Color(65, 131, 215));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  Product");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout pnProductItemLayout = new javax.swing.GroupLayout(pnProductItem);
        pnProductItem.setLayout(pnProductItemLayout);
        pnProductItemLayout.setHorizontalGroup(
            pnProductItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnProductItemLayout.setVerticalGroup(
            pnProductItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductItemLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pnHomeitem.setBackground(new java.awt.Color(211, 84, 0));

        jLabel7.setBackground(new java.awt.Color(255, 204, 102));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  Home");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout pnHomeitemLayout = new javax.swing.GroupLayout(pnHomeitem);
        pnHomeitem.setLayout(pnHomeitemLayout);
        pnHomeitemLayout.setHorizontalGroup(
            pnHomeitemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnHomeitemLayout.setVerticalGroup(
            pnHomeitemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHomeitemLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pnRevenue.setBackground(new java.awt.Color(204, 0, 204));

        jLabel10.setBackground(new java.awt.Color(255, 102, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("  Revenue");
        jLabel10.setOpaque(true);

        javax.swing.GroupLayout pnRevenueLayout = new javax.swing.GroupLayout(pnRevenue);
        pnRevenue.setLayout(pnRevenueLayout);
        pnRevenueLayout.setHorizontalGroup(
            pnRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        pnRevenueLayout.setVerticalGroup(
            pnRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRevenueLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pnProfits.setBackground(new java.awt.Color(255, 0, 0));

        jLabel11.setBackground(new java.awt.Color(255, 102, 102));
        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("  Net Profits");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout pnProfitsLayout = new javax.swing.GroupLayout(pnProfits);
        pnProfits.setLayout(pnProfitsLayout);
        pnProfitsLayout.setHorizontalGroup(
            pnProfitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnProfitsLayout.setVerticalGroup(
            pnProfitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProfitsLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pnRefund.setBackground(new java.awt.Color(1, 152, 117));

        jLabel12.setBackground(new java.awt.Color(0, 204, 0));
        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("  Refund");
        jLabel12.setOpaque(true);

        javax.swing.GroupLayout pnRefundLayout = new javax.swing.GroupLayout(pnRefund);
        pnRefund.setLayout(pnRefundLayout);
        pnRefundLayout.setHorizontalGroup(
            pnRefundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnRefundLayout.setVerticalGroup(
            pnRefundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRefundLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pnSale.setBackground(new java.awt.Color(255, 204, 0));

        jLabel9.setBackground(new java.awt.Color(255, 204, 102));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  Sales");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout pnSaleLayout = new javax.swing.GroupLayout(pnSale);
        pnSale.setLayout(pnSaleLayout);
        pnSaleLayout.setHorizontalGroup(
            pnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnSaleLayout.setVerticalGroup(
            pnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaleLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pnHome.setBackground(new java.awt.Color(255, 255, 255));

        lblhome.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblhome.setText("Home");

        javax.swing.GroupLayout pnHomeLayout = new javax.swing.GroupLayout(pnHome);
        pnHome.setLayout(pnHomeLayout);
        pnHomeLayout.setHorizontalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHomeLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(lblhome)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        pnHomeLayout.setVerticalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHomeLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lblhome)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        pnUser.setBackground(new java.awt.Color(255, 255, 255));

        lbluser.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbluser.setText("User");

        javax.swing.GroupLayout pnUserLayout = new javax.swing.GroupLayout(pnUser);
        pnUser.setLayout(pnUserLayout);
        pnUserLayout.setHorizontalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(lbluser)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        pnUserLayout.setVerticalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lbluser)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pnProduct.setBackground(new java.awt.Color(255, 255, 255));

        lblproduct.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblproduct.setText("Product");

        javax.swing.GroupLayout pnProductLayout = new javax.swing.GroupLayout(pnProduct);
        pnProduct.setLayout(pnProductLayout);
        pnProductLayout.setHorizontalGroup(
            pnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(lblproduct)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        pnProductLayout.setVerticalGroup(
            pnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(lblproduct)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        pnSettings.setBackground(new java.awt.Color(255, 255, 255));

        lblsettings.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblsettings.setText("Settings");

        javax.swing.GroupLayout pnSettingsLayout = new javax.swing.GroupLayout(pnSettings);
        pnSettings.setLayout(pnSettingsLayout);
        pnSettingsLayout.setHorizontalGroup(
            pnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSettingsLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(lblsettings)
                .addGap(183, 183, 183))
        );
        pnSettingsLayout.setVerticalGroup(
            pnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSettingsLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(lblsettings)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Contact");

        javax.swing.GroupLayout pnContactLayout = new javax.swing.GroupLayout(pnContact);
        pnContact.setLayout(pnContactLayout);
        pnContactLayout.setHorizontalGroup(
            pnContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContactLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192))
        );
        pnContactLayout.setVerticalGroup(
            pnContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContactLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnDasboardLayout = new javax.swing.GroupLayout(pnDasboard);
        pnDasboard.setLayout(pnDasboardLayout);
        pnDasboardLayout.setHorizontalGroup(
            pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDasboardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnProfits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnDasboardLayout.createSequentialGroup()
                        .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnSale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnHomeitem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(88, 88, 88)
                .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnProductItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnRefund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDasboardLayout.createSequentialGroup()
                    .addComponent(pnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDasboardLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(pnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDasboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDasboardLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(pnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnDasboardLayout.setVerticalGroup(
            pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDasboardLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnHomeitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnProductItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnProfits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnRefund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDasboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDasboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
            .addGroup(pnDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDasboardLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(pnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnContainer.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout pnContainerLayout = new javax.swing.GroupLayout(pnContainer);
        pnContainer.setLayout(pnContainerLayout);
        pnContainerLayout.setHorizontalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnContainerLayout.setVerticalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnDasboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pnContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDasboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblAppLogo;
    private javax.swing.JLabel lblAppName;
    private javax.swing.JLabel lblCalender;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lblproduct;
    private javax.swing.JLabel lblsettings;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPanel pnCalendar;
    private javax.swing.JPanel pnContact;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnDasboard;
    private javax.swing.JPanel pnHome;
    private javax.swing.JPanel pnHomeitem;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnProduct;
    private javax.swing.JPanel pnProductItem;
    private javax.swing.JPanel pnProfits;
    private javax.swing.JPanel pnRefund;
    private javax.swing.JPanel pnRevenue;
    private javax.swing.JPanel pnSale;
    private javax.swing.JPanel pnSettings;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JPanel pnUser;
    // End of variables declaration//GEN-END:variables
}
