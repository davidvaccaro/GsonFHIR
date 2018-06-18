package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A set of ordered Quantities defined by a low and high limit.
 */
public class Range extends Element {
	@Expose
	private Quantity low;

	/**
	 * Getter for low
	 * @return The low limit. The boundary is inclusive.
	 */
	public Quantity getLow() { return low; }

	/**
	 * Setter for low
	 * @param value The low limit. The boundary is inclusive.
	 */
	public void setLow(Quantity value) { low = value; }


	@Expose
	private Quantity high;

	/**
	 * Getter for high
	 * @return The high limit. The boundary is inclusive.
	 */
	public Quantity getHigh() { return high; }

	/**
	 * Setter for high
	 * @param value The high limit. The boundary is inclusive.
	 */
	public void setHigh(Quantity value) { high = value; }


}
