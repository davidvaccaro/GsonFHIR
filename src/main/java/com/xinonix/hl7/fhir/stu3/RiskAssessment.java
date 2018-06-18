package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 */
public class RiskAssessment extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a RiskAssessment resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a RiskAssessment resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Business identifier assigned to the risk assessment.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Business identifier assigned to the risk assessment.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private Reference basedOn;

	/**
	 * Getter for basedOn
	 * @return A reference to the request that is fulfilled by this risk assessment.
	 */
	public Reference getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A reference to the request that is fulfilled by this risk assessment.
	 */
	public void setBasedOn(Reference value) { basedOn = value; }


	@Expose
	private Reference parent;

	/**
	 * Getter for parent
	 * @return A reference to a resource that this risk assessment is part of, such as a Procedure.
	 */
	public Reference getParent() { return parent; }

	/**
	 * Setter for parent
	 * @param value A reference to a resource that this risk assessment is part of, such as a Procedure.
	 */
	public void setParent(Reference value) { parent = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the RiskAssessment, using the same statuses as an Observation.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the RiskAssessment, using the same statuses as an Observation.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private CodeableConcept method;

	/**
	 * Getter for method
	 * @return The algorithm, process or mechanism used to evaluate the risk.
	 */
	public CodeableConcept getMethod() { return method; }

	/**
	 * Setter for method
	 * @param value The algorithm, process or mechanism used to evaluate the risk.
	 */
	public void setMethod(CodeableConcept value) { method = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return The type of the risk assessment performed.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The type of the risk assessment performed.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient or group the risk assessment applies to.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient or group the risk assessment applies to.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter where the assessment was performed.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter where the assessment was performed.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return The date (and possibly time) the risk assessment was performed.
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value The date (and possibly time) the risk assessment was performed.
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Period occurrencePeriod;

	/**
	 * Getter for occurrencePeriod
	 * @return The date (and possibly time) the risk assessment was performed.
	 */
	public Period getOccurrencePeriod() { return occurrencePeriod; }

	/**
	 * Setter for occurrencePeriod
	 * @param value The date (and possibly time) the risk assessment was performed.
	 */
	public void setOccurrencePeriod(Period value) { occurrencePeriod = value; }


	@Expose
	private Reference condition;

	/**
	 * Getter for condition
	 * @return For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
	 */
	public Reference getCondition() { return condition; }

	/**
	 * Setter for condition
	 * @param value For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
	 */
	public void setCondition(Reference value) { condition = value; }


	@Expose
	private Reference performer;

	/**
	 * Getter for performer
	 * @return The provider or software application that performed the assessment.
	 */
	public Reference getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value The provider or software application that performed the assessment.
	 */
	public void setPerformer(Reference value) { performer = value; }


	@Expose
	private CodeableConcept reasonCodeableConcept;

	/**
	 * Getter for reasonCodeableConcept
	 * @return The reason the risk assessment was performed.
	 */
	public CodeableConcept getReasonCodeableConcept() { return reasonCodeableConcept; }

	/**
	 * Setter for reasonCodeableConcept
	 * @param value The reason the risk assessment was performed.
	 */
	public void setReasonCodeableConcept(CodeableConcept value) { reasonCodeableConcept = value; }


	@Expose
	private Reference reasonReference;

	/**
	 * Getter for reasonReference
	 * @return The reason the risk assessment was performed.
	 */
	public Reference getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value The reason the risk assessment was performed.
	 */
	public void setReasonReference(Reference value) { reasonReference = value; }


	@Expose
	private ArrayList<Reference> basis;

	/**
	 * Getter for basis
	 * @return Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).
	 */
	public ArrayList<Reference> getBasis() { return basis; }

	/**
	 * Setter for basis
	 * @param value Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).
	 */
	public void setBasis(ArrayList<Reference> value) { basis = value; }


	@Expose
	private ArrayList<RiskAssessmentPrediction> prediction;

	/**
	 * Getter for prediction
	 * @return Describes the expected outcome for the subject.
	 */
	public ArrayList<RiskAssessmentPrediction> getPrediction() { return prediction; }

	/**
	 * Setter for prediction
	 * @param value Describes the expected outcome for the subject.
	 */
	public void setPrediction(ArrayList<RiskAssessmentPrediction> value) { prediction = value; }


	@Expose
	private String mitigation;

	/**
	 * Getter for mitigation
	 * @return A description of the steps that might be taken to reduce the identified risk(s).
	 */
	public String getMitigation() { return mitigation; }

	/**
	 * Setter for mitigation
	 * @param value A description of the steps that might be taken to reduce the identified risk(s).
	 */
	public void setMitigation(String value) { mitigation = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Additional comments about the risk assessment.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Additional comments about the risk assessment.
	 */
	public void setComment(String value) { comment = value; }


}
