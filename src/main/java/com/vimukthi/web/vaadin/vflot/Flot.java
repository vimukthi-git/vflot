package com.vimukthi.web.vaadin.vflot;


import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.vimukthi.web.vaadin.vflot.gwt.client.UIDL_ATTR_DEFS;
import com.vimukthi.web.vaadin.vflot.gwt.client.VFlot;
import com.vimukthi.web.vaadin.vflot.options.Options;
import com.vimukthi.web.vaadin.vflot.series.Serie;

import com.vaadin.terminal.PaintException;
import com.vaadin.terminal.PaintTarget;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.ClientWidget;

/**
 * @author Vimukthi
 * Server side component for the VMyComponent widget.
 */
@ClientWidget(VFlot.class)
public class Flot extends AbstractComponent {
	
	public interface PlotClickListener {
		public void onClick(String pos, String item);
	}
	
	public interface PlotHoverListener {
		public void onHover(String pos, String item);
	}
	
	public interface PlotSelectListener {
		public void onSelect(String ranges);
	}
	
	private PlotClickListener plotClickListener;
	
	private PlotHoverListener plotHoverListener;
	
	private PlotSelectListener plotSelectListener;
	
	protected List<Serie> series;
	
	protected Options options;
	
	protected String plotStyle = "height:200px;width:400px;";

	protected Gson gson = new Gson();

	protected boolean resize = true;	
	
	protected boolean init = true;

	protected boolean highlight = false;

	protected int[] highlightDataPoint;

	protected boolean unhighlight = false;

	protected int[] unhighlightDataPoint;

	protected boolean unhighlightall = false;

	protected boolean updateseries = false;

	protected boolean setupgrid = false;

	protected boolean redraw = false;

	protected boolean setcrosshairpos = false;

	protected String crosshairpos;

	protected boolean clearcrosshair = false;

	protected boolean setlockcrosshair = false;

	protected String crosshairlockpos;

	protected boolean setunlockcrosshair = false;

	protected boolean setzoom = false;

	protected String zoompos;

	protected boolean setzoomout = false;

	protected boolean setpan = false;

	protected String panpos;

	private boolean clicklistener = false;

	private boolean hoverlistener = false;

	private boolean removeclicklistener = false;

	private boolean removehoverlistener = false;

	private boolean selectlistener = false;

	private boolean removeselectlistener = false;
	
	@Override
	public void setSizeFull(){
		// this is to make this function have no affect on layout
	}

    @Override
    public void paintContent(PaintTarget target) throws PaintException {
        super.paintContent(target);
        // create chart for the first time
        init(target);
        
        // check and execute function calls
        if (highlight){
        	clientHighlight(target);
        }
        if (unhighlight){
        	clientUnHighlight(target);
        }
        if (unhighlightall){
        	clientUnHighlightAll(target);
        }
        if (updateseries){
        	clientUpdateSeries(target);
        }
        if (setupgrid){
        	clientSetupGrid(target);
        }
        if (redraw){
        	clientRedraw(target);
        }
        if (setcrosshairpos){
        	clientSetCrossHairpos(target);
        }
        if (clearcrosshair){
        	clientClearCrosshair(target);
        }
        if (setlockcrosshair){
        	clientSetlockCrosshair(target);
        }
        if (setunlockcrosshair){
        	clientSetunlockCrosshair(target);
        }
        if (setzoom){
        	clientSetZoom(target);
        }
        if (setzoomout){
        	clientSetZoomout(target);
        }
        if (setpan){
        	clientSetPan(target);
        }
        if (clicklistener){
        	clientAddClickListener(target);
        }
        if (hoverlistener){
        	clientAddHoverListener(target);
        }
        if (selectlistener){
        	clientAddSelectListener(target);
        }
        if (removeclicklistener){
        	clientRemoveClickListener(target);
        }
        if (removehoverlistener){
        	clientRemoveHoverListener(target);
        }
        if (removeselectlistener){
        	clientRemoveSelectListener(target);
        }              
    }
    
    protected void clientRemoveSelectListener(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.REMOVESELECTLISTENER_CALL, true);
		removeselectlistener = false;
	}
    
    protected void clientRemoveHoverListener(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.REMOVEHOVERLISTENER_CALL, true);
		removehoverlistener = false;
	}
    
    protected void clientRemoveClickListener(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.REMOVECLICKLISTENER_CALL, true);
		removeclicklistener = false;
	}
    
    protected void clientAddSelectListener(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.ADDSELECTLISTENER_CALL, true);
		selectlistener = false;
	}
    
    protected void clientAddHoverListener(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.ADDHOVERLISTENER_CALL, true);
		hoverlistener = false;
	}
    
    protected void clientAddClickListener(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.ADDCLICKLISTENER_CALL, true);
		clicklistener = false;
	}

	protected void clientUpdateSeries(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.SETDATA_CALL, true);
		target.addVariable(this, UIDL_ATTR_DEFS.SERIES, gson.toJson(series));
		updateseries = false;
	}

	protected void clientSetupGrid(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.SETUPGRID_CALL, true);
		setupgrid = false;
	}

	protected void clientRedraw(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.REDRAW_CALL, true);
		redraw = false;
	}

	protected void clientSetCrossHairpos(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.SETCROSSHAIR_CALL, true);
		target.addVariable(this, UIDL_ATTR_DEFS.SETCROSSHAIR_POS, crosshairpos);
		setcrosshairpos = false;
	}

	protected void clientClearCrosshair(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.CLEARCROSSHAIR_CALL, true);
		clearcrosshair = false;
	}

	protected void clientSetlockCrosshair(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.LOCKCROSSHAIR_CALL, true);
		target.addVariable(this, UIDL_ATTR_DEFS.LOCKCROSSHAIR_POS, crosshairlockpos);
		setlockcrosshair = false;
	}

	protected void clientSetunlockCrosshair(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.UNLOCKCROSSHAIR_CALL, true);
		setunlockcrosshair = false;
	}

	protected void clientSetZoom(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.ZOOM_CALL, true);
		target.addVariable(this, UIDL_ATTR_DEFS.ZOOM_POS, zoompos);
		setzoom = false;
	}

	protected void clientSetZoomout(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.ZOOMOUT_CALL, true);
		setzoomout = false;
	}

	protected void clientSetPan(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.PAN_CALL, true);
		target.addVariable(this, UIDL_ATTR_DEFS.PAN_POS, panpos);
		setpan = false;		
	}

	protected void clientUnHighlightAll(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.UNHIGHLIGHTALL_CALL, true);
		unhighlightall = false;
	}

	protected void clientUnHighlight(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.UNHIGHLIGHT_CALL, true);
		target.addVariable(this, UIDL_ATTR_DEFS.UNHIGHLIGHT_SERIES, unhighlightDataPoint[0]);
		target.addVariable(this, UIDL_ATTR_DEFS.UNHIGHLIGHT_DATAPOINT, unhighlightDataPoint[1]);
		unhighlight = false;
	}

	protected void clientHighlight(PaintTarget target) throws PaintException {
		target.addVariable(this, UIDL_ATTR_DEFS.HIGHLIGHT_CALL, true);
		target.addVariable(this, UIDL_ATTR_DEFS.HIGHLIGHT_SERIES, highlightDataPoint[0]);
		target.addVariable(this, UIDL_ATTR_DEFS.HIGHLIGHT_DATAPOINT, highlightDataPoint[1]);
		highlight = false;
	}

	protected void init(PaintTarget target) throws PaintException {
		target.addAttribute(UIDL_ATTR_DEFS.STYLE, plotStyle);
        target.addAttribute(UIDL_ATTR_DEFS.SERIES, gson.toJson(series));
        target.addAttribute(UIDL_ATTR_DEFS.RESIZE, resize);
        if (options != null){
        	target.addAttribute(UIDL_ATTR_DEFS.OPTIONS, gson.toJson(options));
        }
        
        // initialize handlers whenever the page is refreshed
        if (this.plotClickListener != null && ! clicklistener){
        	clientAddClickListener(target);
        }
        if (this.plotHoverListener != null && ! hoverlistener){
        	clientAddHoverListener(target);
        }
        if (this.plotSelectListener != null && ! selectlistener){
        	clientAddSelectListener(target);
        }
        
        init = false;
	}
	
	/**
	 * 
	 * @return
	 */
	public int width(){
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int height(){
		return 0;
	}
	
	/**
	 * 
	 * @param series
	 * @param datapoint
	 */
	public void highlight(int series, int datapoint){
		highlight = true;
		highlightDataPoint = new int[]{series, datapoint};
		requestRepaint();
	}
	
	/**
	 * 
	 * @param series
	 * @param datapoint
	 */
	public void unhighlight(int series, int datapoint){
		unhighlight = true;
		unhighlightDataPoint = new int[]{series, datapoint};
		requestRepaint();
	}
	
	/**
	 * 
	 */
	public void unhighlight(){
		unhighlightall = true;
		requestRepaint();
	}
	
	/**
	 * Call this only after the chart has already been drawn
	 * @param series
	 */
	public void updateSeries(List<Serie> series){
		updateseries = true;
		this.series = series;
		requestRepaint();
	}
	
	/**
	 * 
	 */
	public void setUpGrid(){
		setupgrid = true;
		requestRepaint();
	}
	
	/**
	 * 
	 */
	public void reDraw(){
		redraw = true;
		requestRepaint();
	}
	
	/****** Flot Plugin apis *****/
	
	/**
	 * 
	 * @param pos
	 */
	public void setCrosshair(String pos){
		setcrosshairpos = true;
		this.crosshairpos = pos;
		requestRepaint();
	}
	
	/**
	 * 
	 */
	public void clearCrosshair(){
		clearcrosshair = true;
		requestRepaint();
	}
	
	/**
	 * 
	 * @param pos
	 */
	public void lockCrosshair(String pos){
		setlockcrosshair = true;
		this.crosshairlockpos = pos;
		requestRepaint();
	}
	
	/**
	 * 
	 */
	public void unlockCrosshair(){
		setunlockcrosshair = true;
		requestRepaint();
	}
	
	/**
	 * 
	 * @param pos
	 */
	public void zoom(String pos){
		setzoom = true;
		this.zoompos = pos;
		requestRepaint();
	}
	
	/**
	 * 
	 */
	public void zoomOut(){
		setzoomout = true;
		requestRepaint();
	}
	
	/**
	 * 
	 * @param pos
	 */
	public void pan(String pos){
		setpan = true;
		this.panpos = pos;
		requestRepaint();
	}
	
	/****** Add Flot event handlers *****/
	
	public void addPlotClickListener(PlotClickListener plotClickListener){
		clicklistener = true;
    	this.plotClickListener = plotClickListener;
    	requestRepaint();
    }
	
	public void removePlotClickListener(){
		removeclicklistener = true;
		this.plotClickListener = null;
		requestRepaint();
	}
	
	public void addPlotHoverListener(PlotHoverListener plotHoverListener){
		hoverlistener  = true;
    	this.plotHoverListener = plotHoverListener;
    	requestRepaint();
    }
	
	public void removePlotHoverListener(){
		removehoverlistener = true;
		this.plotHoverListener = null;
		requestRepaint();
	}
	
	public void addPlotSelectListener(PlotSelectListener plotSelectListener){
		selectlistener  = true;
    	this.plotSelectListener = plotSelectListener;
    	requestRepaint();
    }
	
	public void removePlotSelectListener(){
		removeselectlistener = true;
		this.plotSelectListener = null;
		requestRepaint();
	}
    
    /**
	 * @return the resize
	 */
	public boolean isResize() {
		return resize;
	}

	/**
	 * Set to true to make the chart resize on container resize
	 * @param resize the resize to set
	 */
	public void setResize(boolean resize) {
		this.resize = resize;
	}

	/**
	 * @return the series
	 */
	public List<Serie> getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	/**
	 * @return the options
	 */
	public Options getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(Options options) {
		this.options = options;
	}
	
	/**
	 * @return the plotStyle
	 */
	public String getPlotStyle() {
		return plotStyle;
	}

	/**
	 * set the plot style including width and height <br/>
	 * Eg:-setPlotStyle("height:200px;width:400px");
	 * @param plotStyle the plotStyle to set
	 */
	public void setPlotStyle(String plotStyle) {
		this.plotStyle = plotStyle;
	}
	
	@Override
    public void changeVariables(Object source, Map<String,Object> variables) {
    	super.changeVariables(source, variables);
    	
    	Object[] clickobjs = (Object[]) variables.get(UIDL_ATTR_DEFS.CLICK_EVENT);
    	if (clickobjs != null){
    		plotClickListener.onClick((String) clickobjs[0], (String) clickobjs[1]);
    	}       
    	
    	Object[] hoverobjs = (Object[]) variables.get(UIDL_ATTR_DEFS.HOVER_EVENT);
    	if (hoverobjs != null){
	    	plotHoverListener.
				onHover((String) hoverobjs[0], (String) hoverobjs[1]);
    	}
    	
    	Object[] selectobjs = (Object[]) variables.get(UIDL_ATTR_DEFS.SELECT_EVENT);
    	if (selectobjs != null){
	    	plotSelectListener.
				onSelect((String) selectobjs[0]);
    	}
    };
}
