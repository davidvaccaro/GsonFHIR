package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
 */
public class RelatedPerson extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a RelatedPerson resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a RelatedPerson resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier for a person within a particular scope.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier for a person within a particular scope.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether this related person record is in active use.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether this related person record is in active use.
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The patient this person is related to.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The patient this person is related to.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private CodeableConcept relationship;

	/**
	 * Getter for relationship
	 * @return The nature of the relationship between a patient and the related person.
	 */
	public CodeableConcept getRelationship() { return relationship; }

	/**
	 * Setter for relationship
	 * @param value The nature of the relationship between a patient and the related person.
	 */
	public void setRelationship(CodeableConcept value) { relationship = value; }


	@Expose
	private ArrayList<HumanName> name;

	/**
	 * Getter for name
	 * @return A name associated with the person.
	 */
	public ArrayList<HumanName> getName() { return name; }

	/**
	 * Setter for name
	 * @param value A name associated with the person.
	 */
	public void setName(ArrayList<HumanName> value) { name = value; }


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
	 * @return Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
	 */
	public Gender getGender() { return gender; }

	/**
	 * Setter for gender
	 * @param value Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
	 */
	public void setGender(Gender value) { gender = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date birthDate;

	/**
	 * Getter for birthDate
	 * @return The date on which the related person was born.
	 */
	public Date getBirthDate() { return birthDate; }

	/**
	 * Setter for birthDate
	 * @param value The date on which the related person was born.
	 */
	public void setBirthDate(Date value) { birthDate = value; }


	@Expose
	private ArrayList<Address> address;

	/**
	 * Getter for address
	 * @return Address where the related person can be contacted or visited.
	 */
	public ArrayList<Address> getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value Address where the related person can be contacted or visited.
	 */
	public void setAddress(ArrayList<Address> value) { address = value; }


	@Expose
	private ArrayList<Attachment> photo;

	/**
	 * Getter for photo
	 * @return Image of the person.
	 */
	public ArrayList<Attachment> getPhoto() { return photo; }

	/**
	 * Setter for photo
	 * @param value Image of the person.
	 */
	public void setPhoto(ArrayList<Attachment> value) { photo = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.
	 */
	public void setPeriod(Period value) { period = value; }


}
