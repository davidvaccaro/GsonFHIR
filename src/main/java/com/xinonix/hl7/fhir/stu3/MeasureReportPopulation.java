package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The MeasureReport resource contains the results of evaluating a measure.
 */
public class MeasureReportPopulation extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return The identifier of the population being reported, as defined by the population element of the measure.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The identifier of the population being reported, as defined by the population element of the measure.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return The type of the population.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The type of the population.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Integer count;

	/**
	 * Getter for count
	 * @return The number of members of the population.
	 */
	public Integer getCount() { return count; }

	/**
	 * Setter for count
	 * @param value The number of members of the population.
	 */
	public void setCount(Integer value) { count = value; }


	@Expose
	private Reference patients;

	/**
	 * Getter for patients
	 * @return This element refers to a List of patient level MeasureReport resources, one for each patient in this population.
	 */
	public Reference getPatients() { return patients; }

	/**
	 * Setter for patients
	 * @param value This element refers to a List of patient level MeasureReport resources, one for each patient in this population.
	 */
	public void setPatients(Reference value) { patients = value; }


}
