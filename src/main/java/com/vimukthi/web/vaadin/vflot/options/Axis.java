/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options;

/**
 * @author Vimukthi
 * 
 */
public class Axis {

	private Boolean show = true;

	private String position;

	private String mode;

	private String timezone;

	private String color;

	private String tickColor;

	private Font font;

	private Integer min = null;

	private Integer max = null;

	private Integer autoscaleMargin = null;

	private String transform;

	private String inverseTransform;

	private String ticks;

	private String tickSize;

	private String minTickSize;
	
	private Boolean evalTransform = false;

	private Boolean evalInverseTransform = false;

	private Boolean evalTicks = false;

	private Boolean evalTickSize = false;

	private Boolean evalMinTickSize = false;

	private String timeformat;

	private String[] monthNames;

	private String[] dayNames;

	private Boolean twelveHourClock;

	private String tickFormatter;
	
	private Boolean evalTickFormatter = false;

	private String tickDecimals;

	private Integer labelWidth = null;

	private Integer labelHeight = null;

	private Boolean reserveSpace;

	private Integer tickLength = null;

	private Integer alignTicksWithAxis = null;
	
	private String[] zoomRange;
	
	private String[] panRange;
	
	private String axisLabel;
	
	private Integer axisLabelPadding;
	
	private Boolean axisLabelUseCanvas;
	
	private Boolean axisLabelUseHtml;	
	
	private Integer axisLabelFontSizePixels;
	
	private String axisLabelFontFamily;
	

	/**
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the tickColor
	 */
	public String getTickColor() {
		return tickColor;
	}

	/**
	 * @return the font
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @return the autoscaleMargin
	 */
	public int getAutoscaleMargin() {
		return autoscaleMargin;
	}

	/**
	 * @return the transform
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * @return the inverseTransform
	 */
	public String getInverseTransform() {
		return inverseTransform;
	}

	/**
	 * @return the ticks
	 */
	public String getTicks() {
		return ticks;
	}

	/**
	 * @return the tickSize
	 */
	public String getTickSize() {
		return tickSize;
	}

	/**
	 * @return the minTickSize
	 */
	public String getMinTickSize() {
		return minTickSize;
	}

	/**
	 * @return the tickFormatter
	 */
	public String getTickFormatter() {
		return tickFormatter;
	}

	/**
	 * @return the tickDecimals
	 */
	public String getTickDecimals() {
		return tickDecimals;
	}

	/**
	 * @return the labelWidth
	 */
	public int getLabelWidth() {
		return labelWidth;
	}

	/**
	 * @return the labelHeight
	 */
	public int getLabelHeight() {
		return labelHeight;
	}

	/**
	 * @return the reserveSpace
	 */
	public Boolean getReserveSpace() {
		return reserveSpace;
	}

	/**
	 * @return the tickLength
	 */
	public int getTickLength() {
		return tickLength;
	}

	/**
	 * @return the alignTicksWithAxis
	 */
	public int getAlignTicksWithAxis() {
		return alignTicksWithAxis;
	}

	/**
	 * null or true/false
	 * 
	 * @param show
	 *            the show to set
	 */
	public void setShow(Boolean show) {
		this.show = show;
	}

	/**
	 * "bottom" or "top" or "left" or "right"
	 * 
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * null or "time" ("time" requires jquery.flot.time.js plugin)
	 * 
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * null, "browser" or timezone (only makes sense for mode: "time")
	 * 
	 * @param timezone
	 *            the timezone to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * null or color spec
	 * 
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * null or color spec
	 * 
	 * @param tickColor
	 *            the tickColor to set
	 */
	public void setTickColor(String tickColor) {
		this.tickColor = tickColor;
	}

	/**
	 * null or font spec String
	 * 
	 * @param font
	 *            the font to set
	 */
	public void setFont(Font font) {
		this.font = font;
	}

	/**
	 * @param min
	 *            the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @param max
	 *            the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * @param autoscaleMargin
	 *            the autoscaleMargin to set
	 */
	public void setAutoscaleMargin(int autoscaleMargin) {
		this.autoscaleMargin = autoscaleMargin;
	}

	/**
	 * null or fn: number -> number Eg:- function (v) { return Math.log(v); },
	 * 
	 * @param transform
	 *            the transform to set
	 */
	public void setTransform(String transform) {
		this.evalTransform = true;
		this.transform = transform;
	}

	/**
	 * null or fn: number -> number Eg:- function (v) { return Math.log(v); },
	 * 
	 * @param inverseTransform
	 *            the inverseTransform to set
	 */
	public void setInverseTransform(String inverseTransform) {
		this.evalInverseTransform = true;
		this.inverseTransform = inverseTransform;
	}

	/**
	 * null or number or ticks array or (fn: axis -> ticks array)\ <br/>
	 * Eg:-<br/>
	 * function piTickGenerator(axis) {<br/>
	 * var res = [], i = Math.floor(axis.min / Math.PI);<br/>
	 * do {<br/>
	 * var v = i * Math.PI;<br/>
	 * res.push([v, i + "\u03c0"]);<br/>
	 * ++i;<br/>
	 * } while (v < axis.max);<br/>
	 * return res;<br/>
	 * }<br/>
	 * 
	 * @param ticks
	 *            the ticks to set
	 */
	public void setTicks(String ticks) {
		this.evalTicks = true;
		this.ticks = ticks;
	}

	/**
	 * number or array
	 * 
	 * @param tickSize
	 *            the tickSize to set
	 */
	public void setTickSize(String tickSize) {
		this.evalTickSize = true;
		this.tickSize = tickSize;
	}

	/**
	 * number or array
	 * 
	 * @param minTickSize
	 *            the minTickSize to set
	 */
	public void setMinTickSize(String minTickSize) {
		this.evalMinTickSize = true;
		this.minTickSize = minTickSize;
	}

	/**
	 * (fn: number, String -> string) <br/>
	 * eg:-<br/>
	 * function suffixFormatter(val, axis) {<br/>
	 * if (val > 1000000)<br/>
	 * return (val / 1000000).toFixed(axis.tickDecimals) + " MB";<br/>
	 * else if (val > 1000)<br/>
	 * return (val / 1000).toFixed(axis.tickDecimals) + " kB";<br/>
	 * else<br/>
	 * return val.toFixed(axis.tickDecimals) + " B";<br/>
	 * }<br/>
	 * 
	 * @param tickFormatter
	 *            the tickFormatter to set
	 */
	public void setTickFormatter(String tickFormatter) {
		this.evalTickFormatter = true;
		this.tickFormatter = tickFormatter;
	}

	/**
	 * the number of decimals to display (default is auto-detected)
	 * @param tickDecimals
	 *            the tickDecimals to set
	 */
	public void setTickDecimals(String tickDecimals) {
		this.tickDecimals = tickDecimals;
	}

	/**
	 * @param labelWidth
	 *            the labelWidth to set
	 */
	public void setLabelWidth(int labelWidth) {
		this.labelWidth = labelWidth;
	}

	/**
	 * @param labelHeight
	 *            the labelHeight to set
	 */
	public void setLabelHeight(int labelHeight) {
		this.labelHeight = labelHeight;
	}

	/**
	 * @param reserveSpace
	 *            the reserveSpace to set
	 */
	public void setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
	}

	/**
	 * @param tickLength
	 *            the tickLength to set
	 */
	public void setTickLength(int tickLength) {
		this.tickLength = tickLength;
	}

	/**
	 * @param alignTicksWithAxis
	 *            the alignTicksWithAxis to set
	 */
	public void setAlignTicksWithAxis(int alignTicksWithAxis) {
		this.alignTicksWithAxis = alignTicksWithAxis;
	}

	/**
	 * @return the timeformat
	 */
	public String getTimeformat() {
		return timeformat;
	}

	/**
	 * null or format string <br/>
	 * Eg:- "%Y/%m/%d"<br/>
	 * %a: weekday name (customizable)<br/>
	 * %b: month name (customizable)<br/>
	 * %d: day of month, zero-padded (01-31)<br/>
	 * %e: day of month, space-padded ( 1-31)<br/>
	 * %H: hours, 24-hour time, zero-padded (00-23)<br/>
	 * %I: hours, 12-hour time, zero-padded (01-12)<br/>
	 * %m: month, zero-padded (01-12)<br/>
	 * %M: minutes, zero-padded (00-59)<br/>
	 * %S: seconds, zero-padded (00-59)<br/>
	 * %y: year (two digits)<br/>
	 * %Y: year (four digits)<br/>
	 * %p: am/pm<br/>
	 * %P: AM/PM (uppercase version of %p)<br/>
	 * %w: weekday as number (0-6, 0 being Sunday)<br/>
	 * 
	 * @param timeformat
	 *            the timeformat to set
	 */
	public void setTimeformat(String timeformat) {
		this.timeformat = timeformat;
	}

	/**
	 * @return the monthNames
	 */
	public String[] getMonthNames() {
		return monthNames;
	}

	/**
	 * null or array of size 12 of strings
	 * 
	 * @param monthNames
	 *            the monthNames to set
	 */
	public void setMonthNames(String[] monthNames) {
		this.monthNames = monthNames;
	}

	/**
	 * @return the dayNames
	 */
	public String[] getDayNames() {
		return dayNames;
	}

	/**
	 * null or array of size 7 of strings
	 * 
	 * @param dayNames
	 *            the dayNames to set
	 */
	public void setDayNames(String[] dayNames) {
		this.dayNames = dayNames;
	}

	/**
	 * @return the twelveHourClock
	 */
	public Boolean getTwelveHourClock() {
		return twelveHourClock;
	}

	/**
	 * @param twelveHourClock
	 *            the twelveHourClock to set
	 */
	public void setTwelveHourClock(Boolean twelveHourClock) {
		this.twelveHourClock = twelveHourClock;
	}

	/**
	 * @return the zoomRange
	 */
	public String[] getZoomRange() {
		return zoomRange;
	}

	/**
	 * [number, number] (min, max)
	 * @param zoomRange the zoomRange to set
	 */
	public void setZoomRange(String[] zoomRange) {
		this.zoomRange = zoomRange;
	}

	/**
	 * @return the panRange
	 */
	public String[] getPanRange() {
		return panRange;
	}

	/**
	 * [number, number] (min, max)
	 * @param panRange the panRange to set
	 */
	public void setPanRange(String[] panRange) {
		this.panRange = panRange;
	}

	/**
	 * @return the axisLabel
	 */
	public String getAxisLabel() {
		return axisLabel;
	}

	/**
	 * the text you want displayed as the label
	 * @param axisLabel the axisLabel to set
	 */
	public void setAxisLabel(String axisLabel) {
		this.axisLabel = axisLabel;
	}

	/**
	 * @return the axisLabelPadding
	 */
	public Integer getAxisLabelPadding() {
		return axisLabelPadding;
	}

	/**
	 * padding, in pixels, between the tick labels and the axis label (default: 2)
	 * @param axisLabelPadding the axisLabelPadding to set
	 */
	public void setAxisLabelPadding(Integer axisLabelPadding) {
		this.axisLabelPadding = axisLabelPadding;
	}

	/**
	 * @return the axisLabelUseCanvas
	 */
	public Boolean getAxisLabelUseCanvas() {
		return axisLabelUseCanvas;
	}

	/**
	 * @param axisLabelUseCanvas the axisLabelUseCanvas to set
	 */
	public void setAxisLabelUseCanvas(Boolean axisLabelUseCanvas) {
		this.axisLabelUseCanvas = axisLabelUseCanvas;
	}

	/**
	 * @return the axisLabelUseHtml
	 */
	public Boolean getAxisLabelUseHtml() {
		return axisLabelUseHtml;
	}

	/**
	 * @param axisLabelUseHtml the axisLabelUseHtml to set
	 */
	public void setAxisLabelUseHtml(Boolean axisLabelUseHtml) {
		this.axisLabelUseHtml = axisLabelUseHtml;
	}

	/**
	 * @return the axisLabelFontSizePixels
	 */
	public Integer getAxisLabelFontSizePixels() {
		return axisLabelFontSizePixels;
	}

	/**
	 *  the size, in pixels, of the font (default: 14)
	 * @param axisLabelFontSizePixels the axisLabelFontSizePixels to set
	 */
	public void setAxisLabelFontSizePixels(Integer axisLabelFontSizePixels) {
		this.axisLabelFontSizePixels = axisLabelFontSizePixels;
	}

	/**
	 * @return the axisLabelFontFamily
	 */
	public String getAxisLabelFontFamily() {
		return axisLabelFontFamily;
	}

	/**
	 * the font family of the font (default: sans-serif)
	 * @param axisLabelFontFamily the axisLabelFontFamily to set
	 */
	public void setAxisLabelFontFamily(String axisLabelFontFamily) {
		this.axisLabelFontFamily = axisLabelFontFamily;
	}
}
