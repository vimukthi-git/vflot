/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins.pie;

/**
 * @author Vimukthi
 * 
 */
public class Label {

	private Boolean show;
	private String formatter;
	private Float radius;
	private Background background;
	private String threshold;

	/**
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}

	/**
	 * @return the formatter
	 */
	public String getFormatter() {
		return formatter;
	}

	/**
	 * @return the radius
	 */
	public Float getRadius() {
		return radius;
	}

	/**
	 * @return the background
	 */
	public Background getBackground() {
		return background;
	}

	/**
	 * @return the threshold
	 */
	public String getThreshold() {
		return threshold;
	}

	/**
	 * true/false, or 'auto'
	 * 
	 * @param show
	 *            the show to set
	 */
	public void setShow(Boolean show) {
		this.show = show;
	}

	/**
	 * a user-defined function that modifies the text/style of the label text
	 * 
	 * @param formatter
	 *            the formatter to set
	 */
	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}

	/**
	 * 0-1 for percentage of fullsize, or a specified pixel length
	 * 
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(Float radius) {
		this.radius = radius;
	}

	/**
	 * @param background
	 *            the background to set
	 */
	public void setBackground(Background background) {
		this.background = background;
	}

	/**
	 * 0-1 for the percentage value at which to hide labels (if they're too
	 * small)
	 * 
	 * @param threshold
	 *            the threshold to set
	 */
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
}
