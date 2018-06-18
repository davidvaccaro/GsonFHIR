package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A description of a triggering event.
 */
public class TriggerDefinition extends Element {
	public enum Type{
		@SerializedName("named-event") NAMED_EVENT,
		@SerializedName("periodic") PERIODIC,
		@SerializedName("data-added") DATA_ADDED,
		@SerializedName("data-modified") DATA_MODIFIED,
		@SerializedName("data-removed") DATA_REMOVED,
		@SerializedName("data-accessed") DATA_ACCESSED,
		@SerializedName("data-access-ended") DATA_ACCESS_ENDED
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of triggering event.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of triggering event.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String eventName;

	/**
	 * Getter for eventName
	 * @return The name of the event (if this is a named-event trigger).
	 */
	public String getEventName() { return eventName; }

	/**
	 * Setter for eventName
	 * @param value The name of the event (if this is a named-event trigger).
	 */
	public void setEventName(String value) { eventName = value; }


	@Expose
	private Timing eventTimingTiming;

	/**
	 * Getter for eventTimingTiming
	 * @return The timing of the event (if this is a period trigger).
	 */
	public Timing getEventTimingTiming() { return eventTimingTiming; }

	/**
	 * Setter for eventTimingTiming
	 * @param value The timing of the event (if this is a period trigger).
	 */
	public void setEventTimingTiming(Timing value) { eventTimingTiming = value; }


	@Expose
	private Reference eventTimingReference;

	/**
	 * Getter for eventTimingReference
	 * @return The timing of the event (if this is a period trigger).
	 */
	public Reference getEventTimingReference() { return eventTimingReference; }

	/**
	 * Setter for eventTimingReference
	 * @param value The timing of the event (if this is a period trigger).
	 */
	public void setEventTimingReference(Reference value) { eventTimingReference = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date eventTimingDate;

	/**
	 * Getter for eventTimingDate
	 * @return The timing of the event (if this is a period trigger).
	 */
	public Date getEventTimingDate() { return eventTimingDate; }

	/**
	 * Setter for eventTimingDate
	 * @param value The timing of the event (if this is a period trigger).
	 */
	public void setEventTimingDate(Date value) { eventTimingDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date eventTimingDateTime;

	/**
	 * Getter for eventTimingDateTime
	 * @return The timing of the event (if this is a period trigger).
	 */
	public Date getEventTimingDateTime() { return eventTimingDateTime; }

	/**
	 * Setter for eventTimingDateTime
	 * @param value The timing of the event (if this is a period trigger).
	 */
	public void setEventTimingDateTime(Date value) { eventTimingDateTime = value; }


	@Expose
	private DataRequirement eventData;

	/**
	 * Getter for eventData
	 * @return The triggering data of the event (if this is a data trigger).
	 */
	public DataRequirement getEventData() { return eventData; }

	/**
	 * Setter for eventData
	 * @param value The triggering data of the event (if this is a data trigger).
	 */
	public void setEventData(DataRequirement value) { eventData = value; }


}
