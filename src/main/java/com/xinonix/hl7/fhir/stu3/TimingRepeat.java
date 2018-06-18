package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
 */
public class TimingRepeat extends BackboneElement {
	@Expose
	private Duration boundsDuration;

	/**
	 * Getter for boundsDuration
	 * @return Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
	 */
	public Duration getBoundsDuration() { return boundsDuration; }

	/**
	 * Setter for boundsDuration
	 * @param value Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
	 */
	public void setBoundsDuration(Duration value) { boundsDuration = value; }


	@Expose
	private Range boundsRange;

	/**
	 * Getter for boundsRange
	 * @return Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
	 */
	public Range getBoundsRange() { return boundsRange; }

	/**
	 * Setter for boundsRange
	 * @param value Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
	 */
	public void setBoundsRange(Range value) { boundsRange = value; }


	@Expose
	private Period boundsPeriod;

	/**
	 * Getter for boundsPeriod
	 * @return Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
	 */
	public Period getBoundsPeriod() { return boundsPeriod; }

	/**
	 * Setter for boundsPeriod
	 * @param value Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
	 */
	public void setBoundsPeriod(Period value) { boundsPeriod = value; }


	@Expose
	private Integer count;

	/**
	 * Getter for count
	 * @return A total count of the desired number of repetitions.
	 */
	public Integer getCount() { return count; }

	/**
	 * Setter for count
	 * @param value A total count of the desired number of repetitions.
	 */
	public void setCount(Integer value) { count = value; }


	@Expose
	private Integer countMax;

	/**
	 * Getter for countMax
	 * @return A maximum value for the count of the desired repetitions (e.g. do something 6-8 times).
	 */
	public Integer getCountMax() { return countMax; }

	/**
	 * Setter for countMax
	 * @param value A maximum value for the count of the desired repetitions (e.g. do something 6-8 times).
	 */
	public void setCountMax(Integer value) { countMax = value; }


	@Expose
	private Double duration;

	/**
	 * Getter for duration
	 * @return How long this thing happens for when it happens.
	 */
	public Double getDuration() { return duration; }

	/**
	 * Setter for duration
	 * @param value How long this thing happens for when it happens.
	 */
	public void setDuration(Double value) { duration = value; }


	@Expose
	private Double durationMax;

	/**
	 * Getter for durationMax
	 * @return The upper limit of how long this thing happens for when it happens.
	 */
	public Double getDurationMax() { return durationMax; }

	/**
	 * Setter for durationMax
	 * @param value The upper limit of how long this thing happens for when it happens.
	 */
	public void setDurationMax(Double value) { durationMax = value; }


	public enum DurationUnit{
		@SerializedName("s") S,
		@SerializedName("min") MIN,
		@SerializedName("h") H,
		@SerializedName("d") D,
		@SerializedName("wk") WK,
		@SerializedName("mo") MO,
		@SerializedName("a") A
	}

	@Expose
	private DurationUnit durationUnit;

	/**
	 * Getter for durationUnit
	 * @return The units of time for the duration, in UCUM units.
	 */
	public DurationUnit getDurationUnit() { return durationUnit; }

	/**
	 * Setter for durationUnit
	 * @param value The units of time for the duration, in UCUM units.
	 */
	public void setDurationUnit(DurationUnit value) { durationUnit = value; }


	@Expose
	private Integer frequency;

	/**
	 * Getter for frequency
	 * @return The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).
	 */
	public Integer getFrequency() { return frequency; }

	/**
	 * Setter for frequency
	 * @param value The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).
	 */
	public void setFrequency(Integer value) { frequency = value; }


	@Expose
	private Integer frequencyMax;

	/**
	 * Getter for frequencyMax
	 * @return If present, indicates that the frequency is a range - so to repeat between [frequency] and [frequencyMax] times within the period or period range.
	 */
	public Integer getFrequencyMax() { return frequencyMax; }

	/**
	 * Setter for frequencyMax
	 * @param value If present, indicates that the frequency is a range - so to repeat between [frequency] and [frequencyMax] times within the period or period range.
	 */
	public void setFrequencyMax(Integer value) { frequencyMax = value; }


	@Expose
	private Double period;

	/**
	 * Getter for period
	 * @return Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.
	 */
	public Double getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.
	 */
	public void setPeriod(Double value) { period = value; }


	@Expose
	private Double periodMax;

	/**
	 * Getter for periodMax
	 * @return If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
	 */
	public Double getPeriodMax() { return periodMax; }

	/**
	 * Setter for periodMax
	 * @param value If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
	 */
	public void setPeriodMax(Double value) { periodMax = value; }


	public enum PeriodUnit{
		@SerializedName("s") S,
		@SerializedName("min") MIN,
		@SerializedName("h") H,
		@SerializedName("d") D,
		@SerializedName("wk") WK,
		@SerializedName("mo") MO,
		@SerializedName("a") A
	}

	@Expose
	private PeriodUnit periodUnit;

	/**
	 * Getter for periodUnit
	 * @return The units of time for the period in UCUM units.
	 */
	public PeriodUnit getPeriodUnit() { return periodUnit; }

	/**
	 * Setter for periodUnit
	 * @param value The units of time for the period in UCUM units.
	 */
	public void setPeriodUnit(PeriodUnit value) { periodUnit = value; }


	@Expose
	private ArrayList<String> dayOfWeek;

	/**
	 * Getter for dayOfWeek
	 * @return If one or more days of week is provided, then the action happens only on the specified day(s).
	 */
	public ArrayList<String> getDayOfWeek() { return dayOfWeek; }

	/**
	 * Setter for dayOfWeek
	 * @param value If one or more days of week is provided, then the action happens only on the specified day(s).
	 */
	public void setDayOfWeek(ArrayList<String> value) { dayOfWeek = value; }


	@Expose
	private ArrayList<Date> timeOfDay;

	/**
	 * Getter for timeOfDay
	 * @return Specified time of day for action to take place.
	 */
	public ArrayList<Date> getTimeOfDay() { return timeOfDay; }

	/**
	 * Setter for timeOfDay
	 * @param value Specified time of day for action to take place.
	 */
	public void setTimeOfDay(ArrayList<Date> value) { timeOfDay = value; }


	@Expose
	private ArrayList<String> when;

	/**
	 * Getter for when
	 * @return Real world events that the occurrence of the event should be tied to.
	 */
	public ArrayList<String> getWhen() { return when; }

	/**
	 * Setter for when
	 * @param value Real world events that the occurrence of the event should be tied to.
	 */
	public void setWhen(ArrayList<String> value) { when = value; }


	@Expose
	private Integer offset;

	/**
	 * Getter for offset
	 * @return The number of minutes from the event. If the event code does not indicate whether the minutes is before or after the event, then the offset is assumed to be after the event.
	 */
	public Integer getOffset() { return offset; }

	/**
	 * Setter for offset
	 * @param value The number of minutes from the event. If the event code does not indicate whether the minutes is before or after the event, then the offset is assumed to be after the event.
	 */
	public void setOffset(Integer value) { offset = value; }


}
