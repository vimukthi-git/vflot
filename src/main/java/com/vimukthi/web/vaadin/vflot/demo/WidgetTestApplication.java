package com.vimukthi.web.vaadin.vflot.demo;

import java.util.ArrayList;
import java.util.List;

import com.vimukthi.web.vaadin.vflot.Flot;
import com.vimukthi.web.vaadin.vflot.options.Axis;
import com.vimukthi.web.vaadin.vflot.options.Grid;
import com.vimukthi.web.vaadin.vflot.options.Legend;
import com.vimukthi.web.vaadin.vflot.options.Options;
import com.vimukthi.web.vaadin.vflot.options.Series;
import com.vimukthi.web.vaadin.vflot.options.plugins.CrossHair;
import com.vimukthi.web.vaadin.vflot.options.plugins.Selection;
import com.vimukthi.web.vaadin.vflot.options.plugins.Zoom;
import com.vimukthi.web.vaadin.vflot.options.plugins.pie.Pie;
import com.vimukthi.web.vaadin.vflot.series.ChartSerie;
import com.vimukthi.web.vaadin.vflot.series.Lines;
import com.vimukthi.web.vaadin.vflot.series.PieSerie;
import com.vimukthi.web.vaadin.vflot.series.Serie;
import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;



/**
 * @author Vimukthi
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class WidgetTestApplication extends Application
{
    private Window window;

    @Override
    public void init()
    {
    	setTheme("vflot");
        window = new Window("VFlot Demo");
        window.setSizeFull();
        setMainWindow(window);
        VerticalLayout mainLayout = new VerticalLayout();
        window.setContent(mainLayout);
        mainLayout.setSizeFull();
        
        HorizontalLayout titleBar = new HorizontalLayout();
        mainLayout.addComponent(titleBar);
        titleBar.setHeight("30px");
        titleBar.setWidth("100%");
        titleBar.setStyleName("title-bar");
        titleBar.addComponent(new Label("VFlot Demo"));
        
        TabSheet tabs = new TabSheet();
        mainLayout.addComponent(tabs);
        tabs.setSizeFull();
        
        BasicChartContainer l1 = new BasicChartContainer();
        ComplexChartContainer l2 = new ComplexChartContainer();
        InteractiveChartContainer l3 = new InteractiveChartContainer();
        StackChartContainer l4 = new StackChartContainer();
        
        tabs.addTab(l1, "Basic Charts");
        tabs.addTab(l2, "Complex Charts");
        tabs.addTab(l3, "Interactive Charts");
        tabs.addTab(l4, "Stack Chart");
        
        mainLayout.setExpandRatio(tabs, 1);

    }
    
}

