package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A code system resource specifies a set of codes drawn from one or more code systems.
 */
public class CodeSystemProperty extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return A code that is used to identify the property. The code is used internally (in CodeSystem.concept.property.code) and also externally, such as in property filters.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code that is used to identify the property. The code is used internally (in CodeSystem.concept.property.code) and also externally, such as in property filters.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String uri;

	/**
	 * Getter for uri
	 * @return Reference to the formal meaning of the property. One possible source of meaning is the [Concept Properties](codesystem-concept-properties.html) code system.
	 */
	public String getUri() { return uri; }

	/**
	 * Setter for uri
	 * @param value Reference to the formal meaning of the property. One possible source of meaning is the [Concept Properties](codesystem-concept-properties.html) code system.
	 */
	public void setUri(String value) { uri = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A description of the property- why it is defined, and how its value might be used.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A description of the property- why it is defined, and how its value might be used.
	 */
	public void setDescription(String value) { description = value; }


	public enum Type{
		@SerializedName("code") CODE,
		@SerializedName("Coding") CODING,
		@SerializedName("string") STRING,
		@SerializedName("integer") INTEGER,
		@SerializedName("boolean") BOOLEAN,
		@SerializedName("dateTime") DATETIME
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of the property value. Properties of type "code" contain a code defined by the code system (e.g. a reference to anotherr defined concept).
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of the property value. Properties of type "code" contain a code defined by the code system (e.g. a reference to anotherr defined concept).
	 */
	public void setType(Type value) { type = value; }


}
