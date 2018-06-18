package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSetConcept extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return Specifies a code for the concept to be included or excluded.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Specifies a code for the concept to be included or excluded.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.
	 */
	public void setDisplay(String value) { display = value; }


	@Expose
	private ArrayList<ValueSetDesignation> designation;

	/**
	 * Getter for designation
	 * @return Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
	 */
	public ArrayList<ValueSetDesignation> getDesignation() { return designation; }

	/**
	 * Setter for designation
	 * @param value Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
	 */
	public void setDesignation(ArrayList<ValueSetDesignation> value) { designation = value; }


}
