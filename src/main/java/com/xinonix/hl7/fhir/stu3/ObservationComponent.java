package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Measurements and simple assertions made about a patient, device or other subject.
 */
public class ObservationComponent extends BackboneElement {
	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Describes what was observed. Sometimes this is called the observation "code".
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Describes what was observed. Sometimes this is called the observation "code".
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Quantity valueQuantity;

	/**
	 * Getter for valueQuantity
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public Quantity getValueQuantity() { return valueQuantity; }

	/**
	 * Setter for valueQuantity
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueQuantity(Quantity value) { valueQuantity = value; }


	@Expose
	private CodeableConcept valueCodeableConcept;

	/**
	 * Getter for valueCodeableConcept
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public CodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }

	/**
	 * Setter for valueCodeableConcept
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueCodeableConcept(CodeableConcept value) { valueCodeableConcept = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private Range valueRange;

	/**
	 * Getter for valueRange
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public Range getValueRange() { return valueRange; }

	/**
	 * Setter for valueRange
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueRange(Range value) { valueRange = value; }


	@Expose
	private Ratio valueRatio;

	/**
	 * Getter for valueRatio
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public Ratio getValueRatio() { return valueRatio; }

	/**
	 * Setter for valueRatio
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueRatio(Ratio value) { valueRatio = value; }


	@Expose
	private SampledData valueSampledData;

	/**
	 * Getter for valueSampledData
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public SampledData getValueSampledData() { return valueSampledData; }

	/**
	 * Setter for valueSampledData
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueSampledData(SampledData value) { valueSampledData = value; }


	@Expose
	private Attachment valueAttachment;

	/**
	 * Getter for valueAttachment
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public Attachment getValueAttachment() { return valueAttachment; }

	/**
	 * Setter for valueAttachment
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueAttachment(Attachment value) { valueAttachment = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date valueTime;

	/**
	 * Getter for valueTime
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public Date getValueTime() { return valueTime; }

	/**
	 * Setter for valueTime
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueTime(Date value) { valueTime = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date valueDateTime;

	/**
	 * Getter for valueDateTime
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public Date getValueDateTime() { return valueDateTime; }

	/**
	 * Setter for valueDateTime
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueDateTime(Date value) { valueDateTime = value; }


	@Expose
	private Period valuePeriod;

	/**
	 * Getter for valuePeriod
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public Period getValuePeriod() { return valuePeriod; }

	/**
	 * Setter for valuePeriod
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValuePeriod(Period value) { valuePeriod = value; }


	@Expose
	private CodeableConcept dataAbsentReason;

	/**
	 * Getter for dataAbsentReason
	 * @return Provides a reason why the expected value in the element Observation.value[x] is missing.
	 */
	public CodeableConcept getDataAbsentReason() { return dataAbsentReason; }

	/**
	 * Setter for dataAbsentReason
	 * @param value Provides a reason why the expected value in the element Observation.value[x] is missing.
	 */
	public void setDataAbsentReason(CodeableConcept value) { dataAbsentReason = value; }


	@Expose
	private CodeableConcept interpretation;

	/**
	 * Getter for interpretation
	 * @return The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.
	 */
	public CodeableConcept getInterpretation() { return interpretation; }

	/**
	 * Setter for interpretation
	 * @param value The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.
	 */
	public void setInterpretation(CodeableConcept value) { interpretation = value; }


	@Expose
	private ArrayList<ObservationReferenceRange> referenceRange;

	/**
	 * Getter for referenceRange
	 * @return Guidance on how to interpret the value by comparison to a normal or recommended range.
	 */
	public ArrayList<ObservationReferenceRange> getReferenceRange() { return referenceRange; }

	/**
	 * Setter for referenceRange
	 * @param value Guidance on how to interpret the value by comparison to a normal or recommended range.
	 */
	public void setReferenceRange(ArrayList<ObservationReferenceRange> value) { referenceRange = value; }


}
