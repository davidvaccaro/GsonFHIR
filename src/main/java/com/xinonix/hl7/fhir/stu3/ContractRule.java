package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class ContractRule extends BackboneElement {
	@Expose
	private Attachment contentAttachment;

	/**
	 * Getter for contentAttachment
	 * @return Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
	 */
	public Attachment getContentAttachment() { return contentAttachment; }

	/**
	 * Setter for contentAttachment
	 * @param value Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
	 */
	public void setContentAttachment(Attachment value) { contentAttachment = value; }


	@Expose
	private Reference contentReference;

	/**
	 * Getter for contentReference
	 * @return Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
	 */
	public Reference getContentReference() { return contentReference; }

	/**
	 * Setter for contentReference
	 * @param value Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
	 */
	public void setContentReference(Reference value) { contentReference = value; }


}
