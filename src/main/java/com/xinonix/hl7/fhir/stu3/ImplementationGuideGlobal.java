package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 */
public class ImplementationGuideGlobal extends BackboneElement {
	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return The type of resource that all instances must conform to.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of resource that all instances must conform to.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private Reference profile;

	/**
	 * Getter for profile
	 * @return A reference to the profile that all instances must conform to.
	 */
	public Reference getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value A reference to the profile that all instances must conform to.
	 */
	public void setProfile(Reference value) { profile = value; }


}
