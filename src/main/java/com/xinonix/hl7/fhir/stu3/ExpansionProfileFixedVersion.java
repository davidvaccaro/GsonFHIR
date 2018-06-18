package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 */
public class ExpansionProfileFixedVersion extends BackboneElement {
	@Expose
	private String system;

	/**
	 * Getter for system
	 * @return The specific system for which to fix the version.
	 */
	public String getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value The specific system for which to fix the version.
	 */
	public void setSystem(String value) { system = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The version of the code system from which codes in the expansion should be included.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The version of the code system from which codes in the expansion should be included.
	 */
	public void setVersion(String value) { version = value; }


	public enum Mode{
		@SerializedName("default") DEFAULT,
		@SerializedName("check") CHECK,
		@SerializedName("override") OVERRIDE
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return How to manage the intersection between a fixed version in a value set, and this fixed version of the system in the expansion profile.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value How to manage the intersection between a fixed version in a value set, and this fixed version of the system in the expansion profile.
	 */
	public void setMode(Mode value) { mode = value; }


}
