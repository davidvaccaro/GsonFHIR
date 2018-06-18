package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Describes a measurement, calculation or setting capability of a medical device.
 */
public class DeviceMetricCalibration extends BackboneElement {
	public enum Type{
		@SerializedName("unspecified") UNSPECIFIED,
		@SerializedName("offset") OFFSET,
		@SerializedName("gain") GAIN,
		@SerializedName("two-point") TWO_POINT
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Describes the type of the calibration method.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Describes the type of the calibration method.
	 */
	public void setType(Type value) { type = value; }


	public enum State{
		@SerializedName("not-calibrated") NOT_CALIBRATED,
		@SerializedName("calibration-required") CALIBRATION_REQUIRED,
		@SerializedName("calibrated") CALIBRATED,
		@SerializedName("unspecified") UNSPECIFIED
	}

	@Expose
	private State state;

	/**
	 * Getter for state
	 * @return Describes the state of the calibration.
	 */
	public State getState() { return state; }

	/**
	 * Setter for state
	 * @param value Describes the state of the calibration.
	 */
	public void setState(State value) { state = value; }


	@Expose
	private String time;

	/**
	 * Getter for time
	 * @return Describes the time last calibration has been performed.
	 */
	public String getTime() { return time; }

	/**
	 * Setter for time
	 * @param value Describes the time last calibration has been performed.
	 */
	public void setTime(String value) { time = value; }


}
