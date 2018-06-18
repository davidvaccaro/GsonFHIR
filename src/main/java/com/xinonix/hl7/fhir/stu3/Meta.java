package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
 */
public class Meta extends Element {
	@Expose
	private String versionId;

	/**
	 * Getter for versionId
	 * @return The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.
	 */
	public String getVersionId() { return versionId; }

	/**
	 * Setter for versionId
	 * @param value The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.
	 */
	public void setVersionId(String value) { versionId = value; }


	@Expose
	private String lastUpdated;

	/**
	 * Getter for lastUpdated
	 * @return When the resource last changed - e.g. when the version changed.
	 */
	public String getLastUpdated() { return lastUpdated; }

	/**
	 * Setter for lastUpdated
	 * @param value When the resource last changed - e.g. when the version changed.
	 */
	public void setLastUpdated(String value) { lastUpdated = value; }


	@Expose
	private ArrayList<String> profile;

	/**
	 * Getter for profile
	 * @return A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].
	 */
	public ArrayList<String> getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].
	 */
	public void setProfile(ArrayList<String> value) { profile = value; }


	@Expose
	private ArrayList<Coding> security;

	/**
	 * Getter for security
	 * @return Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.
	 */
	public ArrayList<Coding> getSecurity() { return security; }

	/**
	 * Setter for security
	 * @param value Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.
	 */
	public void setSecurity(ArrayList<Coding> value) { security = value; }


	@Expose
	private ArrayList<Coding> tag;

	/**
	 * Getter for tag
	 * @return Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
	 */
	public ArrayList<Coding> getTag() { return tag; }

	/**
	 * Setter for tag
	 * @param value Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
	 */
	public void setTag(ArrayList<Coding> value) { tag = value; }


}
