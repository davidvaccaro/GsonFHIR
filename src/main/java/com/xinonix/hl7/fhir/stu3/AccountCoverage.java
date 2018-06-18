package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 */
public class AccountCoverage extends BackboneElement {
	@Expose
	private Reference coverage;

	/**
	 * Getter for coverage
	 * @return The party(s) that are responsible for payment (or part of) of charges applied to this account (including self-pay).

A coverage may only be resposible for specific types of charges, and the sequence of the coverages in the account could be important when processing billing.
	 */
	public Reference getCoverage() { return coverage; }

	/**
	 * Setter for coverage
	 * @param value The party(s) that are responsible for payment (or part of) of charges applied to this account (including self-pay).

A coverage may only be resposible for specific types of charges, and the sequence of the coverages in the account could be important when processing billing.
	 */
	public void setCoverage(Reference value) { coverage = value; }


	@Expose
	private Integer priority;

	/**
	 * Getter for priority
	 * @return The priority of the coverage in the context of this account.
	 */
	public Integer getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value The priority of the coverage in the context of this account.
	 */
	public void setPriority(Integer value) { priority = value; }


}
