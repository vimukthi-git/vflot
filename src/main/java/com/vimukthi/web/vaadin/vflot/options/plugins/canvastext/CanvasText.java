/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins.canvastext;

/**
 * @author Vimukthi
 * 
 */
public class CanvasText {

	private Boolean show;
	private String font; 
	private LineBreaks lineBreaks;

	/**
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}

	/**
	 * @return the font
	 */
	public String getFont() {
		return font;
	}

	/**
	 * @return the lineBreaks
	 */
	public LineBreaks getLineBreaks() {
		return lineBreaks;
	}

	/**
	 * @param show
	 *            the show to set
	 */
	public void setShow(Boolean show) {
		this.show = show;
	}

	/**
	 * "sans 8px",
	 * @param font
	 *            the font to set
	 */
	public void setFont(String font) {
		this.font = font;
	}

	/**
	 * @param lineBreaks
	 *            the lineBreaks to set
	 */
	public void setLineBreaks(LineBreaks lineBreaks) {
		this.lineBreaks = lineBreaks;
	}

}
