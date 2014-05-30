/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.series;

/**
 * @author Vimukthi
 *
 */
public class Bars extends SerieObjectBase {
	
	private Float barWidth = null;
	
    private String align;
    
    private Boolean horizontal;

	/**
	 * @return the barWidth
	 */
	public Float getBarWidth() {
		return barWidth;
	}

	/**
	 * @return the align
	 */
	public String getAlign() {
		return align;
	}

	/**
	 * @return the horizontal
	 */
	public Boolean getHorizontal() {
		return horizontal;
	}

	/**
	 * number
	 * @param barWidth the barWidth to set
	 */
	public void setBarWidth(Float barWidth) {
		this.barWidth = barWidth;
	}

	/**
	 *  "left", "right" or "center"
	 * @param align the align to set
	 */
	public void setAlign(String align) {
		this.align = align;
	}

	/**
	 * @param horizontal the horizontal to set
	 */
	public void setHorizontal(Boolean horizontal) {
		this.horizontal = horizontal;
	}
}
