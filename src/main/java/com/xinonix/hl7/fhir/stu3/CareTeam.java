package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 */
public class CareTeam extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a CareTeam resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a CareTeam resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this care team that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this care team that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("proposed") PROPOSED,
		@SerializedName("active") ACTIVE,
		@SerializedName("suspended") SUSPENDED,
		@SerializedName("inactive") INACTIVE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Indicates the current state of the care team.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Indicates the current state of the care team.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return Identifies what kind of team.  This is to support differentiation between multiple co-existing teams, such as care plan team, episode of care team, longitudinal care team.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Identifies what kind of team.  This is to support differentiation between multiple co-existing teams, such as care plan team, episode of care team, longitudinal care team.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A label for human use intended to distinguish like teams.  E.g. the "red" vs. "green" trauma teams.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A label for human use intended to distinguish like teams.  E.g. the "red" vs. "green" trauma teams.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Identifies the patient or group whose intended care is handled by the team.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Identifies the patient or group whose intended care is handled by the team.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter or episode of care that establishes the context for this care team.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter or episode of care that establishes the context for this care team.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Indicates when the team did (or is intended to) come into effect and end.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Indicates when the team did (or is intended to) come into effect and end.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<CareTeamParticipant> participant;

	/**
	 * Getter for participant
	 * @return Identifies all people and organizations who are expected to be involved in the care team.
	 */
	public ArrayList<CareTeamParticipant> getParticipant() { return participant; }

	/**
	 * Setter for participant
	 * @param value Identifies all people and organizations who are expected to be involved in the care team.
	 */
	public void setParticipant(ArrayList<CareTeamParticipant> value) { participant = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return Describes why the care team exists.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value Describes why the care team exists.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Condition(s) that this care team addresses.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Condition(s) that this care team addresses.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<Reference> managingOrganization;

	/**
	 * Getter for managingOrganization
	 * @return The organization responsible for the care team.
	 */
	public ArrayList<Reference> getManagingOrganization() { return managingOrganization; }

	/**
	 * Setter for managingOrganization
	 * @param value The organization responsible for the care team.
	 */
	public void setManagingOrganization(ArrayList<Reference> value) { managingOrganization = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Comments made about the CareTeam.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Comments made about the CareTeam.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
