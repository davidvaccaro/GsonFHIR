package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 */
public class ConceptMapDependsOn extends BackboneElement {
	@Expose
	private String property;

	/**
	 * Getter for property
	 * @return A reference to an element that holds a coded value that corresponds to a code system property. The idea is that the information model carries an element somwhere that is labeled to correspond with a code system property.
	 */
	public String getProperty() { return property; }

	/**
	 * Setter for property
	 * @param value A reference to an element that holds a coded value that corresponds to a code system property. The idea is that the information model carries an element somwhere that is labeled to correspond with a code system property.
	 */
	public void setProperty(String value) { property = value; }


	@Expose
	private String system;

	/**
	 * Getter for system
	 * @return An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).
	 */
	public String getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).
	 */
	public void setSystem(String value) { system = value; }


	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.
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


}
