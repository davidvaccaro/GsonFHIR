package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A time period defined by a start and end date and optionally time.
 */
public class Period extends Element {
	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date start;

	/**
	 * Getter for start
	 * @return The start of the period. The boundary is inclusive.
	 */
	public Date getStart() { return start; }

	/**
	 * Setter for start
	 * @param value The start of the period. The boundary is inclusive.
	 */
	public void setStart(Date value) { start = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date end;

	/**
	 * Getter for end
	 * @return The end of the period. If the end of the period is missing, it means that the period is ongoing. The start may be in the past, and the end date in the future, which means that period is expected/planned to end at that time.
	 */
	public Date getEnd() { return end; }

	/**
	 * Setter for end
	 * @param value The end of the period. If the end of the period is missing, it means that the period is ongoing. The start may be in the past, and the end date in the future, which means that period is expected/planned to end at that time.
	 */
	public void setEnd(Date value) { end = value; }


}
