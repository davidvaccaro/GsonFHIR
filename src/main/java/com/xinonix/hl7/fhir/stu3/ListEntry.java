package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A set of information summarized from a list of other resources.
 */
public class ListEntry extends BackboneElement {
	@Expose
	private CodeableConcept flag;

	/**
	 * Getter for flag
	 * @return The flag allows the system constructing the list to indicate the role and significance of the item in the list.
	 */
	public CodeableConcept getFlag() { return flag; }

	/**
	 * Setter for flag
	 * @param value The flag allows the system constructing the list to indicate the role and significance of the item in the list.
	 */
	public void setFlag(CodeableConcept value) { flag = value; }


	@Expose
	private boolean deleted;

	/**
	 * Getter for deleted
	 * @return True if this item is marked as deleted in the list.
	 */
	public boolean getDeleted() { return deleted; }

	/**
	 * Setter for deleted
	 * @param value True if this item is marked as deleted in the list.
	 */
	public void setDeleted(boolean value) { deleted = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return When this item was added to the list.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value When this item was added to the list.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Reference item;

	/**
	 * Getter for item
	 * @return A reference to the actual resource from which data was derived.
	 */
	public Reference getItem() { return item; }

	/**
	 * Setter for item
	 * @param value A reference to the actual resource from which data was derived.
	 */
	public void setItem(Reference value) { item = value; }


}
