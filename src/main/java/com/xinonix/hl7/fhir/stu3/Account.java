package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 */
public class Account extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Account resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Account resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("inactive") INACTIVE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Indicates whether the account is presently used/usable or not.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Indicates whether the account is presently used/usable or not.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Categorizes the account for reporting and searching purposes.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Categorizes the account for reporting and searching purposes.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Name used for the account when displaying it to humans in reports, etc.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Name used for the account when displaying it to humans in reports, etc.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Identifies the patient, device, practitioner, location or other object the account is associated with.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Identifies the patient, device, practitioner, location or other object the account is associated with.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Period active;

	/**
	 * Getter for active
	 * @return Indicates the period of time over which the account is allowed to have transactions posted to it.
This period may be different to the coveragePeriod which is the duration of time that services may occur.
	 */
	public Period getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Indicates the period of time over which the account is allowed to have transactions posted to it.
This period may be different to the coveragePeriod which is the duration of time that services may occur.
	 */
	public void setActive(Period value) { active = value; }


	@Expose
	private Money balance;

	/**
	 * Getter for balance
	 * @return Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.
	 */
	public Money getBalance() { return balance; }

	/**
	 * Setter for balance
	 * @param value Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.
	 */
	public void setBalance(Money value) { balance = value; }


	@Expose
	private ArrayList<AccountCoverage> coverage;

	/**
	 * Getter for coverage
	 * @return The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
	 */
	public ArrayList<AccountCoverage> getCoverage() { return coverage; }

	/**
	 * Setter for coverage
	 * @param value The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
	 */
	public void setCoverage(ArrayList<AccountCoverage> value) { coverage = value; }


	@Expose
	private Reference owner;

	/**
	 * Getter for owner
	 * @return Indicates the organization, department, etc. with responsibility for the account.
	 */
	public Reference getOwner() { return owner; }

	/**
	 * Setter for owner
	 * @param value Indicates the organization, department, etc. with responsibility for the account.
	 */
	public void setOwner(Reference value) { owner = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Provides additional information about what the account tracks and how it is used.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Provides additional information about what the account tracks and how it is used.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<AccountGuarantor> guarantor;

	/**
	 * Getter for guarantor
	 * @return Parties financially responsible for the account.
	 */
	public ArrayList<AccountGuarantor> getGuarantor() { return guarantor; }

	/**
	 * Setter for guarantor
	 * @param value Parties financially responsible for the account.
	 */
	public void setGuarantor(ArrayList<AccountGuarantor> value) { guarantor = value; }


}
