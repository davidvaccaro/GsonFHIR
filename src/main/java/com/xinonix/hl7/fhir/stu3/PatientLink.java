package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
public class PatientLink extends BackboneElement {
	@Expose
	private Reference other;

	/**
	 * Getter for other
	 * @return The other patient resource that the link refers to.
	 */
	public Reference getOther() { return other; }

	/**
	 * Setter for other
	 * @param value The other patient resource that the link refers to.
	 */
	public void setOther(Reference value) { other = value; }


	public enum Type{
		@SerializedName("replaced-by") REPLACED_BY,
		@SerializedName("replaces") REPLACES,
		@SerializedName("refer") REFER,
		@SerializedName("seealso") SEEALSO
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of link between this patient resource and another patient resource.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of link between this patient resource and another patient resource.
	 */
	public void setType(Type value) { type = value; }


}
