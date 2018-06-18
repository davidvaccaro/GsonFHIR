package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitInsurance extends BackboneElement {
	@Expose
	private Reference coverage;

	/**
	 * Getter for coverage
	 * @return Reference to the program or plan identification, underwriter or payor.
	 */
	public Reference getCoverage() { return coverage; }

	/**
	 * Setter for coverage
	 * @param value Reference to the program or plan identification, underwriter or payor.
	 */
	public void setCoverage(Reference value) { coverage = value; }


	@Expose
	private ArrayList<String> preAuthRef;

	/**
	 * Getter for preAuthRef
	 * @return A list of references from the Insurer to which these services pertain.
	 */
	public ArrayList<String> getPreAuthRef() { return preAuthRef; }

	/**
	 * Setter for preAuthRef
	 * @param value A list of references from the Insurer to which these services pertain.
	 */
	public void setPreAuthRef(ArrayList<String> value) { preAuthRef = value; }


}
