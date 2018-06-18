package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Measurements and simple assertions made about a patient, device or other subject.
 */
public class Observation extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Observation resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Observation resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A unique identifier assigned to this observation.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A unique identifier assigned to this observation.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return A plan, proposal or order that is fulfilled in whole or in part by this event.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A plan, proposal or order that is fulfilled in whole or in part by this event.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	public enum Status{
		@SerializedName("registered") REGISTERED,
		@SerializedName("preliminary") PRELIMINARY,
		@SerializedName("final") FINAL,
		@SerializedName("amended") AMENDED,
		@SerializedName("corrected") CORRECTED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of the result value.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the result value.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return A code that classifies the general type of observation being made.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value A code that classifies the general type of observation being made.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Describes what was observed. Sometimes this is called the observation "name".
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Describes what was observed. Sometimes this is called the observation "name".
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date effectiveDateTime;

	/**
	 * Getter for effectiveDateTime
	 * @return The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
	 */
	public Date getEffectiveDateTime() { return effectiveDateTime; }

	/**
	 * Setter for effectiveDateTime
	 * @param value The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
	 */
	public void setEffectiveDateTime(Date value) { effectiveDateTime = value; }


	@Expose
	private Period effectivePeriod;

	/**
	 * Getter for effectivePeriod
	 * @return The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	private String issued;

	/**
	 * Getter for issued
	 * @return The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
	 */
	public String getIssued() { return issued; }

	/**
	 * Setter for issued
	 * @param value The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
	 */
	public void setIssued(String value) { issued = value; }


	@Expose
	private ArrayList<Reference> performer;

	/**
	 * Getter for performer
	 * @return Who was responsible for asserting the observed value as "true".
	 */
	public ArrayList<Reference> getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value Who was responsible for asserting the observed value as "true".
	 */
	public void setPerformer(ArrayList<Reference> value) { performer = value; }


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
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return The information determined as a result of making the observation, if the information has a simple value.
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value The information determined as a result of making the observation, if the information has a simple value.
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


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
	private String comment;

	/**
	 * Getter for comment
	 * @return May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
	 */
	public void setComment(String value) { comment = value; }


	@Expose
	private CodeableConcept bodySite;

	/**
	 * Getter for bodySite
	 * @return Indicates the site on the subject's body where the observation was made (i.e. the target site).
	 */
	public CodeableConcept getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value Indicates the site on the subject's body where the observation was made (i.e. the target site).
	 */
	public void setBodySite(CodeableConcept value) { bodySite = value; }


	@Expose
	private CodeableConcept method;

	/**
	 * Getter for method
	 * @return Indicates the mechanism used to perform the observation.
	 */
	public CodeableConcept getMethod() { return method; }

	/**
	 * Setter for method
	 * @param value Indicates the mechanism used to perform the observation.
	 */
	public void setMethod(CodeableConcept value) { method = value; }


	@Expose
	private Reference specimen;

	/**
	 * Getter for specimen
	 * @return The specimen that was used when this observation was made.
	 */
	public Reference getSpecimen() { return specimen; }

	/**
	 * Setter for specimen
	 * @param value The specimen that was used when this observation was made.
	 */
	public void setSpecimen(Reference value) { specimen = value; }


	@Expose
	private Reference device;

	/**
	 * Getter for device
	 * @return The device used to generate the observation data.
	 */
	public Reference getDevice() { return device; }

	/**
	 * Setter for device
	 * @param value The device used to generate the observation data.
	 */
	public void setDevice(Reference value) { device = value; }


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


	@Expose
	private ArrayList<ObservationRelated> related;

	/**
	 * Getter for related
	 * @return A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code.
	 */
	public ArrayList<ObservationRelated> getRelated() { return related; }

	/**
	 * Setter for related
	 * @param value A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code.
	 */
	public void setRelated(ArrayList<ObservationRelated> value) { related = value; }


	@Expose
	private ArrayList<ObservationComponent> component;

	/**
	 * Getter for component
	 * @return Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
	 */
	public ArrayList<ObservationComponent> getComponent() { return component; }

	/**
	 * Setter for component
	 * @param value Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
	 */
	public void setComponent(ArrayList<ObservationComponent> value) { component = value; }


}
