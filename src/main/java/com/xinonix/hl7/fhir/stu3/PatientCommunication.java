package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
public class PatientCommunication extends BackboneElement {
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


	@Expose
	private boolean preferred;

	/**
	 * Getter for preferred
	 * @return Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).
	 */
	public boolean getPreferred() { return preferred; }

	/**
	 * Setter for preferred
	 * @param value Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).
	 */
	public void setPreferred(boolean value) { preferred = value; }


}
