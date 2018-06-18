package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
 */
public class MessageDefinitionFocus extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return The kind of resource that must be the focus for this message.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The kind of resource that must be the focus for this message.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private Reference profile;

	/**
	 * Getter for profile
	 * @return A profile that reflects constraints for the focal resource (and potentially for related resources).
	 */
	public Reference getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value A profile that reflects constraints for the focal resource (and potentially for related resources).
	 */
	public void setProfile(Reference value) { profile = value; }


	@Expose
	private Integer min;

	/**
	 * Getter for min
	 * @return Identifies the minimum number of resources of this type that must be pointed to by a message in order for it to be valid against this MessageDefinition.
	 */
	public Integer getMin() { return min; }

	/**
	 * Setter for min
	 * @param value Identifies the minimum number of resources of this type that must be pointed to by a message in order for it to be valid against this MessageDefinition.
	 */
	public void setMin(Integer value) { min = value; }


	@Expose
	private String max;

	/**
	 * Getter for max
	 * @return Identifies the maximum number of resources of this type that must be pointed to by a message in order for it to be valid against this MessageDefinition.
	 */
	public String getMax() { return max; }

	/**
	 * Setter for max
	 * @param value Identifies the maximum number of resources of this type that must be pointed to by a message in order for it to be valid against this MessageDefinition.
	 */
	public void setMax(String value) { max = value; }


}
