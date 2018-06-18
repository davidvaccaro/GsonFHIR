package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 */
public class ExpansionProfileDesignation extends BackboneElement {
	@Expose
	private ExpansionProfileInclude include;

	/**
	 * Getter for include
	 * @return Designations to be included.
	 */
	public ExpansionProfileInclude getInclude() { return include; }

	/**
	 * Setter for include
	 * @param value Designations to be included.
	 */
	public void setInclude(ExpansionProfileInclude value) { include = value; }


	@Expose
	private ExpansionProfileExclude exclude;

	/**
	 * Getter for exclude
	 * @return Designations to be excluded.
	 */
	public ExpansionProfileExclude getExclude() { return exclude; }

	/**
	 * Setter for exclude
	 * @param value Designations to be excluded.
	 */
	public void setExclude(ExpansionProfileExclude value) { exclude = value; }


}
