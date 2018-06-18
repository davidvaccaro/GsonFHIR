package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
 */
public class DeviceUseStatement extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DeviceUseStatement resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DeviceUseStatement resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return An external identifier for this statement such as an IRI.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value An external identifier for this statement such as an IRI.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("intended") INTENDED,
		@SerializedName("stopped") STOPPED,
		@SerializedName("on-hold") ON_HOLD
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient who used the device.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient who used the device.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Period whenUsed;

	/**
	 * Getter for whenUsed
	 * @return The time period over which the device was used.
	 */
	public Period getWhenUsed() { return whenUsed; }

	/**
	 * Setter for whenUsed
	 * @param value The time period over which the device was used.
	 */
	public void setWhenUsed(Period value) { whenUsed = value; }


	@Expose
	private Timing timingTiming;

	/**
	 * Getter for timingTiming
	 * @return How often the device was used.
	 */
	public Timing getTimingTiming() { return timingTiming; }

	/**
	 * Setter for timingTiming
	 * @param value How often the device was used.
	 */
	public void setTimingTiming(Timing value) { timingTiming = value; }


	@Expose
	private Period timingPeriod;

	/**
	 * Getter for timingPeriod
	 * @return How often the device was used.
	 */
	public Period getTimingPeriod() { return timingPeriod; }

	/**
	 * Setter for timingPeriod
	 * @param value How often the device was used.
	 */
	public void setTimingPeriod(Period value) { timingPeriod = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date timingDateTime;

	/**
	 * Getter for timingDateTime
	 * @return How often the device was used.
	 */
	public Date getTimingDateTime() { return timingDateTime; }

	/**
	 * Setter for timingDateTime
	 * @param value How often the device was used.
	 */
	public void setTimingDateTime(Date value) { timingDateTime = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date recordedOn;

	/**
	 * Getter for recordedOn
	 * @return The time at which the statement was made/recorded.
	 */
	public Date getRecordedOn() { return recordedOn; }

	/**
	 * Setter for recordedOn
	 * @param value The time at which the statement was made/recorded.
	 */
	public void setRecordedOn(Date value) { recordedOn = value; }


	@Expose
	private Reference source;

	/**
	 * Getter for source
	 * @return Who reported the device was being used by the patient.
	 */
	public Reference getSource() { return source; }

	/**
	 * Setter for source
	 * @param value Who reported the device was being used by the patient.
	 */
	public void setSource(Reference value) { source = value; }


	@Expose
	private Reference device;

	/**
	 * Getter for device
	 * @return The details of the device used.
	 */
	public Reference getDevice() { return device; }

	/**
	 * Setter for device
	 * @param value The details of the device used.
	 */
	public void setDevice(Reference value) { device = value; }


	@Expose
	private ArrayList<CodeableConcept> indication;

	/**
	 * Getter for indication
	 * @return Reason or justification for the use of the device.
	 */
	public ArrayList<CodeableConcept> getIndication() { return indication; }

	/**
	 * Setter for indication
	 * @param value Reason or justification for the use of the device.
	 */
	public void setIndication(ArrayList<CodeableConcept> value) { indication = value; }


	@Expose
	private CodeableConcept bodySite;

	/**
	 * Getter for bodySite
	 * @return Indicates the site on the subject's body where the device was used ( i.e. the target site).
	 */
	public CodeableConcept getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value Indicates the site on the subject's body where the device was used ( i.e. the target site).
	 */
	public void setBodySite(CodeableConcept value) { bodySite = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
