package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Measurements and simple assertions made about a patient, device or other subject.
 */
public class ObservationReferenceRange extends BackboneElement {
	@Expose
	private Quantity low;

	/**
	 * Getter for low
	 * @return The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is GT=5 - LT=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is LT=2.3).
	 */
	public Quantity getLow() { return low; }

	/**
	 * Setter for low
	 * @param value The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is GT=5 - LT=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is LT=2.3).
	 */
	public void setLow(Quantity value) { low = value; }


	@Expose
	private Quantity high;

	/**
	 * Getter for high
	 * @return The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is GT=5 - LT=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is GT= 2.3).
	 */
	public Quantity getHigh() { return high; }

	/**
	 * Setter for high
	 * @param value The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is GT=5 - LT=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is GT= 2.3).
	 */
	public void setHigh(Quantity value) { high = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Codes to indicate the what part of the targeted reference population it applies to. For example, the normal or therapeutic range.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Codes to indicate the what part of the targeted reference population it applies to. For example, the normal or therapeutic range.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private ArrayList<CodeableConcept> appliesTo;

	/**
	 * Getter for appliesTo
	 * @return Codes to indicate the target population this reference range applies to.  For example, a reference range may be based on the normal population or a particular sex or race.
	 */
	public ArrayList<CodeableConcept> getAppliesTo() { return appliesTo; }

	/**
	 * Setter for appliesTo
	 * @param value Codes to indicate the target population this reference range applies to.  For example, a reference range may be based on the normal population or a particular sex or race.
	 */
	public void setAppliesTo(ArrayList<CodeableConcept> value) { appliesTo = value; }


	@Expose
	private Range age;

	/**
	 * Getter for age
	 * @return The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
	 */
	public Range getAge() { return age; }

	/**
	 * Setter for age
	 * @param value The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
	 */
	public void setAge(Range value) { age = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.
	 */
	public void setText(String value) { text = value; }


}
