package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A  text note which also  contains information about who made the statement and when.
 */
public class Annotation extends Element {
	@Expose
	private Reference authorReference;

	/**
	 * Getter for authorReference
	 * @return The individual responsible for making the annotation.
	 */
	public Reference getAuthorReference() { return authorReference; }

	/**
	 * Setter for authorReference
	 * @param value The individual responsible for making the annotation.
	 */
	public void setAuthorReference(Reference value) { authorReference = value; }


	@Expose
	private String authorString;

	/**
	 * Getter for authorString
	 * @return The individual responsible for making the annotation.
	 */
	public String getAuthorString() { return authorString; }

	/**
	 * Setter for authorString
	 * @param value The individual responsible for making the annotation.
	 */
	public void setAuthorString(String value) { authorString = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date time;

	/**
	 * Getter for time
	 * @return Indicates when this particular annotation was made.
	 */
	public Date getTime() { return time; }

	/**
	 * Setter for time
	 * @param value Indicates when this particular annotation was made.
	 */
	public void setTime(Date value) { time = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return The text of the annotation.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value The text of the annotation.
	 */
	public void setText(String value) { text = value; }


}
