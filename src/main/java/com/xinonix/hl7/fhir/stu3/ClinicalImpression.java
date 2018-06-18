package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 */
public class ClinicalImpression extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ClinicalImpression resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ClinicalImpression resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A unique identifier assigned to the clinical impression that remains consistent regardless of what server the impression is stored on.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A unique identifier assigned to the clinical impression that remains consistent regardless of what server the impression is stored on.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("draft") DRAFT,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Identifies the workflow status of the assessment.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Identifies the workflow status of the assessment.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Categorizes the type of clinical assessment performed.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Categorizes the type of clinical assessment performed.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A summary of the context and/or cause of the assessment - why / where was it performed, and what patient events/status prompted it.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A summary of the context and/or cause of the assessment - why / where was it performed, and what patient events/status prompted it.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient or group of individuals assessed as part of this record.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient or group of individuals assessed as part of this record.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter or episode of care this impression was created as part of.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter or episode of care this impression was created as part of.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date effectiveDateTime;

	/**
	 * Getter for effectiveDateTime
	 * @return The point in time or period over which the subject was assessed.
	 */
	public Date getEffectiveDateTime() { return effectiveDateTime; }

	/**
	 * Setter for effectiveDateTime
	 * @param value The point in time or period over which the subject was assessed.
	 */
	public void setEffectiveDateTime(Date value) { effectiveDateTime = value; }


	@Expose
	private Period effectivePeriod;

	/**
	 * Getter for effectivePeriod
	 * @return The point in time or period over which the subject was assessed.
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value The point in time or period over which the subject was assessed.
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return Indicates when the documentation of the assessment was complete.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value Indicates when the documentation of the assessment was complete.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Reference assessor;

	/**
	 * Getter for assessor
	 * @return The clinician performing the assessment.
	 */
	public Reference getAssessor() { return assessor; }

	/**
	 * Setter for assessor
	 * @param value The clinician performing the assessment.
	 */
	public void setAssessor(Reference value) { assessor = value; }


	@Expose
	private Reference previous;

	/**
	 * Getter for previous
	 * @return A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
	 */
	public Reference getPrevious() { return previous; }

	/**
	 * Setter for previous
	 * @param value A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
	 */
	public void setPrevious(Reference value) { previous = value; }


	@Expose
	private ArrayList<Reference> problem;

	/**
	 * Getter for problem
	 * @return This a list of the relevant problems/conditions for a patient.
	 */
	public ArrayList<Reference> getProblem() { return problem; }

	/**
	 * Setter for problem
	 * @param value This a list of the relevant problems/conditions for a patient.
	 */
	public void setProblem(ArrayList<Reference> value) { problem = value; }


	@Expose
	private ArrayList<ClinicalImpressionInvestigation> investigation;

	/**
	 * Getter for investigation
	 * @return One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
	 */
	public ArrayList<ClinicalImpressionInvestigation> getInvestigation() { return investigation; }

	/**
	 * Setter for investigation
	 * @param value One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
	 */
	public void setInvestigation(ArrayList<ClinicalImpressionInvestigation> value) { investigation = value; }


	@Expose
	private ArrayList<String> protocol;

	/**
	 * Getter for protocol
	 * @return Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
	 */
	public ArrayList<String> getProtocol() { return protocol; }

	/**
	 * Setter for protocol
	 * @param value Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
	 */
	public void setProtocol(ArrayList<String> value) { protocol = value; }


	@Expose
	private String summary;

	/**
	 * Getter for summary
	 * @return A text summary of the investigations and the diagnosis.
	 */
	public String getSummary() { return summary; }

	/**
	 * Setter for summary
	 * @param value A text summary of the investigations and the diagnosis.
	 */
	public void setSummary(String value) { summary = value; }


	@Expose
	private ArrayList<ClinicalImpressionFinding> finding;

	/**
	 * Getter for finding
	 * @return Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.
	 */
	public ArrayList<ClinicalImpressionFinding> getFinding() { return finding; }

	/**
	 * Setter for finding
	 * @param value Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.
	 */
	public void setFinding(ArrayList<ClinicalImpressionFinding> value) { finding = value; }


	@Expose
	private ArrayList<CodeableConcept> prognosisCodeableConcept;

	/**
	 * Getter for prognosisCodeableConcept
	 * @return Estimate of likely outcome.
	 */
	public ArrayList<CodeableConcept> getPrognosisCodeableConcept() { return prognosisCodeableConcept; }

	/**
	 * Setter for prognosisCodeableConcept
	 * @param value Estimate of likely outcome.
	 */
	public void setPrognosisCodeableConcept(ArrayList<CodeableConcept> value) { prognosisCodeableConcept = value; }


	@Expose
	private ArrayList<Reference> prognosisReference;

	/**
	 * Getter for prognosisReference
	 * @return RiskAssessment expressing likely outcome.
	 */
	public ArrayList<Reference> getPrognosisReference() { return prognosisReference; }

	/**
	 * Setter for prognosisReference
	 * @param value RiskAssessment expressing likely outcome.
	 */
	public void setPrognosisReference(ArrayList<Reference> value) { prognosisReference = value; }


	@Expose
	private ArrayList<Reference> action;

	/**
	 * Getter for action
	 * @return Action taken as part of assessment procedure.
	 */
	public ArrayList<Reference> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Action taken as part of assessment procedure.
	 */
	public void setAction(ArrayList<Reference> value) { action = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
