package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
 */
public class ParameterDefinition extends Element {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name of the parameter used to allow access to the value of the parameter in evaluation contexts.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name of the parameter used to allow access to the value of the parameter in evaluation contexts.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String use;

	/**
	 * Getter for use
	 * @return Whether the parameter is input or output for the module.
	 */
	public String getUse() { return use; }

	/**
	 * Setter for use
	 * @param value Whether the parameter is input or output for the module.
	 */
	public void setUse(String value) { use = value; }


	@Expose
	private Integer min;

	/**
	 * Getter for min
	 * @return The minimum number of times this parameter SHALL appear in the request or response.
	 */
	public Integer getMin() { return min; }

	/**
	 * Setter for min
	 * @param value The minimum number of times this parameter SHALL appear in the request or response.
	 */
	public void setMin(Integer value) { min = value; }


	@Expose
	private String max;

	/**
	 * Getter for max
	 * @return The maximum number of times this element is permitted to appear in the request or response.
	 */
	public String getMax() { return max; }

	/**
	 * Setter for max
	 * @param value The maximum number of times this element is permitted to appear in the request or response.
	 */
	public void setMax(String value) { max = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return A brief discussion of what the parameter is for and how it is used by the module.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value A brief discussion of what the parameter is for and how it is used by the module.
	 */
	public void setDocumentation(String value) { documentation = value; }


	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return The type of the parameter.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of the parameter.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private Reference profile;

	/**
	 * Getter for profile
	 * @return If specified, this indicates a profile that the input data must conform to, or that the output data will conform to.
	 */
	public Reference getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value If specified, this indicates a profile that the input data must conform to, or that the output data will conform to.
	 */
	public void setProfile(Reference value) { profile = value; }


}
