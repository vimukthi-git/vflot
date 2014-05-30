/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.series;


/**
 * @author Vimukthi
 *
 */
public class PieSerie implements Serie {
	
	private String label;
	
	private String color;
	
	private Boolean clickable;
	
	private Boolean hoverable;
	
	private Integer shadowsize = null;
	
	private String highlightColor;
	
	private Integer data;	
	
	/**
	 * @param label
	 */
	public PieSerie(String label) {
		super();
		this.label = label;
	}

	/**
	 * @return the data
	 */
	public Integer getData() {
		return data;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void addData(Integer value){
		data = value;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the clickable
	 */
	public Boolean getClickable() {
		return clickable;
	}

	/**
	 * Set this on options first to activate
	 * @param clickable the clickable to set
	 */
	public void setClickable(Boolean clickable) {
		this.clickable = clickable;
	}

	/**
	 * @return the shadowsize
	 */
	public int getShadowsize() {
		return shadowsize;
	}

	/**
	 * @param shadowsize the shadowsize to set
	 */
	public void setShadowsize(int shadowsize) {
		this.shadowsize = shadowsize;
	}

	/**
	 * @return the hoverable
	 */
	public Boolean getHoverable() {
		return hoverable;
	}

	/**
	 * Set this on options first to activate
	 * @param hoverable the hoverable to set
	 */
	public void setHoverable(Boolean hoverable) {
		this.hoverable = hoverable;
	}

	/**
	 * @return the highlightColor
	 */
	public String getHighlightColor() {
		return highlightColor;
	}

	/**
	 * color or number
	 * @param highlightColor the highlightColor to set
	 */
	public void setHighlightColor(String highlightColor) {
		this.highlightColor = highlightColor;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
}
