package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 */
public class DetectedIssue extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DetectedIssue resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DetectedIssue resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Business identifier associated with the detected issue record.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Business identifier associated with the detected issue record.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return Indicates the status of the detected issue.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Indicates the status of the detected issue.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Identifies the general type of issue identified.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Identifies the general type of issue identified.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	public enum Severity{
		@SerializedName("high") HIGH,
		@SerializedName("moderate") MODERATE,
		@SerializedName("low") LOW
	}

	@Expose
	private Severity severity;

	/**
	 * Getter for severity
	 * @return Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
	 */
	public Severity getSeverity() { return severity; }

	/**
	 * Setter for severity
	 * @param value Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
	 */
	public void setSeverity(Severity value) { severity = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return Indicates the patient whose record the detected issue is associated with.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value Indicates the patient whose record the detected issue is associated with.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date or date-time when the detected issue was initially identified.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date or date-time when the detected issue was initially identified.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.
	 */
	public void setAuthor(Reference value) { author = value; }


	@Expose
	private ArrayList<Reference> implicated;

	/**
	 * Getter for implicated
	 * @return Indicates the resource representing the current activity or proposed activity that is potentially problematic.
	 */
	public ArrayList<Reference> getImplicated() { return implicated; }

	/**
	 * Setter for implicated
	 * @param value Indicates the resource representing the current activity or proposed activity that is potentially problematic.
	 */
	public void setImplicated(ArrayList<Reference> value) { implicated = value; }


	@Expose
	private String detail;

	/**
	 * Getter for detail
	 * @return A textual explanation of the detected issue.
	 */
	public String getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value A textual explanation of the detected issue.
	 */
	public void setDetail(String value) { detail = value; }


	@Expose
	private String reference;

	/**
	 * Getter for reference
	 * @return The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
	 */
	public String getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
	 */
	public void setReference(String value) { reference = value; }


	@Expose
	private ArrayList<DetectedIssueMitigation> mitigation;

	/**
	 * Getter for mitigation
	 * @return Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
	 */
	public ArrayList<DetectedIssueMitigation> getMitigation() { return mitigation; }

	/**
	 * Setter for mitigation
	 * @param value Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
	 */
	public void setMitigation(ArrayList<DetectedIssueMitigation> value) { mitigation = value; }


}
