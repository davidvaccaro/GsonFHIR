package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
public class AuditEventNetwork extends BackboneElement {
	@Expose
	private String address;

	/**
	 * Getter for address
	 * @return An identifier for the network access point of the user device for the audit event.
	 */
	public String getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value An identifier for the network access point of the user device for the audit event.
	 */
	public void setAddress(String value) { address = value; }


	public enum Type{
		@SerializedName("1") ONE,
		@SerializedName("2") TWO,
		@SerializedName("3") THREE,
		@SerializedName("4") FOUR,
		@SerializedName("5") FIVE
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return An identifier for the type of network access point that originated the audit event.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value An identifier for the type of network access point that originated the audit event.
	 */
	public void setType(Type value) { type = value; }


}
