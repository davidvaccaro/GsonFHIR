package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 */
public class OperationDefinitionBinding extends BackboneElement {
	public enum Strength{
		@SerializedName("required") REQUIRED,
		@SerializedName("extensible") EXTENSIBLE,
		@SerializedName("preferred") PREFERRED,
		@SerializedName("example") EXAMPLE
	}

	@Expose
	private Strength strength;

	/**
	 * Getter for strength
	 * @return Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
	 */
	public Strength getStrength() { return strength; }

	/**
	 * Setter for strength
	 * @param value Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
	 */
	public void setStrength(Strength value) { strength = value; }


	@Expose
	private String valueSetUri;

	/**
	 * Getter for valueSetUri
	 * @return Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.
	 */
	public String getValueSetUri() { return valueSetUri; }

	/**
	 * Setter for valueSetUri
	 * @param value Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.
	 */
	public void setValueSetUri(String value) { valueSetUri = value; }


	@Expose
	private Reference valueSetReference;

	/**
	 * Getter for valueSetReference
	 * @return Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.
	 */
	public Reference getValueSetReference() { return valueSetReference; }

	/**
	 * Setter for valueSetReference
	 * @param value Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.
	 */
	public void setValueSetReference(Reference value) { valueSetReference = value; }


}
