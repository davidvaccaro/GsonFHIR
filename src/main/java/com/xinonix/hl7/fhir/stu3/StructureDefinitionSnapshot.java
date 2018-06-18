package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
 */
public class StructureDefinitionSnapshot extends BackboneElement {
	@Expose
	private ArrayList<ElementDefinition> element;

	/**
	 * Getter for element
	 * @return Captures constraints on each element within the resource.
	 */
	public ArrayList<ElementDefinition> getElement() { return element; }

	/**
	 * Setter for element
	 * @param value Captures constraints on each element within the resource.
	 */
	public void setElement(ArrayList<ElementDefinition> value) { element = value; }


}
