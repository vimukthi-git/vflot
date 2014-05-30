/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.series;

/**
 * @author Vimukthi
 *
 */
public class Points extends SerieObjectBase {
	
	private Integer radius = null;
	
    private String symbol;

	/**
	 * @return the radius
	 */
	public Integer getRadius() {
		return radius;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * number
	 * @param radius the radius to set
	 */
	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	/**
	 * "circle", "square", "diamond", "triangle" or "cross"
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
