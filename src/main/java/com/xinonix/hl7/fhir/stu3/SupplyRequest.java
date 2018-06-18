package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A record of a request for a medication, substance or device used in the healthcare setting.
 */
public class SupplyRequest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a SupplyRequest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a SupplyRequest resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Unique identifier for this supply request.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique identifier for this supply request.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	public enum Status{
		@SerializedName("draft") DRAFT,
		@SerializedName("active") ACTIVE,
		@SerializedName("suspended") SUSPENDED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Status of the supply request.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Status of the supply request.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private String priority;

	/**
	 * Getter for priority
	 * @return Indicates how quickly this SupplyRequest should be addressed with respect to other requests.
	 */
	public String getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Indicates how quickly this SupplyRequest should be addressed with respect to other requests.
	 */
	public void setPriority(String value) { priority = value; }


	@Expose
	private SupplyRequestOrderedItem orderedItem;

	/**
	 * Getter for orderedItem
	 * @return The item being requested.
	 */
	public SupplyRequestOrderedItem getOrderedItem() { return orderedItem; }

	/**
	 * Setter for orderedItem
	 * @param value The item being requested.
	 */
	public void setOrderedItem(SupplyRequestOrderedItem value) { orderedItem = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return When the request should be fulfilled.
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value When the request should be fulfilled.
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Period occurrencePeriod;

	/**
	 * Getter for occurrencePeriod
	 * @return When the request should be fulfilled.
	 */
	public Period getOccurrencePeriod() { return occurrencePeriod; }

	/**
	 * Setter for occurrencePeriod
	 * @param value When the request should be fulfilled.
	 */
	public void setOccurrencePeriod(Period value) { occurrencePeriod = value; }


	@Expose
	private Timing occurrenceTiming;

	/**
	 * Getter for occurrenceTiming
	 * @return When the request should be fulfilled.
	 */
	public Timing getOccurrenceTiming() { return occurrenceTiming; }

	/**
	 * Setter for occurrenceTiming
	 * @param value When the request should be fulfilled.
	 */
	public void setOccurrenceTiming(Timing value) { occurrenceTiming = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date authoredOn;

	/**
	 * Getter for authoredOn
	 * @return When the request was made.
	 */
	public Date getAuthoredOn() { return authoredOn; }

	/**
	 * Setter for authoredOn
	 * @param value When the request was made.
	 */
	public void setAuthoredOn(Date value) { authoredOn = value; }


	@Expose
	private SupplyRequestRequester requester;

	/**
	 * Getter for requester
	 * @return The individual who initiated the request and has responsibility for its activation.
	 */
	public SupplyRequestRequester getRequester() { return requester; }

	/**
	 * Setter for requester
	 * @param value The individual who initiated the request and has responsibility for its activation.
	 */
	public void setRequester(SupplyRequestRequester value) { requester = value; }


	@Expose
	private ArrayList<Reference> supplier;

	/**
	 * Getter for supplier
	 * @return Who is intended to fulfill the request.
	 */
	public ArrayList<Reference> getSupplier() { return supplier; }

	/**
	 * Setter for supplier
	 * @param value Who is intended to fulfill the request.
	 */
	public void setSupplier(ArrayList<Reference> value) { supplier = value; }


	@Expose
	private CodeableConcept reasonCodeableConcept;

	/**
	 * Getter for reasonCodeableConcept
	 * @return Why the supply item was requested.
	 */
	public CodeableConcept getReasonCodeableConcept() { return reasonCodeableConcept; }

	/**
	 * Setter for reasonCodeableConcept
	 * @param value Why the supply item was requested.
	 */
	public void setReasonCodeableConcept(CodeableConcept value) { reasonCodeableConcept = value; }


	@Expose
	private Reference reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Why the supply item was requested.
	 */
	public Reference getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Why the supply item was requested.
	 */
	public void setReasonReference(Reference value) { reasonReference = value; }


	@Expose
	private Reference deliverFrom;

	/**
	 * Getter for deliverFrom
	 * @return Where the supply is expected to come from.
	 */
	public Reference getDeliverFrom() { return deliverFrom; }

	/**
	 * Setter for deliverFrom
	 * @param value Where the supply is expected to come from.
	 */
	public void setDeliverFrom(Reference value) { deliverFrom = value; }


	@Expose
	private Reference deliverTo;

	/**
	 * Getter for deliverTo
	 * @return Where the supply is destined to go.
	 */
	public Reference getDeliverTo() { return deliverTo; }

	/**
	 * Setter for deliverTo
	 * @param value Where the supply is destined to go.
	 */
	public void setDeliverTo(Reference value) { deliverTo = value; }


}
