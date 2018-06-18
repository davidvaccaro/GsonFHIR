package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 */
public class GroupCharacteristic extends BackboneElement {
	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A code that identifies the kind of trait being asserted.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code that identifies the kind of trait being asserted.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private CodeableConcept valueCodeableConcept;

	/**
	 * Getter for valueCodeableConcept
	 * @return The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
	 */
	public CodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }

	/**
	 * Setter for valueCodeableConcept
	 * @param value The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
	 */
	public void setValueCodeableConcept(CodeableConcept value) { valueCodeableConcept = value; }


	@Expose
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


	@Expose
	private Quantity valueQuantity;

	/**
	 * Getter for valueQuantity
	 * @return The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
	 */
	public Quantity getValueQuantity() { return valueQuantity; }

	/**
	 * Setter for valueQuantity
	 * @param value The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
	 */
	public void setValueQuantity(Quantity value) { valueQuantity = value; }


	@Expose
	private Range valueRange;

	/**
	 * Getter for valueRange
	 * @return The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
	 */
	public Range getValueRange() { return valueRange; }

	/**
	 * Setter for valueRange
	 * @param value The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
	 */
	public void setValueRange(Range value) { valueRange = value; }


	@Expose
	private boolean exclude;

	/**
	 * Getter for exclude
	 * @return If true, indicates the characteristic is one that is NOT held by members of the group.
	 */
	public boolean getExclude() { return exclude; }

	/**
	 * Setter for exclude
	 * @param value If true, indicates the characteristic is one that is NOT held by members of the group.
	 */
	public void setExclude(boolean value) { exclude = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period over which the characteristic is tested; e.g. the patient had an operation during the month of June.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period over which the characteristic is tested; e.g. the patient had an operation during the month of June.
	 */
	public void setPeriod(Period value) { period = value; }


}
