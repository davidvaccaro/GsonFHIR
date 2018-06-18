package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A summary of information based on the results of executing a TestScript.
 */
public class TestReportParticipant extends BackboneElement {
	public enum Type{
		@SerializedName("test-engine") TEST_ENGINE,
		@SerializedName("client") CLIENT,
		@SerializedName("server") SERVER
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of participant.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of participant.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String uri;

	/**
	 * Getter for uri
	 * @return The uri of the participant. An absolute URL is preferred.
	 */
	public String getUri() { return uri; }

	/**
	 * Setter for uri
	 * @param value The uri of the participant. An absolute URL is preferred.
	 */
	public void setUri(String value) { uri = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return The display name of the participant.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value The display name of the participant.
	 */
	public void setDisplay(String value) { display = value; }


}
