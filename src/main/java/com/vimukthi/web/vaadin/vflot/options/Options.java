/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options;

import java.util.List;

import com.vimukthi.web.vaadin.vflot.options.plugins.CrossHair;
import com.vimukthi.web.vaadin.vflot.options.plugins.Pan;
import com.vimukthi.web.vaadin.vflot.options.plugins.Selection;
import com.vimukthi.web.vaadin.vflot.options.plugins.Zoom;

/**
 * @author Vimukthi
 *
 */
public class Options {
	
	private Series series;
	
	private Legend legend;
	
	private Grid grid;
	
	private Interaction interaction;
	
	private List<String> colors;
	
	private Axis xaxis;
	
	private List<Axis> xaxes;
	
	private Axis yaxis;
	
	private List<Axis> yaxes;
	
	private CrossHair crosshair;
	
	private Zoom zoom;
	
	private Pan pan;
	
	private Selection selection;

	/**
	 * @return the grid
	 */
	public Grid getGrid() {
		return grid;
	}

	/**
	 * @return the interaction
	 */
	public Interaction getInteraction() {
		return interaction;
	}

	/**
	 * @param grid the grid to set
	 */
	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	/**
	 * @param interaction the interaction to set
	 */
	public void setInteraction(Interaction interaction) {
		this.interaction = interaction;
	}

	/**
	 * @return the series
	 */
	public Series getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(Series series) {
		this.series = series;
	}

	/**
	 * @return the legend
	 */
	public Legend getLegend() {
		return legend;
	}

	/**
	 * @param legend the legend to set
	 */
	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	/**
	 * @return the xaxis
	 */
	public Axis getXaxis() {
		return xaxis;
	}

	/**
	 * @return the xaxes
	 */
	public List<Axis> getXaxes() {
		return xaxes;
	}

	/**
	 * @return the yaxis
	 */
	public Axis getYaxis() {
		return yaxis;
	}

	/**
	 * @return the yaxes
	 */
	public List<Axis> getYaxes() {
		return yaxes;
	}

	/**
	 * Set if there's only one x axis
	 * @param xaxis the xaxis to set
	 */
	public void setXaxis(Axis xaxis) {
		this.xaxes = null;
		this.xaxis = xaxis;
	}

	/**
	 * Set if there are multiple x axes
	 * @param xaxes the xaxes to set
	 */
	public void setXaxes(List<Axis> xaxes) {
		this.xaxis = null;
		this.xaxes = xaxes;
	}

	/**
	 * Set if there's only one y axis
	 * @param yaxis the yaxis to set
	 */
	public void setYaxis(Axis yaxis) {
		this.yaxes = null;
		this.yaxis = yaxis;
	}

	/**
	 * Set if there are multiple y axes
	 * @param yaxes the yaxes to set
	 */
	public void setYaxes(List<Axis> yaxes) {
		this.yaxis = null;
		this.yaxes = yaxes;
	}

	/**
	 * @return the colors
	 */
	public List<String> getColors() {
		return colors;
	}

	/**
	 * Colors for series
	 * @param colors the colors to set
	 */
	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	/**
	 * @return the crosshair
	 */
	public CrossHair getCrosshair() {
		return crosshair;
	}

	/**
	 * @param crosshair the crosshair to set
	 */
	public void setCrosshair(CrossHair crosshair) {
		this.crosshair = crosshair;
	}

	/**
	 * @return the zoom
	 */
	public Zoom getZoom() {
		return zoom;
	}

	/**
	 * @param zoom the zoom to set
	 */
	public void setZoom(Zoom zoom) {
		this.zoom = zoom;
	}

	/**
	 * @return the pan
	 */
	public Pan getPan() {
		return pan;
	}

	/**
	 * @param pan the pan to set
	 */
	public void setPan(Pan pan) {
		this.pan = pan;
	}

	/**
	 * @return the selection
	 */
	public Selection getSelection() {
		return selection;
	}

	/**
	 * @param selection the selection to set
	 */
	public void setSelection(Selection selection) {
		this.selection = selection;
	}
}
