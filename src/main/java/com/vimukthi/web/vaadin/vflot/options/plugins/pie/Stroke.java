/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins.pie;

/**
 * @author Vimukthi
 * 
 */
public class Stroke {

	private String color;
	private Integer width;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * any hexidecimal color value (other formats may or
	 * may not work, so best to stick with something
	 * like '#FFF')
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * integer pixel width of the stroke
	 * @param width
	 *            the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
}
