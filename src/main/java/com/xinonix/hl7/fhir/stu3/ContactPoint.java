package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
 */
public class ContactPoint extends Element {
	public enum System{
		@SerializedName("phone") PHONE,
		@SerializedName("fax") FAX,
		@SerializedName("email") EMAIL,
		@SerializedName("pager") PAGER,
		@SerializedName("url") URL,
		@SerializedName("sms") SMS,
		@SerializedName("other") OTHER
	}

	@Expose
	private System system;

	/**
	 * Getter for system
	 * @return Telecommunications form for contact point - what communications system is required to make use of the contact.
	 */
	public System getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value Telecommunications form for contact point - what communications system is required to make use of the contact.
	 */
	public void setSystem(System value) { system = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
	 */
	public void setValue(String value) { value = value; }


	public enum Use{
		@SerializedName("home") HOME,
		@SerializedName("work") WORK,
		@SerializedName("temp") TEMP,
		@SerializedName("old") OLD,
		@SerializedName("mobile") MOBILE
	}

	@Expose
	private Use use;

	/**
	 * Getter for use
	 * @return Identifies the purpose for the contact point.
	 */
	public Use getUse() { return use; }

	/**
	 * Setter for use
	 * @param value Identifies the purpose for the contact point.
	 */
	public void setUse(Use value) { use = value; }


	@Expose
	private Integer rank;

	/**
	 * Getter for rank
	 * @return Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values.
	 */
	public Integer getRank() { return rank; }

	/**
	 * Setter for rank
	 * @param value Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values.
	 */
	public void setRank(Integer value) { rank = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Time period when the contact point was/is in use.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Time period when the contact point was/is in use.
	 */
	public void setPeriod(Period value) { period = value; }


}
