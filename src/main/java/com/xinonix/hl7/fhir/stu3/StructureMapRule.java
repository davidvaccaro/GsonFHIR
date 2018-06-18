package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A Map of relationships between 2 structures that can be used to transform data.
 */
public class StructureMapRule extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Name of the rule for internal references.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Name of the rule for internal references.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private ArrayList<StructureMapSource> source;

	/**
	 * Getter for source
	 * @return Source inputs to the mapping.
	 */
	public ArrayList<StructureMapSource> getSource() { return source; }

	/**
	 * Setter for source
	 * @param value Source inputs to the mapping.
	 */
	public void setSource(ArrayList<StructureMapSource> value) { source = value; }


	@Expose
	private ArrayList<StructureMapTarget> target;

	/**
	 * Getter for target
	 * @return Content to create because of this mapping rule.
	 */
	public ArrayList<StructureMapTarget> getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value Content to create because of this mapping rule.
	 */
	public void setTarget(ArrayList<StructureMapTarget> value) { target = value; }


	@Expose
	private ArrayList<StructureMapRule> rule;

	/**
	 * Getter for rule
	 * @return Rules contained in this rule.
	 */
	public ArrayList<StructureMapRule> getRule() { return rule; }

	/**
	 * Setter for rule
	 * @param value Rules contained in this rule.
	 */
	public void setRule(ArrayList<StructureMapRule> value) { rule = value; }


	@Expose
	private ArrayList<StructureMapDependent> dependent;

	/**
	 * Getter for dependent
	 * @return Which other rules to apply in the context of this rule.
	 */
	public ArrayList<StructureMapDependent> getDependent() { return dependent; }

	/**
	 * Setter for dependent
	 * @param value Which other rules to apply in the context of this rule.
	 */
	public void setDependent(ArrayList<StructureMapDependent> value) { dependent = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Documentation for this instance of data.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Documentation for this instance of data.
	 */
	public void setDocumentation(String value) { documentation = value; }


}
