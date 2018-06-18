package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A reference from one resource to another.
 */
public class Reference extends Element {
	@Expose
	private String reference;

	/**
	 * Getter for reference
	 * @return A reference to a location at which the other resource is found. The reference may be a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.
	 */
	public String getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value A reference to a location at which the other resource is found. The reference may be a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.
	 */
	public void setReference(String value) { reference = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return An identifier for the other resource. This is used when there is no way to reference the other resource directly, either because the entity is not available through a FHIR server, or because there is no way for the author of the resource to convert a known identifier to an actual location. There is no requirement that a Reference.identifier point to something that is actually exposed as a FHIR instance, but it SHALL point to a business concept that would be expected to be exposed as a FHIR instance, and that instance would need to be of a FHIR resource type allowed by the reference.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value An identifier for the other resource. This is used when there is no way to reference the other resource directly, either because the entity is not available through a FHIR server, or because there is no way for the author of the resource to convert a known identifier to an actual location. There is no requirement that a Reference.identifier point to something that is actually exposed as a FHIR instance, but it SHALL point to a business concept that would be expected to be exposed as a FHIR instance, and that instance would need to be of a FHIR resource type allowed by the reference.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return Plain text narrative that identifies the resource in addition to the resource reference.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value Plain text narrative that identifies the resource in addition to the resource reference.
	 */
	public void setDisplay(String value) { display = value; }


}
