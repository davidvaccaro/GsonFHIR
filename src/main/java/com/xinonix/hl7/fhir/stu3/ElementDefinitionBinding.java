package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinitionBinding extends BackboneElement {
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
	private String description;

	/**
	 * Getter for description
	 * @return Describes the intended use of this particular set of codes.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Describes the intended use of this particular set of codes.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String valueSetUri;

	/**
	 * Getter for valueSetUri
	 * @return Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used. If the binding refers to an explicit value set - the normal case - then use a Reference(ValueSet) preferably containing the canonical URL for the value set. If the reference is to an implicit value set - usually, an IETF RFC that defines a grammar, such as mime types - then use a uri.
	 */
	public String getValueSetUri() { return valueSetUri; }

	/**
	 * Setter for valueSetUri
	 * @param value Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used. If the binding refers to an explicit value set - the normal case - then use a Reference(ValueSet) preferably containing the canonical URL for the value set. If the reference is to an implicit value set - usually, an IETF RFC that defines a grammar, such as mime types - then use a uri.
	 */
	public void setValueSetUri(String value) { valueSetUri = value; }


	@Expose
	private Reference valueSetReference;

	/**
	 * Getter for valueSetReference
	 * @return Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used. If the binding refers to an explicit value set - the normal case - then use a Reference(ValueSet) preferably containing the canonical URL for the value set. If the reference is to an implicit value set - usually, an IETF RFC that defines a grammar, such as mime types - then use a uri.
	 */
	public Reference getValueSetReference() { return valueSetReference; }

	/**
	 * Setter for valueSetReference
	 * @param value Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used. If the binding refers to an explicit value set - the normal case - then use a Reference(ValueSet) preferably containing the canonical URL for the value set. If the reference is to an implicit value set - usually, an IETF RFC that defines a grammar, such as mime types - then use a uri.
	 */
	public void setValueSetReference(Reference value) { valueSetReference = value; }


}
