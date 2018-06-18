package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class EncounterClassHistory extends BackboneElement {
	@Expose
	@SerializedName("class")
	private Coding classCode;

	/**
	 * Getter for classCode
	 * @return inpatient | outpatient | ambulatory | emergency +.
	 */
	public Coding getClassCode() { return classCode; }

	/**
	 * Setter for classCode
	 * @param value inpatient | outpatient | ambulatory | emergency +.
	 */
	public void setClassCode(Coding value) { classCode = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The time that the episode was in the specified class.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The time that the episode was in the specified class.
	 */
	public void setPeriod(Period value) { period = value; }


}
