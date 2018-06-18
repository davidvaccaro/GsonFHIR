package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitProcessNote extends BackboneElement {
	@Expose
	private Integer number;

	/**
	 * Getter for number
	 * @return An integer associated with each note which may be referred to from each service line item.
	 */
	public Integer getNumber() { return number; }

	/**
	 * Setter for number
	 * @param value An integer associated with each note which may be referred to from each service line item.
	 */
	public void setNumber(Integer value) { number = value; }


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


	@Expose
	private CodeableConcept language;

	/**
	 * Getter for language
	 * @return The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-EN" for England English.
	 */
	public CodeableConcept getLanguage() { return language; }

	/**
	 * Setter for language
	 * @param value The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-EN" for England English.
	 */
	public void setLanguage(CodeableConcept value) { language = value; }


}
