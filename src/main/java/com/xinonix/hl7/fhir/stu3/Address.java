package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
 */
public class Address extends Element {
	public enum Use{
		@SerializedName("home") HOME,
		@SerializedName("work") WORK,
		@SerializedName("temp") TEMP,
		@SerializedName("old") OLD
	}

	@Expose
	private Use use;

	/**
	 * Getter for use
	 * @return The purpose of this address.
	 */
	public Use getUse() { return use; }

	/**
	 * Setter for use
	 * @param value The purpose of this address.
	 */
	public void setUse(Use value) { use = value; }


	public enum Type{
		@SerializedName("postal") POSTAL,
		@SerializedName("physical") PHYSICAL,
		@SerializedName("both") BOTH
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return A full text representation of the address.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value A full text representation of the address.
	 */
	public void setText(String value) { text = value; }


	@Expose
	private ArrayList<String> line;

	/**
	 * Getter for line
	 * @return This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.
	 */
	public ArrayList<String> getLine() { return line; }

	/**
	 * Setter for line
	 * @param value This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.
	 */
	public void setLine(ArrayList<String> value) { line = value; }


	@Expose
	private String city;

	/**
	 * Getter for city
	 * @return The name of the city, town, village or other community or delivery center.
	 */
	public String getCity() { return city; }

	/**
	 * Setter for city
	 * @param value The name of the city, town, village or other community or delivery center.
	 */
	public void setCity(String value) { city = value; }


	@Expose
	private String district;

	/**
	 * Getter for district
	 * @return The name of the administrative area (county).
	 */
	public String getDistrict() { return district; }

	/**
	 * Setter for district
	 * @param value The name of the administrative area (county).
	 */
	public void setDistrict(String value) { district = value; }


	@Expose
	private String state;

	/**
	 * Getter for state
	 * @return Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
	 */
	public String getState() { return state; }

	/**
	 * Setter for state
	 * @param value Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
	 */
	public void setState(String value) { state = value; }


	@Expose
	private String postalCode;

	/**
	 * Getter for postalCode
	 * @return A postal code designating a region defined by the postal service.
	 */
	public String getPostalCode() { return postalCode; }

	/**
	 * Setter for postalCode
	 * @param value A postal code designating a region defined by the postal service.
	 */
	public void setPostalCode(String value) { postalCode = value; }


	@Expose
	private String country;

	/**
	 * Getter for country
	 * @return Country - a nation as commonly understood or generally accepted.
	 */
	public String getCountry() { return country; }

	/**
	 * Setter for country
	 * @param value Country - a nation as commonly understood or generally accepted.
	 */
	public void setCountry(String value) { country = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Time period when address was/is in use.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Time period when address was/is in use.
	 */
	public void setPeriod(Period value) { period = value; }


}
