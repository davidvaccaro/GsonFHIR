package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
 */
public class Contributor extends Element {
	public enum Type{
		@SerializedName("author") AUTHOR,
		@SerializedName("editor") EDITOR,
		@SerializedName("reviewer") REVIEWER,
		@SerializedName("endorser") ENDORSER
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of contributor.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of contributor.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name of the individual or organization responsible for the contribution.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name of the individual or organization responsible for the contribution.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private ArrayList<ContactDetail> contact;

	/**
	 * Getter for contact
	 * @return Contact details to assist a user in finding and communicating with the contributor.
	 */
	public ArrayList<ContactDetail> getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value Contact details to assist a user in finding and communicating with the contributor.
	 */
	public void setContact(ArrayList<ContactDetail> value) { contact = value; }


}
