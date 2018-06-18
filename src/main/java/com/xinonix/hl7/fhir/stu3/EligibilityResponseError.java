package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 */
public class EligibilityResponseError extends BackboneElement {
	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return An error code,from a specified code system, which details why the eligibility check could not be performed.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value An error code,from a specified code system, which details why the eligibility check could not be performed.
	 */
	public void setCode(CodeableConcept value) { code = value; }


}
