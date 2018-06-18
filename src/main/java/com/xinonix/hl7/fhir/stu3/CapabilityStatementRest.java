package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementRest extends BackboneElement {
	public enum Mode{
		@SerializedName("client") CLIENT,
		@SerializedName("server") SERVER
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Information about the system's restful capabilities that apply across all applications, such as security.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Information about the system's restful capabilities that apply across all applications, such as security.
	 */
	public void setDocumentation(String value) { documentation = value; }


	@Expose
	private CapabilityStatementSecurity security;

	/**
	 * Getter for security
	 * @return Information about security implementation from an interface perspective - what a client needs to know.
	 */
	public CapabilityStatementSecurity getSecurity() { return security; }

	/**
	 * Setter for security
	 * @param value Information about security implementation from an interface perspective - what a client needs to know.
	 */
	public void setSecurity(CapabilityStatementSecurity value) { security = value; }


	@Expose
	private ArrayList<CapabilityStatementResource> resource;

	/**
	 * Getter for resource
	 * @return A specification of the restful capabilities of the solution for a specific resource type.
	 */
	public ArrayList<CapabilityStatementResource> getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value A specification of the restful capabilities of the solution for a specific resource type.
	 */
	public void setResource(ArrayList<CapabilityStatementResource> value) { resource = value; }


	@Expose
	private ArrayList<CapabilityStatementInteraction1> interaction;

	/**
	 * Getter for interaction
	 * @return A specification of restful operations supported by the system.
	 */
	public ArrayList<CapabilityStatementInteraction1> getInteraction() { return interaction; }

	/**
	 * Setter for interaction
	 * @param value A specification of restful operations supported by the system.
	 */
	public void setInteraction(ArrayList<CapabilityStatementInteraction1> value) { interaction = value; }


	@Expose
	private ArrayList<CapabilityStatementSearchParam> searchParam;

	/**
	 * Getter for searchParam
	 * @return Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
	 */
	public ArrayList<CapabilityStatementSearchParam> getSearchParam() { return searchParam; }

	/**
	 * Setter for searchParam
	 * @param value Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
	 */
	public void setSearchParam(ArrayList<CapabilityStatementSearchParam> value) { searchParam = value; }


	@Expose
	private ArrayList<CapabilityStatementOperation> operation;

	/**
	 * Getter for operation
	 * @return Definition of an operation or a named query together with its parameters and their meaning and type.
	 */
	public ArrayList<CapabilityStatementOperation> getOperation() { return operation; }

	/**
	 * Setter for operation
	 * @param value Definition of an operation or a named query together with its parameters and their meaning and type.
	 */
	public void setOperation(ArrayList<CapabilityStatementOperation> value) { operation = value; }


	@Expose
	private ArrayList<String> compartment;

	/**
	 * Getter for compartment
	 * @return An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL .
	 */
	public ArrayList<String> getCompartment() { return compartment; }

	/**
	 * Setter for compartment
	 * @param value An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL .
	 */
	public void setCompartment(ArrayList<String> value) { compartment = value; }


}
