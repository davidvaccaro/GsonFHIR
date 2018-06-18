package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinitionBase extends BackboneElement {
	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base.
	 */
	public void setPath(String value) { path = value; }


	@Expose
	private Integer min;

	/**
	 * Getter for min
	 * @return Minimum cardinality of the base element identified by the path.
	 */
	public Integer getMin() { return min; }

	/**
	 * Setter for min
	 * @param value Minimum cardinality of the base element identified by the path.
	 */
	public void setMin(Integer value) { min = value; }


	@Expose
	private String max;

	/**
	 * Getter for max
	 * @return Maximum cardinality of the base element identified by the path.
	 */
	public String getMax() { return max; }

	/**
	 * Setter for max
	 * @param value Maximum cardinality of the base element identified by the path.
	 */
	public void setMax(String value) { max = value; }


}
