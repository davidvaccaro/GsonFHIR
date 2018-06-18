package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The Measure resource provides the definition of a quality measure.
 */
public class MeasurePopulation extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A unique identifier for the population criteria. This identifier is used to report data against this criteria within the measure report.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A unique identifier for the population criteria. This identifier is used to report data against this criteria within the measure report.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return The type of population criteria.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The type of population criteria.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Optional name or short description of this population.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Optional name or short description of this population.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return The human readable description of this population criteria.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value The human readable description of this population criteria.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String criteria;

	/**
	 * Getter for criteria
	 * @return The name of a valid referenced CQL expression (may be namespaced) that defines this population criteria.
	 */
	public String getCriteria() { return criteria; }

	/**
	 * Setter for criteria
	 * @param value The name of a valid referenced CQL expression (may be namespaced) that defines this population criteria.
	 */
	public void setCriteria(String value) { criteria = value; }


}
