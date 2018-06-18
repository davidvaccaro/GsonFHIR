package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Prospective warnings of potential issues when providing care to the patient.
 */
public class Flag extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Flag resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Flag resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier assigned to the flag for external use (outside the FHIR environment).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier assigned to the flag for external use (outside the FHIR environment).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("inactive") INACTIVE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Supports basic workflow.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Supports basic workflow.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Allows an flag to be divided into different categories like clinical, administrative etc. Intended to be used as a means of filtering which flags are displayed to particular user or in a given context.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Allows an flag to be divided into different categories like clinical, administrative etc. Intended to be used as a means of filtering which flags are displayed to particular user or in a given context.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return The coded value or textual component of the flag to display to the user.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The coded value or textual component of the flag to display to the user.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient, location, group , organization , or practitioner, etc. this is about record this flag is associated with.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient, location, group , organization , or practitioner, etc. this is about record this flag is associated with.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period of time from the activation of the flag to inactivation of the flag. If the flag is active, the end of the period should be unspecified.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period of time from the activation of the flag to inactivation of the flag. If the flag is active, the end of the period should be unspecified.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Reference encounter;

	/**
	 * Getter for encounter
	 * @return This alert is only relevant during the encounter.
	 */
	public Reference getEncounter() { return encounter; }

	/**
	 * Setter for encounter
	 * @param value This alert is only relevant during the encounter.
	 */
	public void setEncounter(Reference value) { encounter = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return The person, organization or device that created the flag.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value The person, organization or device that created the flag.
	 */
	public void setAuthor(Reference value) { author = value; }


}
