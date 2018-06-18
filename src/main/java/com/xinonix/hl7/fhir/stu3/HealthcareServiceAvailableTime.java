package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterTime;

/**
 * The details of a healthcare service available at a location.
 */
public class HealthcareServiceAvailableTime extends BackboneElement {
	@Expose
	private ArrayList<String> daysOfWeek;

	/**
	 * Getter for daysOfWeek
	 * @return Indicates which days of the week are available between the start and end Times.
	 */
	public ArrayList<String> getDaysOfWeek() { return daysOfWeek; }

	/**
	 * Setter for daysOfWeek
	 * @param value Indicates which days of the week are available between the start and end Times.
	 */
	public void setDaysOfWeek(ArrayList<String> value) { daysOfWeek = value; }


	@Expose
	private boolean allDay;

	/**
	 * Getter for allDay
	 * @return Is this always available? (hence times are irrelevant) e.g. 24 hour service.
	 */
	public boolean getAllDay() { return allDay; }

	/**
	 * Setter for allDay
	 * @param value Is this always available? (hence times are irrelevant) e.g. 24 hour service.
	 */
	public void setAllDay(boolean value) { allDay = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date availableStartTime;

	/**
	 * Getter for availableStartTime
	 * @return The opening time of day. Note: If the AllDay flag is set, then this time is ignored.
	 */
	public Date getAvailableStartTime() { return availableStartTime; }

	/**
	 * Setter for availableStartTime
	 * @param value The opening time of day. Note: If the AllDay flag is set, then this time is ignored.
	 */
	public void setAvailableStartTime(Date value) { availableStartTime = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date availableEndTime;

	/**
	 * Getter for availableEndTime
	 * @return The closing time of day. Note: If the AllDay flag is set, then this time is ignored.
	 */
	public Date getAvailableEndTime() { return availableEndTime; }

	/**
	 * Setter for availableEndTime
	 * @param value The closing time of day. Note: If the AllDay flag is set, then this time is ignored.
	 */
	public void setAvailableEndTime(Date value) { availableEndTime = value; }


}
