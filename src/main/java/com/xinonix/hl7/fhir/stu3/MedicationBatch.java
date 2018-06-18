package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 */
public class MedicationBatch extends BackboneElement {
	@Expose
	private String lotNumber;

	/**
	 * Getter for lotNumber
	 * @return The assigned lot number of a batch of the specified product.
	 */
	public String getLotNumber() { return lotNumber; }

	/**
	 * Setter for lotNumber
	 * @param value The assigned lot number of a batch of the specified product.
	 */
	public void setLotNumber(String value) { lotNumber = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date expirationDate;

	/**
	 * Getter for expirationDate
	 * @return When this specific batch of product will expire.
	 */
	public Date getExpirationDate() { return expirationDate; }

	/**
	 * Setter for expirationDate
	 * @param value When this specific batch of product will expire.
	 */
	public void setExpirationDate(Date value) { expirationDate = value; }


}
