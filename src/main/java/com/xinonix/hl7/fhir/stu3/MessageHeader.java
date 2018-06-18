package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 */
public class MessageHeader extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a MessageHeader resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a MessageHeader resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Coding event;

	/**
	 * Getter for event
	 * @return Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value "http://hl7.org/fhir/message-events".
	 */
	public Coding getEvent() { return event; }

	/**
	 * Setter for event
	 * @param value Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value "http://hl7.org/fhir/message-events".
	 */
	public void setEvent(Coding value) { event = value; }


	@Expose
	private ArrayList<MessageHeaderDestination> destination;

	/**
	 * Getter for destination
	 * @return The destination application which the message is intended for.
	 */
	public ArrayList<MessageHeaderDestination> getDestination() { return destination; }

	/**
	 * Setter for destination
	 * @param value The destination application which the message is intended for.
	 */
	public void setDestination(ArrayList<MessageHeaderDestination> value) { destination = value; }


	@Expose
	private Reference receiver;

	/**
	 * Getter for receiver
	 * @return Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.
	 */
	public Reference getReceiver() { return receiver; }

	/**
	 * Setter for receiver
	 * @param value Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.
	 */
	public void setReceiver(Reference value) { receiver = value; }


	@Expose
	private Reference sender;

	/**
	 * Getter for sender
	 * @return Identifies the sending system to allow the use of a trust relationship.
	 */
	public Reference getSender() { return sender; }

	/**
	 * Setter for sender
	 * @param value Identifies the sending system to allow the use of a trust relationship.
	 */
	public void setSender(Reference value) { sender = value; }


	@Expose
	private String timestamp;

	/**
	 * Getter for timestamp
	 * @return The time that the message was sent.
	 */
	public String getTimestamp() { return timestamp; }

	/**
	 * Setter for timestamp
	 * @param value The time that the message was sent.
	 */
	public void setTimestamp(String value) { timestamp = value; }


	@Expose
	private Reference enterer;

	/**
	 * Getter for enterer
	 * @return The person or device that performed the data entry leading to this message. When there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.
	 */
	public Reference getEnterer() { return enterer; }

	/**
	 * Setter for enterer
	 * @param value The person or device that performed the data entry leading to this message. When there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.
	 */
	public void setEnterer(Reference value) { enterer = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return The logical author of the message - the person or device that decided the described event should happen. When there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value The logical author of the message - the person or device that decided the described event should happen. When there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.
	 */
	public void setAuthor(Reference value) { author = value; }


	@Expose
	private MessageHeaderSource source;

	/**
	 * Getter for source
	 * @return The source application from which this message originated.
	 */
	public MessageHeaderSource getSource() { return source; }

	/**
	 * Setter for source
	 * @param value The source application from which this message originated.
	 */
	public void setSource(MessageHeaderSource value) { source = value; }


	@Expose
	private Reference responsible;

	/**
	 * Getter for responsible
	 * @return The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.
	 */
	public Reference getResponsible() { return responsible; }

	/**
	 * Setter for responsible
	 * @param value The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.
	 */
	public void setResponsible(Reference value) { responsible = value; }


	@Expose
	private CodeableConcept reason;

	/**
	 * Getter for reason
	 * @return Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.
	 */
	public CodeableConcept getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.
	 */
	public void setReason(CodeableConcept value) { reason = value; }


	@Expose
	private MessageHeaderResponse response;

	/**
	 * Getter for response
	 * @return Information about the message that this message is a response to.  Only present if this message is a response.
	 */
	public MessageHeaderResponse getResponse() { return response; }

	/**
	 * Setter for response
	 * @param value Information about the message that this message is a response to.  Only present if this message is a response.
	 */
	public void setResponse(MessageHeaderResponse value) { response = value; }


	@Expose
	private ArrayList<Reference> focus;

	/**
	 * Getter for focus
	 * @return The actual data of the message - a reference to the root/focus class of the event.
	 */
	public ArrayList<Reference> getFocus() { return focus; }

	/**
	 * Setter for focus
	 * @param value The actual data of the message - a reference to the root/focus class of the event.
	 */
	public void setFocus(ArrayList<Reference> value) { focus = value; }


}
