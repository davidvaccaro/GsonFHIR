package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
 */
public class ImmunizationRecommendationDateCriterion extends BackboneElement {
	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date value;

	/**
	 * Getter for value
	 * @return The date whose meaning is specified by dateCriterion.code.
	 */
	public Date getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The date whose meaning is specified by dateCriterion.code.
	 */
	public void setValue(Date value) { value = value; }


}
