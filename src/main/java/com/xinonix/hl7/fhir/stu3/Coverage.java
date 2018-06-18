package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 */
public class Coverage extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Coverage resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Coverage resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatination of the Coverage.SubscriberID and the Coverage.dependant.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatination of the Coverage.SubscriberID and the Coverage.dependant.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the resource instance.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the resource instance.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Reference policyHolder;

	/**
	 * Getter for policyHolder
	 * @return The party who 'owns' the insurance policy,  may be an individual, corporation or the subscriber's employer.
	 */
	public Reference getPolicyHolder() { return policyHolder; }

	/**
	 * Setter for policyHolder
	 * @param value The party who 'owns' the insurance policy,  may be an individual, corporation or the subscriber's employer.
	 */
	public void setPolicyHolder(Reference value) { policyHolder = value; }


	@Expose
	private Reference subscriber;

	/**
	 * Getter for subscriber
	 * @return The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.
	 */
	public Reference getSubscriber() { return subscriber; }

	/**
	 * Setter for subscriber
	 * @param value The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.
	 */
	public void setSubscriber(Reference value) { subscriber = value; }


	@Expose
	private String subscriberId;

	/**
	 * Getter for subscriberId
	 * @return The insurer assigned ID for the Subscriber.
	 */
	public String getSubscriberId() { return subscriberId; }

	/**
	 * Setter for subscriberId
	 * @param value The insurer assigned ID for the Subscriber.
	 */
	public void setSubscriberId(String value) { subscriberId = value; }


	@Expose
	private Reference beneficiary;

	/**
	 * Getter for beneficiary
	 * @return The party who benefits from the insurance coverage., the patient when services are provided.
	 */
	public Reference getBeneficiary() { return beneficiary; }

	/**
	 * Setter for beneficiary
	 * @param value The party who benefits from the insurance coverage., the patient when services are provided.
	 */
	public void setBeneficiary(Reference value) { beneficiary = value; }


	@Expose
	private CodeableConcept relationship;

	/**
	 * Getter for relationship
	 * @return The relationship of beneficiary (patient) to the subscriber.
	 */
	public CodeableConcept getRelationship() { return relationship; }

	/**
	 * Setter for relationship
	 * @param value The relationship of beneficiary (patient) to the subscriber.
	 */
	public void setRelationship(CodeableConcept value) { relationship = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<Reference> payor;

	/**
	 * Getter for payor
	 * @return The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. May provide multiple identifiers such as insurance company identifier or business identifier (BIN number).
	 */
	public ArrayList<Reference> getPayor() { return payor; }

	/**
	 * Setter for payor
	 * @param value The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. May provide multiple identifiers such as insurance company identifier or business identifier (BIN number).
	 */
	public void setPayor(ArrayList<Reference> value) { payor = value; }


	@Expose
	private CoverageGrouping grouping;

	/**
	 * Getter for grouping
	 * @return A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan.
	 */
	public CoverageGrouping getGrouping() { return grouping; }

	/**
	 * Setter for grouping
	 * @param value A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan.
	 */
	public void setGrouping(CoverageGrouping value) { grouping = value; }


	@Expose
	private String dependent;

	/**
	 * Getter for dependent
	 * @return A unique identifier for a dependent under the coverage.
	 */
	public String getDependent() { return dependent; }

	/**
	 * Setter for dependent
	 * @param value A unique identifier for a dependent under the coverage.
	 */
	public void setDependent(String value) { dependent = value; }


	@Expose
	private String sequence;

	/**
	 * Getter for sequence
	 * @return An optional counter for a particular instance of the identified coverage which increments upon each renewal.
	 */
	public String getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value An optional counter for a particular instance of the identified coverage which increments upon each renewal.
	 */
	public void setSequence(String value) { sequence = value; }


	@Expose
	private Integer order;

	/**
	 * Getter for order
	 * @return The order of applicability of this coverage relative to other coverages which are currently inforce. Note, there may be gaps in the numbering and this does not imply primary, secondard etc. as the specific positioning of coverages depends upon the episode of care.
	 */
	public Integer getOrder() { return order; }

	/**
	 * Setter for order
	 * @param value The order of applicability of this coverage relative to other coverages which are currently inforce. Note, there may be gaps in the numbering and this does not imply primary, secondard etc. as the specific positioning of coverages depends upon the episode of care.
	 */
	public void setOrder(Integer value) { order = value; }


	@Expose
	private String network;

	/**
	 * Getter for network
	 * @return The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.
	 */
	public String getNetwork() { return network; }

	/**
	 * Setter for network
	 * @param value The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.
	 */
	public void setNetwork(String value) { network = value; }


	@Expose
	private ArrayList<Reference> contract;

	/**
	 * Getter for contract
	 * @return The policy(s) which constitute this insurance coverage.
	 */
	public ArrayList<Reference> getContract() { return contract; }

	/**
	 * Setter for contract
	 * @param value The policy(s) which constitute this insurance coverage.
	 */
	public void setContract(ArrayList<Reference> value) { contract = value; }


}
