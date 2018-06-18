package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
 */
public class SampledData extends Element {
	@Expose
	private Quantity origin;

	/**
	 * Getter for origin
	 * @return The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series.
	 */
	public Quantity getOrigin() { return origin; }

	/**
	 * Setter for origin
	 * @param value The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series.
	 */
	public void setOrigin(Quantity value) { origin = value; }


	@Expose
	private Double period;

	/**
	 * Getter for period
	 * @return The length of time between sampling times, measured in milliseconds.
	 */
	public Double getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The length of time between sampling times, measured in milliseconds.
	 */
	public void setPeriod(Double value) { period = value; }


	@Expose
	private Double factor;

	/**
	 * Getter for factor
	 * @return A correction factor that is applied to the sampled data points before they are added to the origin.
	 */
	public Double getFactor() { return factor; }

	/**
	 * Setter for factor
	 * @param value A correction factor that is applied to the sampled data points before they are added to the origin.
	 */
	public void setFactor(Double value) { factor = value; }


	@Expose
	private Double lowerLimit;

	/**
	 * Getter for lowerLimit
	 * @return The lower limit of detection of the measured points. This is needed if any of the data points have the value "L" (lower than detection limit).
	 */
	public Double getLowerLimit() { return lowerLimit; }

	/**
	 * Setter for lowerLimit
	 * @param value The lower limit of detection of the measured points. This is needed if any of the data points have the value "L" (lower than detection limit).
	 */
	public void setLowerLimit(Double value) { lowerLimit = value; }


	@Expose
	private Double upperLimit;

	/**
	 * Getter for upperLimit
	 * @return The upper limit of detection of the measured points. This is needed if any of the data points have the value "U" (higher than detection limit).
	 */
	public Double getUpperLimit() { return upperLimit; }

	/**
	 * Setter for upperLimit
	 * @param value The upper limit of detection of the measured points. This is needed if any of the data points have the value "U" (higher than detection limit).
	 */
	public void setUpperLimit(Double value) { upperLimit = value; }


	@Expose
	private Integer dimensions;

	/**
	 * Getter for dimensions
	 * @return The number of sample points at each time point. If this value is greater than one, then the dimensions will be interlaced - all the sample points for a point in time will be recorded at once.
	 */
	public Integer getDimensions() { return dimensions; }

	/**
	 * Setter for dimensions
	 * @param value The number of sample points at each time point. If this value is greater than one, then the dimensions will be interlaced - all the sample points for a point in time will be recorded at once.
	 */
	public void setDimensions(Integer value) { dimensions = value; }


	@Expose
	private String data;

	/**
	 * Getter for data
	 * @return A series of data points which are decimal values separated by a single space (character u20). The special values "E" (error), "L" (below detection limit) and "U" (above detection limit) can also be used in place of a decimal value.
	 */
	public String getData() { return data; }

	/**
	 * Setter for data
	 * @param value A series of data points which are decimal values separated by a single space (character u20). The special values "E" (error), "L" (below detection limit) and "U" (above detection limit) can also be used in place of a decimal value.
	 */
	public void setData(String value) { data = value; }


}
