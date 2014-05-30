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
public class StackChartContainer extends GridLayout {

	/**
	 * @param columns
	 * @param rows
	 */
	public StackChartContainer() {
		super(1, 1);
		setSizeFull();
		setSpacing(true);

		VerticalLayout sublayout2 = new VerticalLayout();
		sublayout2.setStyleName("sublayout");
		sublayout2.setSpacing(true);
		HorizontalLayout titlebar2 = new HorizontalLayout();
		titlebar2.setStyleName("subtitle-bar");
		titlebar2.setHeight("100%");
		titlebar2.setWidth("100%");
		sublayout2.addComponent(titlebar2);
		titlebar2.addComponent(new Label("Basic Bar Chart"));		
		Flot basicBarChart = createBasicBarChart();
		sublayout2.addComponent(basicBarChart);
		addComponent(sublayout2, 0, 0);

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
        
        chartserie1.setStack("1");
        chartserie2.setStack("1");

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

	
	
	
}
