package ee.ut.cs.aa.grading.lab_1.plotter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


@SuppressWarnings("serial")
public class TimePlotImplementation extends ApplicationFrame implements TimePlot {

	public TimePlotImplementation() {
		super("Insertion sort vs Quicksort");
	}
	
	@Override
	public void plot(XYDataset data) {
		 
		JFreeChart lineChart = ChartFactory.createXYLineChart(
		         "Insertion sort vs Quicksort",
		         "input size", "time",
		         data,
		         PlotOrientation.VERTICAL,
		         true,true,false);
		
		ChartPanel chartPanel = new ChartPanel(lineChart);
	    chartPanel.setPreferredSize(new java.awt.Dimension(560 ,367));
	    setContentPane(chartPanel);

		pack();
		RefineryUtilities.centerFrameOnScreen(this);
		setVisible(true);
	}
}
