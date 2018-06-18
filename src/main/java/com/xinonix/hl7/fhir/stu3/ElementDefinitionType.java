package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinitionType extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return URL of Data type or Resource that is a(or the) type used for this element. References are URLs that are relative to http://hl7.org/fhir/StructureDefinition e.g. "string" is a reference to http://hl7.org/fhir/StructureDefinition/string. Absolute URLs are only allowed in logical models.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value URL of Data type or Resource that is a(or the) type used for this element. References are URLs that are relative to http://hl7.org/fhir/StructureDefinition e.g. "string" is a reference to http://hl7.org/fhir/StructureDefinition/string. Absolute URLs are only allowed in logical models.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String profile;

	/**
	 * Getter for profile
	 * @return Identifies a profile structure or implementation Guide that SHALL hold for the datatype this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
	 */
	public String getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value Identifies a profile structure or implementation Guide that SHALL hold for the datatype this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
	 */
	public void setProfile(String value) { profile = value; }


	@Expose
	private String targetProfile;

	/**
	 * Getter for targetProfile
	 * @return Identifies a profile structure or implementation Guide that SHALL hold for the target of the reference this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
	 */
	public String getTargetProfile() { return targetProfile; }

	/**
	 * Setter for targetProfile
	 * @param value Identifies a profile structure or implementation Guide that SHALL hold for the target of the reference this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
	 */
	public void setTargetProfile(String value) { targetProfile = value; }


	@Expose
	private ArrayList<String> aggregation;

	/**
	 * Getter for aggregation
	 * @return If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
	 */
	public ArrayList<String> getAggregation() { return aggregation; }

	/**
	 * Setter for aggregation
	 * @param value If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
	 */
	public void setAggregation(ArrayList<String> value) { aggregation = value; }


	public enum Versioning{
		@SerializedName("either") EITHER,
		@SerializedName("independent") INDEPENDENT,
		@SerializedName("specific") SPECIFIC
	}

	@Expose
	private Versioning versioning;

	/**
	 * Getter for versioning
	 * @return Whether this reference needs to be version specific or version independent, or whether either can be used.
	 */
	public Versioning getVersioning() { return versioning; }

	/**
	 * Setter for versioning
	 * @param value Whether this reference needs to be version specific or version independent, or whether either can be used.
	 */
	public void setVersioning(Versioning value) { versioning = value; }


}
