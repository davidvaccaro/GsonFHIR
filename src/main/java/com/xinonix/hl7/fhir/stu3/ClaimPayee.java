package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class ClaimPayee extends BackboneElement {
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
	private Coding resourceType;

	/**
	 * Getter for resourceType
	 * @return organization | patient | practitioner | relatedperson.
	 */
	public Coding getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value organization | patient | practitioner | relatedperson.
	 */
	public void setResourceType(Coding value) { resourceType = value; }


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
