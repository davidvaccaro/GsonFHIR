package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinitionDiscriminator extends BackboneElement {
	public enum Type{
		@SerializedName("value") VALUE,
		@SerializedName("exists") EXISTS,
		@SerializedName("pattern") PATTERN,
		@SerializedName("type") TYPE,
		@SerializedName("profile") PROFILE
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return How the element value is interpreted when discrimination is evaluated.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value How the element value is interpreted when discrimination is evaluated.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return A FHIRPath expression, using a restricted subset of FHIRPath, that is used to identify the element on which discrimination is based.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value A FHIRPath expression, using a restricted subset of FHIRPath, that is used to identify the element on which discrimination is based.
	 */
	public void setPath(String value) { path = value; }


}
