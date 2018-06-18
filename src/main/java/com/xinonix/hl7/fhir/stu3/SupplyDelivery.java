package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Record of delivery of what is supplied.
 */
public class SupplyDelivery extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a SupplyDelivery resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a SupplyDelivery resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Identifier assigned by the dispensing facility when the item(s) is dispensed.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier assigned by the dispensing facility when the item(s) is dispensed.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


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


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return A larger event of which this particular event is a component or step.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value A larger event of which this particular event is a component or step.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	public enum Status{
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("completed") COMPLETED,
		@SerializedName("abandoned") ABANDONED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return A code specifying the state of the dispense event.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code specifying the state of the dispense event.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return A link to a resource representing the person whom the delivered item is for.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value A link to a resource representing the person whom the delivered item is for.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private SupplyDeliverySuppliedItem suppliedItem;

	/**
	 * Getter for suppliedItem
	 * @return The item that is being delivered or has been supplied.
	 */
	public SupplyDeliverySuppliedItem getSuppliedItem() { return suppliedItem; }

	/**
	 * Setter for suppliedItem
	 * @param value The item that is being delivered or has been supplied.
	 */
	public void setSuppliedItem(SupplyDeliverySuppliedItem value) { suppliedItem = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return The date or time(s) the activity occurred.
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value The date or time(s) the activity occurred.
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Period occurrencePeriod;

	/**
	 * Getter for occurrencePeriod
	 * @return The date or time(s) the activity occurred.
	 */
	public Period getOccurrencePeriod() { return occurrencePeriod; }

	/**
	 * Setter for occurrencePeriod
	 * @param value The date or time(s) the activity occurred.
	 */
	public void setOccurrencePeriod(Period value) { occurrencePeriod = value; }


	@Expose
	private Timing occurrenceTiming;

	/**
	 * Getter for occurrenceTiming
	 * @return The date or time(s) the activity occurred.
	 */
	public Timing getOccurrenceTiming() { return occurrenceTiming; }

	/**
	 * Setter for occurrenceTiming
	 * @param value The date or time(s) the activity occurred.
	 */
	public void setOccurrenceTiming(Timing value) { occurrenceTiming = value; }


	@Expose
	private Reference supplier;

	/**
	 * Getter for supplier
	 * @return The individual responsible for dispensing the medication, supplier or device.
	 */
	public Reference getSupplier() { return supplier; }

	/**
	 * Setter for supplier
	 * @param value The individual responsible for dispensing the medication, supplier or device.
	 */
	public void setSupplier(Reference value) { supplier = value; }


	@Expose
	private Reference destination;

	/**
	 * Getter for destination
	 * @return Identification of the facility/location where the Supply was shipped to, as part of the dispense event.
	 */
	public Reference getDestination() { return destination; }

	/**
	 * Setter for destination
	 * @param value Identification of the facility/location where the Supply was shipped to, as part of the dispense event.
	 */
	public void setDestination(Reference value) { destination = value; }


	@Expose
	private ArrayList<Reference> receiver;

	/**
	 * Getter for receiver
	 * @return Identifies the person who picked up the Supply.
	 */
	public ArrayList<Reference> getReceiver() { return receiver; }

	/**
	 * Setter for receiver
	 * @param value Identifies the person who picked up the Supply.
	 */
	public void setReceiver(ArrayList<Reference> value) { receiver = value; }


}
