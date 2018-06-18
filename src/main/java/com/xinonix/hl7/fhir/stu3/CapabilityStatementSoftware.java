package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementSoftware extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Name software is known by.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Name software is known by.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The version identifier for the software covered by this statement.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The version identifier for the software covered by this statement.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date releaseDate;

	/**
	 * Getter for releaseDate
	 * @return Date this version of the software was released.
	 */
	public Date getReleaseDate() { return releaseDate; }

	/**
	 * Setter for releaseDate
	 * @param value Date this version of the software was released.
	 */
	public void setReleaseDate(Date value) { releaseDate = value; }


}
