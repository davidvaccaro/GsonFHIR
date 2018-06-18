package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
 */
public class ImmunizationRecommendation extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ImmunizationRecommendation resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ImmunizationRecommendation resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A unique identifier assigned to this particular recommendation record.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A unique identifier assigned to this particular recommendation record.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The patient the recommendations are for.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The patient the recommendations are for.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private ArrayList<ImmunizationRecommendationRecommendation> recommendation;

	/**
	 * Getter for recommendation
	 * @return Vaccine administration recommendations.
	 */
	public ArrayList<ImmunizationRecommendationRecommendation> getRecommendation() { return recommendation; }

	/**
	 * Setter for recommendation
	 * @param value Vaccine administration recommendations.
	 */
	public void setRecommendation(ArrayList<ImmunizationRecommendationRecommendation> value) { recommendation = value; }


}
