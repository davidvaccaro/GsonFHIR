package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A collection of error, warning or information messages that result from a system action.
 */
public class OperationOutcome extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a OperationOutcome resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a OperationOutcome resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<OperationOutcomeIssue> issue;

	/**
	 * Getter for issue
	 * @return An error, warning or information message that results from a system action.
	 */
	public ArrayList<OperationOutcomeIssue> getIssue() { return issue; }

	/**
	 * Setter for issue
	 * @param value An error, warning or information message that results from a system action.
	 */
	public void setIssue(ArrayList<OperationOutcomeIssue> value) { issue = value; }


}
