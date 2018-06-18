package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
 */
public class Basic extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Basic resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Basic resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier assigned to the resource for business purposes, outside the context of FHIR.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier assigned to the resource for business purposes, outside the context of FHIR.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Identifies the 'type' of resource - equivalent to the resource name for other resources.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Identifies the 'type' of resource - equivalent to the resource name for other resources.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Identifies the patient, practitioner, device or any other resource that is the "focus" of this resource.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Identifies the patient, practitioner, device or any other resource that is the "focus" of this resource.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date created;

	/**
	 * Getter for created
	 * @return Identifies when the resource was first created.
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value Identifies when the resource was first created.
	 */
	public void setCreated(Date value) { created = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return Indicates who was responsible for creating the resource instance.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Indicates who was responsible for creating the resource instance.
	 */
	public void setAuthor(Reference value) { author = value; }


}
