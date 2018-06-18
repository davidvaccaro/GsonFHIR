package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Describes a measurement, calculation or setting capability of a medical device.
 */
public class DeviceMetric extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DeviceMetric resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DeviceMetric resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private CodeableConcept unit;

	/**
	 * Getter for unit
	 * @return Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
	 */
	public CodeableConcept getUnit() { return unit; }

	/**
	 * Setter for unit
	 * @param value Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
	 */
	public void setUnit(CodeableConcept value) { unit = value; }


	@Expose
	private Reference source;

	/**
	 * Getter for source
	 * @return Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc.
	 */
	public Reference getSource() { return source; }

	/**
	 * Setter for source
	 * @param value Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc.
	 */
	public void setSource(Reference value) { source = value; }


	@Expose
	private Reference parent;

	/**
	 * Getter for parent
	 * @return Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.
	 */
	public Reference getParent() { return parent; }

	/**
	 * Setter for parent
	 * @param value Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.
	 */
	public void setParent(Reference value) { parent = value; }


	public enum OperationalStatus{
		@SerializedName("on") ON,
		@SerializedName("off") OFF,
		@SerializedName("standby") STANDBY,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private OperationalStatus operationalStatus;

	/**
	 * Getter for operationalStatus
	 * @return Indicates current operational state of the device. For example: On, Off, Standby, etc.
	 */
	public OperationalStatus getOperationalStatus() { return operationalStatus; }

	/**
	 * Setter for operationalStatus
	 * @param value Indicates current operational state of the device. For example: On, Off, Standby, etc.
	 */
	public void setOperationalStatus(OperationalStatus value) { operationalStatus = value; }


	public enum Color{
		@SerializedName("black") BLACK,
		@SerializedName("red") RED,
		@SerializedName("green") GREEN,
		@SerializedName("yellow") YELLOW,
		@SerializedName("blue") BLUE,
		@SerializedName("magenta") MAGENTA,
		@SerializedName("cyan") CYAN,
		@SerializedName("white") WHITE
	}

	@Expose
	private Color color;

	/**
	 * Getter for color
	 * @return Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
	 */
	public Color getColor() { return color; }

	/**
	 * Setter for color
	 * @param value Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
	 */
	public void setColor(Color value) { color = value; }


	public enum Category{
		@SerializedName("measurement") MEASUREMENT,
		@SerializedName("setting") SETTING,
		@SerializedName("calculation") CALCULATION,
		@SerializedName("unspecified") UNSPECIFIED
	}

	@Expose
	private Category category;

	/**
	 * Getter for category
	 * @return Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
	 */
	public Category getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
	 */
	public void setCategory(Category value) { category = value; }


	@Expose
	private Timing measurementPeriod;

	/**
	 * Getter for measurementPeriod
	 * @return Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.
	 */
	public Timing getMeasurementPeriod() { return measurementPeriod; }

	/**
	 * Setter for measurementPeriod
	 * @param value Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.
	 */
	public void setMeasurementPeriod(Timing value) { measurementPeriod = value; }


	@Expose
	private ArrayList<DeviceMetricCalibration> calibration;

	/**
	 * Getter for calibration
	 * @return Describes the calibrations that have been performed or that are required to be performed.
	 */
	public ArrayList<DeviceMetricCalibration> getCalibration() { return calibration; }

	/**
	 * Setter for calibration
	 * @param value Describes the calibrations that have been performed or that are required to be performed.
	 */
	public void setCalibration(ArrayList<DeviceMetricCalibration> value) { calibration = value; }


}
