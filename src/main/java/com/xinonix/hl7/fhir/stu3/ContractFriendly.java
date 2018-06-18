package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class ContractFriendly extends BackboneElement {
	@Expose
	private Attachment contentAttachment;

	/**
	 * Getter for contentAttachment
	 * @return Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability.
	 */
	public Attachment getContentAttachment() { return contentAttachment; }

	/**
	 * Setter for contentAttachment
	 * @param value Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability.
	 */
	public void setContentAttachment(Attachment value) { contentAttachment = value; }


	@Expose
	private Reference contentReference;

	/**
	 * Getter for contentReference
	 * @return Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability.
	 */
	public Reference getContentReference() { return contentReference; }

	/**
	 * Setter for contentReference
	 * @param value Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability.
	 */
	public void setContentReference(Reference value) { contentReference = value; }


}
