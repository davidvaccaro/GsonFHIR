package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 */
public class ConsentData1 extends BackboneElement {
	public enum Meaning{
		@SerializedName("instance") INSTANCE,
		@SerializedName("related") RELATED,
		@SerializedName("dependents") DEPENDENTS,
		@SerializedName("authoredby") AUTHOREDBY
	}

	@Expose
	private Meaning meaning;

	/**
	 * Getter for meaning
	 * @return How the resource reference is interpreted when testing consent restrictions.
	 */
	public Meaning getMeaning() { return meaning; }

	/**
	 * Setter for meaning
	 * @param value How the resource reference is interpreted when testing consent restrictions.
	 */
	public void setMeaning(Meaning value) { meaning = value; }


	@Expose
	private Reference reference;

	/**
	 * Getter for reference
	 * @return A reference to a specific resource that defines which resources are covered by this consent.
	 */
	public Reference getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value A reference to a specific resource that defines which resources are covered by this consent.
	 */
	public void setReference(Reference value) { reference = value; }


}
