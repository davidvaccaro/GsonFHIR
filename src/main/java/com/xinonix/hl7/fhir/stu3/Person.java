package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * Demographics and administrative information about a person independent of a specific health-related context.
 */
public class Person extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Person resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Person resource
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
	 * @return Administrative Gender.
	 */
	public Gender getGender() { return gender; }

	/**
	 * Setter for gender
	 * @param value Administrative Gender.
	 */
	public void setGender(Gender value) { gender = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date birthDate;

	/**
	 * Getter for birthDate
	 * @return The birth date for the person.
	 */
	public Date getBirthDate() { return birthDate; }

	/**
	 * Setter for birthDate
	 * @param value The birth date for the person.
	 */
	public void setBirthDate(Date value) { birthDate = value; }


	@Expose
	private ArrayList<Address> address;

	/**
	 * Getter for address
	 * @return One or more addresses for the person.
	 */
	public ArrayList<Address> getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value One or more addresses for the person.
	 */
	public void setAddress(ArrayList<Address> value) { address = value; }


	@Expose
	private Attachment photo;

	/**
	 * Getter for photo
	 * @return An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.
	 */
	public Attachment getPhoto() { return photo; }

	/**
	 * Setter for photo
	 * @param value An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.
	 */
	public void setPhoto(Attachment value) { photo = value; }


	@Expose
	private Reference managingOrganization;

	/**
	 * Getter for managingOrganization
	 * @return The organization that is the custodian of the person record.
	 */
	public Reference getManagingOrganization() { return managingOrganization; }

	/**
	 * Setter for managingOrganization
	 * @param value The organization that is the custodian of the person record.
	 */
	public void setManagingOrganization(Reference value) { managingOrganization = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether this person's record is in active use.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether this person's record is in active use.
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private ArrayList<PersonLink> link;

	/**
	 * Getter for link
	 * @return Link to a resource that concerns the same actual person.
	 */
	public ArrayList<PersonLink> getLink() { return link; }

	/**
	 * Setter for link
	 * @param value Link to a resource that concerns the same actual person.
	 */
	public void setLink(ArrayList<PersonLink> value) { link = value; }


}
