package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A reference to a document.
 */
public class DocumentReferenceRelatesTo extends BackboneElement {
	public enum Code{
		@SerializedName("replaces") REPLACES,
		@SerializedName("transforms") TRANSFORMS,
		@SerializedName("signs") SIGNS,
		@SerializedName("appends") APPENDS
	}

	@Expose
	private Code code;

	/**
	 * Getter for code
	 * @return The type of relationship that this document has with anther document.
	 */
	public Code getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The type of relationship that this document has with anther document.
	 */
	public void setCode(Code value) { code = value; }


	@Expose
	private Reference target;

	/**
	 * Getter for target
	 * @return The target document of this relationship.
	 */
	public Reference getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value The target document of this relationship.
	 */
	public void setTarget(Reference value) { target = value; }


}
