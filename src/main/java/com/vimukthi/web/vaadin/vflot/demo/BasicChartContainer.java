/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.vimukthi.web.vaadin.vflot.Flot;
import com.vimukthi.web.vaadin.vflot.options.Axis;
import com.vimukthi.web.vaadin.vflot.options.Grid;
import com.vimukthi.web.vaadin.vflot.options.Legend;
import com.vimukthi.web.vaadin.vflot.options.Options;
import com.vimukthi.web.vaadin.vflot.options.Series;
import com.vimukthi.web.vaadin.vflot.options.plugins.CrossHair;
import com.vimukthi.web.vaadin.vflot.options.plugins.Selection;
import com.vimukthi.web.vaadin.vflot.options.plugins.Zoom;
import com.vimukthi.web.vaadin.vflot.options.plugins.pie.Pie;
import com.vimukthi.web.vaadin.vflot.series.Bars;
import com.vimukthi.web.vaadin.vflot.series.ChartSerie;
import com.vimukthi.web.vaadin.vflot.series.Lines;
import com.vimukthi.web.vaadin.vflot.series.PieSerie;
import com.vimukthi.web.vaadin.vflot.series.Serie;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Vimukthi
 *
 */
public class BasicChartContainer extends GridLayout {

	/**
	 * @param columns
	 * @param rows
	 */
	public BasicChartContainer() {
		super(2, 2);
		setSizeFull();
		setSpacing(true);
		
		VerticalLayout sublayout1 = new VerticalLayout();
		sublayout1.setSpacing(true);
		sublayout1.setStyleName("sublayout");
		HorizontalLayout titlebar1 = new HorizontalLayout();
		titlebar1.setStyleName("subtitle-bar");
		titlebar1.setHeight("20px");
		titlebar1.setWidth("100%");
		sublayout1.addComponent(titlebar1);
		titlebar1.addComponent(new Label("Basic Line Chart"));		
		Flot basicLineChart = createBasicLineChart();
		sublayout1.addComponent(basicLineChart);
		addComponent(sublayout1, 0, 0);
		
		VerticalLayout sublayout2 = new VerticalLayout();
		sublayout2.setStyleName("sublayout");
		sublayout2.setSpacing(true);
		HorizontalLayout titlebar2 = new HorizontalLayout();
		titlebar2.setStyleName("subtitle-bar");
		titlebar2.setHeight("20px");
		titlebar2.setWidth("100%");
		sublayout2.addComponent(titlebar2);
		titlebar2.addComponent(new Label("Basic Bar Chart"));		
		Flot basicBarChart = createBasicBarChart();
		sublayout2.addComponent(basicBarChart);
		addComponent(sublayout2, 0, 1);
		
		VerticalLayout sublayout3 = new VerticalLayout();
		sublayout3.setStyleName("sublayout");
		sublayout3.setSpacing(true);
		HorizontalLayout titlebar3 = new HorizontalLayout();
		titlebar3.setStyleName("subtitle-bar");
		titlebar3.setHeight("20px");
		titlebar3.setWidth("100%");
		sublayout3.addComponent(titlebar3);
		titlebar3.addComponent(new Label("Basic Area Chart"));		
		Flot basicAreaChart = createBasicAreaChart();
		sublayout3.addComponent(basicAreaChart);
		addComponent(sublayout3, 1, 0);
		
		VerticalLayout sublayout4 = new VerticalLayout();
		sublayout4.setStyleName("sublayout");
		sublayout4.setSpacing(true);
		HorizontalLayout titlebar4 = new HorizontalLayout();
		titlebar4.setStyleName("subtitle-bar");
		titlebar4.setHeight("20px");
		titlebar4.setWidth("100%");
		sublayout4.addComponent(titlebar4);
		titlebar4.addComponent(new Label("Basic Pie Chart"));		
		Flot basicPieChart = createBasicPieChart();
		sublayout4.addComponent(basicPieChart);
		addComponent(sublayout4, 1, 1);
	}

	private Flot createBasicPieChart() {
		Flot pie = new Flot();
        List<Serie> pieseries = new ArrayList<Serie>();
        PieSerie pieserie1 = new PieSerie("serie1");
        pieserie1.addData(10);
        pieseries.add(pieserie1);
        PieSerie pieserie2 = new PieSerie("serie2");
        pieserie2.addData(20);
        pieseries.add(pieserie2);
        PieSerie pieserie3 = new PieSerie("serie3");
        pieserie3.addData(30);
        pieseries.add(pieserie3);
        PieSerie pieserie4 = new PieSerie("serie4");
        pieserie4.addData(15);
        pieseries.add(pieserie4);
        PieSerie pieserie5 = new PieSerie("serie5");
        pieserie5.addData(25);
        pieseries.add(pieserie5);
        pie.setSeries(pieseries);
        
        Options pieOpt = new Options();
        Series pieseriesopt = new Series();
        Pie pieopt = new Pie();
        pieopt.setShow(true);
        pieseriesopt.setPie(pieopt);
        pieOpt.setSeries(pieseriesopt);
        pie.setOptions(pieOpt);
		return pie;
	}

	private Flot createBasicAreaChart() {
		final Flot chart = new Flot();
		
		// Add data
        ChartSerie chartserie1 = new ChartSerie("First series");
        Map<Object, Object> data1 = DemoDataGen.getRandomData(50, 20);
        for (Entry<Object, Object> data : data1.entrySet()) {
        	chartserie1.addDataPoint(data.getKey(), data.getValue());
		}
        
        ChartSerie chartserie2 = new ChartSerie("Second series");
        Map<Object, Object> data2 = DemoDataGen.getRandomData(50, 10);
        for (Entry<Object, Object> data : data2.entrySet()) {
        	chartserie2.addDataPoint(data.getKey(), data.getValue());
		}     
        
        List<Serie> series = new ArrayList<Serie>();
        series.add(chartserie1);
        series.add(chartserie2);
        chart.setSeries(series);
        
        // Specify options
        Options opt = new Options();        
        Axis yaxis1 = new Axis(); 
        yaxis1.setAxisLabel("Y Axis");
        opt.setYaxis(yaxis1);
        
        Axis xaxis1 = new Axis(); 
        xaxis1.setAxisLabel("X Axis");
        // don't display floating points
        xaxis1.setTickDecimals("0");
        xaxis1.setTickFormatter("function(val, axis){return ['Flot', 'Charts', 'Colorful', " +
        		"'Beautiful', 'Simple', 'HTML5', 'Performant', 'Customizable', 'Extensible', " +
        		"'Clean', 'Compatible'][(val % 11)]}");
        opt.setXaxis(xaxis1);
       
        // make this an area chart by enabling fill
        Lines lines = new Lines();
        lines.setFill("true");        
        Series s = new Series();
        s.setLines(lines);
        opt.setSeries(s);
        
        // change default set of series colors
        opt.setColors(Arrays.asList(new String[] { "#4573a7",
				"#89a54e", "#7e6c96" }));
        
        chart.setOptions(opt);
		return chart;
	}

	private Flot createBasicBarChart() {
		final Flot chart = new Flot();
		
		// Add data
        ChartSerie chartserie1 = new ChartSerie("First series");
        Map<Object, Object> data1 = DemoDataGen.getRandomData(50, 10);
        for (Entry<Object, Object> data : data1.entrySet()) {
        	chartserie1.addDataPoint(data.getKey(), data.getValue());
		}
        
        ChartSerie chartserie2 = new ChartSerie("Second series");
        Map<Object, Object> data2 = DemoDataGen.getRandomData(50, 10);
        for (Entry<Object, Object> data : data2.entrySet()) {
        	chartserie2.addDataPoint(data.getKey(), data.getValue());
		}     
        
        List<Serie> series = new ArrayList<Serie>();
        series.add(chartserie1);
        series.add(chartserie2);
        chart.setSeries(series);
        
        // Specify options
        Options opt = new Options();        
        Axis yaxis1 = new Axis(); 
        yaxis1.setAxisLabel("Y Axis");
        opt.setYaxis(yaxis1);
        
        Axis xaxis1 = new Axis(); 
        xaxis1.setAxisLabel("X Axis");
        // don't display floating points
        xaxis1.setTickDecimals("0");
        opt.setXaxis(xaxis1);
       
        // make this a bar chart
        Bars bars = new Bars();
        bars.setShow(true);
        
        Series s = new Series();
        s.setBars(bars);
        opt.setSeries(s);
        
        chart.setOptions(opt);
		return chart;
	}

	private Flot createBasicLineChart() {
		final Flot chart = new Flot();
		
		// Add data
        ChartSerie chartserie1 = new ChartSerie("First series");
        Map<Object, Object> data1 = DemoDataGen.getRandomData(50, 100);
        for (Entry<Object, Object> data : data1.entrySet()) {
        	chartserie1.addDataPoint(data.getKey(), data.getValue());
		}
        
        ChartSerie chartserie2 = new ChartSerie("Second series");
        Map<Object, Object> data2 = DemoDataGen.getRandomData(50, 80);
        for (Entry<Object, Object> data : data2.entrySet()) {
        	chartserie2.addDataPoint(data.getKey(), data.getValue());
		}     
        
        List<Serie> series = new ArrayList<Serie>();
        series.add(chartserie1);
        series.add(chartserie2);
        chart.setSeries(series);
        
        // Specify options
        Options opt = new Options();        
        Axis yaxis1 = new Axis(); 
        yaxis1.setAxisLabel("Y Axis");
        opt.setYaxis(yaxis1);
        
        Axis xaxis1 = new Axis(); 
        xaxis1.setAxisLabel("X Axis");
        opt.setXaxis(xaxis1);
        
        chart.setOptions(opt);
		return chart;
	}
	
	
}
