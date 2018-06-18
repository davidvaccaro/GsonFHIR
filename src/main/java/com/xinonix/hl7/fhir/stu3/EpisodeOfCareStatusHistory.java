package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 */
public class EpisodeOfCareStatusHistory extends BackboneElement {
	public enum Status{
		@SerializedName("planned") PLANNED,
		@SerializedName("waitlist") WAITLIST,
		@SerializedName("active") ACTIVE,
		@SerializedName("onhold") ONHOLD,
		@SerializedName("finished") FINISHED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return planned | waitlist | active | onhold | finished | cancelled.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value planned | waitlist | active | onhold | finished | cancelled.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period during this EpisodeOfCare that the specific status applied.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period during this EpisodeOfCare that the specific status applied.
	 */
	public void setPeriod(Period value) { period = value; }


}
