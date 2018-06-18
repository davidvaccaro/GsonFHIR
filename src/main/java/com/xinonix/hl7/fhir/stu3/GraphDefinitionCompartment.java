package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 */
public class GraphDefinitionCompartment extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return Identifies the compartment.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Identifies the compartment.
	 */
	public void setCode(String value) { code = value; }


	public enum Rule{
		@SerializedName("identical") IDENTICAL,
		@SerializedName("matching") MATCHING,
		@SerializedName("different") DIFFERENT,
		@SerializedName("custom") CUSTOM
	}

	@Expose
	private Rule rule;

	/**
	 * Getter for rule
	 * @return identical | matching | different | no-rule | custom.
	 */
	public Rule getRule() { return rule; }

	/**
	 * Setter for rule
	 * @param value identical | matching | different | no-rule | custom.
	 */
	public void setRule(Rule value) { rule = value; }


	@Expose
	private String expression;

	/**
	 * Getter for expression
	 * @return Custom rule, as a FHIRPath expression.
	 */
	public String getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value Custom rule, as a FHIRPath expression.
	 */
	public void setExpression(String value) { expression = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Documentation for FHIRPath expression.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Documentation for FHIRPath expression.
	 */
	public void setDescription(String value) { description = value; }


}
