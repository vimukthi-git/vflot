/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options;

import com.vimukthi.web.vaadin.vflot.exceptions.FlotLegendException;

/**
 * @author Vimukthi
 *
 */
public class Legend {
	
	private Boolean show = true;
	
	private String labelFormatter;
	
	private Boolean evalLabelFormatter = false;
	
	private String labelBoxBorderColor;
	
	private Integer noColumns = null;
	
	private String position;
	
	private String[] margins = new String[]{"0px", "0px"};
	
	private String backgroundColor;
	
	private Double backgroundOpacity = null;
	
	private String container;
	
	private Boolean evalContainer = false;
	
	private String sorted;
	
	private Boolean evalSorted = false;
	
	

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
	 * @return the labelFormatter
	 */
	public String getLabelFormatter() {
		return labelFormatter;
	}

	/**
	 * null or (javascript function: string, series object -> string)
	 * @param labelFormatter the labelFormatter to set
	 */
	public void setLabelFormatter(String labelFormatter) {
		this.evalLabelFormatter = true;
		this.labelFormatter = labelFormatter;
	}

	/**
	 * @return the labelBoxBorderColor
	 */
	public String getLabelBoxBorderColor() {
		return labelBoxBorderColor;
	}

	/**
	 * color
	 * @param labelBoxBorderColor the labelBoxBorderColor to set
	 */
	public void setLabelBoxBorderColor(String labelBoxBorderColor) {
		this.labelBoxBorderColor = labelBoxBorderColor;
	}

	/**
	 * @return the noColumns
	 */
	public int getNoColumns() {
		return noColumns;
	}

	/**
	 * @param noColumns the noColumns to set
	 */
	public void setNoColumns(int noColumns) {
		this.noColumns = noColumns;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * "ne" or "nw" or "se" or "sw"
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the margin
	 */
	public String[] getMargins() {
		return margins;
	}

	/**
	 * [x margin, y margin]
	 * @param margin the margin to set
	 */
	public void setMargins(String[] margins) {
		this.margins = margins;
	}

	/**
	 * @return the backgroundColor
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @param backgroundColor the backgroundColor to set
	 */
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @return the container
	 */
	public String getContainer() {
		return container;
	}

	/**
	 * null or jQuery object/DOM element/jQuery expression
	 * @param container the container to set
	 */
	public void setContainer(String container) {
		this.evalContainer = true;
		this.container = container;
	}

	/**
	 * @return the sorted
	 */
	public String getSorted() {
		return sorted;
	}

	/**
	 * null/false, true, "ascending", "descending" or a comparator
	 * </br>eg:-</br>
	 * sorted: function(a, b) { </br>
     * 	// sort alphabetically in ascending order</br>
     * 	return a.label == b.label ? 0 : (</br>
     *   	a.label > b.label ? 1 : -1</br>
     *	)</br>
	 * }</br>
	 * 
	 * @param sorted the sorted to set
	 */
	public void setSorted(String sorted) {
		if (!sorted.equals("ascending") || !sorted.equals("descending")){
			this.evalSorted = true;
		}		
		this.sorted = sorted;
	}

	/**
	 * @return the backgroundOpacity
	 */
	public double getBackgroundOpacity() {
		return backgroundOpacity;
	}

	/**
	 * Background opacity must be a value between [0,1]
	 * @param backgroundOpacity the backgroundOpacity to set
	 * @throws FlotLegendException 
	 */
	public void setBackgroundOpacity(double backgroundOpacity) throws FlotLegendException {
		if (backgroundOpacity < 0 || backgroundOpacity > 1)
			throw new FlotLegendException("Background opacity must be a value between [0,1]");
		this.backgroundOpacity = backgroundOpacity;
	}
}
