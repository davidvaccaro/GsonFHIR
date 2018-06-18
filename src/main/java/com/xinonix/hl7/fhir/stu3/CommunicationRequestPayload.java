package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 */
public class CommunicationRequestPayload extends BackboneElement {
	@Expose
	private String contentString;

	/**
	 * Getter for contentString
	 * @return The communicated content (or for multi-part communications, one portion of the communication).
	 */
	public String getContentString() { return contentString; }

	/**
	 * Setter for contentString
	 * @param value The communicated content (or for multi-part communications, one portion of the communication).
	 */
	public void setContentString(String value) { contentString = value; }


	@Expose
	private Attachment contentAttachment;

	/**
	 * Getter for contentAttachment
	 * @return The communicated content (or for multi-part communications, one portion of the communication).
	 */
	public Attachment getContentAttachment() { return contentAttachment; }

	/**
	 * Setter for contentAttachment
	 * @param value The communicated content (or for multi-part communications, one portion of the communication).
	 */
	public void setContentAttachment(Attachment value) { contentAttachment = value; }


	@Expose
	private Reference contentReference;

	/**
	 * Getter for contentReference
	 * @return The communicated content (or for multi-part communications, one portion of the communication).
	 */
	public Reference getContentReference() { return contentReference; }

	/**
	 * Setter for contentReference
	 * @param value The communicated content (or for multi-part communications, one portion of the communication).
	 */
	public void setContentReference(Reference value) { contentReference = value; }


}
