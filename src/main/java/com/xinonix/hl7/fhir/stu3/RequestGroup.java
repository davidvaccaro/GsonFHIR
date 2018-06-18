package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 */
public class RequestGroup extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a RequestGroup resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a RequestGroup resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Allows a service to provide a unique, business identifier for the request.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Allows a service to provide a unique, business identifier for the request.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return A protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
	 */
	public void setDefinition(ArrayList<Reference> value) { definition = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return A plan, proposal or order that is fulfilled in whole or in part by this request.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A plan, proposal or order that is fulfilled in whole or in part by this request.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private ArrayList<Reference> replaces;

	/**
	 * Getter for replaces
	 * @return Completed or terminated request(s) whose function is taken by this new request.
	 */
	public ArrayList<Reference> getReplaces() { return replaces; }

	/**
	 * Setter for replaces
	 * @param value Completed or terminated request(s) whose function is taken by this new request.
	 */
	public void setReplaces(ArrayList<Reference> value) { replaces = value; }


	@Expose
	private Identifier groupIdentifier;

	/**
	 * Getter for groupIdentifier
	 * @return A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition, prescription or similar form.
	 */
	public Identifier getGroupIdentifier() { return groupIdentifier; }

	/**
	 * Setter for groupIdentifier
	 * @param value A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition, prescription or similar form.
	 */
	public void setGroupIdentifier(Identifier value) { groupIdentifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The current state of the request. For request groups, the status reflects the status of all the requests in the group.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The current state of the request. For request groups, the status reflects the status of all the requests in the group.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private String intent;

	/**
	 * Getter for intent
	 * @return Indicates the level of authority/intentionality associated with the request and where the request fits into the workflow chain.
	 */
	public String getIntent() { return intent; }

	/**
	 * Setter for intent
	 * @param value Indicates the level of authority/intentionality associated with the request and where the request fits into the workflow chain.
	 */
	public void setIntent(String value) { intent = value; }


	@Expose
	private String priority;

	/**
	 * Getter for priority
	 * @return Indicates how quickly the request should be addressed with respect to other requests.
	 */
	public String getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Indicates how quickly the request should be addressed with respect to other requests.
	 */
	public void setPriority(String value) { priority = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The subject for which the request group was created.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The subject for which the request group was created.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return Describes the context of the request group, if any.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value Describes the context of the request group, if any.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date authoredOn;

	/**
	 * Getter for authoredOn
	 * @return Indicates when the request group was created.
	 */
	public Date getAuthoredOn() { return authoredOn; }

	/**
	 * Setter for authoredOn
	 * @param value Indicates when the request group was created.
	 */
	public void setAuthoredOn(Date value) { authoredOn = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return Provides a reference to the author of the request group.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Provides a reference to the author of the request group.
	 */
	public void setAuthor(Reference value) { author = value; }


	@Expose
	private CodeableConcept reasonCodeableConcept;

	/**
	 * Getter for reasonCodeableConcept
	 * @return Indicates the reason the request group was created. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 */
	public CodeableConcept getReasonCodeableConcept() { return reasonCodeableConcept; }

	/**
	 * Setter for reasonCodeableConcept
	 * @param value Indicates the reason the request group was created. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 */
	public void setReasonCodeableConcept(CodeableConcept value) { reasonCodeableConcept = value; }


	@Expose
	private Reference reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Indicates the reason the request group was created. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 */
	public Reference getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Indicates the reason the request group was created. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 */
	public void setReasonReference(Reference value) { reasonReference = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Provides a mechanism to communicate additional information about the response.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Provides a mechanism to communicate additional information about the response.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<RequestGroupAction> action;

	/**
	 * Getter for action
	 * @return The actions, if any, produced by the evaluation of the artifact.
	 */
	public ArrayList<RequestGroupAction> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value The actions, if any, produced by the evaluation of the artifact.
	 */
	public void setAction(ArrayList<RequestGroupAction> value) { action = value; }


}
