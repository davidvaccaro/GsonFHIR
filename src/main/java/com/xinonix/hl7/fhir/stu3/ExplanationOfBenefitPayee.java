package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitPayee extends BackboneElement {
	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Type of Party to be reimbursed: Subscriber, provider, other.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Type of Party to be reimbursed: Subscriber, provider, other.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private CodeableConcept resourceType;

	/**
	 * Getter for resourceType
	 * @return organization | patient | practitioner | relatedperson.
	 */
	public CodeableConcept getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value organization | patient | practitioner | relatedperson.
	 */
	public void setResourceType(CodeableConcept value) { resourceType = value; }


	@Expose
	private Reference party;

	/**
	 * Getter for party
	 * @return Party to be reimbursed: Subscriber, provider, other.
	 */
	public Reference getParty() { return party; }

	/**
	 * Setter for party
	 * @param value Party to be reimbursed: Subscriber, provider, other.
	 */
	public void setParty(Reference value) { party = value; }


}
