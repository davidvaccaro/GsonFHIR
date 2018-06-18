package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A relationship of two Quantity values - expressed as a numerator and a denominator.
 */
public class Ratio extends Element {
	@Expose
	private Quantity numerator;

	/**
	 * Getter for numerator
	 * @return The value of the numerator.
	 */
	public Quantity getNumerator() { return numerator; }

	/**
	 * Setter for numerator
	 * @param value The value of the numerator.
	 */
	public void setNumerator(Quantity value) { numerator = value; }


	@Expose
	private Quantity denominator;

	/**
	 * Getter for denominator
	 * @return The value of the denominator.
	 */
	public Quantity getDenominator() { return denominator; }

	/**
	 * Setter for denominator
	 * @param value The value of the denominator.
	 */
	public void setDenominator(Quantity value) { denominator = value; }


}
