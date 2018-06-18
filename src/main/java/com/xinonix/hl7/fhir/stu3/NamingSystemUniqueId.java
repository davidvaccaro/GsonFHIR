package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 */
public class NamingSystemUniqueId extends BackboneElement {
	public enum Type{
		@SerializedName("oid") OID,
		@SerializedName("uuid") UUID,
		@SerializedName("uri") URI,
		@SerializedName("other") OTHER
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Identifies the unique identifier scheme used for this particular identifier.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Identifies the unique identifier scheme used for this particular identifier.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The string that should be sent over the wire to identify the code system or identifier system.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The string that should be sent over the wire to identify the code system or identifier system.
	 */
	public void setValue(String value) { value = value; }


	@Expose
	private boolean preferred;

	/**
	 * Getter for preferred
	 * @return Indicates whether this identifier is the "preferred" identifier of this type.
	 */
	public boolean getPreferred() { return preferred; }

	/**
	 * Setter for preferred
	 * @param value Indicates whether this identifier is the "preferred" identifier of this type.
	 */
	public void setPreferred(boolean value) { preferred = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Notes about the past or intended usage of this identifier.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Notes about the past or intended usage of this identifier.
	 */
	public void setComment(String value) { comment = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.
	 */
	public void setPeriod(Period value) { period = value; }


}
