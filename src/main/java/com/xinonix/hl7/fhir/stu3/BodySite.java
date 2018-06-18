package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Record details about the anatomical location of a specimen or body part.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
 */
public class BodySite extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a BodySite resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a BodySite resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier for this instance of the anatomical location.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier for this instance of the anatomical location.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether this body site is in active use.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether this body site is in active use.
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Named anatomical location - ideally coded where possible.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Named anatomical location - ideally coded where possible.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private ArrayList<CodeableConcept> qualifier;

	/**
	 * Getter for qualifier
	 * @return Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.
	 */
	public ArrayList<CodeableConcept> getQualifier() { return qualifier; }

	/**
	 * Setter for qualifier
	 * @param value Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.
	 */
	public void setQualifier(ArrayList<CodeableConcept> value) { qualifier = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A summary, charactarization or explanation of the anatomic location.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A summary, charactarization or explanation of the anatomic location.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<Attachment> image;

	/**
	 * Getter for image
	 * @return Image or images used to identify a location.
	 */
	public ArrayList<Attachment> getImage() { return image; }

	/**
	 * Setter for image
	 * @param value Image or images used to identify a location.
	 */
	public void setImage(ArrayList<Attachment> value) { image = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The person to which the body site belongs.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The person to which the body site belongs.
	 */
	public void setPatient(Reference value) { patient = value; }


}
