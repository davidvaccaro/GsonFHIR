package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
public class Patient extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Patient resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Patient resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return An identifier for this patient.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value An identifier for this patient.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether this patient record is in active use.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether this patient record is in active use.
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private ArrayList<HumanName> name;

	/**
	 * Getter for name
	 * @return A name associated with the individual.
	 */
	public ArrayList<HumanName> getName() { return name; }

	/**
	 * Setter for name
	 * @param value A name associated with the individual.
	 */
	public void setName(ArrayList<HumanName> value) { name = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
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
	 * @return Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
	 */
	public Gender getGender() { return gender; }

	/**
	 * Setter for gender
	 * @param value Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
	 */
	public void setGender(Gender value) { gender = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date birthDate;

	/**
	 * Getter for birthDate
	 * @return The date of birth for the individual.
	 */
	public Date getBirthDate() { return birthDate; }

	/**
	 * Setter for birthDate
	 * @param value The date of birth for the individual.
	 */
	public void setBirthDate(Date value) { birthDate = value; }


	@Expose
	private boolean deceasedBoolean;

	/**
	 * Getter for deceasedBoolean
	 * @return Indicates if the individual is deceased or not.
	 */
	public boolean getDeceasedBoolean() { return deceasedBoolean; }

	/**
	 * Setter for deceasedBoolean
	 * @param value Indicates if the individual is deceased or not.
	 */
	public void setDeceasedBoolean(boolean value) { deceasedBoolean = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date deceasedDateTime;

	/**
	 * Getter for deceasedDateTime
	 * @return Indicates if the individual is deceased or not.
	 */
	public Date getDeceasedDateTime() { return deceasedDateTime; }

	/**
	 * Setter for deceasedDateTime
	 * @param value Indicates if the individual is deceased or not.
	 */
	public void setDeceasedDateTime(Date value) { deceasedDateTime = value; }


	@Expose
	private ArrayList<Address> address;

	/**
	 * Getter for address
	 * @return Addresses for the individual.
	 */
	public ArrayList<Address> getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value Addresses for the individual.
	 */
	public void setAddress(ArrayList<Address> value) { address = value; }


	@Expose
	private CodeableConcept maritalStatus;

	/**
	 * Getter for maritalStatus
	 * @return This field contains a patient's most recent marital (civil) status.
	 */
	public CodeableConcept getMaritalStatus() { return maritalStatus; }

	/**
	 * Setter for maritalStatus
	 * @param value This field contains a patient's most recent marital (civil) status.
	 */
	public void setMaritalStatus(CodeableConcept value) { maritalStatus = value; }


	@Expose
	private boolean multipleBirthBoolean;

	/**
	 * Getter for multipleBirthBoolean
	 * @return Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer).
	 */
	public boolean getMultipleBirthBoolean() { return multipleBirthBoolean; }

	/**
	 * Setter for multipleBirthBoolean
	 * @param value Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer).
	 */
	public void setMultipleBirthBoolean(boolean value) { multipleBirthBoolean = value; }


	@Expose
	private Integer multipleBirthInteger;

	/**
	 * Getter for multipleBirthInteger
	 * @return Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer).
	 */
	public Integer getMultipleBirthInteger() { return multipleBirthInteger; }

	/**
	 * Setter for multipleBirthInteger
	 * @param value Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer).
	 */
	public void setMultipleBirthInteger(Integer value) { multipleBirthInteger = value; }


	@Expose
	private ArrayList<Attachment> photo;

	/**
	 * Getter for photo
	 * @return Image of the patient.
	 */
	public ArrayList<Attachment> getPhoto() { return photo; }

	/**
	 * Setter for photo
	 * @param value Image of the patient.
	 */
	public void setPhoto(ArrayList<Attachment> value) { photo = value; }


	@Expose
	private ArrayList<PatientContact> contact;

	/**
	 * Getter for contact
	 * @return A contact party (e.g. guardian, partner, friend) for the patient.
	 */
	public ArrayList<PatientContact> getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value A contact party (e.g. guardian, partner, friend) for the patient.
	 */
	public void setContact(ArrayList<PatientContact> value) { contact = value; }


	@Expose
	private PatientAnimal animal;

	/**
	 * Getter for animal
	 * @return This patient is known to be an animal.
	 */
	public PatientAnimal getAnimal() { return animal; }

	/**
	 * Setter for animal
	 * @param value This patient is known to be an animal.
	 */
	public void setAnimal(PatientAnimal value) { animal = value; }


	@Expose
	private ArrayList<PatientCommunication> communication;

	/**
	 * Getter for communication
	 * @return Languages which may be used to communicate with the patient about his or her health.
	 */
	public ArrayList<PatientCommunication> getCommunication() { return communication; }

	/**
	 * Setter for communication
	 * @param value Languages which may be used to communicate with the patient about his or her health.
	 */
	public void setCommunication(ArrayList<PatientCommunication> value) { communication = value; }


	@Expose
	private ArrayList<Reference> generalPractitioner;

	/**
	 * Getter for generalPractitioner
	 * @return Patient's nominated care provider.
	 */
	public ArrayList<Reference> getGeneralPractitioner() { return generalPractitioner; }

	/**
	 * Setter for generalPractitioner
	 * @param value Patient's nominated care provider.
	 */
	public void setGeneralPractitioner(ArrayList<Reference> value) { generalPractitioner = value; }


	@Expose
	private Reference managingOrganization;

	/**
	 * Getter for managingOrganization
	 * @return Organization that is the custodian of the patient record.
	 */
	public Reference getManagingOrganization() { return managingOrganization; }

	/**
	 * Setter for managingOrganization
	 * @param value Organization that is the custodian of the patient record.
	 */
	public void setManagingOrganization(Reference value) { managingOrganization = value; }


	@Expose
	private ArrayList<PatientLink> link;

	/**
	 * Getter for link
	 * @return Link to another patient resource that concerns the same actual patient.
	 */
	public ArrayList<PatientLink> getLink() { return link; }

	/**
	 * Setter for link
	 * @param value Link to another patient resource that concerns the same actual patient.
	 */
	public void setLink(ArrayList<PatientLink> value) { link = value; }


}
