package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class EncounterLocation extends BackboneElement {
	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return The location where the encounter takes place.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value The location where the encounter takes place.
	 */
	public void setLocation(Reference value) { location = value; }


	public enum Status{
		@SerializedName("planned") PLANNED,
		@SerializedName("active") ACTIVE,
		@SerializedName("reserved") RESERVED,
		@SerializedName("completed") COMPLETED
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Time period during which the patient was present at the location.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Time period during which the patient was present at the location.
	 */
	public void setPeriod(Period value) { period = value; }


}
