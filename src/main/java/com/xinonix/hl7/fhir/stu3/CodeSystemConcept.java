package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A code system resource specifies a set of codes drawn from one or more code systems.
 */
public class CodeSystemConcept extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return A code - a text symbol - that uniquely identifies the concept within the code system.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code - a text symbol - that uniquely identifies the concept within the code system.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return A human readable string that is the recommended default way to present this concept to a user.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value A human readable string that is the recommended default way to present this concept to a user.
	 */
	public void setDisplay(String value) { display = value; }


	@Expose
	private String definition;

	/**
	 * Getter for definition
	 * @return The formal definition of the concept. The code system resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.
	 */
	public String getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value The formal definition of the concept. The code system resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.
	 */
	public void setDefinition(String value) { definition = value; }


	@Expose
	private ArrayList<CodeSystemDesignation> designation;

	/**
	 * Getter for designation
	 * @return Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
	 */
	public ArrayList<CodeSystemDesignation> getDesignation() { return designation; }

	/**
	 * Setter for designation
	 * @param value Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
	 */
	public void setDesignation(ArrayList<CodeSystemDesignation> value) { designation = value; }


	@Expose
	private ArrayList<CodeSystemProperty1> property;

	/**
	 * Getter for property
	 * @return A property value for this concept.
	 */
	public ArrayList<CodeSystemProperty1> getProperty() { return property; }

	/**
	 * Setter for property
	 * @param value A property value for this concept.
	 */
	public void setProperty(ArrayList<CodeSystemProperty1> value) { property = value; }


	@Expose
	private ArrayList<CodeSystemConcept> concept;

	/**
	 * Getter for concept
	 * @return Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.
	 */
	public ArrayList<CodeSystemConcept> getConcept() { return concept; }

	/**
	 * Setter for concept
	 * @param value Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.
	 */
	public void setConcept(ArrayList<CodeSystemConcept> value) { concept = value; }


}
