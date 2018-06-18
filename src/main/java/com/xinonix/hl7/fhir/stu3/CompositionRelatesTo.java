package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
 */
public class CompositionRelatesTo extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return The type of relationship that this composition has with anther composition or document.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The type of relationship that this composition has with anther composition or document.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private Identifier targetIdentifier;

	/**
	 * Getter for targetIdentifier
	 * @return The target composition/document of this relationship.
	 */
	public Identifier getTargetIdentifier() { return targetIdentifier; }

	/**
	 * Setter for targetIdentifier
	 * @param value The target composition/document of this relationship.
	 */
	public void setTargetIdentifier(Identifier value) { targetIdentifier = value; }


	@Expose
	private Reference targetReference;

	/**
	 * Getter for targetReference
	 * @return The target composition/document of this relationship.
	 */
	public Reference getTargetReference() { return targetReference; }

	/**
	 * Setter for targetReference
	 * @param value The target composition/document of this relationship.
	 */
	public void setTargetReference(Reference value) { targetReference = value; }


}
