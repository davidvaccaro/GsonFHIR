package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A technical identifier - identifies some entity uniquely and unambiguously.
 */
public class Identifier extends Element {
	public enum Use{
		@SerializedName("usual") USUAL,
		@SerializedName("official") OFFICIAL,
		@SerializedName("temp") TEMP,
		@SerializedName("secondary") SECONDARY
	}

	@Expose
	private Use use;

	/**
	 * Getter for use
	 * @return The purpose of this identifier.
	 */
	public Use getUse() { return use; }

	/**
	 * Setter for use
	 * @param value The purpose of this identifier.
	 */
	public void setUse(Use value) { use = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private String system;

	/**
	 * Getter for system
	 * @return Establishes the namespace for the value - that is, a URL that describes a set values that are unique.
	 */
	public String getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value Establishes the namespace for the value - that is, a URL that describes a set values that are unique.
	 */
	public void setSystem(String value) { system = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The portion of the identifier typically relevant to the user and which is unique within the context of the system.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The portion of the identifier typically relevant to the user and which is unique within the context of the system.
	 */
	public void setValue(String value) { value = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Time period during which identifier is/was valid for use.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Time period during which identifier is/was valid for use.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Reference assigner;

	/**
	 * Getter for assigner
	 * @return Organization that issued/manages the identifier.
	 */
	public Reference getAssigner() { return assigner; }

	/**
	 * Setter for assigner
	 * @param value Organization that issued/manages the identifier.
	 */
	public void setAssigner(Reference value) { assigner = value; }


}
