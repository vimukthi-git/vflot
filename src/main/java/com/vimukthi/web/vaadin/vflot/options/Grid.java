/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options;

import com.vimukthi.web.vaadin.vflot.options.plugins.canvastext.CanvasText;

/**
 * @author Vimukthi
 * 
 */
public class Grid {

	private Boolean show;
	
	private Boolean aboveData;
	
	private String color;
	
	private Colors backgroundColor;
	
	private Width margin;
	
	private Integer labelMargin;
	
	private Integer axisMargin;
	
	private String markings;
	
	private Boolean evalMarkings = false;
	
	private Width privateborderWidth;
	
	private Width borderColor;
	
	private Integer minBorderMargin;
	
	private Boolean clickable = true;
	
	private Boolean hoverable;
	
	private Boolean autoHighlight;
	
	private Integer mouseActiveRadius;
	
	private CanvasText canvasText;

	/**
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}

	/**
	 * @return the aboveData
	 */
	public Boolean getAboveData() {
		return aboveData;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the backgroundColor
	 */
	public Colors getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @return the margin
	 */
	public Width getMargin() {
		return margin;
	}

	/**
	 * @return the labelMargin
	 */
	public Integer getLabelMargin() {
		return labelMargin;
	}

	/**
	 * @return the axisMargin
	 */
	public Integer getAxisMargin() {
		return axisMargin;
	}

	/**
	 * @return the markings
	 */
	public String getMarkings() {
		return markings;
	}

	/**
	 * @return the privateborderWidth
	 */
	public Width getPrivateborderWidth() {
		return privateborderWidth;
	}

	/**
	 * @return the borderColor
	 */
	public Width getBorderColor() {
		return borderColor;
	}

	/**
	 * @return the minBorderMargin
	 */
	public Integer getMinBorderMargin() {
		return minBorderMargin;
	}

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
	 * @return the autoHighlight
	 */
	public Boolean getAutoHighlight() {
		return autoHighlight;
	}

	/**
	 * @return the mouseActiveRadius
	 */
	public Integer getMouseActiveRadius() {
		return mouseActiveRadius;
	}

	/**
	 * @param show
	 *            the show to set
	 */
	public void setShow(Boolean show) {
		this.show = show;
	}

	/**
	 * @param aboveData
	 *            the aboveData to set
	 */
	public void setAboveData(Boolean aboveData) {
		this.aboveData = aboveData;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * color/gradient or null
	 * 
	 * @param backgroundColor
	 *            the backgroundColor to set
	 */
	public void setBackgroundColor(Colors backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @param margin
	 *            the margin to set
	 */
	public void setMargin(Width margin) {
		this.margin = margin;
	}

	/**
	 * @param labelMargin
	 *            the labelMargin to set
	 */
	public void setLabelMargin(Integer labelMargin) {
		this.labelMargin = labelMargin;
	}

	/**
	 * @param axisMargin
	 *            the axisMargin to set
	 */
	public void setAxisMargin(Integer axisMargin) {
		this.axisMargin = axisMargin;
	}

	/**
	 * array of markings or (fn: axes -> array of markings)
	 * <br/>Eg:-<br/>
	 * function (axes) {<br/>
    		var markings = [];<br/>
    		for (var x = Math.floor(axes.xaxis.min); x < axes.xaxis.max; x += 2)<br/>
        		markings.push({ xaxis: { from: x, to: x + 1 } });<br/>
    		return markings;<br/>
		}<br/>
	 * @param markings
	 *            the markings to set
	 */
	public void setMarkings(String markings) {
		this.evalMarkings = true;
		this.markings = markings;
	}

	/**
	 * @param privateborderWidth
	 *            the privateborderWidth to set
	 */
	public void setPrivateborderWidth(Width privateborderWidth) {
		this.privateborderWidth = privateborderWidth;
	}

	/**
	 * @param borderColor
	 *            the borderColor to set
	 */
	public void setBorderColor(Width borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @param minBorderMargin
	 *            the minBorderMargin to set
	 */
	public void setMinBorderMargin(Integer minBorderMargin) {
		this.minBorderMargin = minBorderMargin;
	}

	/**
	 * @param clickable
	 *            the clickable to set
	 */
	public void setClickable(Boolean clickable) {
		this.clickable = clickable;
	}

	/**
	 * @param hoverable
	 *            the hoverable to set
	 */
	public void setHoverable(Boolean hoverable) {
		this.hoverable = hoverable;
	}

	/**
	 * @param autoHighlight
	 *            the autoHighlight to set
	 */
	public void setAutoHighlight(Boolean autoHighlight) {
		this.autoHighlight = autoHighlight;
	}

	/**
	 * @param mouseActiveRadius
	 *            the mouseActiveRadius to set
	 */
	public void setMouseActiveRadius(Integer mouseActiveRadius) {
		this.mouseActiveRadius = mouseActiveRadius;
	}

	/**
	 * @return the canvasText
	 */
	public CanvasText getCanvasText() {
		return canvasText;
	}

	/**
	 * Used by canvas text plugin
	 * @param canvasText the canvasText to set
	 */
	public void setCanvasText(CanvasText canvasText) {
		this.canvasText = canvasText;
	}
}
