package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A homogeneous material with a definite composition.
 */
public class SubstanceInstance extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Identifier associated with the package/container (usually a label affixed directly).
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier associated with the package/container (usually a label affixed directly).
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date expiry;

	/**
	 * Getter for expiry
	 * @return When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
	 */
	public Date getExpiry() { return expiry; }

	/**
	 * Setter for expiry
	 * @param value When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
	 */
	public void setExpiry(Date value) { expiry = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The amount of the substance.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The amount of the substance.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


}
