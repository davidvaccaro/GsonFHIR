package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Specifies contact information for a person or organization.
 */
public class ContactDetail extends Element {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name of an individual to contact.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name of an individual to contact.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return The contact details for the individual (if a name was provided) or the organization.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value The contact details for the individual (if a name was provided) or the organization.
	 */
	public void setTelecom(ArrayList<ContactPoint> value) { telecom = value; }


}
