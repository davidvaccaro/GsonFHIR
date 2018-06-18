package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 */
public class CommunicationPayload extends BackboneElement {
	@Expose
	private String contentString;

	/**
	 * Getter for contentString
	 * @return A communicated content (or for multi-part communications, one portion of the communication).
	 */
	public String getContentString() { return contentString; }

	/**
	 * Setter for contentString
	 * @param value A communicated content (or for multi-part communications, one portion of the communication).
	 */
	public void setContentString(String value) { contentString = value; }


	@Expose
	private Attachment contentAttachment;

	/**
	 * Getter for contentAttachment
	 * @return A communicated content (or for multi-part communications, one portion of the communication).
	 */
	public Attachment getContentAttachment() { return contentAttachment; }

	/**
	 * Setter for contentAttachment
	 * @param value A communicated content (or for multi-part communications, one portion of the communication).
	 */
	public void setContentAttachment(Attachment value) { contentAttachment = value; }


	@Expose
	private Reference contentReference;

	/**
	 * Getter for contentReference
	 * @return A communicated content (or for multi-part communications, one portion of the communication).
	 */
	public Reference getContentReference() { return contentReference; }

	/**
	 * Setter for contentReference
	 * @param value A communicated content (or for multi-part communications, one portion of the communication).
	 */
	public void setContentReference(Reference value) { contentReference = value; }


}
