package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
 */
public class ImmunizationRecommendationProtocol extends BackboneElement {
	@Expose
	private Integer doseSequence;

	/**
	 * Getter for doseSequence
	 * @return Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
	 */
	public Integer getDoseSequence() { return doseSequence; }

	/**
	 * Setter for doseSequence
	 * @param value Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
	 */
	public void setDoseSequence(Integer value) { doseSequence = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Contains the description about the protocol under which the vaccine was administered.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Contains the description about the protocol under which the vaccine was administered.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private Reference authority;

	/**
	 * Getter for authority
	 * @return Indicates the authority who published the protocol.  For example, ACIP.
	 */
	public Reference getAuthority() { return authority; }

	/**
	 * Setter for authority
	 * @param value Indicates the authority who published the protocol.  For example, ACIP.
	 */
	public void setAuthority(Reference value) { authority = value; }


	@Expose
	private String series;

	/**
	 * Getter for series
	 * @return One possible path to achieve presumed immunity against a disease - within the context of an authority.
	 */
	public String getSeries() { return series; }

	/**
	 * Setter for series
	 * @param value One possible path to achieve presumed immunity against a disease - within the context of an authority.
	 */
	public void setSeries(String value) { series = value; }


}
