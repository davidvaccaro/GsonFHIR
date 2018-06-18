package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 */
public class Goal extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Goal resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Goal resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("proposed") PROPOSED,
		@SerializedName("accepted") ACCEPTED,
		@SerializedName("planned") PLANNED,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("on-target") ON_TARGET,
		@SerializedName("ahead-of-target") AHEAD_OF_TARGET,
		@SerializedName("behind-target") BEHIND_TARGET,
		@SerializedName("sustaining") SUSTAINING,
		@SerializedName("achieved") ACHIEVED,
		@SerializedName("on-hold") ON_HOLD,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("rejected") REJECTED
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Indicates whether the goal has been reached and is still considered relevant.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Indicates whether the goal has been reached and is still considered relevant.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return Indicates a category the goal falls within.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Indicates a category the goal falls within.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private CodeableConcept priority;

	/**
	 * Getter for priority
	 * @return Identifies the mutually agreed level of importance associated with reaching/sustaining the goal.
	 */
	public CodeableConcept getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Identifies the mutually agreed level of importance associated with reaching/sustaining the goal.
	 */
	public void setPriority(CodeableConcept value) { priority = value; }


	@Expose
	private CodeableConcept description;

	/**
	 * Getter for description
	 * @return Human-readable and/or coded description of a specific desired objective of care, such as "control blood pressure" or "negotiate an obstacle course" or "dance with child at wedding".
	 */
	public CodeableConcept getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Human-readable and/or coded description of a specific desired objective of care, such as "control blood pressure" or "negotiate an obstacle course" or "dance with child at wedding".
	 */
	public void setDescription(CodeableConcept value) { description = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Identifies the patient, group or organization for whom the goal is being established.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Identifies the patient, group or organization for whom the goal is being established.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date startDate;

	/**
	 * Getter for startDate
	 * @return The date or event after which the goal should begin being pursued.
	 */
	public Date getStartDate() { return startDate; }

	/**
	 * Setter for startDate
	 * @param value The date or event after which the goal should begin being pursued.
	 */
	public void setStartDate(Date value) { startDate = value; }


	@Expose
	private CodeableConcept startCodeableConcept;

	/**
	 * Getter for startCodeableConcept
	 * @return The date or event after which the goal should begin being pursued.
	 */
	public CodeableConcept getStartCodeableConcept() { return startCodeableConcept; }

	/**
	 * Setter for startCodeableConcept
	 * @param value The date or event after which the goal should begin being pursued.
	 */
	public void setStartCodeableConcept(CodeableConcept value) { startCodeableConcept = value; }


	@Expose
	private GoalTarget target;

	/**
	 * Getter for target
	 * @return Indicates what should be done by when.
	 */
	public GoalTarget getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value Indicates what should be done by when.
	 */
	public void setTarget(GoalTarget value) { target = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date statusDate;

	/**
	 * Getter for statusDate
	 * @return Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
	 */
	public Date getStatusDate() { return statusDate; }

	/**
	 * Setter for statusDate
	 * @param value Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
	 */
	public void setStatusDate(Date value) { statusDate = value; }


	@Expose
	private String statusReason;

	/**
	 * Getter for statusReason
	 * @return Captures the reason for the current status.
	 */
	public String getStatusReason() { return statusReason; }

	/**
	 * Setter for statusReason
	 * @param value Captures the reason for the current status.
	 */
	public void setStatusReason(String value) { statusReason = value; }


	@Expose
	private Reference expressedBy;

	/**
	 * Getter for expressedBy
	 * @return Indicates whose goal this is - patient goal, practitioner goal, etc.
	 */
	public Reference getExpressedBy() { return expressedBy; }

	/**
	 * Setter for expressedBy
	 * @param value Indicates whose goal this is - patient goal, practitioner goal, etc.
	 */
	public void setExpressedBy(Reference value) { expressedBy = value; }


	@Expose
	private ArrayList<Reference> addresses;

	/**
	 * Getter for addresses
	 * @return The identified conditions and other health record elements that are intended to be addressed by the goal.
	 */
	public ArrayList<Reference> getAddresses() { return addresses; }

	/**
	 * Setter for addresses
	 * @param value The identified conditions and other health record elements that are intended to be addressed by the goal.
	 */
	public void setAddresses(ArrayList<Reference> value) { addresses = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Any comments related to the goal.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Any comments related to the goal.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<CodeableConcept> outcomeCode;

	/**
	 * Getter for outcomeCode
	 * @return Identifies the change (or lack of change) at the point when the status of the goal is assessed.
	 */
	public ArrayList<CodeableConcept> getOutcomeCode() { return outcomeCode; }

	/**
	 * Setter for outcomeCode
	 * @param value Identifies the change (or lack of change) at the point when the status of the goal is assessed.
	 */
	public void setOutcomeCode(ArrayList<CodeableConcept> value) { outcomeCode = value; }


	@Expose
	private ArrayList<Reference> outcomeReference;

	/**
	 * Getter for outcomeReference
	 * @return Details of what's changed (or not changed).
	 */
	public ArrayList<Reference> getOutcomeReference() { return outcomeReference; }

	/**
	 * Setter for outcomeReference
	 * @param value Details of what's changed (or not changed).
	 */
	public void setOutcomeReference(ArrayList<Reference> value) { outcomeReference = value; }


}
