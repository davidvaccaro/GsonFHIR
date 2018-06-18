package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
 */
public class ChargeItem extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ChargeItem resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ChargeItem resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers assigned to this event performer or other systems.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers assigned to this event performer or other systems.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private ArrayList<String> definition;

	/**
	 * Getter for definition
	 * @return References the source of pricing information, rules of application for the code this ChargeItem uses.
	 */
	public ArrayList<String> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value References the source of pricing information, rules of application for the code this ChargeItem uses.
	 */
	public void setDefinition(ArrayList<String> value) { definition = value; }


	public enum Status{
		@SerializedName("planned") PLANNED,
		@SerializedName("billable") BILLABLE,
		@SerializedName("not-billable") NOT_BILLABLE,
		@SerializedName("aborted") ABORTED,
		@SerializedName("billed") BILLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The current state of the ChargeItem.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The current state of the ChargeItem.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return ChargeItems can be grouped to larger ChargeItems covering the whole set.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value ChargeItems can be grouped to larger ChargeItems covering the whole set.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A code that identifies the charge, like a billing code.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code that identifies the charge, like a billing code.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The individual or set of individuals the action is being or was performed on.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The individual or set of individuals the action is being or was performed on.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter or episode of care that establishes the context for this event.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter or episode of care that establishes the context for this event.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return Date/time(s) or duration when the charged service was applied.
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value Date/time(s) or duration when the charged service was applied.
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Period occurrencePeriod;

	/**
	 * Getter for occurrencePeriod
	 * @return Date/time(s) or duration when the charged service was applied.
	 */
	public Period getOccurrencePeriod() { return occurrencePeriod; }

	/**
	 * Setter for occurrencePeriod
	 * @param value Date/time(s) or duration when the charged service was applied.
	 */
	public void setOccurrencePeriod(Period value) { occurrencePeriod = value; }


	@Expose
	private Timing occurrenceTiming;

	/**
	 * Getter for occurrenceTiming
	 * @return Date/time(s) or duration when the charged service was applied.
	 */
	public Timing getOccurrenceTiming() { return occurrenceTiming; }

	/**
	 * Setter for occurrenceTiming
	 * @param value Date/time(s) or duration when the charged service was applied.
	 */
	public void setOccurrenceTiming(Timing value) { occurrenceTiming = value; }


	@Expose
	private ArrayList<ChargeItemParticipant> participant;

	/**
	 * Getter for participant
	 * @return Indicates who or what performed or participated in the charged service.
	 */
	public ArrayList<ChargeItemParticipant> getParticipant() { return participant; }

	/**
	 * Setter for participant
	 * @param value Indicates who or what performed or participated in the charged service.
	 */
	public void setParticipant(ArrayList<ChargeItemParticipant> value) { participant = value; }


	@Expose
	private Reference performingOrganization;

	/**
	 * Getter for performingOrganization
	 * @return The organization requesting the service.
	 */
	public Reference getPerformingOrganization() { return performingOrganization; }

	/**
	 * Setter for performingOrganization
	 * @param value The organization requesting the service.
	 */
	public void setPerformingOrganization(Reference value) { performingOrganization = value; }


	@Expose
	private Reference requestingOrganization;

	/**
	 * Getter for requestingOrganization
	 * @return The organization performing the service.
	 */
	public Reference getRequestingOrganization() { return requestingOrganization; }

	/**
	 * Setter for requestingOrganization
	 * @param value The organization performing the service.
	 */
	public void setRequestingOrganization(Reference value) { requestingOrganization = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return Quantity of which the charge item has been serviced.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value Quantity of which the charge item has been serviced.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private ArrayList<CodeableConcept> bodysite;

	/**
	 * Getter for bodysite
	 * @return The anatomical location where the related service has been applied.
	 */
	public ArrayList<CodeableConcept> getBodysite() { return bodysite; }

	/**
	 * Setter for bodysite
	 * @param value The anatomical location where the related service has been applied.
	 */
	public void setBodysite(ArrayList<CodeableConcept> value) { bodysite = value; }


	@Expose
	private Double factorOverride;

	/**
	 * Getter for factorOverride
	 * @return Factor overriding the factor determined by the rules associated with the code.
	 */
	public Double getFactorOverride() { return factorOverride; }

	/**
	 * Setter for factorOverride
	 * @param value Factor overriding the factor determined by the rules associated with the code.
	 */
	public void setFactorOverride(Double value) { factorOverride = value; }


	@Expose
	private Money priceOverride;

	/**
	 * Getter for priceOverride
	 * @return Total price of the charge overriding the list price associated with the code.
	 */
	public Money getPriceOverride() { return priceOverride; }

	/**
	 * Setter for priceOverride
	 * @param value Total price of the charge overriding the list price associated with the code.
	 */
	public void setPriceOverride(Money value) { priceOverride = value; }


	@Expose
	private String overrideReason;

	/**
	 * Getter for overrideReason
	 * @return If the list price or the rule based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action.
	 */
	public String getOverrideReason() { return overrideReason; }

	/**
	 * Setter for overrideReason
	 * @param value If the list price or the rule based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action.
	 */
	public void setOverrideReason(String value) { overrideReason = value; }


	@Expose
	private Reference enterer;

	/**
	 * Getter for enterer
	 * @return The device, practitioner, etc. who entered the charge item.
	 */
	public Reference getEnterer() { return enterer; }

	/**
	 * Setter for enterer
	 * @param value The device, practitioner, etc. who entered the charge item.
	 */
	public void setEnterer(Reference value) { enterer = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date enteredDate;

	/**
	 * Getter for enteredDate
	 * @return Date the charge item was entered.
	 */
	public Date getEnteredDate() { return enteredDate; }

	/**
	 * Setter for enteredDate
	 * @param value Date the charge item was entered.
	 */
	public void setEnteredDate(Date value) { enteredDate = value; }


	@Expose
	private ArrayList<CodeableConcept> reason;

	/**
	 * Getter for reason
	 * @return Describes why the event occurred in coded or textual form.
	 */
	public ArrayList<CodeableConcept> getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value Describes why the event occurred in coded or textual form.
	 */
	public void setReason(ArrayList<CodeableConcept> value) { reason = value; }


	@Expose
	private ArrayList<Reference> service;

	/**
	 * Getter for service
	 * @return Indicated the rendered service that caused this charge.
	 */
	public ArrayList<Reference> getService() { return service; }

	/**
	 * Setter for service
	 * @param value Indicated the rendered service that caused this charge.
	 */
	public void setService(ArrayList<Reference> value) { service = value; }


	@Expose
	private ArrayList<Reference> account;

	/**
	 * Getter for account
	 * @return Account into which this ChargeItems belongs.
	 */
	public ArrayList<Reference> getAccount() { return account; }

	/**
	 * Setter for account
	 * @param value Account into which this ChargeItems belongs.
	 */
	public void setAccount(ArrayList<Reference> value) { account = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Comments made about the event by the performer, subject or other participants.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Comments made about the event by the performer, subject or other participants.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<Reference> supportingInformation;

	/**
	 * Getter for supportingInformation
	 * @return Further information supporting the this charge.
	 */
	public ArrayList<Reference> getSupportingInformation() { return supportingInformation; }

	/**
	 * Setter for supportingInformation
	 * @param value Further information supporting the this charge.
	 */
	public void setSupportingInformation(ArrayList<Reference> value) { supportingInformation = value; }


}
