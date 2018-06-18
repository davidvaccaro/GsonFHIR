package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class ContractLegal extends BackboneElement {
	@Expose
	private Attachment contentAttachment;

	/**
	 * Getter for contentAttachment
	 * @return Contract legal text in human renderable form.
	 */
	public Attachment getContentAttachment() { return contentAttachment; }

	/**
	 * Setter for contentAttachment
	 * @param value Contract legal text in human renderable form.
	 */
	public void setContentAttachment(Attachment value) { contentAttachment = value; }


	@Expose
	private Reference contentReference;

	/**
	 * Getter for contentReference
	 * @return Contract legal text in human renderable form.
	 */
	public Reference getContentReference() { return contentReference; }

	/**
	 * Setter for contentReference
	 * @param value Contract legal text in human renderable form.
	 */
	public void setContentReference(Reference value) { contentReference = value; }


}
