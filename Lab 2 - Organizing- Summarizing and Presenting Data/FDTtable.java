/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
/**

/**
 *
 * @author RizelleAnn
 */
public class FDTtable extends javax.swing.JFrame {

    /**
     * Creates new form FDTtable
     */
    Object[] rowData;
    DefaultTableModel model;
    Numerical numeric;
    private ArrayList<Integer> rawData;
    int width, popsize;
    private String[][] finalRes = null;
    private String title;
    private int[] idata;
    private float[] fdata;
    private int[] isorted;
    private float[] fsorted;
    private String dataType;
    private float frange;
    private int irange;
    private int size;
    private int numClasses;  
    private int[] freq;
    private int[] cummu;
    private float[] percentage;
    private float[] cummupercent;
    private float[] mid;
    private float[][] trueCL;
    private String lowerLast;
    private String upper;
    private String lower;
    private String upperFirst;
    private int i =0;
    
    public FDTtable(){
        initComponents();
    }
    
    public FDTtable(Numerical numeric,String title, String datatype, float[] fdata, int size){
        this.title = title;
        this.fdata = fdata;
        this.dataType = dataType;
        this.size = size;
        this.numeric = numeric;
        initComponents();
        displayFDT("float");
    }
    
    public FDTtable(Numerical numeric,String title, String dataType, int[] idata, int size){
        this.title = title;
        this.idata = idata;
        this.dataType = dataType;
        this.size = size;
        this.numeric = numeric;
        initComponents();
        displayFDT("int");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        fdtTable = new javax.swing.JTable();
        collapseButton = new javax.swing.JButton();
        histogramButton = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        titleHeading = new javax.swing.JLabel();

        setTitle("Frequency Distribution Table");
        setLocation(new java.awt.Point(500, 150));
        setName("fdtFrame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fdtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class Limits", "True Class Limits", "Midpoint", "Frequency", "Percent", "Cummulative Freq", "Cummulative %"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        fdtTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(fdtTable);
        fdtTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        collapseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        collapseButton.setText("Collapse Option");
        collapseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collapseButtonMouseReleased(evt);
            }
        });

        histogramButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        histogramButton.setText("Show Histogram");
        histogramButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                histogramButtonMouseReleased(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        titleHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(collapseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(histogramButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titleHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collapseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histogramButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void collapseButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collapseButtonMouseReleased
        // TODO add your handling code here:
        FDT fdt = new FDT(this);
        fdt.setVisible(true);
        fdt.setLocation(500,150);
    }//GEN-LAST:event_collapseButtonMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setVisible(false);
        numeric.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

    private void histogramButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_histogramButtonMouseReleased
      
       // HistogramChart histo = new HistogramChart(title, arr, lower,upper, rawData, width);
       HistogramChart histo = new HistogramChart(title, finalRes);
       histo.setVisible(true);
    }//GEN-LAST:event_histogramButtonMouseReleased



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
            java.util.logging.Logger.getLogger(FDTtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDTtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDTtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDTtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDTtable().setVisible(true);
            }
        });*/
    }
    
    
   
    public void collapseFirst(){
        
        model.setValueAt("<= "+ upperFirst, 0,0);//cl
        model.setValueAt("--------", 0, 1);//tcl
        model.setValueAt("--------", 0, 2);//midpoint
        
        model.setValueAt(finalRes[numClasses - 1][0], i-2,0);
        model.setValueAt(finalRes[numClasses - 1][1], i-2,1);
        model.setValueAt(finalRes[numClasses - 1][2], i-2,2);
    
    }
    
    public void collapseLast(){
        
        model.setValueAt(finalRes[0][0],0,0);
        model.setValueAt(finalRes[0][1], 0,1);
        model.setValueAt(finalRes[0][2], 0,2);
        
        model.setValueAt(">= " + lowerLast, i-2, 0);
        model.setValueAt("--------", i-2, 1);
        model.setValueAt("--------", i-2, 2);

    }
    
    public void collapseBoth(){
        
        model.setValueAt("<= "+ upperFirst, 0,0);//cl
        model.setValueAt("--------", 0, 1);//tcl
        model.setValueAt("--------", 0, 2);//midpoint
        
        model.setValueAt(">= " + lowerLast, i-2, 0);
        model.setValueAt("--------", i-2, 1);
        model.setValueAt("--------", i-2, 2);  
    }
    
    public void none(){
        
        model.setValueAt(finalRes[0][0],0,0);
        model.setValueAt(finalRes[0][1], 0,1);
        model.setValueAt(finalRes[0][2], 0,2);
        
        model.setValueAt(finalRes[numClasses - 1][0], i-2,0);
        model.setValueAt(finalRes[numClasses - 1][1], i-2,1);
        model.setValueAt(finalRes[numClasses - 1][2], i-2,2);
        
    }
    public void displayFDT(String type){
        titleHeading.setText(title);
        model = (DefaultTableModel) fdtTable.getModel();
        
        if(type == "float"){
            sortElements(type);
            finalRes = computeAll(fsorted); 
        } else {
            sortElements(type);
            finalRes = computeAll(isorted);
        }
        rowData = new Object[7];
        String datadata = "";
        for(; i < finalRes.length; i++){
            rowData[0] = finalRes[i][0];
            rowData[1] = finalRes[i][1];
            rowData[2] = finalRes[i][2];
            rowData[3] =finalRes[i][3];
            rowData[4] = finalRes[i][4];
            rowData[5] = finalRes[i][5];
            rowData[6] = finalRes[i][6];
           // datadata +="" + rowData[0] + rowData[1] + rowData[2] + rowData[3] + rowData[4] + rowData[5] + rowData[6]; 
           // arrData.add(datadata);
                    
            model.addRow(rowData);
        }
    }
    
    public String[][] computeAll(float[] fsorted){
        String[][] fdt;
        int n = classWidth("float");
        System.out.println("classWidth = " + n);
        System.out.println("range = " + frange);
        System.out.println("sorted = " + Arrays.toString(fsorted));
        float[][] fclasses = classLimits(fsorted);
        System.out.println("classLimits:\n" + Arrays.deepToString(fclasses));
        lower = "" + fclasses[0][0];
        upperFirst = "" + fclasses[0][1];
        upper = "" + fclasses[numClasses - 1][1];
        lowerLast = "" + fclasses[numClasses - 1][0];
        trueClasses("float");
        System.out.println("trueclassLimits: " + Arrays.deepToString(trueCL));
        midpoint("float");
        System.out.println("mid = " + Arrays.toString(mid));
        frequency("float");
        System.out.println("freq = " + Arrays.toString(freq));
        percentage("float");
        System.out.println("percent = " + Arrays.toString(percentage));
        cummuFreq("float");
        System.out.println("cummu = " + Arrays.toString(cummu));
        percentCummu("float");
        System.out.println("sorted = " + Arrays.toString(cummupercent));

        fdt = toStringFinal(numClasses, fclasses);        
        System.out.println("All: \n " + Arrays.deepToString(fdt));
        
        return fdt;
    }
    public String[][] computeAll(int[] isorted){
        String[][] fdt ;
        int n = classWidth("int");
        System.out.println("classWidth = " + n);
        System.out.println("range = " + irange);
        System.out.println("sorted = " + Arrays.toString(isorted));
        int[][] iclasses = classLimits(isorted);
        System.out.println("classLimits:\n" + Arrays.deepToString(iclasses));
        lower = "" + iclasses[0][0];
        upperFirst = "" + iclasses[0][1];
        upper = "" + iclasses[numClasses - 1][1];
        lowerLast = "" + iclasses[numClasses - 1][0];
        trueClasses("int");
        System.out.println("trueclassLimits: " + Arrays.deepToString(trueCL));
        midpoint("int");
        System.out.println("mid = " + Arrays.toString(mid));
        frequency("int");
        System.out.println("freq = " + Arrays.toString(freq));
        percentage("int");
        System.out.println("percent = " + Arrays.toString(percentage));
        cummuFreq("int");
        System.out.println("cummu = " + Arrays.toString(cummu));
        percentCummu("int");
        System.out.println("sorted = " + Arrays.toString(cummupercent));

        
        fdt= toStringFinal(numClasses, iclasses);
        System.out.println("All: \n " + Arrays.deepToString(fdt));
        return fdt;
    }
    //float data
    public String[][] toStringFinal(int n,float[][] fclasses){
        String[][] fdt = new String[n+1][7];
        
        for(int i = 0; i < n; i++){
            fdt[i][0] = "" + fclasses[i][0] + " - " + fclasses[i][1];
            fdt[i][1] = "" + trueCL[i][0] + " - " + trueCL[i][1];
            fdt[i][2] = "" + mid[i];
            fdt[i][3] = "" + freq[i];
            fdt[i][4] = "" + percentage[i];
            fdt[i][5] = "" + cummu[i];
            fdt[i][6] = "" + cummupercent[i];
        }
        fdt[numClasses][3] = "" + freq[numClasses];
        fdt[numClasses][4] = "" + percentage[numClasses];
        return fdt;            
    }
    
    public String[][] toStringFinal(int n, int[][] iclasses){
        String[][] fdt = new String[n+1][7];
        
        for(int i = 0; i < n; i++){
            fdt[i][0] = "" + iclasses[i][0] + " - " + iclasses[i][1];
            fdt[i][1] = "" + trueCL[i][0] + " - " + trueCL[i][1];
            fdt[i][2] = "" + mid[i];
            fdt[i][3] = "" + freq[i];
            fdt[i][4] = "" + percentage[i];
            fdt[i][5] = "" + cummu[i];
            fdt[i][6] = "" + cummupercent[i];
        }
        
        fdt[numClasses][3] = "" + freq[numClasses];
        fdt[numClasses][4] = "" + percentage[numClasses];
       
        return fdt;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton collapseButton;
    private javax.swing.JTable fdtTable;
    private javax.swing.JButton histogramButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel titleHeading;
    // End of variables declaration//GEN-END:variables
    
    public float[][] classLimits(float[] fsorted){
        int c = classWidth("float");
        range("float");
        float[][] classes = new float[numClasses][2];
        
        classes[0][0] = fsorted[0];
        classes[0][1] = classes[0][0] + (c - 1);
        for(int i = 1; i < numClasses; i++){
            classes[i][0] = classes[i-1][0] + c;
            classes[i][1] = classes[i-1][1] + c;
        }
     return classes;   
    }
    
    public int[][] classLimits(int[] isorted){
        int c = classWidth("int");
        range("int");
        int[][] classes = new int[numClasses][2];
        
        classes[0][0] = isorted[0];
        classes[0][1] = classes[0][0] + (c - 1);

        
        for(int i = 1; i < numClasses; i++){
            classes[i][0] = classes[i-1][0] + c;
            classes[i][1] = classes[i-1][1] +  c;
        }
        return classes;
    }
    
    
    public void range(String dtype){
        sortElements(dtype);
        if(dtype == "float"){
            frange = fsorted[fsorted.length - 1] - fsorted[0];
        } else if(dtype == "int"){
            irange = isorted[isorted.length - 1] - isorted[0];
        }
    }
    
    public double kComputation(){
        return (double)Math.ceil(1 + (3.322 * Math.log10(size)));
    }
    
    public int classWidth(String typee){
        if(typee == "float"){
            range("float");
            numClasses = (int)Math.ceil(kComputation());
            return (int)Math.ceil(frange / kComputation());
        } 
        else {
            range("int");
            numClasses = (int)Math.ceil(kComputation());  
        }
        
        return (int)Math.ceil(irange / kComputation());
        
     
    }
    
    public void sortElements(String datatype){
        if(datatype == "float"){
            fsorted = new float[fdata.length];
            for(int i = 0; i < fdata.length; i++){
                fsorted[i] = fdata[i];
            }
            Arrays.sort(fsorted);
        } else if(datatype == "int") {
            isorted = new int[idata.length];
            for(int i=0; i < idata.length; i++){
                isorted[i] = idata[i];
            }
            Arrays.sort(isorted);
        }
    }
    
    public void midpoint(String typee){
        float sum = 0; 
        if(typee == "float"){
            int c = classWidth("float");
            mid = new float[numClasses]; 
            float[][] fclasses = classLimits(fsorted);
            for(int i = 0; i < numClasses; i++){
                mid[i] = (float)((fclasses[i][0] + fclasses[i][1]) / 2);
            }
        } else {
            int c = classWidth("int");
            mid = new float[numClasses]; 
            int[][] iclasses = classLimits(isorted);
            for(int i = 0; i < numClasses; i++){
                mid[i] = (float)((iclasses[i][0] + iclasses[i][1]) / 2);
            }
        }
        
    }
    
    public void trueClasses(String dtype){
        
        if(dtype == "float"){
            int c = classWidth("float");
            trueCL = new float[numClasses][2];
            float[][] fclasses = classLimits(fsorted);
            for(int i = 0; i < numClasses; i++){
                trueCL[i][0] = (float) (fclasses[i][0] - 0.5);
                trueCL[i][1] = (float) (fclasses[i][1] + 0.5);
            }
        } else {
            int c = classWidth("int");
            trueCL = new float[numClasses][2];
            int[][] iclasses = classLimits(isorted);
            for(int i = 0; i < numClasses; i++){
                trueCL[i][0] = (float) (iclasses[i][0] - 0.5);
                trueCL[i][1] = (float) (iclasses[i][1] + 0.5);
            }
        }
    }

    public void frequency(String datatype){
        sortElements(datatype);
        int sum = 0;
        int f = 0;
        
        if(datatype == "float"){
            int c = classWidth("float");
            freq = new int[numClasses + 1];
            float[][] temp = classLimits(fsorted);

            for(int i = 0; i < numClasses; i++){
                for(int j = 0; j < fsorted.length; j++){
                    if(fsorted[j] >= temp[i][0] && fsorted[j] <= temp[i][1]){
                        f++;
                    }
                }
                freq[i] = f;
                sum += freq[i];
                f = 0;
            }
            freq[numClasses] = sum;
        } else {
            int c = classWidth("int");
            freq = new int[numClasses + 1];
            int[][] temp = classLimits(isorted);

            for(int i = 0; i < numClasses; i++){
                for(int j = 0; j < isorted.length; j++){
                    if(isorted[j] >= temp[i][0] && isorted[j] <= temp[i][1]){
                        f++;
                    }
                }
                freq[i] = f;
                sum += freq[i];
                f = 0;
            }
            freq[numClasses] = sum;
            
        }
        
        
    }
    
    public void cummuFreq(String datatype){
        int n = classWidth(datatype);
        int temp = 0;
        cummu = new int[numClasses];
        cummu[0] = freq[0];
        for(int i = 1; i < numClasses; i++){
            cummu[i] = cummu[i - 1] + freq[i];
        }
    }
    
    public void percentage(String datatype){
        int n = classWidth(datatype);
        float sum = 0;
        percentage = new float[numClasses+1];
        for(int i = 0; i < numClasses; i++){
            percentage[i] = (float)(((float)freq[i] /(float) size) * 100); 
            sum += percentage[i];
        }
        
        percentage[numClasses] = sum;
    }
    
    public void percentCummu(String datatype){
        int n = classWidth(datatype);
        cummupercent = new float[numClasses];
        cummupercent[0] = percentage[0];
        for(int i = 1; i < numClasses; i++){
            cummupercent[i] = cummupercent[i - 1] + percentage[i];
        }

    }

}

