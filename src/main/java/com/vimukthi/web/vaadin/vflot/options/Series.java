/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options;

import com.vimukthi.web.vaadin.vflot.options.plugins.pie.Pie;
import com.vimukthi.web.vaadin.vflot.series.Bars;
import com.vimukthi.web.vaadin.vflot.series.Lines;
import com.vimukthi.web.vaadin.vflot.series.Points;

/**
 * @author Vimukthi
 * 
 */
public class Series {
	
	private Lines lines;

	private Points points;

	private Bars bars;
	
	private Pie pie;

	private Integer shadowsize = null;

	private String highlightColor;
	
	private Boolean clickable;
	
	private Boolean hoverable;
	
	/**
	 * @return the clickable
	 */
	public Boolean getClickable() {
		return clickable;
	}

	/**
	 * @return the hoverable
	 */
	public Boolean getHoverable() {
		return hoverable;
	}

	/**
	 * @param clickable the clickable to set
	 */
	public void setClickable(Boolean clickable) {
		this.clickable = clickable;
	}

	/**
	 * @param hoverable the hoverable to set
	 */
	public void setHoverable(Boolean hoverable) {
		this.hoverable = hoverable;
	}

	/**
	 * @return the bars
	 */
	public Bars getBars() {
		return bars;
	}

	/**
	 * @return the shadowsize
	 */
	public Integer getShadowsize() {
		return shadowsize;
	}

	/**
	 * @return the highlightColor
	 */
	public String getHighlightColor() {
		return highlightColor;
	}

	/**
	 * @param bars
	 *            the bars to set
	 */
	public void setBars(Bars bars) {
		this.bars = bars;
	}

	/**
	 * @param shadowsize
	 *            the shadowsize to set
	 */
	public void setShadowsize(Integer shadowsize) {
		this.shadowsize = shadowsize;
	}

	/**
	 * @param highlightColor
	 *            the highlightColor to set
	 */
	public void setHighlightColor(String highlightColor) {
		this.highlightColor = highlightColor;
	}

	/**
	 * @return the lines
	 */
	public Lines getLines() {
		return lines;
	}

	/**
	 * @return the points
	 */
	public Points getPoints() {
		return points;
	}

	/**
	 * @param lines
	 *            the lines to set
	 */
	public void setLines(Lines lines) {
		this.lines = lines;
	}

	/**
	 * @param points
	 *            the points to set
	 */
	public void setPoints(Points points) {
		this.points = points;
	}

	/**
	 * @return the pie
	 */
	public Pie getPie() {
		return pie;
	}

	/**
	 * @param pie the pie to set
	 */
	public void setPie(Pie pie) {
		this.pie = pie;
	}
}
