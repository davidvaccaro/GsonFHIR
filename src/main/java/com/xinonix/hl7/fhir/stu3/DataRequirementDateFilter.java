package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 */
public class DataRequirementDateFilter extends BackboneElement {
	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.
	 */
	public void setPath(String value) { path = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date valueDateTime;

	/**
	 * Getter for valueDateTime
	 * @return The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.
	 */
	public Date getValueDateTime() { return valueDateTime; }

	/**
	 * Setter for valueDateTime
	 * @param value The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.
	 */
	public void setValueDateTime(Date value) { valueDateTime = value; }


	@Expose
	private Period valuePeriod;

	/**
	 * Getter for valuePeriod
	 * @return The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.
	 */
	public Period getValuePeriod() { return valuePeriod; }

	/**
	 * Setter for valuePeriod
	 * @param value The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.
	 */
	public void setValuePeriod(Period value) { valuePeriod = value; }


	@Expose
	private Duration valueDuration;

	/**
	 * Getter for valueDuration
	 * @return The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.
	 */
	public Duration getValueDuration() { return valueDuration; }

	/**
	 * Setter for valueDuration
	 * @param value The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.
	 */
	public void setValueDuration(Duration value) { valueDuration = value; }


}
