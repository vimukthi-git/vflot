/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins.pie;

/**
 * @author Vimukthi
 * 
 */
public class OffSet {

	private Integer top;
	private Integer left;

	/**
	 * @return the top
	 */
	public Integer getTop() {
		return top;
	}

	/**
	 * @return the left
	 */
	public Integer getLeft() {
		return left;
	}

	/**
	 * integer value to move the pie up or down
	 * @param top
	 *            the top to set
	 */
	public void setTop(Integer top) {
		this.top = top;
	}

	/**
	 * integer value to move the pie left or right, or 'auto'
	 * @param left
	 *            the left to set
	 */
	public void setLeft(Integer left) {
		this.left = left;
	}
}
