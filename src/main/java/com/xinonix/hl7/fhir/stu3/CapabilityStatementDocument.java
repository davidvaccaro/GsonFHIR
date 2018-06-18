package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementDocument extends BackboneElement {
	public enum Mode{
		@SerializedName("producer") PRODUCER,
		@SerializedName("consumer") CONSUMER
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return Mode of this document declaration - whether an application is a producer or consumer.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value Mode of this document declaration - whether an application is a producer or consumer.
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return A description of how the application supports or uses the specified document profile.  For example, when documents are created, what action is taken with consumed documents, etc.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value A description of how the application supports or uses the specified document profile.  For example, when documents are created, what action is taken with consumed documents, etc.
	 */
	public void setDocumentation(String value) { documentation = value; }


	@Expose
	private Reference profile;

	/**
	 * Getter for profile
	 * @return A constraint on a resource used in the document.
	 */
	public Reference getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value A constraint on a resource used in the document.
	 */
	public void setProfile(Reference value) { profile = value; }


}
