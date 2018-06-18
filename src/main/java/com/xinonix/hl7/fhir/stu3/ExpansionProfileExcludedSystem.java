package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 */
public class ExpansionProfileExcludedSystem extends BackboneElement {
	@Expose
	private String system;

	/**
	 * Getter for system
	 * @return An absolute URI which is the code system to be excluded.
	 */
	public String getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value An absolute URI which is the code system to be excluded.
	 */
	public void setSystem(String value) { system = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The version of the code system from which codes in the expansion should be excluded.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The version of the code system from which codes in the expansion should be excluded.
	 */
	public void setVersion(String value) { version = value; }


}
