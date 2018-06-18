package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 */
public class SearchParameterComponent extends BackboneElement {
	@Expose
	private Reference definition;

	/**
	 * Getter for definition
	 * @return The definition of the search parameter that describes this part.
	 */
	public Reference getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value The definition of the search parameter that describes this part.
	 */
	public void setDefinition(Reference value) { definition = value; }


	@Expose
	private String expression;

	/**
	 * Getter for expression
	 * @return A sub-expression that defines how to extract values for this component from the output of the main SearchParameter.expression.
	 */
	public String getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value A sub-expression that defines how to extract values for this component from the output of the main SearchParameter.expression.
	 */
	public void setExpression(String value) { expression = value; }


}
