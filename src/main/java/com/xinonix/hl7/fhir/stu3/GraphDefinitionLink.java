package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 */
public class GraphDefinitionLink extends BackboneElement {
	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return Path in the resource that contains the link.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value Path in the resource that contains the link.
	 */
	public void setPath(String value) { path = value; }


	@Expose
	private String sliceName;

	/**
	 * Getter for sliceName
	 * @return Which slice (if profiled).
	 */
	public String getSliceName() { return sliceName; }

	/**
	 * Setter for sliceName
	 * @param value Which slice (if profiled).
	 */
	public void setSliceName(String value) { sliceName = value; }


	@Expose
	private Integer min;

	/**
	 * Getter for min
	 * @return Minimum occurrences for this link.
	 */
	public Integer getMin() { return min; }

	/**
	 * Setter for min
	 * @param value Minimum occurrences for this link.
	 */
	public void setMin(Integer value) { min = value; }


	@Expose
	private String max;

	/**
	 * Getter for max
	 * @return Maximum occurrences for this link.
	 */
	public String getMax() { return max; }

	/**
	 * Setter for max
	 * @param value Maximum occurrences for this link.
	 */
	public void setMax(String value) { max = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Information about why this link is of interest in this graph definition.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Information about why this link is of interest in this graph definition.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<GraphDefinitionTarget> target;

	/**
	 * Getter for target
	 * @return Potential target for the link.
	 */
	public ArrayList<GraphDefinitionTarget> getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value Potential target for the link.
	 */
	public void setTarget(ArrayList<GraphDefinitionTarget> value) { target = value; }


}
