package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
 */
public class ActivityDefinitionDynamicValue extends BackboneElement {
	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A brief, natural language description of the intended semantics of the dynamic value.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A brief, natural language description of the intended semantics of the dynamic value.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return The path to the element to be customized. This is the path on the resource that will hold the result of the calculation defined by the expression.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value The path to the element to be customized. This is the path on the resource that will hold the result of the calculation defined by the expression.
	 */
	public void setPath(String value) { path = value; }


	@Expose
	private String language;

	/**
	 * Getter for language
	 * @return The media type of the language for the expression.
	 */
	public String getLanguage() { return language; }

	/**
	 * Setter for language
	 * @param value The media type of the language for the expression.
	 */
	public void setLanguage(String value) { language = value; }


	@Expose
	private String expression;

	/**
	 * Getter for expression
	 * @return An expression specifying the value of the customized element.
	 */
	public String getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value An expression specifying the value of the customized element.
	 */
	public void setExpression(String value) { expression = value; }


}
