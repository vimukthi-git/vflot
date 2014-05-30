/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vimukthi
 *
 */
public class Colors {
	
	private List<String> colors;

	/**
	 * @param colors
	 */
	public Colors() {
		super();
		this.colors = new ArrayList<String>();
	}
	
	public Colors addColor(String color){
		colors.add(color);
		return this;
	}

	/**
	 * @return the colors
	 */
	public List<String> getColors() {
		return colors;
	}

	/**
	 * @param colors the colors to set
	 */
	public void setColors(List<String> colors) {
		this.colors = colors;
	}

}
