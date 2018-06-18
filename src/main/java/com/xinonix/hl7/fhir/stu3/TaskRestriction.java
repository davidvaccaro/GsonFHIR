package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A task to be performed.
 */
public class TaskRestriction extends BackboneElement {
	@Expose
	private Integer repetitions;

	/**
	 * Getter for repetitions
	 * @return Indicates the number of times the requested action should occur.
	 */
	public Integer getRepetitions() { return repetitions; }

	/**
	 * Setter for repetitions
	 * @param value Indicates the number of times the requested action should occur.
	 */
	public void setRepetitions(Integer value) { repetitions = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Over what time-period is fulfillment sought.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Over what time-period is fulfillment sought.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<Reference> recipient;

	/**
	 * Getter for recipient
	 * @return For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?
	 */
	public ArrayList<Reference> getRecipient() { return recipient; }

	/**
	 * Setter for recipient
	 * @param value For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?
	 */
	public void setRecipient(ArrayList<Reference> value) { recipient = value; }


}
