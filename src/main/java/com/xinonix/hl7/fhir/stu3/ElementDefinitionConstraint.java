package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinitionConstraint extends BackboneElement {
	@Expose
	private String key;

	/**
	 * Getter for key
	 * @return Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
	 */
	public String getKey() { return key; }

	/**
	 * Setter for key
	 * @param value Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
	 */
	public void setKey(String value) { key = value; }


	@Expose
	private String requirements;

	/**
	 * Getter for requirements
	 * @return Description of why this constraint is necessary or appropriate.
	 */
	public String getRequirements() { return requirements; }

	/**
	 * Setter for requirements
	 * @param value Description of why this constraint is necessary or appropriate.
	 */
	public void setRequirements(String value) { requirements = value; }


	public enum Severity{
		@SerializedName("error") ERROR,
		@SerializedName("warning") WARNING
	}

	@Expose
	private Severity severity;

	/**
	 * Getter for severity
	 * @return Identifies the impact constraint violation has on the conformance of the instance.
	 */
	public Severity getSeverity() { return severity; }

	/**
	 * Setter for severity
	 * @param value Identifies the impact constraint violation has on the conformance of the instance.
	 */
	public void setSeverity(Severity value) { severity = value; }


	@Expose
	private String human;

	/**
	 * Getter for human
	 * @return Text that can be used to describe the constraint in messages identifying that the constraint has been violated.
	 */
	public String getHuman() { return human; }

	/**
	 * Setter for human
	 * @param value Text that can be used to describe the constraint in messages identifying that the constraint has been violated.
	 */
	public void setHuman(String value) { human = value; }


	@Expose
	private String expression;

	/**
	 * Getter for expression
	 * @return A [FHIRPath](http://hl7.org/fluentpath) expression of constraint that can be executed to see if this constraint is met.
	 */
	public String getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value A [FHIRPath](http://hl7.org/fluentpath) expression of constraint that can be executed to see if this constraint is met.
	 */
	public void setExpression(String value) { expression = value; }


	@Expose
	private String xpath;

	/**
	 * Getter for xpath
	 * @return An XPath expression of constraint that can be executed to see if this constraint is met.
	 */
	public String getXpath() { return xpath; }

	/**
	 * Setter for xpath
	 * @param value An XPath expression of constraint that can be executed to see if this constraint is met.
	 */
	public void setXpath(String value) { xpath = value; }


	@Expose
	private String source;

	/**
	 * Getter for source
	 * @return A reference to the original source of the constraint, for traceability purposes.
	 */
	public String getSource() { return source; }

	/**
	 * Setter for source
	 * @param value A reference to the original source of the constraint, for traceability purposes.
	 */
	public void setSource(String value) { source = value; }


}
