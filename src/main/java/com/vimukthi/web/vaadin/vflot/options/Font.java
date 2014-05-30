/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options;

/**
 * @author Vimukthi
 * 
 */
public class Font {

	private Integer size = null;
	
	private String style;
	
	private String weight;
	
	private String family;
	
	private String variant;

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @return the family
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * @return the variant
	 */
	public String getVariant() {
		return variant;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param style
	 *            the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * @param family
	 *            the family to set
	 */
	public void setFamily(String family) {
		this.family = family;
	}

	/**
	 * @param variant
	 *            the variant to set
	 */
	public void setVariant(String variant) {
		this.variant = variant;
	}
}
