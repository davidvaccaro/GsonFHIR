package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptVariable extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Descriptive name for this variable.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Descriptive name for this variable.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String defaultValue;

	/**
	 * Getter for defaultValue
	 * @return A default, hard-coded, or user-defined value for this variable.
	 */
	public String getDefaultValue() { return defaultValue; }

	/**
	 * Setter for defaultValue
	 * @param value A default, hard-coded, or user-defined value for this variable.
	 */
	public void setDefaultValue(String value) { defaultValue = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A free text natural language description of the variable and its purpose.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the variable and its purpose.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String expression;

	/**
	 * Getter for expression
	 * @return The fluentpath expression to evaluate against the fixture body. When variables are defined, only one of either expression, headerField or path must be specified.
	 */
	public String getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value The fluentpath expression to evaluate against the fixture body. When variables are defined, only one of either expression, headerField or path must be specified.
	 */
	public void setExpression(String value) { expression = value; }


	@Expose
	private String headerField;

	/**
	 * Getter for headerField
	 * @return Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
	 */
	public String getHeaderField() { return headerField; }

	/**
	 * Setter for headerField
	 * @param value Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
	 */
	public void setHeaderField(String value) { headerField = value; }


	@Expose
	private String hint;

	/**
	 * Getter for hint
	 * @return Displayable text string with hint help information to the user when entering a default value.
	 */
	public String getHint() { return hint; }

	/**
	 * Setter for hint
	 * @param value Displayable text string with hint help information to the user when entering a default value.
	 */
	public void setHint(String value) { hint = value; }


	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return XPath or JSONPath to evaluate against the fixture body.  When variables are defined, only one of either expression, headerField or path must be specified.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value XPath or JSONPath to evaluate against the fixture body.  When variables are defined, only one of either expression, headerField or path must be specified.
	 */
	public void setPath(String value) { path = value; }


	@Expose
	private String sourceId;

	/**
	 * Getter for sourceId
	 * @return Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
	 */
	public String getSourceId() { return sourceId; }

	/**
	 * Setter for sourceId
	 * @param value Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
	 */
	public void setSourceId(String value) { sourceId = value; }


}
