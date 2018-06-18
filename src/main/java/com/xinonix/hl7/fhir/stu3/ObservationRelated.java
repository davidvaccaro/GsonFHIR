package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Measurements and simple assertions made about a patient, device or other subject.
 */
public class ObservationRelated extends BackboneElement {
	public enum Type{
		@SerializedName("has-member") HAS_MEMBER,
		@SerializedName("derived-from") DERIVED_FROM,
		@SerializedName("sequel-to") SEQUEL_TO,
		@SerializedName("replaces") REPLACES,
		@SerializedName("qualified-by") QUALIFIED_BY,
		@SerializedName("interfered-by") INTERFERED_BY
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return A code specifying the kind of relationship that exists with the target resource.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value A code specifying the kind of relationship that exists with the target resource.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private Reference target;

	/**
	 * Getter for target
	 * @return A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.
	 */
	public Reference getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.
	 */
	public void setTarget(Reference value) { target = value; }


}
