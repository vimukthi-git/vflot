/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.series;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Vimukthi
 *
 */
public class ChartSerie implements Serie {
	
	private String id;
	
	private String fillBetween;
	
	private String label;
	
	private String color;
	
	private Lines lines;
	
	private Points points;
	
	private Bars bars;
	
	private Boolean clickable;
	
	private Boolean hoverable;
	
	private Integer shadowsize = null;
	
	private String highlightColor;
	
	private Integer xaxis = 1;
	
	private Integer yaxis = 1;
	
	private List<Object[]> data;
	
	private String stack;
	
	/**
	 * @param label
	 */
	public ChartSerie(String label) {
		super();
		this.label = label;
		this.data = new ArrayList<Object[]>();
	}

	/**
	 * @return the data
	 */
	public List<Object[]> getData() {
		return data;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void addDataPoint(Object x, Object y){
		Object[] xy = new Object[]{x, y};
		data.add(xy);
	}
	
	public void addPieData(String value){
		String[] valueArr = new String[]{value};
		data.add(valueArr);
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the clickable
	 */
	public Boolean getClickable() {
		return clickable;
	}

	/**
	 * Set this on options first to activate
	 * @param clickable the clickable to set
	 */
	public void setClickable(Boolean clickable) {
		this.clickable = clickable;
	}

	/**
	 * @return the shadowsize
	 */
	public int getShadowsize() {
		return shadowsize;
	}

	/**
	 * @param shadowsize the shadowsize to set
	 */
	public void setShadowsize(int shadowsize) {
		this.shadowsize = shadowsize;
	}

	/**
	 * @return the hoverable
	 */
	public Boolean getHoverable() {
		return hoverable;
	}

	/**
	 * Set this on options first to activate
	 * @param hoverable the hoverable to set
	 */
	public void setHoverable(Boolean hoverable) {
		this.hoverable = hoverable;
	}

	/**
	 * @return the highlightColor
	 */
	public String getHighlightColor() {
		return highlightColor;
	}

	/**
	 * color or number
	 * @param highlightColor the highlightColor to set
	 */
	public void setHighlightColor(String highlightColor) {
		this.highlightColor = highlightColor;
	}

	/**
	 * @return the xaxis
	 */
	public int getXaxis() {
		return xaxis;
	}

	/**
	 * @param xaxis the xaxis to set
	 */
	public void setXaxis(int xaxis) {
		this.xaxis = xaxis;
	}

	/**
	 * @return the yaxis
	 */
	public int getYaxis() {
		return yaxis;
	}

	/**
	 * @param yaxis the yaxis to set
	 */
	public void setYaxis(int yaxis) {
		this.yaxis = yaxis;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the lines
	 */
	public SerieObjectBase getLines() {
		return lines;
	}

	/**
	 * specific lines options
	 * @param lines the lines to set
	 */
	public void setLines(Lines lines) {
		this.lines = lines;
	}

	/**
	 * @return the points
	 */
	public Points getPoints() {
		return points;
	}

	/**
	 * specific points options
	 * @param points the points to set
	 */
	public void setPoints(Points points) {
		this.points = points;
	}

	/**
	 * @return the bars
	 */
	public Bars getBars() {
		return bars;
	}

	/**
	 * specific bars options
	 * @param bars the bars to set
	 */
	public void setBars(Bars bars) {
		this.bars = bars;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Used with fillBetween plugin
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the fillBetween
	 */
	public String getFillBetween() {
		return fillBetween;
	}

	/**
	 * give the id of the other series to fill between
	 * @param fillBetween the fillBetween to set
	 */
	public void setFillBetween(String fillBetween) {
		this.fillBetween = fillBetween;
	}

	/**
	 * @return the stack
	 */
	public String getStack() {
		return stack;
	}

	/**
	 * Used by stack plugin.
	 * Two or more series are stacked when their "stack" attribute is set to 
	 * the same key (which can be any number or string or just "true")
	 * @param stack the stack to set
	 */
	public void setStack(String stack) {
		this.stack = stack;
	}

}
