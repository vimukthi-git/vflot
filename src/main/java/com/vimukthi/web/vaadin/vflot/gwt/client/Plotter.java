/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.gwt.client;

import com.google.gwt.dom.client.Element;

/**
 * @author Vimukthi
 *
 */
public class Plotter {
	
	private Plot plot;
	
	private Element container;
	
	private VFlot vflot;
	
	/**
	 * @param vflot
	 */
	public Plotter(VFlot vflot) {
		super();
		this.vflot = vflot;
	}

	public void create(Element container, String series){
		this.container = container;
		plot  = PlotterImpl.create(container, series);
	}
	
	public void create(Element container, String series, String options, boolean resize){
		this.container = container;
		plot  = PlotterImpl.create(this, container, series, options, resize);
	}
	
	/**** Flot api ***/
	
	/**
	 * 
	 * @param series
	 * @param datapoint
	 */
	public void highlight(int series, int datapoint){
		PlotterImpl.highlight(plot, series, datapoint);
	}
	
	public void unhighlight(int series, int datapoint){
		PlotterImpl.unhighlight(plot, series, datapoint);
	}
	
	public void unhighlight(){
		PlotterImpl.unhighlight(plot);
	}
	
	public void setData(String series){
		PlotterImpl.setData(plot, series);
	}
	
	public void setUpGrid(){
		PlotterImpl.setUpGrid(plot);
	}
	
	public void draw(){
		PlotterImpl.draw(plot);
	}
	
	public int width(){
		return PlotterImpl.width(plot);
	}
	
	public int height(){
		return PlotterImpl.height(plot);
	}
	
	/****** Flot Plugin apis *****/
	
	public void setCrosshair(String pos){
		PlotterImpl.setCrosshair(plot, pos);
	}
	
	public void clearCrosshair(){
		PlotterImpl.clearCrosshair(plot);
	}
	
	public void lockCrosshair(String pos){
		PlotterImpl.lockCrosshair(plot, pos);
	}
	
	public void unlockCrosshair(){
		PlotterImpl.unlockCrosshair(plot);
	}
	
	public void zoom(String pos){
		PlotterImpl.zoom(plot, pos);
	}
	
	public void zoomOut(){
		PlotterImpl.zoomOut(plot);
	}
	
	public void pan(String pos){
		PlotterImpl.pan(plot, pos);
	}
	
	/****** Flot events *****/
	public void addClickListener() {
		PlotterImpl.addClickListener(this, container);
	}
	
	public void addHoverListener() {
		PlotterImpl.addHoverListener(this, container);
	}
	
	public void addSelectListener() {
		PlotterImpl.addSelectListener(this, container);
	}
	
	public void removeClickListener() {
		PlotterImpl.removeClickListener(container);
	}
	
	public void removeHoverListener() {
		PlotterImpl.removeHoverListener(container);
	}
	
	public void removeSelectListener() {
		PlotterImpl.removeSelectListener(container);
	}
	
	public void onPlotClick(String pos, String item){
		vflot.onPlotClick(pos, item);
	}
	
	public void onPlotHover(String pos, String item){
		vflot.onPlotHover(pos, item);
	}
	
	public void onPlotSelect(String ranges){
		vflot.onPlotSelect(ranges);
	}

	/**
	 * @return the plot
	 */
	public Plot getPlot() {
		return plot;
	}

	/**
	 * @param plot the plot to set
	 */
	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	/**
	 * @return the vflot
	 */
	public VFlot getVflot() {
		return vflot;
	}

	/**
	 * @param vflot the vflot to set
	 */
	public void setVflot(VFlot vflot) {
		this.vflot = vflot;
	}
}
