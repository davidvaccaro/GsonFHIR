package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A reference to a document.
 */
public class DocumentReferenceContent extends BackboneElement {
	@Expose
	private Attachment attachment;

	/**
	 * Getter for attachment
	 * @return The document or URL of the document along with critical metadata to prove content has integrity.
	 */
	public Attachment getAttachment() { return attachment; }

	/**
	 * Setter for attachment
	 * @param value The document or URL of the document along with critical metadata to prove content has integrity.
	 */
	public void setAttachment(Attachment value) { attachment = value; }


	@Expose
	private Coding format;

	/**
	 * Getter for format
	 * @return An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.
	 */
	public Coding getFormat() { return format; }

	/**
	 * Setter for format
	 * @param value An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.
	 */
	public void setFormat(Coding value) { format = value; }


}
