package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Demographics and administrative information about a person independent of a specific health-related context.
 */
public class PersonLink extends BackboneElement {
	@Expose
	private Reference target;

	/**
	 * Getter for target
	 * @return The resource to which this actual person is associated.
	 */
	public Reference getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value The resource to which this actual person is associated.
	 */
	public void setTarget(Reference value) { target = value; }


	public enum Assurance{
		@SerializedName("level1") LEVEL1,
		@SerializedName("level2") LEVEL2,
		@SerializedName("level3") LEVEL3,
		@SerializedName("level4") LEVEL4
	}

	@Expose
	private Assurance assurance;

	/**
	 * Getter for assurance
	 * @return Level of assurance that this link is actually associated with the target resource.
	 */
	public Assurance getAssurance() { return assurance; }

	/**
	 * Setter for assurance
	 * @param value Level of assurance that this link is actually associated with the target resource.
	 */
	public void setAssurance(Assurance value) { assurance = value; }


}
