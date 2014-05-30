/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins.pie;

/**
 * @author Vimukthi
 * 
 */
public class Combine {

	private String threshold;
	private String color;
	private String label;

	/**
	 * @return the threshold
	 */
	public String getThreshold() {
		return threshold;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * 0-1 for the percentage value at which to
	 * combine slices (if they're too small)
	 * @param threshold
	 *            the threshold to set
	 */
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}

	/**
	 * any hexidecimal color value (other formats may or
	 * may not work, so best to stick with something
	 * like '#CCC'), if null, the plugin will
	 * automatically use the color of the first slice to
	 * be combined
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * any text value of what the combined slice should
	 * be labeled
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
}
