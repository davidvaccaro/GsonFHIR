package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 */
public class AccountGuarantor extends BackboneElement {
	@Expose
	private Reference party;

	/**
	 * Getter for party
	 * @return The entity who is responsible.
	 */
	public Reference getParty() { return party; }

	/**
	 * Setter for party
	 * @param value The entity who is responsible.
	 */
	public void setParty(Reference value) { party = value; }


	@Expose
	private boolean onHold;

	/**
	 * Getter for onHold
	 * @return A guarantor may be placed on credit hold or otherwise have their role temporarily suspended.
	 */
	public boolean getOnHold() { return onHold; }

	/**
	 * Setter for onHold
	 * @param value A guarantor may be placed on credit hold or otherwise have their role temporarily suspended.
	 */
	public void setOnHold(boolean value) { onHold = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The timeframe during which the guarantor accepts responsibility for the account.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The timeframe during which the guarantor accepts responsibility for the account.
	 */
	public void setPeriod(Period value) { period = value; }


}
