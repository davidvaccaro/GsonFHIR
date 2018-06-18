package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 */
public class FamilyMemberHistoryCondition extends BackboneElement {
	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private CodeableConcept outcome;

	/**
	 * Getter for outcome
	 * @return Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.
	 */
	public CodeableConcept getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.
	 */
	public void setOutcome(CodeableConcept value) { outcome = value; }


	@Expose
	private Age onsetAge;

	/**
	 * Getter for onsetAge
	 * @return Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
	 */
	public Age getOnsetAge() { return onsetAge; }

	/**
	 * Setter for onsetAge
	 * @param value Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
	 */
	public void setOnsetAge(Age value) { onsetAge = value; }


	@Expose
	private Range onsetRange;

	/**
	 * Getter for onsetRange
	 * @return Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
	 */
	public Range getOnsetRange() { return onsetRange; }

	/**
	 * Setter for onsetRange
	 * @param value Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
	 */
	public void setOnsetRange(Range value) { onsetRange = value; }


	@Expose
	private Period onsetPeriod;

	/**
	 * Getter for onsetPeriod
	 * @return Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
	 */
	public Period getOnsetPeriod() { return onsetPeriod; }

	/**
	 * Setter for onsetPeriod
	 * @param value Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
	 */
	public void setOnsetPeriod(Period value) { onsetPeriod = value; }


	@Expose
	private String onsetString;

	/**
	 * Getter for onsetString
	 * @return Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
	 */
	public String getOnsetString() { return onsetString; }

	/**
	 * Setter for onsetString
	 * @param value Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
	 */
	public void setOnsetString(String value) { onsetString = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return An area where general notes can be placed about this specific condition.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value An area where general notes can be placed about this specific condition.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
