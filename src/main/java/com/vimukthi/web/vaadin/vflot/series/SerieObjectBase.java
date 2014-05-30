/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.series;

/**
 * @author Vimukthi
 *
 */
public class SerieObjectBase {
	
	private Boolean show = true;
	
	private Integer lineWidth = null;
	
    private String fill;
    
    private String fillColor; 

	/**
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}

	/**
	 * @param show the show to set
	 */
	public void setShow(Boolean show) {
		this.show = show;
	}

	/**
	 * @return the lineWidth
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * @param lineWidth the lineWidth to set
	 */
	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * @return the fill
	 */
	public String getFill() {
		return fill;
	}

	/**
	 * boolean or number
	 * @param fill the fill to set
	 */
	public void setFill(String fill) {
		this.fill = fill;
	}

	/**
	 * @return the fillColor
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * null or color/gradient
	 * Eg:- rgba(255, 255, 255, 0.8)
	 * @param fillColor the fillColor to set
	 */
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

}
