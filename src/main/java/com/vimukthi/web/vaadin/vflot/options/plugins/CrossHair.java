/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins;

/**
 * @author Vimukthi
 * 
 */
public class CrossHair {
	
	private String mode;
	private String color;
	private Integer lineWidth = null;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the lineWidth
	 */
	public Integer getLineWidth() {
		return lineWidth;
	}

	/**
	 * null or "x" or "y" or "xy"
	 * 
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param lineWidth
	 *            the lineWidth to set
	 */
	public void setLineWidth(Integer lineWidth) {
		this.lineWidth = lineWidth;
	}
}
