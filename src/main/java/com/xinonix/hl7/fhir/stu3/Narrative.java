package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A human-readable formatted text, including images.
 */
public class Narrative extends Element {
	public enum Status{
		@SerializedName("generated") GENERATED,
		@SerializedName("extensions") EXTENSIONS,
		@SerializedName("additional") ADDITIONAL,
		@SerializedName("empty") EMPTY
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private String div;

	/**
	 * Getter for div
	 * @return The actual narrative content, a stripped down version of XHTML.
	 */
	public String getDiv() { return div; }

	/**
	 * Setter for div
	 * @param value The actual narrative content, a stripped down version of XHTML.
	 */
	public void setDiv(String value) { div = value; }


}
