/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins.pie;

/**
 * @author Vimukthi
 * 
 */
public class Background {

	private String color;
	private String opacity;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the opacity
	 */
	public String getOpacity() {
		return opacity;
	}

	/**
	 * any hexidecimal color value (other formats may or
	 *  may not work, so best to stick with something
	 *  like '#000')
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 *  0-1
	 * @param opacity
	 *            the opacity to set
	 */
	public void setOpacity(String opacity) {
		this.opacity = opacity;
	}
}
