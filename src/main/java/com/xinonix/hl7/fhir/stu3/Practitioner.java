package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 */
public class Practitioner extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Practitioner resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Practitioner resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return An identifier that applies to this person in this role.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value An identifier that applies to this person in this role.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether this practitioner's record is in active use.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether this practitioner's record is in active use.
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private ArrayList<HumanName> name;

	/**
	 * Getter for name
	 * @return The name(s) associated with the practitioner.
	 */
	public ArrayList<HumanName> getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name(s) associated with the practitioner.
	 */
	public void setName(ArrayList<HumanName> value) { name = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return A contact detail for the practitioner, e.g. a telephone number or an email address.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value A contact detail for the practitioner, e.g. a telephone number or an email address.
	 */
	public void setTelecom(ArrayList<ContactPoint> value) { telecom = value; }


	@Expose
	private ArrayList<Address> address;

	/**
	 * Getter for address
	 * @return Address(es) of the practitioner that are not role specific (typically home address). 
Work addresses are not typically entered in this property as they are usually role dependent.
	 */
	public ArrayList<Address> getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value Address(es) of the practitioner that are not role specific (typically home address). 
Work addresses are not typically entered in this property as they are usually role dependent.
	 */
	public void setAddress(ArrayList<Address> value) { address = value; }


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
	 * @return The date of birth for the practitioner.
	 */
	public Date getBirthDate() { return birthDate; }

	/**
	 * Setter for birthDate
	 * @param value The date of birth for the practitioner.
	 */
	public void setBirthDate(Date value) { birthDate = value; }


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
	private ArrayList<PractitionerQualification> qualification;

	/**
	 * Getter for qualification
	 * @return Qualifications obtained by training and certification.
	 */
	public ArrayList<PractitionerQualification> getQualification() { return qualification; }

	/**
	 * Setter for qualification
	 * @param value Qualifications obtained by training and certification.
	 */
	public void setQualification(ArrayList<PractitionerQualification> value) { qualification = value; }


	@Expose
	private ArrayList<CodeableConcept> communication;

	/**
	 * Getter for communication
	 * @return A language the practitioner is able to use in patient communication.
	 */
	public ArrayList<CodeableConcept> getCommunication() { return communication; }

	/**
	 * Setter for communication
	 * @param value A language the practitioner is able to use in patient communication.
	 */
	public void setCommunication(ArrayList<CodeableConcept> value) { communication = value; }


}
