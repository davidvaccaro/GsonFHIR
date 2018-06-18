package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource provides the adjudication details from the processing of a Claim resource.
 */
public class ClaimResponseInsurance extends BackboneElement {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return A service line item.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value A service line item.
	 */
	public void setSequence(Integer value) { sequence = value; }


	@Expose
	private boolean focal;

	/**
	 * Getter for focal
	 * @return The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
	 */
	public boolean getFocal() { return focal; }

	/**
	 * Setter for focal
	 * @param value The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
	 */
	public void setFocal(boolean value) { focal = value; }


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
	private String businessArrangement;

	/**
	 * Getter for businessArrangement
	 * @return The contract number of a business agreement which describes the terms and conditions.
	 */
	public String getBusinessArrangement() { return businessArrangement; }

	/**
	 * Setter for businessArrangement
	 * @param value The contract number of a business agreement which describes the terms and conditions.
	 */
	public void setBusinessArrangement(String value) { businessArrangement = value; }


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


	@Expose
	private Reference claimResponse;

	/**
	 * Getter for claimResponse
	 * @return The Coverages adjudication details.
	 */
	public Reference getClaimResponse() { return claimResponse; }

	/**
	 * Setter for claimResponse
	 * @param value The Coverages adjudication details.
	 */
	public void setClaimResponse(Reference value) { claimResponse = value; }


}
