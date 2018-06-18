package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides processing status, errors and notes from the processing of a resource.
 */
public class ProcessResponseProcessNote extends BackboneElement {
	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return The note purpose: Print/Display.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value The note purpose: Print/Display.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return The note text.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value The note text.
	 */
	public void setText(String value) { text = value; }


}
