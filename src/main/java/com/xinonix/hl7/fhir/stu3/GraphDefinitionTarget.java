package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 */
public class GraphDefinitionTarget extends BackboneElement {
	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return Type of resource this link refers to.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value Type of resource this link refers to.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private String profile;

	/**
	 * Getter for profile
	 * @return Profile for the target resource.
	 */
	public String getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value Profile for the target resource.
	 */
	public void setProfile(String value) { profile = value; }


	@Expose
	private ArrayList<GraphDefinitionCompartment> compartment;

	/**
	 * Getter for compartment
	 * @return Compartment Consistency Rules.
	 */
	public ArrayList<GraphDefinitionCompartment> getCompartment() { return compartment; }

	/**
	 * Setter for compartment
	 * @param value Compartment Consistency Rules.
	 */
	public void setCompartment(ArrayList<GraphDefinitionCompartment> value) { compartment = value; }


	@Expose
	private ArrayList<GraphDefinitionLink> link;

	/**
	 * Getter for link
	 * @return Additional links from target resource.
	 */
	public ArrayList<GraphDefinitionLink> getLink() { return link; }

	/**
	 * Setter for link
	 * @param value Additional links from target resource.
	 */
	public void setLink(ArrayList<GraphDefinitionLink> value) { link = value; }


}
