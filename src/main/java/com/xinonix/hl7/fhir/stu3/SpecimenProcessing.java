package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A sample to be used for analysis.
 */
public class SpecimenProcessing extends BackboneElement {
	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Textual description of procedure.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Textual description of procedure.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private CodeableConcept procedure;

	/**
	 * Getter for procedure
	 * @return A coded value specifying the procedure used to process the specimen.
	 */
	public CodeableConcept getProcedure() { return procedure; }

	/**
	 * Setter for procedure
	 * @param value A coded value specifying the procedure used to process the specimen.
	 */
	public void setProcedure(CodeableConcept value) { procedure = value; }


	@Expose
	private ArrayList<Reference> additive;

	/**
	 * Getter for additive
	 * @return Material used in the processing step.
	 */
	public ArrayList<Reference> getAdditive() { return additive; }

	/**
	 * Setter for additive
	 * @param value Material used in the processing step.
	 */
	public void setAdditive(ArrayList<Reference> value) { additive = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date timeDateTime;

	/**
	 * Getter for timeDateTime
	 * @return A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin.
	 */
	public Date getTimeDateTime() { return timeDateTime; }

	/**
	 * Setter for timeDateTime
	 * @param value A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin.
	 */
	public void setTimeDateTime(Date value) { timeDateTime = value; }


	@Expose
	private Period timePeriod;

	/**
	 * Getter for timePeriod
	 * @return A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin.
	 */
	public Period getTimePeriod() { return timePeriod; }

	/**
	 * Setter for timePeriod
	 * @param value A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin.
	 */
	public void setTimePeriod(Period value) { timePeriod = value; }


}
