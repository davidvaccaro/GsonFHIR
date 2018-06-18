package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The details of a healthcare service available at a location.
 */
public class HealthcareServiceNotAvailable extends BackboneElement {
	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return The reason that can be presented to the user as to why this time is not available.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value The reason that can be presented to the user as to why this time is not available.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private Period during;

	/**
	 * Getter for during
	 * @return Service is not available (seasonally or for a public holiday) from this date.
	 */
	public Period getDuring() { return during; }

	/**
	 * Setter for during
	 * @param value Service is not available (seasonally or for a public holiday) from this date.
	 */
	public void setDuring(Period value) { during = value; }


}
