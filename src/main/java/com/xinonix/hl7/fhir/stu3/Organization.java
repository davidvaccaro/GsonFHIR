package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
 */
public class Organization extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Organization resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Organization resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier for the organization that is used to identify the organization across multiple disparate systems.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier for the organization that is used to identify the organization across multiple disparate systems.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether the organization's record is still in active use.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether the organization's record is still in active use.
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return The kind(s) of organization that this is.
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value The kind(s) of organization that this is.
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A name associated with the organization.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A name associated with the organization.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private ArrayList<String> alias;

	/**
	 * Getter for alias
	 * @return A list of alternate names that the organization is known as, or was known as in the past.
	 */
	public ArrayList<String> getAlias() { return alias; }

	/**
	 * Setter for alias
	 * @param value A list of alternate names that the organization is known as, or was known as in the past.
	 */
	public void setAlias(ArrayList<String> value) { alias = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return A contact detail for the organization.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value A contact detail for the organization.
	 */
	public void setTelecom(ArrayList<ContactPoint> value) { telecom = value; }


	@Expose
	private ArrayList<Address> address;

	/**
	 * Getter for address
	 * @return An address for the organization.
	 */
	public ArrayList<Address> getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value An address for the organization.
	 */
	public void setAddress(ArrayList<Address> value) { address = value; }


	@Expose
	private Reference partOf;

	/**
	 * Getter for partOf
	 * @return The organization of which this organization forms a part.
	 */
	public Reference getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value The organization of which this organization forms a part.
	 */
	public void setPartOf(Reference value) { partOf = value; }


	@Expose
	private ArrayList<OrganizationContact> contact;

	/**
	 * Getter for contact
	 * @return Contact for the organization for a certain purpose.
	 */
	public ArrayList<OrganizationContact> getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value Contact for the organization for a certain purpose.
	 */
	public void setContact(ArrayList<OrganizationContact> value) { contact = value; }


	@Expose
	private ArrayList<Reference> endpoint;

	/**
	 * Getter for endpoint
	 * @return Technical endpoints providing access to services operated for the organization.
	 */
	public ArrayList<Reference> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value Technical endpoints providing access to services operated for the organization.
	 */
	public void setEndpoint(ArrayList<Reference> value) { endpoint = value; }


}
