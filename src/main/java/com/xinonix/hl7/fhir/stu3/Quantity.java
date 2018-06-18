package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
 */
public class Quantity extends Element {
	@Expose
	private Double value;

	/**
	 * Getter for value
	 * @return The value of the measured amount. The value includes an implicit precision in the presentation of the value.
	 */
	public Double getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The value of the measured amount. The value includes an implicit precision in the presentation of the value.
	 */
	public void setValue(Double value) { value = value; }


	public enum Comparator{
		@SerializedName("<") LT,
		@SerializedName("<=") LEQ,
		@SerializedName(">=") GEQ,
		@SerializedName(">") GT
	}

	@Expose
	private Comparator comparator;

	/**
	 * Getter for comparator
	 * @return How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "LT" , then the real value is LT stated value.
	 */
	public Comparator getComparator() { return comparator; }

	/**
	 * Setter for comparator
	 * @param value How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "LT" , then the real value is LT stated value.
	 */
	public void setComparator(Comparator value) { comparator = value; }


	@Expose
	private String unit;

	/**
	 * Getter for unit
	 * @return A human-readable form of the unit.
	 */
	public String getUnit() { return unit; }

	/**
	 * Setter for unit
	 * @param value A human-readable form of the unit.
	 */
	public void setUnit(String value) { unit = value; }


	@Expose
	private String system;

	/**
	 * Getter for system
	 * @return The identification of the system that provides the coded form of the unit.
	 */
	public String getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value The identification of the system that provides the coded form of the unit.
	 */
	public void setSystem(String value) { system = value; }


	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return A computer processable form of the unit in some unit representation system.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A computer processable form of the unit in some unit representation system.
	 */
	public void setCode(String value) { code = value; }


}
