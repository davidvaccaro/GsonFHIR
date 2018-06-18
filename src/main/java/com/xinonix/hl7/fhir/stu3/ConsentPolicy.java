package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 */
public class ConsentPolicy extends BackboneElement {
	@Expose
	private String authority;

	/**
	 * Getter for authority
	 * @return Entity or Organization having regulatory jurisdiction or accountability for  enforcing policies pertaining to Consent Directives.
	 */
	public String getAuthority() { return authority; }

	/**
	 * Setter for authority
	 * @param value Entity or Organization having regulatory jurisdiction or accountability for  enforcing policies pertaining to Consent Directives.
	 */
	public void setAuthority(String value) { authority = value; }


	@Expose
	private String uri;

	/**
	 * Getter for uri
	 * @return The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
	 */
	public String getUri() { return uri; }

	/**
	 * Setter for uri
	 * @param value The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
	 */
	public void setUri(String value) { uri = value; }


}
