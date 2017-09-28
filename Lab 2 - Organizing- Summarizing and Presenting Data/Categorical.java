/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author apple
 */
public class Categorical extends javax.swing.JFrame {

    private String title, inData, unorderedDataList;
    private int popSize, type, counter = 0, counter2 = 1;
    private ArrayList<String> dataList = new ArrayList<String>();
    private Boolean displayDataButtonClicked = false;
    private ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
    private ArrayList<String> group;
    private ArrayList<Double> percentages = new ArrayList<Double>();
    private boolean percentagesEmpty = true, dataButtonClicked = false;

    /**
     * Creates new form Categorical
     */
    public Categorical() {
        initComponents();
    }
    
    public Categorical(String title){
        this.title = title;
        setTitle(title);
        initComponents();
    }
    
    public Categorical(Categorical categorical){
        title = categorical.title;
        popSize = categorical.popSize;
        dataList = categorical.dataList;
        groups = categorical.groups;
        percentages = categorical.percentages;
        unorderedDataList = categorical.unorderedDataList;
        percentagesEmpty = false;
        initComponents();
        numericalButton.setEnabled(false);
        numericalButton.setFocusable(false);
        characterButton.setEnabled(false);
        characterButton.setFocusable(false);
        stringButton.setEnabled(false);
        stringButton.setFocusable(false);
        enterSizeTextField.setEnabled(false);
        enterSizeTextField.setFocusable(false);
        enterDataTextField.setEnabled(false);
        enterDataTextField.setFocusable(false);
        displayDataButton.setEnabled(true);
        displayDataButton.setFocusable(true);
        displayTableButton.setEnabled(true);
        displayTableButton.setFocusable(true);
        displayGraphButton.setEnabled(true);
        displayGraphButton.setFocusable(true);
        dataTextArea.setText(unorderedDataList);
        dataButtonClicked = true;
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
        jLabel1 = new javax.swing.JLabel();
        numericalButton = new javax.swing.JRadioButton();
        stringButton = new javax.swing.JRadioButton();
        characterButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        enterSizeTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        enterDataTextField = new javax.swing.JTextField();
        displayDataButton = new javax.swing.JButton();
        displayTableButton = new javax.swing.JButton();
        displayGraphButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 70));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(463, 392));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("1. Type of Data:");

        numericalButton.setBackground(new java.awt.Color(0, 0, 0));
        numericalButton.setForeground(new java.awt.Color(240, 240, 240));
        numericalButton.setText("Numerical");
        numericalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numericalButtonActionPerformed(evt);
            }
        });

        stringButton.setBackground(new java.awt.Color(0, 0, 0));
        stringButton.setForeground(new java.awt.Color(240, 240, 240));
        stringButton.setText("String");
        stringButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stringButtonActionPerformed(evt);
            }
        });

        characterButton.setBackground(new java.awt.Color(0, 0, 0));
        characterButton.setForeground(new java.awt.Color(240, 240, 240));
        characterButton.setText("Character");
        characterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                characterButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("2. Data size:");
        jLabel2.setAutoscrolls(true);

        enterSizeTextField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        enterSizeTextField.setText("Data size here..");
        enterSizeTextField.setEnabled(false);
        enterSizeTextField.setFocusable(false);
        enterSizeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterSizeTextFieldMouseClicked(evt);
            }
        });
        enterSizeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterSizeTextFieldKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("3. Enter Data: ");

        enterDataTextField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        enterDataTextField.setText("Enter data here..");
        enterDataTextField.setEnabled(false);
        enterDataTextField.setFocusable(false);
        enterDataTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterDataTextFieldMouseClicked(evt);
            }
        });
        enterDataTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterDataTextFieldKeyReleased(evt);
            }
        });

        displayDataButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        displayDataButton.setText("Display Data");
        displayDataButton.setEnabled(false);
        displayDataButton.setFocusable(false);
        displayDataButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayDataButtonMouseClicked(evt);
            }
        });

        displayTableButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        displayTableButton.setText("Display Table");
        displayTableButton.setEnabled(false);
        displayTableButton.setFocusable(false);
        displayTableButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayTableButtonMouseClicked(evt);
            }
        });

        displayGraphButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        displayGraphButton.setText("Display Graph");
        displayGraphButton.setEnabled(false);
        displayGraphButton.setFocusable(false);
        displayGraphButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayGraphButtonMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Data:");

        dataTextArea.setEditable(false);
        dataTextArea.setColumns(20);
        dataTextArea.setRows(5);
        jScrollPane1.setViewportView(dataTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(numericalButton)
                                .addGap(24, 24, 24)
                                .addComponent(stringButton)
                                .addGap(18, 18, 18)
                                .addComponent(characterButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayGraphButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(displayTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numericalButton)
                            .addComponent(stringButton)
                            .addComponent(characterButton))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(displayDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numericalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numericalButtonActionPerformed
        // TODO add your handling code here:
        type = 1;
        numericalButton.setEnabled(false);
        numericalButton.setFocusable(false);
        stringButton.setEnabled(false);
        stringButton.setFocusable(false);
        characterButton.setEnabled(false);
        characterButton.setFocusable(false);
        enterSizeTextField.setEnabled(true);
        enterSizeTextField.setFocusable(true);
    }//GEN-LAST:event_numericalButtonActionPerformed

    private void stringButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stringButtonActionPerformed
        // TODO add your handling code here:
        type = 2;
        numericalButton.setEnabled(false);
        numericalButton.setFocusable(false);
        stringButton.setEnabled(false);
        stringButton.setFocusable(false);
        characterButton.setEnabled(false);
        characterButton.setFocusable(false);
        enterSizeTextField.setEnabled(true);
        enterSizeTextField.setFocusable(true);
    }//GEN-LAST:event_stringButtonActionPerformed

    private void characterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_characterButtonActionPerformed
        // TODO add your handling code here:
        type = 3;
        numericalButton.setEnabled(false);
        numericalButton.setFocusable(false);
        stringButton.setEnabled(false);
        stringButton.setFocusable(false);
        characterButton.setEnabled(false);
        characterButton.setFocusable(false);
        enterSizeTextField.setEnabled(true);
        enterSizeTextField.setFocusable(true);
    }//GEN-LAST:event_characterButtonActionPerformed

    private void enterSizeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterSizeTextFieldMouseClicked
        // TODO add your handling code here:
        enterSizeTextField.setText("");
    }//GEN-LAST:event_enterSizeTextFieldMouseClicked

    private void enterSizeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterSizeTextFieldKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                String population = enterSizeTextField.getText();
                popSize = Integer.parseInt(population);
                if (popSize < 25){
                    JOptionPane.showMessageDialog(this,"Data size must be greater or equal to 25.", "Error", JOptionPane.ERROR_MESSAGE);
                    enterSizeTextField.setText("");
                } else {
                    enterSizeTextField.setEditable(false);
                    enterSizeTextField.setFocusable(false);
                    enterSizeTextField.setEnabled(false);
                    
                    enterDataTextField.setEnabled(true);
                    enterDataTextField.setFocusable(true);
                }
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Input Must Be Numeric", "Error", JOptionPane.ERROR_MESSAGE);
                enterSizeTextField.setText("");
            }
        }
    }//GEN-LAST:event_enterSizeTextFieldKeyReleased

    private void enterDataTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterDataTextFieldMouseClicked
        // TODO add your handling code here:
        enterDataTextField.setText("");
    }//GEN-LAST:event_enterDataTextFieldMouseClicked

    private void enterDataTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterDataTextFieldKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("Data size: " + popSize);
            boolean added = false;
            inData = enterDataTextField.getText();
            if(counter < popSize){
                switch (type) {
                    case 1:
                        try {
                            int dataa = Integer.parseInt(inData);
                            if(dataa < 0){
                                JOptionPane.showMessageDialog(this,"Input must be greater or equal to 0.", "Error", JOptionPane.ERROR_MESSAGE);
                                enterDataTextField.setText("");
                            }else{
                                dataList.add(inData);
                                enterDataTextField.setText("");
                                counter++;
                                added = true;
                            }
                        } catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(this,"Input must be numeric", "Error", JOptionPane.ERROR_MESSAGE);
                            enterDataTextField.setText("");
                        }   break;
                    case 2:
                        dataList.add(inData);
                        counter++;
                        enterDataTextField.setText("");
                        added = true;
                        break;
                    case 3:
                        if(inData.length() > 1){
                            JOptionPane.showMessageDialog(this,"Input must be a character", "Error", JOptionPane.ERROR_MESSAGE);
                            enterDataTextField.setText("");
                        } else {
                            if(Character.isLetter(inData.charAt(0))){
                                dataList.add(inData);
                                counter++;
                                enterDataTextField.setText("");
                                added = true;
                            } else {
                                JOptionPane.showMessageDialog(this,"Input must be a character", "Error", JOptionPane.ERROR_MESSAGE);
                                enterDataTextField.setText("");
                            }
                        }   break;
                    default:
                        break;
                }
                if(counter == popSize){
                    enterDataTextField.setEnabled(false);
                    enterDataTextField.setFocusable(false);
                    displayDataButton.setEnabled(true);
                    displayDataButton.setFocusable(true);
                }
            }
            
            if(added){
                System.out.println("Data " + counter2 + ": " + inData);
                counter2++;
            }
        }
    }//GEN-LAST:event_enterDataTextFieldKeyReleased

    private void displayDataButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayDataButtonMouseClicked
        // TODO add your handling code here:
        dataTextArea.setEnabled(true);
        dataTextArea.setFocusable(true);
        if(percentagesEmpty){
            if(!displayDataButtonClicked){
                String string = "\t\t" + title + "\n   ";
                int j = 0;
                
                for(String data : dataList){
                    System.out.print(data + " ");
                    if(j != 5){
                        string += data + "\t";
                        j++;
                    }else{
                        string += "\n   ";
                        string += data + "\t";
                        j = 1;
                    }
                }
                unorderedDataList = string;
                dataTextArea.setText(string);
                displayDataButtonClicked = true;

                displayTableButton.setEnabled(true);
                displayTableButton.setFocusable(true);
                displayGraphButton.setEnabled(true);
                displayGraphButton.setFocusable(true);

                Collections.sort(dataList);
                regroup();
                computePercentage();
            }
        }else{
            dataTextArea.setText(unorderedDataList);
        }
        dataButtonClicked = true;
        
        System.out.println("\n\n");
    }//GEN-LAST:event_displayDataButtonMouseClicked

    private void displayTableButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableButtonMouseClicked
        // TODO add your handling code here:
        if(dataButtonClicked){
            Table table = new Table(this);
            table.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_displayTableButtonMouseClicked

    private void displayGraphButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayGraphButtonMouseClicked
        // TODO add your handling code here:
        if(dataButtonClicked){
            DefaultPieDataset dataset = new DefaultPieDataset();
            int i = 0;
            for(ArrayList<String> groot : groups){
                dataset.setValue(groot.get(0), percentages.get(i));
                i++;
            }

            JFreeChart pieChart = ChartFactory.createPieChart(title, dataset, true, true, true);
            ChartFrame frame = new ChartFrame(title, pieChart);
            frame.setVisible(true);
            frame.setSize(450, 450);
            frame.setLocation(500, 70);
        }
    }//GEN-LAST:event_displayGraphButtonMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        MenuFrame menu = new MenuFrame();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void regroup(){
        String current = dataList.get(0);
        group = new ArrayList<String>();
        for(String str : dataList){
            if(!current.equals(str)){
                groups.add(group);
                group = new ArrayList<String>();
                group.add(str);
                current = str;
            }else{
                group.add(str);
            }
        }
        groups.add(group);
        
        int i = 1;
        for(ArrayList<String> groot : groups){
            System.out.println("Group " + i + ":");
            i++;
            for(String str : groot){
                System.out.println(str);
            }
            System.out.println();
        }
    }
    
    private void computePercentage(){
        for(ArrayList<String> groot : groups){
            int count = 0, j = 1;
            for(String str : groot){
                count++;
            }
            double temp = count * 100.0 / popSize;
            percentages.add(temp);
        }        
    }
    
     public String getStringTitle(){
        return title;
    }
    
    public ArrayList<ArrayList<String>> getGroups(){
        return groups;
    }
    
    public ArrayList<Double> getPercentages(){
        return percentages;
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
            java.util.logging.Logger.getLogger(Categorical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categorical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categorical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categorical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categorical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton characterButton;
    private javax.swing.JTextArea dataTextArea;
    private javax.swing.JButton displayDataButton;
    private javax.swing.JButton displayGraphButton;
    private javax.swing.JButton displayTableButton;
    private javax.swing.JTextField enterDataTextField;
    private javax.swing.JTextField enterSizeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton numericalButton;
    private javax.swing.JRadioButton stringButton;
    // End of variables declaration//GEN-END:variables
}
