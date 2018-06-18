package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 */
public class AllergyIntoleranceReaction extends BackboneElement {
	@Expose
	private CodeableConcept substance;

	/**
	 * Getter for substance
	 * @return Identification of the specific substance (or pharmaceutical product) considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'.
	 */
	public CodeableConcept getSubstance() { return substance; }

	/**
	 * Setter for substance
	 * @param value Identification of the specific substance (or pharmaceutical product) considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'.
	 */
	public void setSubstance(CodeableConcept value) { substance = value; }


	@Expose
	private ArrayList<CodeableConcept> manifestation;

	/**
	 * Getter for manifestation
	 * @return Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
	 */
	public ArrayList<CodeableConcept> getManifestation() { return manifestation; }

	/**
	 * Setter for manifestation
	 * @param value Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
	 */
	public void setManifestation(ArrayList<CodeableConcept> value) { manifestation = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Text description about the reaction as a whole, including details of the manifestation if required.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Text description about the reaction as a whole, including details of the manifestation if required.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date onset;

	/**
	 * Getter for onset
	 * @return Record of the date and/or time of the onset of the Reaction.
	 */
	public Date getOnset() { return onset; }

	/**
	 * Setter for onset
	 * @param value Record of the date and/or time of the onset of the Reaction.
	 */
	public void setOnset(Date value) { onset = value; }


	public enum Severity{
		@SerializedName("mild") MILD,
		@SerializedName("moderate") MODERATE,
		@SerializedName("severe") SEVERE
	}

	@Expose
	private Severity severity;

	/**
	 * Getter for severity
	 * @return Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
	 */
	public Severity getSeverity() { return severity; }

	/**
	 * Setter for severity
	 * @param value Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
	 */
	public void setSeverity(Severity value) { severity = value; }


	@Expose
	private CodeableConcept exposureRoute;

	/**
	 * Getter for exposureRoute
	 * @return Identification of the route by which the subject was exposed to the substance.
	 */
	public CodeableConcept getExposureRoute() { return exposureRoute; }

	/**
	 * Setter for exposureRoute
	 * @param value Identification of the route by which the subject was exposed to the substance.
	 */
	public void setExposureRoute(CodeableConcept value) { exposureRoute = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Additional text about the adverse reaction event not captured in other fields.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Additional text about the adverse reaction event not captured in other fields.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
