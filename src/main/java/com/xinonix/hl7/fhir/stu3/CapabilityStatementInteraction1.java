package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementInteraction1 extends BackboneElement {
	public enum Code{
		@SerializedName("transaction") TRANSACTION,
		@SerializedName("batch") BATCH,
		@SerializedName("search-system") SEARCH_SYSTEM,
		@SerializedName("history-system") HISTORY_SYSTEM
	}

	@Expose
	private Code code;

	/**
	 * Getter for code
	 * @return A coded identifier of the operation, supported by the system.
	 */
	public Code getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A coded identifier of the operation, supported by the system.
	 */
	public void setCode(Code value) { code = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
	 */
	public void setDocumentation(String value) { documentation = value; }


}
