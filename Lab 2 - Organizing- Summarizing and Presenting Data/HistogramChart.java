/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.TickUnits;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramBin;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author RizelleAnn
 */
public class HistogramChart extends ApplicationFrame {
    private static String[][] arrData;
    private static String title;
    private static int max;
    private static int min;
    private ArrayList<Integer> rawData;
    int width;
    ChartFrame frame;
    
    public HistogramChart(String title,String[][] arrData, int max, int min, ArrayList<Integer> rawData, int width){
        super(title);
        this.width = width;
        this.rawData = rawData;
        this.max = max;
        this.min = min;
        this.title = title;
        this.arrData = arrData;
        JPanel chartPanel = crearPanel();
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
        //setContentPane(chartPanel);
        //frame = new ChartFrame("Histogram", chartPanel);
    }
    
    public HistogramChart(String title, String[][] arrData){
        super(title);
        this.arrData = arrData;
        this.title = title;
        JPanel chartPanel = crearPanel();
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
    }
    
    private  IntervalXYDataset crearDataset() {
        //HistogramDataset dataset = new HistogramDataset();
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries(title);
        int freq[] = new int[HistogramChart.arrData.length-1];
        double mid[] = new double[this.arrData.length-1];
        //double mid[] = new double[rawData.size() -1];
        for(int i = 0; i < arrData.length-1; i++){
            freq[i] = Integer.parseInt(arrData[i][3]);
           // mid[i] =  rawData.get(i);
            mid[i] = Double.parseDouble(arrData[i][2]);
           
            series.add(mid[i], freq[i]);
            //data.addBin(new SimpleHistogramBin(i,i+mid[i]));
           
        }
        //dataset.addSeries("", mid, arrData.length-1, 0,width-1);
        dataset.setAutoWidth(false);
        dataset.setIntervalWidth(Double.parseDouble(arrData[1][2]) - Double.parseDouble(arrData[0][2]));
        dataset.addSeries(series);
        
        return dataset;
    }
    
    private static JFreeChart crearChart(IntervalXYDataset dataset) {
        JFreeChart chart = ChartFactory.createHistogram(
                title,
                "Midpoint",
                "Frequency",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                false,
                false);
     
        XYPlot plot = (XYPlot) chart.getPlot();
        NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();

        //domainAxis.setRange(0.0, max);
        /*final TickUnits standardUnits = new TickUnits();
        for(int i = 0; i < arrData.length-1; i++){
            //domainAxis.setTickUnit(new NumberTickUnit(Double.parseDouble(arrData[i][2])));
            standardUnits.add(new NumberTickUnit(Double.parseDouble(arrData[i][2])));
            System.out.println(arrData[i][2]);
        }
        domainAxis.setStandardTickUnits(standardUnits);*/
        
        //rangeAxis.setRange(0, max);
        //rangeAxis.setTickUnit(new NumberTickUnit(0.05));
        
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
 
        /*try {
            ChartUtilities.saveChartAsPNG(new File("histogram.PNG"), chart, 500, 475);
        } catch (IOException e) {
        }*/
        
        /*ChartFrame frame = new ChartFrame("Histogram", chart);
        frame.setVisible(true);
        frame.setLocation(500,70);
        frame.setDefaultCloseOperation(2);*/
        return chart;
    }
    

    public  JPanel crearPanel() {
        JFreeChart chart = crearChart(crearDataset());
        frame = new ChartFrame("Histogram", chart);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(2);
        frame.setLocation(500,70);
        frame.setSize(new Dimension(500,475));
        return new ChartPanel(chart);
    }

}

