package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A human's name with the ability to identify parts and usage.
 */
public class HumanName extends Element {
	public enum Use{
		@SerializedName("usual") USUAL,
		@SerializedName("official") OFFICIAL,
		@SerializedName("temp") TEMP,
		@SerializedName("nickname") NICKNAME,
		@SerializedName("anonymous") ANONYMOUS,
		@SerializedName("old") OLD,
		@SerializedName("maiden") MAIDEN
	}

	@Expose
	private Use use;

	/**
	 * Getter for use
	 * @return Identifies the purpose for this name.
	 */
	public Use getUse() { return use; }

	/**
	 * Setter for use
	 * @param value Identifies the purpose for this name.
	 */
	public void setUse(Use value) { use = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return A full text representation of the name.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value A full text representation of the name.
	 */
	public void setText(String value) { text = value; }


	@Expose
	private String family;

	/**
	 * Getter for family
	 * @return The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.
	 */
	public String getFamily() { return family; }

	/**
	 * Setter for family
	 * @param value The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.
	 */
	public void setFamily(String value) { family = value; }


	@Expose
	private ArrayList<String> given;

	/**
	 * Getter for given
	 * @return Given name.
	 */
	public ArrayList<String> getGiven() { return given; }

	/**
	 * Setter for given
	 * @param value Given name.
	 */
	public void setGiven(ArrayList<String> value) { given = value; }


	@Expose
	private ArrayList<String> prefix;

	/**
	 * Getter for prefix
	 * @return Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.
	 */
	public ArrayList<String> getPrefix() { return prefix; }

	/**
	 * Setter for prefix
	 * @param value Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.
	 */
	public void setPrefix(ArrayList<String> value) { prefix = value; }


	@Expose
	private ArrayList<String> suffix;

	/**
	 * Getter for suffix
	 * @return Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.
	 */
	public ArrayList<String> getSuffix() { return suffix; }

	/**
	 * Setter for suffix
	 * @param value Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.
	 */
	public void setSuffix(ArrayList<String> value) { suffix = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Indicates the period of time when this name was valid for the named person.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Indicates the period of time when this name was valid for the named person.
	 */
	public void setPeriod(Period value) { period = value; }


}
