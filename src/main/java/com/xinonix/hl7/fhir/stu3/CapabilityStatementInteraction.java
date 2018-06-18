package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementInteraction extends BackboneElement {
	public enum Code{
		@SerializedName("read") READ,
		@SerializedName("vread") VREAD,
		@SerializedName("update") UPDATE,
		@SerializedName("patch") PATCH,
		@SerializedName("delete") DELETE,
		@SerializedName("history-instance") HISTORY_INSTANCE,
		@SerializedName("history-type") HISTORY_TYPE,
		@SerializedName("create") CREATE,
		@SerializedName("search-type") SEARCH_TYPE
	}

	@Expose
	private Code code;

	/**
	 * Getter for code
	 * @return Coded identifier of the operation, supported by the system resource.
	 */
	public Code getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Coded identifier of the operation, supported by the system resource.
	 */
	public void setCode(Code value) { code = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.
	 */
	public void setDocumentation(String value) { documentation = value; }


}
