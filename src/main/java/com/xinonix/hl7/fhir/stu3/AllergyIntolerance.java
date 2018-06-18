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
public class AllergyIntolerance extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a AllergyIntolerance resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a AllergyIntolerance resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum ClinicalStatus{
		@SerializedName("active") ACTIVE,
		@SerializedName("inactive") INACTIVE,
		@SerializedName("resolved") RESOLVED
	}

	@Expose
	private ClinicalStatus clinicalStatus;

	/**
	 * Getter for clinicalStatus
	 * @return The clinical status of the allergy or intolerance.
	 */
	public ClinicalStatus getClinicalStatus() { return clinicalStatus; }

	/**
	 * Setter for clinicalStatus
	 * @param value The clinical status of the allergy or intolerance.
	 */
	public void setClinicalStatus(ClinicalStatus value) { clinicalStatus = value; }


	public enum VerificationStatus{
		@SerializedName("unconfirmed") UNCONFIRMED,
		@SerializedName("confirmed") CONFIRMED,
		@SerializedName("refuted") REFUTED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private VerificationStatus verificationStatus;

	/**
	 * Getter for verificationStatus
	 * @return Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified substance (including pharmaceutical product).
	 */
	public VerificationStatus getVerificationStatus() { return verificationStatus; }

	/**
	 * Setter for verificationStatus
	 * @param value Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified substance (including pharmaceutical product).
	 */
	public void setVerificationStatus(VerificationStatus value) { verificationStatus = value; }


	public enum Type{
		@SerializedName("allergy") ALLERGY,
		@SerializedName("intolerance") INTOLERANCE
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Identification of the underlying physiological mechanism for the reaction risk.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Identification of the underlying physiological mechanism for the reaction risk.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private ArrayList<String> category;

	/**
	 * Getter for category
	 * @return Category of the identified substance.
	 */
	public ArrayList<String> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Category of the identified substance.
	 */
	public void setCategory(ArrayList<String> value) { category = value; }


	public enum Criticality{
		@SerializedName("low") LOW,
		@SerializedName("high") HIGH,
		@SerializedName("unable-to-assess") UNABLE_TO_ASSESS
	}

	@Expose
	private Criticality criticality;

	/**
	 * Getter for criticality
	 * @return Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
	 */
	public Criticality getCriticality() { return criticality; }

	/**
	 * Setter for criticality
	 * @param value Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
	 */
	public void setCriticality(Criticality value) { criticality = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Code for an allergy or intolerance statement (either a positive or a negated/excluded statement).  This may be a code for a substance or pharmaceutical product that is considered to be responsible for the adverse reaction risk (e.g., "Latex"), an allergy or intolerance condition (e.g., "Latex allergy"), or a negated/excluded code for a specific substance or class (e.g., "No latex allergy") or a general or categorical negated statement (e.g.,  "No known allergy", "No known drug allergies").
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Code for an allergy or intolerance statement (either a positive or a negated/excluded statement).  This may be a code for a substance or pharmaceutical product that is considered to be responsible for the adverse reaction risk (e.g., "Latex"), an allergy or intolerance condition (e.g., "Latex allergy"), or a negated/excluded code for a specific substance or class (e.g., "No latex allergy") or a general or categorical negated statement (e.g.,  "No known allergy", "No known drug allergies").
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The patient who has the allergy or intolerance.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The patient who has the allergy or intolerance.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date onsetDateTime;

	/**
	 * Getter for onsetDateTime
	 * @return Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public Date getOnsetDateTime() { return onsetDateTime; }

	/**
	 * Setter for onsetDateTime
	 * @param value Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public void setOnsetDateTime(Date value) { onsetDateTime = value; }


	@Expose
	private Age onsetAge;

	/**
	 * Getter for onsetAge
	 * @return Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public Age getOnsetAge() { return onsetAge; }

	/**
	 * Setter for onsetAge
	 * @param value Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public void setOnsetAge(Age value) { onsetAge = value; }


	@Expose
	private Period onsetPeriod;

	/**
	 * Getter for onsetPeriod
	 * @return Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public Period getOnsetPeriod() { return onsetPeriod; }

	/**
	 * Setter for onsetPeriod
	 * @param value Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public void setOnsetPeriod(Period value) { onsetPeriod = value; }


	@Expose
	private Range onsetRange;

	/**
	 * Getter for onsetRange
	 * @return Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public Range getOnsetRange() { return onsetRange; }

	/**
	 * Setter for onsetRange
	 * @param value Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public void setOnsetRange(Range value) { onsetRange = value; }


	@Expose
	private String onsetString;

	/**
	 * Getter for onsetString
	 * @return Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public String getOnsetString() { return onsetString; }

	/**
	 * Setter for onsetString
	 * @param value Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
	 */
	public void setOnsetString(String value) { onsetString = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date assertedDate;

	/**
	 * Getter for assertedDate
	 * @return The date on which the existance of the AllergyIntolerance was first asserted or acknowledged.
	 */
	public Date getAssertedDate() { return assertedDate; }

	/**
	 * Setter for assertedDate
	 * @param value The date on which the existance of the AllergyIntolerance was first asserted or acknowledged.
	 */
	public void setAssertedDate(Date value) { assertedDate = value; }


	@Expose
	private Reference recorder;

	/**
	 * Getter for recorder
	 * @return Individual who recorded the record and takes responsibility for its content.
	 */
	public Reference getRecorder() { return recorder; }

	/**
	 * Setter for recorder
	 * @param value Individual who recorded the record and takes responsibility for its content.
	 */
	public void setRecorder(Reference value) { recorder = value; }


	@Expose
	private Reference asserter;

	/**
	 * Getter for asserter
	 * @return The source of the information about the allergy that is recorded.
	 */
	public Reference getAsserter() { return asserter; }

	/**
	 * Setter for asserter
	 * @param value The source of the information about the allergy that is recorded.
	 */
	public void setAsserter(Reference value) { asserter = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date lastOccurrence;

	/**
	 * Getter for lastOccurrence
	 * @return Represents the date and/or time of the last known occurrence of a reaction event.
	 */
	public Date getLastOccurrence() { return lastOccurrence; }

	/**
	 * Setter for lastOccurrence
	 * @param value Represents the date and/or time of the last known occurrence of a reaction event.
	 */
	public void setLastOccurrence(Date value) { lastOccurrence = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<AllergyIntoleranceReaction> reaction;

	/**
	 * Getter for reaction
	 * @return Details about each adverse reaction event linked to exposure to the identified substance.
	 */
	public ArrayList<AllergyIntoleranceReaction> getReaction() { return reaction; }

	/**
	 * Setter for reaction
	 * @param value Details about each adverse reaction event linked to exposure to the identified substance.
	 */
	public void setReaction(ArrayList<AllergyIntoleranceReaction> value) { reaction = value; }


}
