package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitRelated extends BackboneElement {
	@Expose
	private Reference claim;

	/**
	 * Getter for claim
	 * @return Other claims which are related to this claim such as prior claim versions or for related services.
	 */
	public Reference getClaim() { return claim; }

	/**
	 * Setter for claim
	 * @param value Other claims which are related to this claim such as prior claim versions or for related services.
	 */
	public void setClaim(Reference value) { claim = value; }


	@Expose
	private CodeableConcept relationship;

	/**
	 * Getter for relationship
	 * @return For example prior or umbrella.
	 */
	public CodeableConcept getRelationship() { return relationship; }

	/**
	 * Setter for relationship
	 * @param value For example prior or umbrella.
	 */
	public void setRelationship(CodeableConcept value) { relationship = value; }


	@Expose
	private Identifier reference;

	/**
	 * Getter for reference
	 * @return An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .
	 */
	public Identifier getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .
	 */
	public void setReference(Identifier value) { reference = value; }


}
