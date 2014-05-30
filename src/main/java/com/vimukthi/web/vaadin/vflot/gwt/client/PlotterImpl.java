/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.gwt.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * @author Vimukthi
 * 
 */
public class PlotterImpl {
	
	/******************************** plot create functions ***********************************/

	/**
	 * 
	 * @param container
	 * @param series
	 * @return
	 */
	public static native Plot create(Element container, String series)
	/*-{
	 	var series = JSON.parse(series);
		return new $wnd.jQuery.plot($wnd.jQuery("#" + container.id), series);
	}-*/;

	/**
	 * 
	 * @param container
	 * @param series
	 * @param options
	 * @return
	 */
	public static native Plot create(Plotter plotter, Element container, String series,
			String options, boolean resize)
	/*-{
	 	var series = JSON.parse(series);
		$wnd['series' + container.id] = series;
		var options = JSON.parse(options);
		$wnd['options' + container.id] = options;		
		@com.vimukthi.web.vaadin.vflot.gwt.client.PlotterImpl::evalOptions(Lcom/google/gwt/core/client/JavaScriptObject;)(options);
		var plot = new $wnd.jQuery.plot($wnd.jQuery("#" + container.id), series,
				options);
				
		// resize the plot width vaadin container size change
		if (resize){
			$wnd.jQuery("#" + container.id).parent().parent().resize(function(e){
				var width = $wnd.jQuery(e.target).width();
				var height = $wnd.jQuery(e.target).height();
				$wnd.jQuery("#" + container.id).width(width);
				$wnd.jQuery("#" + container.id).height(height);
				plot.resize();
				plot.setupGrid();
				plot.draw();
			});
		}		
		return plot;
	}-*/;
	
	/******************************** Flot functions ***********************************/
	
	/**
	 * highlight a data point
	 * @param plot
	 * @param series - zero indexed
	 * @param datapoint - zero indexed
	 */
	public static native void highlight(Plot plot, int series, int datapoint)
	/*-{
	 	plot.highlight(series, datapoint);
	 }-*/;
	
	/**
	 * unhighlight a datapoint
	 * @param plot
	 * @param series
	 * @param datapoint
	 */
	public static native void unhighlight(Plot plot, int series, int datapoint)
	/*-{
 		plot.unhighlight(series, datapoint);
 	}-*/;
	
	/**
	 * unhighlight everything
	 * @param plot
	 */
	public static native void unhighlight(Plot plot)
	/*-{
 		plot.unhighlight();
 	}-*/;
	
	/**
	 * set a new set of data
	 * @param plot
	 * @param series
	 */
	public static native void setData(Plot plot, String series)
	/*-{
		var series = JSON.parse(series);
 		plot.setData(series);
 		plot.resize();
 		plot.setupGrid();
 		plot.draw();
 	}-*/;
	
	/**
	 * Recalculate and set axis scaling, ticks, legend etc.
	 * @param plot
	 */
	public static native void setUpGrid(Plot plot)
	/*-{
 		plot.setUpGrid();
 		plot.draw();
 	}-*/;
	
	/**
	 * Redraw
	 * @param plot
	 */
	public static native void draw(Plot plot)
	/*-{
 		plot.draw();
 	}-*/;
	
	/**
	 * 
	 * @param plot
	 * @return
	 */
	public static native int width(Plot plot)
	/*-{
 		plot.width();
 	}-*/;
	
	/**
	 * 
	 * @param plot
	 * @return
	 */
	public static native int height(Plot plot)
	/*-{
 		plot.height();
 	}-*/;
	
	/******************************** Flot plugin functions ***********************************/
	
	/******************************** Crosshair plugin functions ******************************/
	
	/**
	 * Set the position of the crosshair. Note that this is cleared if
     * the user moves the mouse. "pos" should be on the form { x: xpos,
     * y: ypos } (or x2 and y2 if you're using the secondary axes), which
     * is coincidentally the same format as what you get from a "plothover"
     * event. If "pos" is null, the crosshair is cleared.
	 * @param plot
	 * @param pos
	 * @return
	 */
	public static native void setCrosshair(Plot plot, String pos)
	/*-{
	 	var position = JSON.parse(pos);
 		plot.setCrosshair(position);
 	}-*/;
	
	/**
	 * 
	 * @param plot
	 * @return
	 */
	public static native void clearCrosshair(Plot plot)
	/*-{
 		plot.clearCrosshair();
 	}-*/;
	
	/**
	 * 
	 * @param plot
	 * @param pos
	 * @return
	 */
	public static native void lockCrosshair(Plot plot, String pos)
	/*-{
	 	var position = JSON.parse(pos);
 		plot.lockCrosshair(position);
 	}-*/;
	
	/**
	 * 
	 * @param plot
	 */
	public static native void unlockCrosshair(Plot plot)
	/*-{
 		plot.unlockCrosshair();
 	}-*/;
	
	/******************************** Navigate plugin functions ******************************/
	
	/**
	 * zoom default amount in on the pixel (100, 200) 
  	 * plot.zoom({ center: { left: 10, top: 20 } });
	 * @param plot
	 * @param pos
	 */
	public static native void zoom(Plot plot, String pos)
	/*-{
	 	var position = JSON.parse(pos);
 		plot.zoom(pos);
 	}-*/;
	
	/**
	 * 
	 * @param plot
	 */
	public static native void zoomOut(Plot plot)
	/*-{
 		plot.zoomOut();
 	}-*/;
	
	/**
	 * pan 100 pixels to the left and 20 down
  	 * plot.pan({ left: -100, top: 20 })
	 * @param plot
	 * @param pos
	 */
	public static native void pan(Plot plot, String pos)
	/*-{
 		var position = JSON.parse(pos);
 		plot.pan(pos);
 	}-*/;
	
	/******************************** Event handlers *******************************************/
	
	public static native void addClickListener(Plotter plotter, Element container) /*-{
		$wnd.jQuery("#" + container.id).bind("plotclick", function (event, pos, item) {
			var pos_str = JSON.stringify(pos);
			var item_str = JSON.stringify(item);
			plotter.@com.vimukthi.web.vaadin.vflot.gwt.client.Plotter::onPlotClick(Ljava/lang/String;Ljava/lang/String;)(pos_str, item_str);
		});
	}-*/;
	
	public static native void addHoverListener(Plotter plotter, Element container) /*-{
		$wnd.jQuery("#" + container.id).bind("plothover", function (event, pos, item) {
			var pos_str = JSON.stringify(pos);
			var item_str = JSON.stringify(item);
			plotter.@com.vimukthi.web.vaadin.vflot.gwt.client.Plotter::onPlotHover(Ljava/lang/String;Ljava/lang/String;)(pos_str, item_str);
		});
	}-*/;
	
	public static native void addSelectListener(Plotter plotter, Element container) /*-{
		$wnd.jQuery("#" + container.id).bind("plotselected", function (event, ranges) {
			var ranges_str = JSON.stringify(ranges);
			plotter.@com.vimukthi.web.vaadin.vflot.gwt.client.Plotter::onPlotSelect(Ljava/lang/String;)(ranges_str);
		});
	}-*/;
	
	public static native void removeClickListener(Element container)/*-{
		$wnd.jQuery("#" + container.id).unbind("plotclick");
	}-*/;
	
	public static native void removeHoverListener(Element container)/*-{
		$wnd.jQuery("#" + container.id).unbind("plothover");
	}-*/;
	
	public static native void removeSelectListener(Element container)/*-{
		$wnd.jQuery("#" + container.id).unbind("plotselected");
	}-*/;
	
	public static native void removeAllListeners(Element container)/*-{
		$wnd.jQuery("#" + container.id).unbind();
	}-*/;
	
	/******************************** Start eval type functions ***********************************/

	/**
	 * This will check and evaluate stringified expressions in options json
	 * 
	 * @param options
	 */
	public static native void evalOptions(JavaScriptObject options)
	/*-{
		if (options.yaxes) {
			for (var i = 0; i < options.yaxes.length; i++) {
    			@com.vimukthi.web.vaadin.vflot.gwt.client.PlotterImpl::evalAxisOptions(Lcom/google/gwt/core/client/JavaScriptObject;)(options.yaxes[i]);
			}
		} else if (options.yaxis) {
			@com.vimukthi.web.vaadin.vflot.gwt.client.PlotterImpl::evalAxisOptions(Lcom/google/gwt/core/client/JavaScriptObject;)(options.yaxis);
		}
		if (options.xaxes) {
			for (var i = 0; i < options.xaxes.length; i++) {
    			@com.vimukthi.web.vaadin.vflot.gwt.client.PlotterImpl::evalAxisOptions(Lcom/google/gwt/core/client/JavaScriptObject;)(options.xaxes[i]);
			}
		} else if (options.xaxis) {
			@com.vimukthi.web.vaadin.vflot.gwt.client.PlotterImpl::evalAxisOptions(Lcom/google/gwt/core/client/JavaScriptObject;)(options.xaxis);
		}
		
		if (options.grid){
			@com.vimukthi.web.vaadin.vflot.gwt.client.PlotterImpl::evalGridOptions(Lcom/google/gwt/core/client/JavaScriptObject;)(options.grid);
		}
		
		if (options.legend){
			@com.vimukthi.web.vaadin.vflot.gwt.client.PlotterImpl::evalLegendOptions(Lcom/google/gwt/core/client/JavaScriptObject;)(options.legend);
		}
	}-*/;

	public static native void evalAxisOptions(JavaScriptObject axis)
	/*-{
		if (axis.evalTransform) {
			axis.transform = eval('(' + axis.transform + ')');
		}
		if (axis.evalInverseTransform) {
			axis.inverseTransform = eval('(' + axis.inverseTransform + ')');
		}
		if (axis.evalTicks) {
			axis.ticks = eval('(' + axis.ticks + ')');
		}
		if (axis.evalTickSize) {
			axis.tickSize = eval('(' + axis.tickSize + ')');
		}
		if (axis.evalMinTickSize) {
			axis.minTickSize = eval('(' + axis.minTickSize + ')');
		}
		if (axis.evalTickFormatter) {
			axis.tickFormatter = eval('(' + axis.tickFormatter + ')');
		}
	}-*/;

	public static native void evalGridOptions(JavaScriptObject grid)
	/*-{
		if (grid.evalMarkings) {
			grid.markings = eval('(' + grid.markings + ')');
		}
	}-*/;

	public static native void evalLegendOptions(JavaScriptObject legend)
	/*-{
		if (legend.evalLabelFormatter) {
			legend.labelFormatter = eval('(' + legend.labelFormatter + ')');
		}
		if (legend.evalContainer) {
			legend.container = eval('(' + legend.container + ')');
		}
		if (legend.evalSorted) {
			legend.sorted = eval('(' + legend.sorted + ')');
		}
	}-*/;

	public static native void evalSerieOptions(JavaScriptObject serie)
	/*-{
		if (serie.evalTransform) {
			serie.transform = eval('(' + serie.transform + ')');
		}
	}-*/;
}
