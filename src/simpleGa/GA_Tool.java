
package simpleGa;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.openide.util.Exceptions;
import simpleGa.Algorithm.*;
import simpleGa.FitnessCalc.*;
import simpleGa.GA.*;
import simpleGa.Individual.*;
import simpleGa.Population.*;

/**
 *
 * @author NEHA
 */
public class GA_Tool extends javax.swing.JFrame {

    private Container con=getContentPane();
    private JButton button=new JButton ("Button");
    private JButton button1=new JButton ("Button1");
    private JButton button2=new JButton ("Button2");
    private JButton button3=new JButton ("Button3");
    private JButton button4=new JButton ("Button4");
    ImageIcon icon=new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\geneticAlgoDemo\\build\\classes\\images\\DNA.png");
   //  ImageIcon icon=new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\geneticAlgoDemo\\build\\classes\\images\\red and purple animated button.jpg");
    ImageIcon icon1=new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\geneticAlgoDemo\\build\\classes\\images\\Ind2.png");;
    ImageIcon icon2=new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\geneticAlgoDemo\\build\\classes\\images\\crossover.png");
    ImageIcon icon4=new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\geneticAlgoDemo\\build\\classes\\images\\red and purple animated button.jpg");
    ImageIcon icon3=new ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\geneticAlgoDemo\\build\\classes\\images\\Ind1.png");
    static int a,c;
    static double b,d;
    static String sol;
    int check;
    double param1;
    int param2;
    double param3;
    String param4="incorrect";
    int allSet=0;
    String ratio;
    double ratio2;

    public GA_Tool() {
        initComponents();
       Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\geneticAlgoDemo\\build\\classes\\images\\IconImage.jpg");
        setIconImage(icon);
        setTitle("GA_Tool"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        InitializeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CrossoverTextbox = new javax.swing.JTextField();
        TourSizeTextbox = new javax.swing.JTextField();
        MutationTextbox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        geneSrquenceTextbox = new javax.swing.JTextField();
        SetParameterButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        SelectionButton = new javax.swing.JButton();
        CrossoverButton = new javax.swing.JButton();
        MutationButton = new javax.swing.JButton();
        LookSolutionButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel1.text")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 34, 230, 29);

        jTextField1.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jTextField1.text")); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 30, 86, 29);

        InitializeButton.setBackground(new java.awt.Color(204, 204, 255));
        InitializeButton.setForeground(new java.awt.Color(102, 102, 255));
        InitializeButton.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.InitializeButton.text")); // NOI18N
        InitializeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InitializeButtonMouseClicked(evt);
            }
        });
        InitializeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitializeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InitializeButton);
        InitializeButton.setBounds(340, 20, 170, 50);

        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel2.text")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 20, 130, 29);

        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel3.text")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 60, 140, 29);

        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel4.text")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 90, 130, 35);

        CrossoverTextbox.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.CrossoverTextbox.text")); // NOI18N
        CrossoverTextbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossoverTextboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrossoverTextboxMouseExited(evt);
            }
        });
        CrossoverTextbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CrossoverTextboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CrossoverTextboxKeyTyped(evt);
            }
        });
        getContentPane().add(CrossoverTextbox);
        CrossoverTextbox.setBounds(670, 20, 77, 29);

        TourSizeTextbox.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.TourSizeTextbox.text")); // NOI18N
        TourSizeTextbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TourSizeTextboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TourSizeTextboxMouseExited(evt);
            }
        });
        getContentPane().add(TourSizeTextbox);
        TourSizeTextbox.setBounds(670, 60, 77, 29);

        MutationTextbox.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.MutationTextbox.text")); // NOI18N
        MutationTextbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MutationTextboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MutationTextboxMouseExited(evt);
            }
        });
        getContentPane().add(MutationTextbox);
        MutationTextbox.setBounds(670, 100, 80, 30);

        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel7.text")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(880, 20, 407, 29);

        geneSrquenceTextbox.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.geneSrquenceTextbox.text")); // NOI18N
        geneSrquenceTextbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geneSrquenceTextboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                geneSrquenceTextboxMouseExited(evt);
            }
        });
        getContentPane().add(geneSrquenceTextbox);
        geneSrquenceTextbox.setBounds(770, 60, 513, 29);

        SetParameterButton.setBackground(new java.awt.Color(204, 204, 255));
        SetParameterButton.setForeground(new java.awt.Color(102, 102, 255));
        SetParameterButton.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.SetParameterButton.text")); // NOI18N
        SetParameterButton.setActionCommand(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.SetParameterButton.actionCommand")); // NOI18N
        SetParameterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SetParameterButtonMouseReleased(evt);
            }
        });
        SetParameterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetParameterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SetParameterButton);
        SetParameterButton.setBounds(770, 110, 220, 49);

        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel5.text")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 150, 520, 46);

        SelectionButton.setBackground(new java.awt.Color(204, 204, 255));
        SelectionButton.setForeground(new java.awt.Color(102, 102, 255));
        SelectionButton.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.SelectionButton.text")); // NOI18N
        SelectionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SelectionButtonMouseEntered(evt);
            }
        });
        SelectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SelectionButton);
        SelectionButton.setBounds(490, 210, 144, 50);

        CrossoverButton.setBackground(new java.awt.Color(204, 204, 255));
        CrossoverButton.setForeground(new java.awt.Color(102, 102, 255));
        CrossoverButton.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.CrossoverButton.text")); // NOI18N
        CrossoverButton.setActionCommand(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.CrossoverButton.actionCommand")); // NOI18N
        CrossoverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrossoverButtonMouseEntered(evt);
            }
        });
        CrossoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossoverButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CrossoverButton);
        CrossoverButton.setBounds(650, 210, 100, 50);

        MutationButton.setBackground(new java.awt.Color(204, 204, 255));
        MutationButton.setForeground(new java.awt.Color(102, 102, 255));
        MutationButton.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.MutationButton.text")); // NOI18N
        MutationButton.setActionCommand(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.MutationButton.actionCommand")); // NOI18N
        MutationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MutationButtonMouseEntered(evt);
            }
        });
        MutationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MutationButton);
        MutationButton.setBounds(770, 210, 100, 50);

        LookSolutionButton.setBackground(new java.awt.Color(204, 204, 255));
        LookSolutionButton.setForeground(new java.awt.Color(102, 102, 255));
        LookSolutionButton.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.LookSolutionButton.text")); // NOI18N
        LookSolutionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LookSolutionButtonMouseEntered(evt);
            }
        });
        LookSolutionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LookSolutionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LookSolutionButton);
        LookSolutionButton.setBounds(920, 210, 144, 50);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(500, 270, 130, 80);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(640, 270, 130, 80);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(780, 270, 130, 80);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel6.text")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(920, 270, 340, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel11.text")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(920, 330, 490, 60);

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel8.text")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 400, 630, 60);

        jLabel9.setBackground(new java.awt.Color(255, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel9.text")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(500, 470, 790, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 204));
        jLabel10.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel10.text")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(500, 530, 780, 40);

        jPanel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 75, 480, 690);

        jButton1.setForeground(new java.awt.Color(153, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red animated home button with metal frame.jpg"))); // NOI18N
        jButton1.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1090, 120, 160, 110);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 204));
        jLabel12.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jLabel12.text")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(490, 360, 420, 30);

        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText(org.openide.util.NbBundle.getMessage(GA_Tool.class, "GA_Tool.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 20, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        //         JOptionPane.showMessageDialog(this,"This field determines the no. of individuals you want in one population!!!");
        //        check=Integer.parseInt(jTextField1.getText());
        //        if((check==0)||(check <1 || check >100)){
            //            check=0;
            //        }
        //        else
        //        {
            //            check=1;
            //        }
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited
        // TODO add your handling code here:
        //   if(check==0){
            // JOptionPane.showMessageDialog(this,"Please enter an integer within valid range!!!");
            //}
    }//GEN-LAST:event_jTextField1MouseExited

    private void InitializeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InitializeButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InitializeButtonMouseClicked

    private void InitializeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitializeButtonActionPerformed
        // Initialize(create)polulation.......................................................
        if(jTextField1.getText()==""){
            JOptionPane.showMessageDialog(this, "Please enter value first","Missing parameter alert" ,JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            a=Integer.parseInt(jTextField1.getText());
            for (int i = 0; i < a; i++) {
                jPanel1.setLayout(new FlowLayout() );
                button=new JButton("Indiv"+i,icon);
                button.setName("Button"+i);
                button.setSize(10, 10);
                button.setText("Indiv"+(i+1));
                button.setForeground(Color.red);
                button.setBackground(Color.green);
                jPanel1.add(button);
                //to print gene sequences of created buttons........................................
                button.addActionListener(new GA_Tool.ButtonClickListener());
                jPanel1.revalidate();
            }
        }
        }
        private class ButtonClickListener implements ActionListener{
            // int A= JApplet1.a;
            public void actionPerformed(ActionEvent e) {
                int A=GA_Tool.a;
                Individual newIndividual = new Individual();
                newIndividual.generateIndividual();
                jLabel9.setText("Gene Sequence of the Indiv:"+newIndividual.toString());
            }
    }//GEN-LAST:event_InitializeButtonActionPerformed

    private void CrossoverTextboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossoverTextboxMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This field determines the extent of the traits of the parents inherited by children.So enter a decimal value between range of 0-1!!!");
    }//GEN-LAST:event_CrossoverTextboxMouseClicked

    private void CrossoverTextboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossoverTextboxMouseExited
        // TODO add your handling code here:
        if((CrossoverTextbox.getText()).equals("")){ 
            JOptionPane.showMessageDialog(this,"Please enter a decimal value within valid range!!!");
        }
        else if((Double.parseDouble(CrossoverTextbox.getText()))<=0.0||(Double.parseDouble(CrossoverTextbox.getText()))>=1.0){
            param1=0;
        }
        else
        {
            param1=1;
            String s1=(CrossoverTextbox.getText());
          //  int ind=s1.indexOf(".");
           // ratio=s1.substring(ind);
          //  ratio=s1.substring(2);
            ratio2=Double.parseDouble(s1);
            //JOptionPane.showMessageDialog(this,"Child will get traits of Parents in the ratio of"+ratio+":"+(10-ratio2));
        }
    }//GEN-LAST:event_CrossoverTextboxMouseExited

    private void TourSizeTextboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TourSizeTextboxMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This field determines the no. of times the popoulation of selected individuals will be created .So enter an integer value between range of 0-10!!!");
    }//GEN-LAST:event_TourSizeTextboxMouseClicked

    private void TourSizeTextboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TourSizeTextboxMouseExited
        // TODO add your handling code here:
        if((TourSizeTextbox.getText()).equals("")){ 
            JOptionPane.showMessageDialog(this,"Please enter an integer value within valid range!!!");
        }
        else if((Integer.parseInt(TourSizeTextbox.getText()))<0 || (Integer.parseInt(TourSizeTextbox.getText()))==0){
            param2=0;
        }
        else
        {
            param2=1;
        }
    }//GEN-LAST:event_TourSizeTextboxMouseExited

    private void MutationTextboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MutationTextboxMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This field determines how slightly children will be different from their parents.It should be not more than 0.015!!!");
    }//GEN-LAST:event_MutationTextboxMouseClicked

    private void MutationTextboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MutationTextboxMouseExited
        // TODO add your handling code here:
        if((MutationTextbox.getText())==""){
            JOptionPane.showMessageDialog(this,"Please enter a decimal value within valid range!!!");
        }
        else if((Double.parseDouble(MutationTextbox.getText()))<=0.0|| (Double.parseDouble(MutationTextbox.getText()))>0.015){
            param3=0;
        }
        else
        {
            param3=1;
        }
    }//GEN-LAST:event_MutationTextboxMouseExited

    private void geneSrquenceTextboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geneSrquenceTextboxMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Please enter a gene sequence(string of 0 and 1)that you want to see in the solution of fittest individual!!!");
    }//GEN-LAST:event_geneSrquenceTextboxMouseClicked

    private void geneSrquenceTextboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geneSrquenceTextboxMouseExited
        // TODO add your handling code here:
        //       if((jTextField5.getText())==""){
            //           JOptionPane.showMessageDialog(this,"Please enter value!!!");
            //       }
        //       else{
            //        for (int i = 0; i <((jTextField5.getText()).length()); i++) {
                //             if(jTextField5.getText().charAt(i)==0 || jTextField5.getText().charAt(i)==1){
                    //                 param4=null;
                    //                 param4="correct";
                    //             }
                //             else{
                    //                 param4="incorret";
                    //             }
                //        }
            //       }
    }//GEN-LAST:event_geneSrquenceTextboxMouseExited

    private void SetParameterButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetParameterButtonMouseReleased
        // TODO add your handling code here:
        //    JOptionPane.showMessageDialog(this,"All input Parameters are set!!!");
    }//GEN-LAST:event_SetParameterButtonMouseReleased

    private void SetParameterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetParameterButtonActionPerformed
        //check for any empty or invalid fields.................................................
        if(param1==1 & param2==1 & param3==1){
            //Set parameters dynamically............................................................
            b=Double.parseDouble(CrossoverTextbox.getText());
            c=Integer.parseInt(TourSizeTextbox.getText());
            d=Double.parseDouble(MutationTextbox.getText());
            sol=geneSrquenceTextbox.getText();
            allSet=1;
            if(allSet==1){
                //  System.out.println("param1="+param1+"param2="+param2+"param3="+param3+"param4="+param4);
                JOptionPane.showMessageDialog(this,"All input Parameters are set!!!");
            }
            else{
                //System.out.println("parameters are not set!!!");
                JOptionPane.showMessageDialog(this,"Please set the Input Parameters first!!!");
            }
        }
    }//GEN-LAST:event_SetParameterButtonActionPerformed

    private void SelectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionButtonActionPerformed
        // Show Selection Function of GA Algorithm.............................................
        //    if(allSet==1){
            String Solution=GA_Tool.sol;
            FitnessCalc.setSolution(Solution);
            // Create an initial population
            int A= GA_Tool.a;
            Population myPop = new Population(A, true);
            while (myPop.getFittest().getFitness()<FitnessCalc.getMaxFitness()){
                myPop=Algorithm.evolvePopulation(myPop);
            }
            jPanel2.setLayout(new GridLayout(4, 2));
            button1=new JButton("parent1",icon1);
            button1.setName("PButton");
            button1.setForeground(Color.red);
            button1.setBackground(Color.green);
            jPanel2.add(button1);
            button4=new JButton("parent2",icon3);
            button4.setName("PButton");
            button4.setForeground(Color.red);
            button4.setBackground(Color.green);
            jPanel2.add(button4);
            button1.addActionListener(new FirstActionListener());
            button4.addActionListener(new SecondActionListener());
            jPanel2.revalidate();
            jLabel12.setText("These are the fittest selected Parents"); 
            //  }
        //else
        //{
            //  JOptionPane.showMessageDialog(this, "Please set Input Variables first","Missing parameter alert" ,JOptionPane.INFORMATION_MESSAGE);
            //}
    }//GEN-LAST:event_SelectionButtonActionPerformed

    private void CrossoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossoverButtonActionPerformed
        // Show Crossover Function of GA Algorithm.............................................
        //if(allSet==1){
            String Solution=GA_Tool.sol;
            // Byte Solution=JApplet1.sol;
            FitnessCalc.setSolution(Solution);
            // Create an initial population
            int A= GA_Tool.a;
            Population myPop = new Population(A, true);
            int generationCount = 0;
            while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
                myPop = Algorithm.evolvePopulation(myPop);
            }
            jPanel3.setLayout(new GridLayout(4,2));
            button2=new JButton("crossed",icon2);
            button2.setName("CButton");
            button2.setForeground(Color.green);
            button2.setBackground(Color.pink);
            button2.addActionListener(new ThirdActionListener());
            jPanel3.add(button2);
            jPanel3.revalidate();
            jLabel12.setText("These selected Parents are being crossed"); 
            //}
        //else
        //{
            //      JOptionPane.showMessageDialog(this, "Please set Input Variables first","Missing parameter alert" ,JOptionPane.INFORMATION_MESSAGE);
            //    }
    }//GEN-LAST:event_CrossoverButtonActionPerformed

    private void MutationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutationButtonActionPerformed
        // Show Mutation Function of GA Algorithm..............................................
        //   if(allSet==1){
            String Solution=GA_Tool.sol;
            FitnessCalc.setSolution(Solution);
            // Create an initial population
            int A= GA_Tool.a;
            Population myPop = new Population(A, true);
            while (myPop.getFittest().getFitness()<FitnessCalc.getMaxFitness()){
                myPop=Algorithm.evolvePopulation(myPop);
            }
            jPanel4.setLayout(new GridLayout(4,2));
            button3=new JButton("mutated",icon4);
            button3.setName("MButton");
            button3.setForeground(Color.pink);
            button3.setBackground(Color.green);
            jPanel4.add(button3);
            button3.addActionListener(new FourthActionListener());
            jPanel4.revalidate();
            jLabel12.setText("The child after crossing is mutated here"); 
            // }
        //else
        //{
            //  JOptionPane.showMessageDialog(this, "Please set Input Variables first","Missing parameter alert" ,JOptionPane.INFORMATION_MESSAGE);
            //}
    }//GEN-LAST:event_MutationButtonActionPerformed

    private void LookSolutionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookSolutionButtonActionPerformed
        // Calculate and display final solution by applying GA algorithm.......................
        //     if(allSet==1){
            String Solution=GA_Tool.sol;
            FitnessCalc.setSolution(Solution);
            // Create an initial population
            int A= GA_Tool.a;
            Population myPop = new Population(A, true);
            // Evolve our population until we reach an optimum solution
            int generationCount = 0;
            while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
                generationCount++;
                myPop = Algorithm.evolvePopulation(myPop);
            }
            jLabel6.setText("Solution Found in Generation: " + generationCount);
            jLabel8.setText("Genes:"+(myPop.getFittest()));
            jLabel11.setText("The Genes found below in generation"+ generationCount+"are same as gene sequence set before!!! ");
            //}
        //   else
        // {
            //   JOptionPane.showMessageDialog(this, "Please set Input Variables first","Missing parameter alert" ,JOptionPane.INFORMATION_MESSAGE);
            //}
    }//GEN-LAST:event_LookSolutionButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new JFrame1().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CrossoverTextboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CrossoverTextboxKeyReleased
        // TODO add your handling code here:
       // JOptionPane.showMessageDialog(this,"Child will get traits of Parents in the ratio of"+ratio+":"+(10-ratio2));
    }//GEN-LAST:event_CrossoverTextboxKeyReleased

    private void CrossoverTextboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CrossoverTextboxKeyTyped
        // TODO add your handling code here:
       // JOptionPane.showMessageDialog(this,"Child will get traits of Parents in the ratio of"+ratio+":"+(10-ratio2));
    }//GEN-LAST:event_CrossoverTextboxKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Child will get traits of Parents in the ratio of  "+ratio2+":"+(1-ratio2));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SelectionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectionButtonMouseEntered
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this,"This function selects the most Fittest Parents from set of popoulation!");
    }//GEN-LAST:event_SelectionButtonMouseEntered

    private void CrossoverButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossoverButtonMouseEntered
        // TODO add your handling code here:
         //JOptionPane.showMessageDialog(this,"This function shows the crossed individual generated from the selected parents!");
    }//GEN-LAST:event_CrossoverButtonMouseEntered

    private void MutationButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MutationButtonMouseEntered
        // TODO add your handling code here:
         //JOptionPane.showMessageDialog(this,"This function shows that the crossed individual is slightly mutated!");
    }//GEN-LAST:event_MutationButtonMouseEntered

    private void LookSolutionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LookSolutionButtonMouseEntered
        // TODO add your handling code here:
         //JOptionPane.showMessageDialog(this,"Click here to see the result of Genetic Algorithm!");
         
    }//GEN-LAST:event_LookSolutionButtonMouseEntered
private class FirstActionListener implements ActionListener{
          public void actionPerformed(ActionEvent e){
            String Solution=GA_Tool.sol;
            FitnessCalc.setSolution(Solution);
        // Create an initial population
            int A= GA_Tool.a;
            Population pop = new Population(A, true);
            int generationCount = 0;
            while (pop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
            pop = Algorithm.evolvePopulation(pop);
       }
              jLabel10.setText("Gene Sequence of Parent1:"+(Algorithm.indiv1.toString()));
          }
      }
      
    private class SecondActionListener implements ActionListener{
          public void actionPerformed(ActionEvent e){
        String Solution=GA_Tool.sol;
        FitnessCalc.setSolution(Solution);
        // Create an initial population
        int A= GA_Tool.a;
        Population pop = new Population(A, true);
           int generationCount = 0;
        while (pop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
            pop = Algorithm.evolvePopulation(pop);
        }
              jLabel10.setText("Gene Sequence of Parent2:"+(Algorithm.indiv2.toString()));
          }
      }
    private class ThirdActionListener implements ActionListener{
          public void actionPerformed(ActionEvent e){
              jLabel10.setText("Gene sequence of Crossed Indiv:"+(Algorithm.newIndiv.toString()));
          }
       }
    private class FourthActionListener implements ActionListener{
          public void actionPerformed(ActionEvent e){
        String Solution=GA_Tool.sol;
        FitnessCalc.setSolution(Solution);
        // Create an initial population
        int A= GA_Tool.a;
        Population pop = new Population(A, true);
           int generationCount = 0;
        while (pop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
            pop = Algorithm.evolvePopulation(pop);
        }
              jLabel10.setText("Gene sequence of Mutated Indiv:"+(Algorithm.mIndiv.toString()));
          }
       }

    
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
            java.util.logging.Logger.getLogger(GA_Tool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GA_Tool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GA_Tool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GA_Tool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GA_Tool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrossoverButton;
    private javax.swing.JTextField CrossoverTextbox;
    private javax.swing.JButton InitializeButton;
    private javax.swing.JButton LookSolutionButton;
    private javax.swing.JButton MutationButton;
    private javax.swing.JTextField MutationTextbox;
    private javax.swing.JButton SelectionButton;
    private javax.swing.JButton SetParameterButton;
    private javax.swing.JTextField TourSizeTextbox;
    private javax.swing.JTextField geneSrquenceTextbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
// 1111000000000000000000000000000000000000000000000000000000001111