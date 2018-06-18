package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
 */
public class OrganizationContact extends BackboneElement {
	@Expose
	private CodeableConcept purpose;

	/**
	 * Getter for purpose
	 * @return Indicates a purpose for which the contact can be reached.
	 */
	public CodeableConcept getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Indicates a purpose for which the contact can be reached.
	 */
	public void setPurpose(CodeableConcept value) { purpose = value; }


	@Expose
	private HumanName name;

	/**
	 * Getter for name
	 * @return A name associated with the contact.
	 */
	public HumanName getName() { return name; }

	/**
	 * Setter for name
	 * @param value A name associated with the contact.
	 */
	public void setName(HumanName value) { name = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.
	 */
	public void setTelecom(ArrayList<ContactPoint> value) { telecom = value; }


	@Expose
	private Address address;

	/**
	 * Getter for address
	 * @return Visiting or postal addresses for the contact.
	 */
	public Address getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value Visiting or postal addresses for the contact.
	 */
	public void setAddress(Address value) { address = value; }


}
