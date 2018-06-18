package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 */
public class ImplementationGuidePackage extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name for the group, as used in page.package.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name for the group, as used in page.package.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Human readable text describing the package.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Human readable text describing the package.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<ImplementationGuideResource> resource;

	/**
	 * Getter for resource
	 * @return A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
	 */
	public ArrayList<ImplementationGuideResource> getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
	 */
	public void setResource(ArrayList<ImplementationGuideResource> value) { resource = value; }


}
