package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * The Measure resource provides the definition of a quality measure.
 */
public class MeasureSupplementalData extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return An identifier for the supplemental data.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value An identifier for the supplemental data.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private ArrayList<CodeableConcept> usage;

	/**
	 * Getter for usage
	 * @return An indicator of the intended usage for the supplemental data element. Supplemental data indicates the data is additional information requested to augment the measure information. Risk adjustment factor indicates the data is additional information used to calculate risk adjustment factors when applying a risk model to the measure calculation.
	 */
	public ArrayList<CodeableConcept> getUsage() { return usage; }

	/**
	 * Setter for usage
	 * @param value An indicator of the intended usage for the supplemental data element. Supplemental data indicates the data is additional information requested to augment the measure information. Risk adjustment factor indicates the data is additional information used to calculate risk adjustment factors when applying a risk model to the measure calculation.
	 */
	public void setUsage(ArrayList<CodeableConcept> value) { usage = value; }


	@Expose
	private String criteria;

	/**
	 * Getter for criteria
	 * @return The criteria for the supplemental data. This must be the name of a valid expression defined within a referenced library, and defines the data to be returned for this element.
	 */
	public String getCriteria() { return criteria; }

	/**
	 * Setter for criteria
	 * @param value The criteria for the supplemental data. This must be the name of a valid expression defined within a referenced library, and defines the data to be returned for this element.
	 */
	public void setCriteria(String value) { criteria = value; }


	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return The supplemental data to be supplied as part of the measure response, specified as a valid FHIR Resource Path.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value The supplemental data to be supplied as part of the measure response, specified as a valid FHIR Resource Path.
	 */
	public void setPath(String value) { path = value; }


}
