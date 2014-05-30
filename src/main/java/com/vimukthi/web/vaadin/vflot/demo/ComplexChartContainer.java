/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.demo;

import java.util.ArrayList;
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
import com.vimukthi.web.vaadin.vflot.series.ChartSerie;
import com.vimukthi.web.vaadin.vflot.series.Lines;
import com.vimukthi.web.vaadin.vflot.series.PieSerie;
import com.vimukthi.web.vaadin.vflot.series.Serie;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

/**
 * @author Vimukthi
 *
 */
public class ComplexChartContainer extends GridLayout {

	/**
	 * @param columns
	 * @param rows
	 */
	public ComplexChartContainer() {
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
		titlebar1.addComponent(new Label("Stacked Bar Chart - Flot stack plugin"));		
		Flot basicLineChart = createStackedBarChart();
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
		titlebar2.addComponent(new Label("Chart with multiple axis"));		
		Flot basicBarChart = createMultipleAxisChart();
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
		titlebar3.addComponent(new Label("Time series chart"));		
		Flot basicAreaChart = createTimeSeriesChart();
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
		titlebar4.addComponent(new Label("Mixed series chart"));		
		Flot basicPieChart = createMixedSeriesChart();
		sublayout4.addComponent(basicPieChart);
		addComponent(sublayout4, 1, 1);
	}
	
	private Flot createMixedSeriesChart() {
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

	private Flot createTimeSeriesChart() {
		final Flot chart = new Flot();
        
        chart.addPlotClickListener(new Flot.PlotClickListener() {
			
			public void onClick(String pos, String item) {
				getWindow().showNotification(pos);
				
			}
		});
        
        chart.addPlotSelectListener(new Flot.PlotSelectListener() {
			
			public void onSelect(String ranges) {
				getWindow().showNotification(ranges);
				
			}
		});
        
        
        Button remover = new Button("remove listener");
        remover.addListener(new Button.ClickListener() {
			
			public void buttonClick(ClickEvent event) {
				chart.removePlotClickListener();
			}
		});
        //chart.removePlotClickListener();
        ChartSerie chartserie1 = new ChartSerie("First series");
        chartserie1.addDataPoint("1.0", "2.0");
        chartserie1.addDataPoint("2.0", "4.0");
        chartserie1.addDataPoint("3.0", "3.0");
        chartserie1.addDataPoint("4.0", "6.0");
        chartserie1.addDataPoint("5.0", "10.0");
        //chartserie1.setFillBetween("foo");
        chartserie1.setYaxis(1);
        
        ChartSerie chartserie2 = new ChartSerie("Second series");
        chartserie2.addDataPoint("1.0", "5.0");
        chartserie2.addDataPoint("2.0", "1.0");
        chartserie2.addDataPoint("3.0", "8.0");
        chartserie2.addDataPoint("4.0", "9.0");
        chartserie2.addDataPoint("5.0", "10.0");
        
        chartserie2.setId("foo");
        chartserie2.setYaxis(2);
        //        serie2.setLines(lines);      
        //serie2.setHighlightColor("rgba(255, 0, 0, 0.3)");
        
        List<Serie> series = new ArrayList<Serie>();
        series.add(chartserie1);
        series.add(chartserie2);
        chart.setSeries(series);
        Options opt = new Options();
        Legend legend = new Legend();
        legend.setPosition("nw");
        opt.setLegend(legend);
        
        Selection sel = new Selection();
        sel.setMode("x");
        opt.setSelection(sel);
        
        Grid grid = new Grid();
        grid.setHoverable(true);
        grid.setAutoHighlight(true);
//        Colors colors = new Colors();
//        colors.addColor("#FFF").addColor("#999").addColor("FFF");
//        grid.setBackgroundColor(colors);        
        opt.setGrid(grid);
        
        Axis yaxis1 = new Axis();
        yaxis1.setAxisLabel("Foo");
        yaxis1.setPosition("right");
        yaxis1.setZoomRange(new String[]{"0", "0"});
        //yaxis1.setTransform("function (v) { return -v; }");
//        yaxis1.setTickFormatter("function(val, axis){return 'nice'}");
        
        Axis yaxis2 = new Axis();
        yaxis2.setAxisLabel("Bar");
        yaxis2.setPosition("left");
        yaxis2.setZoomRange(new String[]{"0", "0"});
        //yaxis2.setTransform("function (v) { return 2 * v; }");
        
        List<Axis> yaxes = new ArrayList<Axis>();
        yaxes.add(yaxis1);
        yaxes.add(yaxis2);
        
        opt.setYaxes(yaxes);
        
        CrossHair cr = new CrossHair();
        cr.setMode("xy");
        opt.setCrosshair(cr);
        
        Lines lines = new Lines();
        lines.setFill("true");
        lines.setFillColor("rgba(255, 0, 0, 0.5)");
        
        Series s = new Series();
        s.setLines(lines);
        opt.setSeries(s);
        
        Zoom zoom = new Zoom();
        zoom.setInteractive(true);
        opt.setZoom(zoom);
        
        chart.setOptions(opt);
        chart.highlight(0, 3);
		return chart;
	}

	private Flot createMultipleAxisChart() {
		final Flot chart = new Flot();
		
      
        ChartSerie chartserie1 = new ChartSerie("First series");
        Map<Object, Object> data1 = DemoDataGen.getRandomData(50, 10);
        for (Entry<Object, Object> data : data1.entrySet()) {
        	chartserie1.addDataPoint(data.getKey(), data.getValue());
		}
        chartserie1.setYaxis(1);
        
        ChartSerie chartserie2 = new ChartSerie("Second series");
        Map<Object, Object> data2 = DemoDataGen.getRandomData(50, 20);
        for (Entry<Object, Object> data : data2.entrySet()) {
        	chartserie2.addDataPoint(data.getKey(), data.getValue());
		}        
        chartserie2.setYaxis(2);
        //        serie2.setLines(lines);      
        //serie2.setHighlightColor("rgba(255, 0, 0, 0.3)");
        
        List<Serie> series = new ArrayList<Serie>();
        series.add(chartserie1);
        series.add(chartserie2);
        chart.setSeries(series);
        Options opt = new Options();
        Legend legend = new Legend();
        legend.setPosition("nw");
        opt.setLegend(legend);
             
        Grid grid = new Grid();
        grid.setHoverable(true);
        grid.setAutoHighlight(true);  
        opt.setGrid(grid);
        
        Axis yaxis1 = new Axis();
        yaxis1.setAxisLabel("Y Axis 1");
        yaxis1.setPosition("right");
        
        Axis yaxis2 = new Axis();
        yaxis2.setAxisLabel("Y Axis 2");
        yaxis2.setPosition("left");
        
        List<Axis> yaxes = new ArrayList<Axis>();
        yaxes.add(yaxis1);
        yaxes.add(yaxis2);        
        opt.setYaxes(yaxes);
        
        Axis xaxis = new Axis();
        xaxis.setAxisLabel("X Axis");
        opt.setXaxis(xaxis);
        
        Lines lines = new Lines();
        lines.setFill("true");
        
        Series s = new Series();
        s.setLines(lines);
        opt.setSeries(s);
        
        chart.setOptions(opt);
		return chart;
	}

	private Flot createStackedBarChart() {
		final Flot chart = new Flot();
        
        chart.addPlotClickListener(new Flot.PlotClickListener() {
			
			public void onClick(String pos, String item) {
				getWindow().showNotification(pos);
				
			}
		});
        
        chart.addPlotSelectListener(new Flot.PlotSelectListener() {
			
			public void onSelect(String ranges) {
				getWindow().showNotification(ranges);
				
			}
		});
        
        
        Button remover = new Button("remove listener");
        remover.addListener(new Button.ClickListener() {
			
			public void buttonClick(ClickEvent event) {
				chart.removePlotClickListener();
			}
		});
        //chart.removePlotClickListener();
        ChartSerie chartserie1 = new ChartSerie("First series");
        chartserie1.addDataPoint("1.0", "2.0");
        chartserie1.addDataPoint("2.0", "4.0");
        chartserie1.addDataPoint("3.0", "3.0");
        chartserie1.addDataPoint("4.0", "6.0");
        chartserie1.addDataPoint("5.0", "10.0");
        //chartserie1.setFillBetween("foo");
        chartserie1.setYaxis(1);
        
        ChartSerie chartserie2 = new ChartSerie("Second series");
        chartserie2.addDataPoint("1.0", "5.0");
        chartserie2.addDataPoint("2.0", "1.0");
        chartserie2.addDataPoint("3.0", "8.0");
        chartserie2.addDataPoint("4.0", "9.0");
        chartserie2.addDataPoint("5.0", "10.0");
        
        chartserie2.setId("foo");
        chartserie2.setYaxis(2);
        //        serie2.setLines(lines);      
        //serie2.setHighlightColor("rgba(255, 0, 0, 0.3)");
        
        List<Serie> series = new ArrayList<Serie>();
        series.add(chartserie1);
        series.add(chartserie2);
        chart.setSeries(series);
        Options opt = new Options();
        Legend legend = new Legend();
        legend.setPosition("nw");
        opt.setLegend(legend);
        
        Selection sel = new Selection();
        sel.setMode("x");
        opt.setSelection(sel);
        
        Grid grid = new Grid();
        grid.setHoverable(true);
        grid.setAutoHighlight(true);
//        Colors colors = new Colors();
//        colors.addColor("#FFF").addColor("#999").addColor("FFF");
//        grid.setBackgroundColor(colors);        
        opt.setGrid(grid);
        
        Axis yaxis1 = new Axis();
        yaxis1.setAxisLabel("Foo");
        yaxis1.setPosition("right");
        yaxis1.setZoomRange(new String[]{"0", "0"});
        //yaxis1.setTransform("function (v) { return -v; }");
//        yaxis1.setTickFormatter("function(val, axis){return 'nice'}");
        
        Axis yaxis2 = new Axis();
        yaxis2.setAxisLabel("Bar");
        yaxis2.setPosition("left");
        yaxis2.setZoomRange(new String[]{"0", "0"});
        //yaxis2.setTransform("function (v) { return 2 * v; }");
        
        List<Axis> yaxes = new ArrayList<Axis>();
        yaxes.add(yaxis1);
        yaxes.add(yaxis2);
        
        opt.setYaxes(yaxes);
        
        CrossHair cr = new CrossHair();
        cr.setMode("xy");
        opt.setCrosshair(cr);
        
        Lines lines = new Lines();
        lines.setFill("true");
        lines.setFillColor("rgba(255, 0, 0, 0.5)");
        
        Series s = new Series();
        s.setLines(lines);
        opt.setSeries(s);
        
        Zoom zoom = new Zoom();
        zoom.setInteractive(true);
        opt.setZoom(zoom);
        
        chart.setOptions(opt);
        chart.highlight(0, 3);
		return chart;
	}
	

}
