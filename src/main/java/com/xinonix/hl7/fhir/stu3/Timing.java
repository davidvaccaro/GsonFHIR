package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;


/**
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
 */
public class Timing extends Element {
	@Expose
	private ArrayList<Date> event;

	/**
	 * Getter for event
	 * @return Identifies specific times when the event occurs.
	 */
	public ArrayList<Date> getEvent() { return event; }

	/**
	 * Setter for event
	 * @param value Identifies specific times when the event occurs.
	 */
	public void setEvent(ArrayList<Date> value) { event = value; }


	@Expose
	private TimingRepeat repeat;

	/**
	 * Getter for repeat
	 * @return A set of rules that describe when the event is scheduled.
	 */
	public TimingRepeat getRepeat() { return repeat; }

	/**
	 * Setter for repeat
	 * @param value A set of rules that describe when the event is scheduled.
	 */
	public void setRepeat(TimingRepeat value) { repeat = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A code for the timing schedule. Some codes such as BID are ubiquitous, but many institutions define their own additional codes. If a code is provided, the code is understood to be a complete statement of whatever is specified in the structured timing data, and either the code or the data may be used to interpret the Timing, with the exception that .repeat.bounds still applies over the code (and is not contained in the code).
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code for the timing schedule. Some codes such as BID are ubiquitous, but many institutions define their own additional codes. If a code is provided, the code is understood to be a complete statement of whatever is specified in the structured timing data, and either the code or the data may be used to interpret the Timing, with the exception that .repeat.bounds still applies over the code (and is not contained in the code).
	 */
	public void setCode(CodeableConcept value) { code = value; }


}
