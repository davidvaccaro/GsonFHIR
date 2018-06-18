package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A collection of error, warning or information messages that result from a system action.
 */
public class OperationOutcomeIssue extends BackboneElement {
	public enum Severity{
		@SerializedName("fatal") FATAL,
		@SerializedName("error") ERROR,
		@SerializedName("warning") WARNING,
		@SerializedName("information") INFORMATION
	}

	@Expose
	private Severity severity;

	/**
	 * Getter for severity
	 * @return Indicates whether the issue indicates a variation from successful processing.
	 */
	public Severity getSeverity() { return severity; }

	/**
	 * Setter for severity
	 * @param value Indicates whether the issue indicates a variation from successful processing.
	 */
	public void setSeverity(Severity value) { severity = value; }


	public enum Code{
		@SerializedName("invalid") INVALID,
		@SerializedName("structure") STRUCTURE,
		@SerializedName("required") REQUIRED,
		@SerializedName("value") VALUE,
		@SerializedName("invariant") INVARIANT,
		@SerializedName("security") SECURITY,
		@SerializedName("login") LOGIN,
		@SerializedName("unknown") UNKNOWN,
		@SerializedName("expired") EXPIRED,
		@SerializedName("forbidden") FORBIDDEN,
		@SerializedName("suppressed") SUPPRESSED,
		@SerializedName("processing") PROCESSING,
		@SerializedName("not-supported") NOT_SUPPORTED,
		@SerializedName("duplicate") DUPLICATE,
		@SerializedName("not-found") NOT_FOUND,
		@SerializedName("too-long") TOO_LONG,
		@SerializedName("code-invalid") CODE_INVALID,
		@SerializedName("extension") EXTENSION,
		@SerializedName("too-costly") TOO_COSTLY,
		@SerializedName("business-rule") BUSINESS_RULE,
		@SerializedName("conflict") CONFLICT,
		@SerializedName("incomplete") INCOMPLETE,
		@SerializedName("transient") TRANSIENT,
		@SerializedName("lock-error") LOCK_ERROR,
		@SerializedName("no-store") NO_STORE,
		@SerializedName("exception") EXCEPTION,
		@SerializedName("timeout") TIMEOUT,
		@SerializedName("throttled") THROTTLED,
		@SerializedName("informational") INFORMATIONAL
	}

	@Expose
	private Code code;

	/**
	 * Getter for code
	 * @return Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
	 */
	public Code getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
	 */
	public void setCode(Code value) { code = value; }


	@Expose
	private CodeableConcept details;

	/**
	 * Getter for details
	 * @return Additional details about the error. This may be a text description of the error, or a system code that identifies the error.
	 */
	public CodeableConcept getDetails() { return details; }

	/**
	 * Setter for details
	 * @param value Additional details about the error. This may be a text description of the error, or a system code that identifies the error.
	 */
	public void setDetails(CodeableConcept value) { details = value; }


	@Expose
	private String diagnostics;

	/**
	 * Getter for diagnostics
	 * @return Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.
	 */
	public String getDiagnostics() { return diagnostics; }

	/**
	 * Setter for diagnostics
	 * @param value Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.
	 */
	public void setDiagnostics(String value) { diagnostics = value; }


	@Expose
	private ArrayList<String> location;

	/**
	 * Getter for location
	 * @return For resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be "http." + the parameter name.
	 */
	public ArrayList<String> getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value For resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be "http." + the parameter name.
	 */
	public void setLocation(ArrayList<String> value) { location = value; }


	@Expose
	private ArrayList<String> expression;

	/**
	 * Getter for expression
	 * @return A simple FHIRPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.
	 */
	public ArrayList<String> getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value A simple FHIRPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.
	 */
	public void setExpression(ArrayList<String> value) { expression = value; }


}
