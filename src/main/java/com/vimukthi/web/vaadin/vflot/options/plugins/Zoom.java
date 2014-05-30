/**
 * 
 */
package com.vimukthi.web.vaadin.vflot.options.plugins;

/**
 * used with navigate plugin
 * 
 * @author Vimukthi
 * 
 */
public class Zoom {

	private Boolean interactive = false;
	private String trigger;
	private String amount; 

	/**
	 * @return the interactive
	 */
	public Boolean getInteractive() {
		return interactive;
	}

	/**
	 * @return the trigger
	 */
	public String getTrigger() {
		return trigger;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * 
	 * @param interactive
	 *            the interactive to set
	 */
	public void setInteractive(Boolean interactive) {
		this.interactive = interactive;
	}

	/**
	 * "dblclick" or "click"
	 * @param trigger
	 *            the trigger to set
	 */
	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

	/**
	 * 2 = 200% (zoom in), 0.5 = 50% (zoom out)
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
