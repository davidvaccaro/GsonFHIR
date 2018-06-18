package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
 */
public class CompositionAttester extends BackboneElement {
	@Expose
	private ArrayList<String> mode;

	/**
	 * Getter for mode
	 * @return The type of attestation the authenticator offers.
	 */
	public ArrayList<String> getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value The type of attestation the authenticator offers.
	 */
	public void setMode(ArrayList<String> value) { mode = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date time;

	/**
	 * Getter for time
	 * @return When the composition was attested by the party.
	 */
	public Date getTime() { return time; }

	/**
	 * Setter for time
	 * @param value When the composition was attested by the party.
	 */
	public void setTime(Date value) { time = value; }


	@Expose
	private Reference party;

	/**
	 * Getter for party
	 * @return Who attested the composition in the specified way.
	 */
	public Reference getParty() { return party; }

	/**
	 * Setter for party
	 * @param value Who attested the composition in the specified way.
	 */
	public void setParty(Reference value) { party = value; }


}
