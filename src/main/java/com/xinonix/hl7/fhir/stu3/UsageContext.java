package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
 */
public class UsageContext extends Element {
	@Expose
	private Coding code;

	/**
	 * Getter for code
	 * @return A code that identifies the type of context being specified by this usage context.
	 */
	public Coding getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code that identifies the type of context being specified by this usage context.
	 */
	public void setCode(Coding value) { code = value; }


	@Expose
	private CodeableConcept valueCodeableConcept;

	/**
	 * Getter for valueCodeableConcept
	 * @return A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
	 */
	public CodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }

	/**
	 * Setter for valueCodeableConcept
	 * @param value A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
	 */
	public void setValueCodeableConcept(CodeableConcept value) { valueCodeableConcept = value; }


	@Expose
	private Quantity valueQuantity;

	/**
	 * Getter for valueQuantity
	 * @return A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
	 */
	public Quantity getValueQuantity() { return valueQuantity; }

	/**
	 * Setter for valueQuantity
	 * @param value A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
	 */
	public void setValueQuantity(Quantity value) { valueQuantity = value; }


	@Expose
	private Range valueRange;

	/**
	 * Getter for valueRange
	 * @return A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
	 */
	public Range getValueRange() { return valueRange; }

	/**
	 * Setter for valueRange
	 * @param value A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
	 */
	public void setValueRange(Range value) { valueRange = value; }


}
