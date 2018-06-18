package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
 */
public class ImmunizationRecommendationRecommendation extends BackboneElement {
	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date the immunization recommendation was created.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date the immunization recommendation was created.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private CodeableConcept vaccineCode;

	/**
	 * Getter for vaccineCode
	 * @return Vaccine that pertains to the recommendation.
	 */
	public CodeableConcept getVaccineCode() { return vaccineCode; }

	/**
	 * Setter for vaccineCode
	 * @param value Vaccine that pertains to the recommendation.
	 */
	public void setVaccineCode(CodeableConcept value) { vaccineCode = value; }


	@Expose
	private CodeableConcept targetDisease;

	/**
	 * Getter for targetDisease
	 * @return The targeted disease for the recommendation.
	 */
	public CodeableConcept getTargetDisease() { return targetDisease; }

	/**
	 * Setter for targetDisease
	 * @param value The targeted disease for the recommendation.
	 */
	public void setTargetDisease(CodeableConcept value) { targetDisease = value; }


	@Expose
	private Integer doseNumber;

	/**
	 * Getter for doseNumber
	 * @return The next recommended dose number (e.g. dose 2 is the next recommended dose).
	 */
	public Integer getDoseNumber() { return doseNumber; }

	/**
	 * Setter for doseNumber
	 * @param value The next recommended dose number (e.g. dose 2 is the next recommended dose).
	 */
	public void setDoseNumber(Integer value) { doseNumber = value; }


	@Expose
	private CodeableConcept forecastStatus;

	/**
	 * Getter for forecastStatus
	 * @return Vaccine administration status.
	 */
	public CodeableConcept getForecastStatus() { return forecastStatus; }

	/**
	 * Setter for forecastStatus
	 * @param value Vaccine administration status.
	 */
	public void setForecastStatus(CodeableConcept value) { forecastStatus = value; }


	@Expose
	private ArrayList<ImmunizationRecommendationDateCriterion> dateCriterion;

	/**
	 * Getter for dateCriterion
	 * @return Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
	 */
	public ArrayList<ImmunizationRecommendationDateCriterion> getDateCriterion() { return dateCriterion; }

	/**
	 * Setter for dateCriterion
	 * @param value Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
	 */
	public void setDateCriterion(ArrayList<ImmunizationRecommendationDateCriterion> value) { dateCriterion = value; }


	@Expose
	private ImmunizationRecommendationProtocol protocol;

	/**
	 * Getter for protocol
	 * @return Contains information about the protocol under which the vaccine was administered.
	 */
	public ImmunizationRecommendationProtocol getProtocol() { return protocol; }

	/**
	 * Setter for protocol
	 * @param value Contains information about the protocol under which the vaccine was administered.
	 */
	public void setProtocol(ImmunizationRecommendationProtocol value) { protocol = value; }


	@Expose
	private ArrayList<Reference> supportingImmunization;

	/**
	 * Getter for supportingImmunization
	 * @return Immunization event history that supports the status and recommendation.
	 */
	public ArrayList<Reference> getSupportingImmunization() { return supportingImmunization; }

	/**
	 * Setter for supportingImmunization
	 * @param value Immunization event history that supports the status and recommendation.
	 */
	public void setSupportingImmunization(ArrayList<Reference> value) { supportingImmunization = value; }


	@Expose
	private ArrayList<Reference> supportingPatientInformation;

	/**
	 * Getter for supportingPatientInformation
	 * @return Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
	 */
	public ArrayList<Reference> getSupportingPatientInformation() { return supportingPatientInformation; }

	/**
	 * Setter for supportingPatientInformation
	 * @param value Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
	 */
	public void setSupportingPatientInformation(ArrayList<Reference> value) { supportingPatientInformation = value; }


}
