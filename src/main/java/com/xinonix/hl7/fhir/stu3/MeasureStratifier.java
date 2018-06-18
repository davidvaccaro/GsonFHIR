package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The Measure resource provides the definition of a quality measure.
 */
public class MeasureStratifier extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return The identifier for the stratifier used to coordinate the reported data back to this stratifier.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The identifier for the stratifier used to coordinate the reported data back to this stratifier.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String criteria;

	/**
	 * Getter for criteria
	 * @return The criteria for the stratifier. This must be the name of an expression defined within a referenced library.
	 */
	public String getCriteria() { return criteria; }

	/**
	 * Setter for criteria
	 * @param value The criteria for the stratifier. This must be the name of an expression defined within a referenced library.
	 */
	public void setCriteria(String value) { criteria = value; }


	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return The path to an element that defines the stratifier, specified as a valid FHIR resource path.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value The path to an element that defines the stratifier, specified as a valid FHIR resource path.
	 */
	public void setPath(String value) { path = value; }


}
