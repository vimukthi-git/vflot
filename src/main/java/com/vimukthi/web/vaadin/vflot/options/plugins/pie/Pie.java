/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins.pie;

/**
 * @author Vimukthi
 * 
 */
public class Pie {

	private Boolean show;
	private Float radius;
	private String innerRadius;
	private String startAngle;
	private String tilt;
	private OffSet offset;
	private Stroke stroke;
	private Label label;
	private Combine combine;
	private Highlight highlight;

	/**
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}

	/**
	 * @return the radius
	 */
	public Float getRadius() {
		return radius;
	}

	/**
	 * @return the innerRadius
	 */
	public String getInnerRadius() {
		return innerRadius;
	}

	/**
	 * @return the startAngle
	 */
	public String getStartAngle() {
		return startAngle;
	}

	/**
	 * @return the tilt
	 */
	public String getTilt() {
		return tilt;
	}

	/**
	 * @return the offset
	 */
	public OffSet getOffset() {
		return offset;
	}

	/**
	 * @return the stroke
	 */
	public Stroke getStroke() {
		return stroke;
	}

	/**
	 * @return the label
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * @return the combine
	 */
	public Combine getCombine() {
		return combine;
	}

	/**
	 * @return the highlight
	 */
	public Highlight getHighlight() {
		return highlight;
	}

	/**
	 * @param show
	 *            the show to set
	 */
	public void setShow(Boolean show) {
		this.show = show;
	}

	/**
	 * 0-1 for percentage of fullsize, or a specified pixel length, or 'auto'
	 * 
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(Float radius) {
		this.radius = radius;
	}

	/**
	 * 0-1 for percentage of fullsize or a specified pixel length, for creating
	 * a donut effect
	 * 
	 * @param innerRadius
	 *            the innerRadius to set
	 */
	public void setInnerRadius(String innerRadius) {
		this.innerRadius = innerRadius;
	}

	/**
	 * 0-2 factor of PI used for starting angle (in radians) i.e 3/2 starts at
	 * the top, 0 and 2 have the same result
	 * 
	 * @param startAngle
	 *            the startAngle to set
	 */
	public void setStartAngle(String startAngle) {
		this.startAngle = startAngle;
	}

	/**
	 * 0-1 for percentage to tilt the pie, where 1 is no tilt, and 0 is
	 * completely flat (nothing will show)
	 * 
	 * @param tilt
	 *            the tilt to set
	 */
	public void setTilt(String tilt) {
		this.tilt = tilt;
	}

	/**
	 * @param offset
	 *            the offset to set
	 */
	public void setOffset(OffSet offset) {
		this.offset = offset;
	}

	/**
	 * @param stroke
	 *            the stroke to set
	 */
	public void setStroke(Stroke stroke) {
		this.stroke = stroke;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(Label label) {
		this.label = label;
	}

	/**
	 * @param combine
	 *            the combine to set
	 */
	public void setCombine(Combine combine) {
		this.combine = combine;
	}

	/**
	 * @param highlight
	 *            the highlight to set
	 */
	public void setHighlight(Highlight highlight) {
		this.highlight = highlight;
	}
}
