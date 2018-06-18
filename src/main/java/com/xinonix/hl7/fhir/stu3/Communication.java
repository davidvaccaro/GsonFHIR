package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 */
public class Communication extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Communication resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Communication resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.
	 */
	public void setDefinition(ArrayList<Reference> value) { definition = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return An order, proposal or plan fulfilled in whole or in part by this Communication.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value An order, proposal or plan fulfilled in whole or in part by this Communication.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return Part of this action.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value Part of this action.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the transmission.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the transmission.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private boolean notDone;

	/**
	 * Getter for notDone
	 * @return If true, indicates that the described communication event did not actually occur.
	 */
	public boolean getNotDone() { return notDone; }

	/**
	 * Setter for notDone
	 * @param value If true, indicates that the described communication event did not actually occur.
	 */
	public void setNotDone(boolean value) { notDone = value; }


	@Expose
	private CodeableConcept notDoneReason;

	/**
	 * Getter for notDoneReason
	 * @return Describes why the communication event did not occur in coded and/or textual form.
	 */
	public CodeableConcept getNotDoneReason() { return notDoneReason; }

	/**
	 * Setter for notDoneReason
	 * @param value Describes why the communication event did not occur in coded and/or textual form.
	 */
	public void setNotDoneReason(CodeableConcept value) { notDoneReason = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return The type of message conveyed such as alert, notification, reminder, instruction, etc.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value The type of message conveyed such as alert, notification, reminder, instruction, etc.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private ArrayList<CodeableConcept> medium;

	/**
	 * Getter for medium
	 * @return A channel that was used for this communication (e.g. email, fax).
	 */
	public ArrayList<CodeableConcept> getMedium() { return medium; }

	/**
	 * Setter for medium
	 * @param value A channel that was used for this communication (e.g. email, fax).
	 */
	public void setMedium(ArrayList<CodeableConcept> value) { medium = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient or group that was the focus of this communication.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient or group that was the focus of this communication.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private ArrayList<Reference> recipient;

	/**
	 * Getter for recipient
	 * @return The entity (e.g. person, organization, clinical information system, or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).
	 */
	public ArrayList<Reference> getRecipient() { return recipient; }

	/**
	 * Setter for recipient
	 * @param value The entity (e.g. person, organization, clinical information system, or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).
	 */
	public void setRecipient(ArrayList<Reference> value) { recipient = value; }


	@Expose
	private ArrayList<Reference> topic;

	/**
	 * Getter for topic
	 * @return The resources which were responsible for or related to producing this communication.
	 */
	public ArrayList<Reference> getTopic() { return topic; }

	/**
	 * Setter for topic
	 * @param value The resources which were responsible for or related to producing this communication.
	 */
	public void setTopic(ArrayList<Reference> value) { topic = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter within which the communication was sent.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter within which the communication was sent.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date sent;

	/**
	 * Getter for sent
	 * @return The time when this communication was sent.
	 */
	public Date getSent() { return sent; }

	/**
	 * Setter for sent
	 * @param value The time when this communication was sent.
	 */
	public void setSent(Date value) { sent = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date received;

	/**
	 * Getter for received
	 * @return The time when this communication arrived at the destination.
	 */
	public Date getReceived() { return received; }

	/**
	 * Setter for received
	 * @param value The time when this communication arrived at the destination.
	 */
	public void setReceived(Date value) { received = value; }


	@Expose
	private Reference sender;

	/**
	 * Getter for sender
	 * @return The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.
	 */
	public Reference getSender() { return sender; }

	/**
	 * Setter for sender
	 * @param value The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.
	 */
	public void setSender(Reference value) { sender = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return The reason or justification for the communication.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value The reason or justification for the communication.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Indicates another resource whose existence justifies this communication.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Indicates another resource whose existence justifies this communication.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<CommunicationPayload> payload;

	/**
	 * Getter for payload
	 * @return Text, attachment(s), or resource(s) that was communicated to the recipient.
	 */
	public ArrayList<CommunicationPayload> getPayload() { return payload; }

	/**
	 * Setter for payload
	 * @param value Text, attachment(s), or resource(s) that was communicated to the recipient.
	 */
	public void setPayload(ArrayList<CommunicationPayload> value) { payload = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Additional notes or commentary about the communication by the sender, receiver or other interested parties.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Additional notes or commentary about the communication by the sender, receiver or other interested parties.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
