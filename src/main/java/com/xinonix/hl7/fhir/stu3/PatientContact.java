package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
public class PatientContact extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> relationship;

	/**
	 * Getter for relationship
	 * @return The nature of the relationship between the patient and the contact person.
	 */
	public ArrayList<CodeableConcept> getRelationship() { return relationship; }

	/**
	 * Setter for relationship
	 * @param value The nature of the relationship between the patient and the contact person.
	 */
	public void setRelationship(ArrayList<CodeableConcept> value) { relationship = value; }


	@Expose
	private HumanName name;

	/**
	 * Getter for name
	 * @return A name associated with the contact person.
	 */
	public HumanName getName() { return name; }

	/**
	 * Setter for name
	 * @param value A name associated with the contact person.
	 */
	public void setName(HumanName value) { name = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return A contact detail for the person, e.g. a telephone number or an email address.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value A contact detail for the person, e.g. a telephone number or an email address.
	 */
	public void setTelecom(ArrayList<ContactPoint> value) { telecom = value; }


	@Expose
	private Address address;

	/**
	 * Getter for address
	 * @return Address for the contact person.
	 */
	public Address getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value Address for the contact person.
	 */
	public void setAddress(Address value) { address = value; }


	public enum Gender{
		@SerializedName("male") MALE,
		@SerializedName("female") FEMALE,
		@SerializedName("other") OTHER,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Gender gender;

	/**
	 * Getter for gender
	 * @return Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
	 */
	public Gender getGender() { return gender; }

	/**
	 * Setter for gender
	 * @param value Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
	 */
	public void setGender(Gender value) { gender = value; }


	@Expose
	private Reference organization;

	/**
	 * Getter for organization
	 * @return Organization on behalf of which the contact is acting or for which the contact is working.
	 */
	public Reference getOrganization() { return organization; }

	/**
	 * Setter for organization
	 * @param value Organization on behalf of which the contact is acting or for which the contact is working.
	 */
	public void setOrganization(Reference value) { organization = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period during which this contact person or organization is valid to be contacted relating to this patient.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period during which this contact person or organization is valid to be contacted relating to this patient.
	 */
	public void setPeriod(Period value) { period = value; }


}
