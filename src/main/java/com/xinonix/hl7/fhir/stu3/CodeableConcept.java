package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
 */
public class CodeableConcept extends Element {
	@Expose
	private ArrayList<Coding> coding;

	/**
	 * Getter for coding
	 * @return A reference to a code defined by a terminology system.
	 */
	public ArrayList<Coding> getCoding() { return coding; }

	/**
	 * Setter for coding
	 * @param value A reference to a code defined by a terminology system.
	 */
	public void setCoding(ArrayList<Coding> value) { coding = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user.
	 */
	public void setText(String value) { text = value; }


}
