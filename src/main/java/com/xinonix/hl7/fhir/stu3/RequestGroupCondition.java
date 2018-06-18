package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 */
public class RequestGroupCondition extends BackboneElement {
	@Expose
	private String kind;

	/**
	 * Getter for kind
	 * @return The kind of condition.
	 */
	public String getKind() { return kind; }

	/**
	 * Setter for kind
	 * @param value The kind of condition.
	 */
	public void setKind(String value) { kind = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A brief, natural language description of the condition that effectively communicates the intended semantics.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A brief, natural language description of the condition that effectively communicates the intended semantics.
	 */
	public void setDescription(String value) { description = value; }


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
	 * @return An expression that returns true or false, indicating whether or not the condition is satisfied.
	 */
	public String getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value An expression that returns true or false, indicating whether or not the condition is satisfied.
	 */
	public void setExpression(String value) { expression = value; }


}
