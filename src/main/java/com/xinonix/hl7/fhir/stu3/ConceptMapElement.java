package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 */
public class ConceptMapElement extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return Identity (code or path) or the element/item being mapped.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Identity (code or path) or the element/item being mapped.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return The display for the code. The display is only provided to help editors when editing the concept map.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value The display for the code. The display is only provided to help editors when editing the concept map.
	 */
	public void setDisplay(String value) { display = value; }


	@Expose
	private ArrayList<ConceptMapTarget> target;

	/**
	 * Getter for target
	 * @return A concept from the target value set that this concept maps to.
	 */
	public ArrayList<ConceptMapTarget> getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value A concept from the target value set that this concept maps to.
	 */
	public void setTarget(ArrayList<ConceptMapTarget> value) { target = value; }


}
