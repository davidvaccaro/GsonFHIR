package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A task to be performed.
 */
public class Task extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Task resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Task resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return The business identifier for this task.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The business identifier for this task.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String definitionUri;

	/**
	 * Getter for definitionUri
	 * @return A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc.
	 */
	public String getDefinitionUri() { return definitionUri; }

	/**
	 * Setter for definitionUri
	 * @param value A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc.
	 */
	public void setDefinitionUri(String value) { definitionUri = value; }


	@Expose
	private Reference definitionReference;

	/**
	 * Getter for definitionReference
	 * @return A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc.
	 */
	public Reference getDefinitionReference() { return definitionReference; }

	/**
	 * Setter for definitionReference
	 * @param value A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc.
	 */
	public void setDefinitionReference(Reference value) { definitionReference = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a "request" resource such as a ProcedureRequest, MedicationRequest, ProcedureRequest, CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfil.  This latter resource is referenced by FocusOn.  For example, based on a ProcedureRequest (= BasedOn), a task is created to fulfil a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a "request" resource such as a ProcedureRequest, MedicationRequest, ProcedureRequest, CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfil.  This latter resource is referenced by FocusOn.  For example, based on a ProcedureRequest (= BasedOn), a task is created to fulfil a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private Identifier groupIdentifier;

	/**
	 * Getter for groupIdentifier
	 * @return An identifier that links together multiple tasks and other requests that were created in the same context.
	 */
	public Identifier getGroupIdentifier() { return groupIdentifier; }

	/**
	 * Setter for groupIdentifier
	 * @param value An identifier that links together multiple tasks and other requests that were created in the same context.
	 */
	public void setGroupIdentifier(Identifier value) { groupIdentifier = value; }


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return Task that this particular task is part of.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value Task that this particular task is part of.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	public enum Status{
		@SerializedName("draft") DRAFT,
		@SerializedName("requested") REQUESTED,
		@SerializedName("received") RECEIVED,
		@SerializedName("accepted") ACCEPTED,
		@SerializedName("rejected") REJECTED,
		@SerializedName("ready") READY,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("on-hold") ON_HOLD,
		@SerializedName("failed") FAILED,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The current status of the task.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The current status of the task.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept statusReason;

	/**
	 * Getter for statusReason
	 * @return An explanation as to why this task is held, failed, was refused, etc.
	 */
	public CodeableConcept getStatusReason() { return statusReason; }

	/**
	 * Setter for statusReason
	 * @param value An explanation as to why this task is held, failed, was refused, etc.
	 */
	public void setStatusReason(CodeableConcept value) { statusReason = value; }


	@Expose
	private CodeableConcept businessStatus;

	/**
	 * Getter for businessStatus
	 * @return Contains business-specific nuances of the business state.
	 */
	public CodeableConcept getBusinessStatus() { return businessStatus; }

	/**
	 * Setter for businessStatus
	 * @param value Contains business-specific nuances of the business state.
	 */
	public void setBusinessStatus(CodeableConcept value) { businessStatus = value; }


	@Expose
	private String intent;

	/**
	 * Getter for intent
	 * @return Indicates the "level" of actionability associated with the Task.  I.e. Is this a proposed task, a planned task, an actionable task, etc.
	 */
	public String getIntent() { return intent; }

	/**
	 * Setter for intent
	 * @param value Indicates the "level" of actionability associated with the Task.  I.e. Is this a proposed task, a planned task, an actionable task, etc.
	 */
	public void setIntent(String value) { intent = value; }


	@Expose
	private String priority;

	/**
	 * Getter for priority
	 * @return Indicates how quickly the Task should be addressed with respect to other requests.
	 */
	public String getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Indicates how quickly the Task should be addressed with respect to other requests.
	 */
	public void setPriority(String value) { priority = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A name or code (or both) briefly describing what the task involves.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A name or code (or both) briefly describing what the task involves.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A free-text description of what is to be performed.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free-text description of what is to be performed.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private Reference focus;

	/**
	 * Getter for focus
	 * @return The request being actioned or the resource being manipulated by this task.
	 */
	public Reference getFocus() { return focus; }

	/**
	 * Setter for focus
	 * @param value The request being actioned or the resource being manipulated by this task.
	 */
	public void setFocus(Reference value) { focus = value; }


	@Expose
	@SerializedName("for")
	private Reference forValue;

	/**
	 * Getter for forValue
	 * @return The entity who benefits from the performance of the service specified in the task (e.g., the patient).
	 */
	public Reference getFor() { return forValue; }

	/**
	 * Setter for forValue
	 * @param value The entity who benefits from the performance of the service specified in the task (e.g., the patient).
	 */
	public void setFor(Reference value) { forValue = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	private Period executionPeriod;

	/**
	 * Getter for executionPeriod
	 * @return Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).
	 */
	public Period getExecutionPeriod() { return executionPeriod; }

	/**
	 * Setter for executionPeriod
	 * @param value Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).
	 */
	public void setExecutionPeriod(Period value) { executionPeriod = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date authoredOn;

	/**
	 * Getter for authoredOn
	 * @return The date and time this task was created.
	 */
	public Date getAuthoredOn() { return authoredOn; }

	/**
	 * Setter for authoredOn
	 * @param value The date and time this task was created.
	 */
	public void setAuthoredOn(Date value) { authoredOn = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date lastModified;

	/**
	 * Getter for lastModified
	 * @return The date and time of last modification to this task.
	 */
	public Date getLastModified() { return lastModified; }

	/**
	 * Setter for lastModified
	 * @param value The date and time of last modification to this task.
	 */
	public void setLastModified(Date value) { lastModified = value; }


	@Expose
	private TaskRequester requester;

	/**
	 * Getter for requester
	 * @return The creator of the task.
	 */
	public TaskRequester getRequester() { return requester; }

	/**
	 * Setter for requester
	 * @param value The creator of the task.
	 */
	public void setRequester(TaskRequester value) { requester = value; }


	@Expose
	private ArrayList<CodeableConcept> performerType;

	/**
	 * Getter for performerType
	 * @return The type of participant that can execute the task.
	 */
	public ArrayList<CodeableConcept> getPerformerType() { return performerType; }

	/**
	 * Setter for performerType
	 * @param value The type of participant that can execute the task.
	 */
	public void setPerformerType(ArrayList<CodeableConcept> value) { performerType = value; }


	@Expose
	private Reference owner;

	/**
	 * Getter for owner
	 * @return Individual organization or Device currently responsible for task execution.
	 */
	public Reference getOwner() { return owner; }

	/**
	 * Setter for owner
	 * @param value Individual organization or Device currently responsible for task execution.
	 */
	public void setOwner(Reference value) { owner = value; }


	@Expose
	private CodeableConcept reason;

	/**
	 * Getter for reason
	 * @return A description or code indicating why this task needs to be performed.
	 */
	public CodeableConcept getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value A description or code indicating why this task needs to be performed.
	 */
	public void setReason(CodeableConcept value) { reason = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Free-text information captured about the task as it progresses.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Free-text information captured about the task as it progresses.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<Reference> relevantHistory;

	/**
	 * Getter for relevantHistory
	 * @return Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.
	 */
	public ArrayList<Reference> getRelevantHistory() { return relevantHistory; }

	/**
	 * Setter for relevantHistory
	 * @param value Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.
	 */
	public void setRelevantHistory(ArrayList<Reference> value) { relevantHistory = value; }


	@Expose
	private TaskRestriction restriction;

	/**
	 * Getter for restriction
	 * @return If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
	 */
	public TaskRestriction getRestriction() { return restriction; }

	/**
	 * Setter for restriction
	 * @param value If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
	 */
	public void setRestriction(TaskRestriction value) { restriction = value; }


	@Expose
	private ArrayList<TaskInput> input;

	/**
	 * Getter for input
	 * @return Additional information that may be needed in the execution of the task.
	 */
	public ArrayList<TaskInput> getInput() { return input; }

	/**
	 * Setter for input
	 * @param value Additional information that may be needed in the execution of the task.
	 */
	public void setInput(ArrayList<TaskInput> value) { input = value; }


	@Expose
	private ArrayList<TaskOutput> output;

	/**
	 * Getter for output
	 * @return Outputs produced by the Task.
	 */
	public ArrayList<TaskOutput> getOutput() { return output; }

	/**
	 * Setter for output
	 * @param value Outputs produced by the Task.
	 */
	public void setOutput(ArrayList<TaskOutput> value) { output = value; }


}
