package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
 */
public class DocumentManifestContent extends BackboneElement {
	@Expose
	private Attachment pAttachment;

	/**
	 * Getter for pAttachment
	 * @return The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.
	 */
	public Attachment getPAttachment() { return pAttachment; }

	/**
	 * Setter for pAttachment
	 * @param value The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.
	 */
	public void setPAttachment(Attachment value) { pAttachment = value; }


	@Expose
	private Reference pReference;

	/**
	 * Getter for pReference
	 * @return The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.
	 */
	public Reference getPReference() { return pReference; }

	/**
	 * Setter for pReference
	 * @param value The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.
	 */
	public void setPReference(Reference value) { pReference = value; }


}
