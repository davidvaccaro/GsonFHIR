package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class EncounterStatusHistory extends BackboneElement {
	public enum Status{
		@SerializedName("planned") PLANNED,
		@SerializedName("arrived") ARRIVED,
		@SerializedName("triaged") TRIAGED,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("onleave") ONLEAVE,
		@SerializedName("finished") FINISHED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The time that the episode was in the specified status.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The time that the episode was in the specified status.
	 */
	public void setPeriod(Period value) { period = value; }


}
