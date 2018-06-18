package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A reference to a document.
 */
public class DocumentReferenceRelated extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private Reference ref;

	/**
	 * Getter for ref
	 * @return Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.
	 */
	public Reference getRef() { return ref; }

	/**
	 * Setter for ref
	 * @param value Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.
	 */
	public void setRef(Reference value) { ref = value; }


}
