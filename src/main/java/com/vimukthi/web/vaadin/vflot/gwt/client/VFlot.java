package com.vimukthi.web.vaadin.vflot.gwt.client;

import com.vaadin.terminal.gwt.client.ApplicationConnection;
import com.vaadin.terminal.gwt.client.Paintable;
import com.vaadin.terminal.gwt.client.UIDL;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * @author Vimukthi
 *
 */
public class VFlot extends Widget implements Paintable {

	/** Set the CSS class name to allow styling. */
	public static final String CLASSNAME = "v-flot";
	
	protected String style;

	/** The client side widget identifier */
	protected String paintableId;

	/** Reference to the server connection object. */
	ApplicationConnection client;

	protected UIDL currentUIDL;

	protected Plotter plotter;
	
	protected boolean initiated = false;

	/**
	 * The constructor should first call super() to initialize the component and
	 * then handle any initialization relevant to Vaadin.
	 */
	public VFlot() {
		// TODO Example code is extending GWT Widget so it must set a root
		// element.
		// Change to proper element or remove if extending another widget
		setElement(Document.get().createDivElement());

		plotter = new Plotter(this);

		// This method call of the Paintable interface sets the component
		// style name in DOM tree
		setStyleName(CLASSNAME);
	}

	/**
	 * Called whenever an update is received from the server
	 */
	public void updateFromUIDL(UIDL uidl, ApplicationConnection client) {
		// This call should be made first.
		// It handles sizes, captions, tooltips, etc. automatically.
		if (client.updateComponent(this, uidl, true)) {
			// If client.updateComponent returns true there has been no changes
			// and we
			// do not need to update anything.
			return;
		}

		// Save reference to server connection object to be able to send
		// user interaction later
		this.client = client;

		this.currentUIDL = uidl;

		// Save the client side identifier (paintable id) for the widget
		paintableId = uidl.getId();
		
		// we call init only if this is not an update to existing chart
		if (! initiated){
			init(uidl);
		}
		
		handleMethodCalls(uidl);
	}

	private void handleMethodCalls(UIDL uidl) {
		// handle highlight call
		if (uidl.hasVariable(UIDL_ATTR_DEFS.HIGHLIGHT_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.HIGHLIGHT_CALL)){
			plotter.highlight(uidl.getIntVariable(UIDL_ATTR_DEFS.HIGHLIGHT_SERIES), 
					uidl.getIntVariable(UIDL_ATTR_DEFS.HIGHLIGHT_DATAPOINT));
		}
		
		// handle highlight call
		if (uidl.hasVariable(UIDL_ATTR_DEFS.UNHIGHLIGHT_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.UNHIGHLIGHT_CALL)){
			plotter.unhighlight(uidl.getIntVariable(UIDL_ATTR_DEFS.UNHIGHLIGHT_SERIES), 
					uidl.getIntVariable(UIDL_ATTR_DEFS.UNHIGHLIGHT_DATAPOINT));
		}
		
		// handle highlight all call
		if (uidl.hasVariable(UIDL_ATTR_DEFS.UNHIGHLIGHTALL_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.UNHIGHLIGHTALL_CALL)){
			plotter.unhighlight();
		}
		
		// handle setdata call
		if (uidl.hasVariable(UIDL_ATTR_DEFS.SETDATA_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.SETDATA_CALL)){
        	plotter.setData(uidl.getStringVariable(UIDL_ATTR_DEFS.SERIES));
        }
		
		// handle setup grid call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.SETUPGRID_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.SETUPGRID_CALL)){
        	plotter.setUpGrid();
        }
        
        // handle redraw call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.REDRAW_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.REDRAW_CALL)){
        	plotter.draw();
        }
        
        // handle set crosshair call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.SETCROSSHAIR_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.SETCROSSHAIR_CALL)){
        	plotter.setCrosshair(uidl.getStringVariable(UIDL_ATTR_DEFS.SETCROSSHAIR_POS));
        }
        
        // handle clear crosshair call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.CLEARCROSSHAIR_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.CLEARCROSSHAIR_CALL)){
        	plotter.clearCrosshair();
        }
        
        // handle lock crosshair call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.LOCKCROSSHAIR_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.LOCKCROSSHAIR_CALL)){
        	plotter.lockCrosshair(uidl.getStringVariable(UIDL_ATTR_DEFS.LOCKCROSSHAIR_POS));
        }
        
        // handle unlock crosshair call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.UNLOCKCROSSHAIR_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.UNLOCKCROSSHAIR_CALL)){
        	plotter.unlockCrosshair();
        }
        
        // handle zoom call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.ZOOM_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.ZOOM_CALL)){
        	plotter.zoom(uidl.getStringVariable(UIDL_ATTR_DEFS.ZOOM_POS));
        }
        
        // handle zoomout call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.ZOOMOUT_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.ZOOMOUT_CALL)){
        	plotter.zoomOut();
        }
        
        // handle pan call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.PAN_CALL) && 
				uidl.getBooleanVariable(UIDL_ATTR_DEFS.PAN_CALL)){
        	plotter.pan(uidl.getStringVariable(UIDL_ATTR_DEFS.PAN_POS));
        }
        
        // handle addClickListener call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.ADDCLICKLISTENER_CALL) && 
        		uidl.getBooleanVariable(UIDL_ATTR_DEFS.ADDCLICKLISTENER_CALL)){
        		plotter.addClickListener();  	
        }
        
        // handle removeClickListener call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.REMOVECLICKLISTENER_CALL) && 
        		uidl.getBooleanVariable(UIDL_ATTR_DEFS.REMOVECLICKLISTENER_CALL)){
        		plotter.removeClickListener();  	
        }
        
        // handle addHoverListener call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.ADDHOVERLISTENER_CALL) && 
        		uidl.getBooleanVariable(UIDL_ATTR_DEFS.ADDHOVERLISTENER_CALL)){
        		plotter.addHoverListener();
        }
        
        // handle removeHoverListener call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.REMOVEHOVERLISTENER_CALL) && 
        		uidl.getBooleanVariable(UIDL_ATTR_DEFS.REMOVEHOVERLISTENER_CALL)){
        		plotter.removeHoverListener();
        }
        
        // handle addHoverListener call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.ADDSELECTLISTENER_CALL) && 
        		uidl.getBooleanVariable(UIDL_ATTR_DEFS.ADDSELECTLISTENER_CALL)){
        		plotter.addSelectListener();
        }
        
        // handle removeHoverListener call
        if (uidl.hasVariable(UIDL_ATTR_DEFS.REMOVESELECTLISTENER_CALL) && 
        		uidl.getBooleanVariable(UIDL_ATTR_DEFS.REMOVESELECTLISTENER_CALL)){
        		plotter.removeSelectListener();
        }
	}

	private void init(UIDL uidl) {
		style = uidl.getStringAttribute(UIDL_ATTR_DEFS.STYLE);
		getElement().setAttribute("style", style);
		getElement().setId(paintableId);		

		String series = uidl.getStringAttribute(UIDL_ATTR_DEFS.SERIES);
		String options = uidl.getStringAttribute(UIDL_ATTR_DEFS.OPTIONS);	
		boolean resize = uidl.getBooleanAttribute(UIDL_ATTR_DEFS.RESIZE);	

		if (options == null) {
			plotter.create(getElement(), series);
		} else {
			plotter.create(getElement(), series, options, resize);
		}
		initiated = true;
	}

	/**
	 * @return the plotter
	 */
	public Plotter getPlotter() {
		return plotter;
	}

	/**
	 * @param plotter
	 *            the plotter to set
	 */
	public void setPlotter(Plotter plotter) {
		this.plotter = plotter;
	}

	public void onPlotClick(String pos, String item) {
		this.client.updateVariable(this.paintableId, 
				UIDL_ATTR_DEFS.CLICK_EVENT, new Object[]{pos, item}, true);
	}
	
	public void onPlotHover(String pos, String item) {
		this.client.updateVariable(this.paintableId, 
				UIDL_ATTR_DEFS.HOVER_EVENT, new Object[]{pos, item}, true);
	}

	public void onPlotSelect(String ranges) {
		this.client.updateVariable(this.paintableId, 
				UIDL_ATTR_DEFS.SELECT_EVENT, new Object[]{ranges}, true);
	}

}
