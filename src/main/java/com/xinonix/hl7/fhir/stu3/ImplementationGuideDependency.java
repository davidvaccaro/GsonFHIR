package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 */
public class ImplementationGuideDependency extends BackboneElement {
	public enum Type{
		@SerializedName("reference") REFERENCE,
		@SerializedName("inclusion") INCLUSION
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return How the dependency is represented when the guide is published.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value How the dependency is represented when the guide is published.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String uri;

	/**
	 * Getter for uri
	 * @return Where the dependency is located.
	 */
	public String getUri() { return uri; }

	/**
	 * Setter for uri
	 * @param value Where the dependency is located.
	 */
	public void setUri(String value) { uri = value; }


}
