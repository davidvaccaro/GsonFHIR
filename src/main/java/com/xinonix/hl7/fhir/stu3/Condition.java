package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 */
public class Condition extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Condition resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Condition resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String clinicalStatus;

	/**
	 * Getter for clinicalStatus
	 * @return The clinical status of the condition.
	 */
	public String getClinicalStatus() { return clinicalStatus; }

	/**
	 * Setter for clinicalStatus
	 * @param value The clinical status of the condition.
	 */
	public void setClinicalStatus(String value) { clinicalStatus = value; }


	public enum VerificationStatus{
		@SerializedName("provisional") PROVISIONAL,
		@SerializedName("differential") DIFFERENTIAL,
		@SerializedName("confirmed") CONFIRMED,
		@SerializedName("refuted") REFUTED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private VerificationStatus verificationStatus;

	/**
	 * Getter for verificationStatus
	 * @return The verification status to support the clinical status of the condition.
	 */
	public VerificationStatus getVerificationStatus() { return verificationStatus; }

	/**
	 * Setter for verificationStatus
	 * @param value The verification status to support the clinical status of the condition.
	 */
	public void setVerificationStatus(VerificationStatus value) { verificationStatus = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return A category assigned to the condition.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value A category assigned to the condition.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private CodeableConcept severity;

	/**
	 * Getter for severity
	 * @return A subjective assessment of the severity of the condition as evaluated by the clinician.
	 */
	public CodeableConcept getSeverity() { return severity; }

	/**
	 * Setter for severity
	 * @param value A subjective assessment of the severity of the condition as evaluated by the clinician.
	 */
	public void setSeverity(CodeableConcept value) { severity = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Identification of the condition, problem or diagnosis.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Identification of the condition, problem or diagnosis.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private ArrayList<CodeableConcept> bodySite;

	/**
	 * Getter for bodySite
	 * @return The anatomical location where this condition manifests itself.
	 */
	public ArrayList<CodeableConcept> getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value The anatomical location where this condition manifests itself.
	 */
	public void setBodySite(ArrayList<CodeableConcept> value) { bodySite = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Indicates the patient or group who the condition record is associated with.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Indicates the patient or group who the condition record is associated with.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return Encounter during which the condition was first asserted.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value Encounter during which the condition was first asserted.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date onsetDateTime;

	/**
	 * Getter for onsetDateTime
	 * @return Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public Date getOnsetDateTime() { return onsetDateTime; }

	/**
	 * Setter for onsetDateTime
	 * @param value Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public void setOnsetDateTime(Date value) { onsetDateTime = value; }


	@Expose
	private Age onsetAge;

	/**
	 * Getter for onsetAge
	 * @return Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public Age getOnsetAge() { return onsetAge; }

	/**
	 * Setter for onsetAge
	 * @param value Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public void setOnsetAge(Age value) { onsetAge = value; }


	@Expose
	private Period onsetPeriod;

	/**
	 * Getter for onsetPeriod
	 * @return Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public Period getOnsetPeriod() { return onsetPeriod; }

	/**
	 * Setter for onsetPeriod
	 * @param value Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public void setOnsetPeriod(Period value) { onsetPeriod = value; }


	@Expose
	private Range onsetRange;

	/**
	 * Getter for onsetRange
	 * @return Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public Range getOnsetRange() { return onsetRange; }

	/**
	 * Setter for onsetRange
	 * @param value Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public void setOnsetRange(Range value) { onsetRange = value; }


	@Expose
	private String onsetString;

	/**
	 * Getter for onsetString
	 * @return Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public String getOnsetString() { return onsetString; }

	/**
	 * Setter for onsetString
	 * @param value Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
	 */
	public void setOnsetString(String value) { onsetString = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date abatementDateTime;

	/**
	 * Getter for abatementDateTime
	 * @return The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public Date getAbatementDateTime() { return abatementDateTime; }

	/**
	 * Setter for abatementDateTime
	 * @param value The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public void setAbatementDateTime(Date value) { abatementDateTime = value; }


	@Expose
	private Age abatementAge;

	/**
	 * Getter for abatementAge
	 * @return The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public Age getAbatementAge() { return abatementAge; }

	/**
	 * Setter for abatementAge
	 * @param value The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public void setAbatementAge(Age value) { abatementAge = value; }


	@Expose
	private boolean abatementBoolean;

	/**
	 * Getter for abatementBoolean
	 * @return The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public boolean getAbatementBoolean() { return abatementBoolean; }

	/**
	 * Setter for abatementBoolean
	 * @param value The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public void setAbatementBoolean(boolean value) { abatementBoolean = value; }


	@Expose
	private Period abatementPeriod;

	/**
	 * Getter for abatementPeriod
	 * @return The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public Period getAbatementPeriod() { return abatementPeriod; }

	/**
	 * Setter for abatementPeriod
	 * @param value The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public void setAbatementPeriod(Period value) { abatementPeriod = value; }


	@Expose
	private Range abatementRange;

	/**
	 * Getter for abatementRange
	 * @return The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public Range getAbatementRange() { return abatementRange; }

	/**
	 * Setter for abatementRange
	 * @param value The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public void setAbatementRange(Range value) { abatementRange = value; }


	@Expose
	private String abatementString;

	/**
	 * Getter for abatementString
	 * @return The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public String getAbatementString() { return abatementString; }

	/**
	 * Setter for abatementString
	 * @param value The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
	 */
	public void setAbatementString(String value) { abatementString = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date assertedDate;

	/**
	 * Getter for assertedDate
	 * @return The date on which the existance of the Condition was first asserted or acknowledged.
	 */
	public Date getAssertedDate() { return assertedDate; }

	/**
	 * Setter for assertedDate
	 * @param value The date on which the existance of the Condition was first asserted or acknowledged.
	 */
	public void setAssertedDate(Date value) { assertedDate = value; }


	@Expose
	private Reference asserter;

	/**
	 * Getter for asserter
	 * @return Individual who is making the condition statement.
	 */
	public Reference getAsserter() { return asserter; }

	/**
	 * Setter for asserter
	 * @param value Individual who is making the condition statement.
	 */
	public void setAsserter(Reference value) { asserter = value; }


	@Expose
	private ConditionStage stage;

	/**
	 * Getter for stage
	 * @return Clinical stage or grade of a condition. May include formal severity assessments.
	 */
	public ConditionStage getStage() { return stage; }

	/**
	 * Setter for stage
	 * @param value Clinical stage or grade of a condition. May include formal severity assessments.
	 */
	public void setStage(ConditionStage value) { stage = value; }


	@Expose
	private ArrayList<ConditionEvidence> evidence;

	/**
	 * Getter for evidence
	 * @return Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.
	 */
	public ArrayList<ConditionEvidence> getEvidence() { return evidence; }

	/**
	 * Setter for evidence
	 * @param value Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.
	 */
	public void setEvidence(ArrayList<ConditionEvidence> value) { evidence = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
