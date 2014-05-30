/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options;

/**
 * @author Vimukthi
 *
 */
public class Width {
	
	private Integer top = null;
	
	private Integer left = null;
	
	private Integer bottom = null;
	
	private Integer right = null;
	
	

	/**
	 * @param top
	 * @param left
	 * @param bottom
	 * @param right
	 */
	public Width(Integer top, Integer left, Integer bottom, Integer right) {
		super();
		this.top = top;
		this.left = left;
		this.bottom = bottom;
		this.right = right;
	}
	
	/**
	 * Set equal margin for all four sides
	 * @param equalMargin
	 */
	public Width(Integer equalMargin) {
		super();
		this.top = equalMargin;
		this.left = equalMargin;
		this.bottom = equalMargin;
		this.right = equalMargin;
	}

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
	 * @return the bottom
	 */
	public Integer getBottom() {
		return bottom;
	}

	/**
	 * @return the right
	 */
	public Integer getRight() {
		return right;
	}

	/**
	 * top margin in pixels
	 * @param top the top to set
	 */
	public void setTop(Integer top) {
		this.top = top;
	}

	/**
	 * left margin in pixels
	 * @param left the left to set
	 */
	public void setLeft(Integer left) {
		this.left = left;
	}

	/**
	 * bottom margin in pixels
	 * @param bottom the bottom to set
	 */
	public void setBottom(Integer bottom) {
		this.bottom = bottom;
	}

	/**
	 * right margin in pixels
	 * @param right the right to set
	 */
	public void setRight(Integer right) {
		this.right = right;
	}
}
