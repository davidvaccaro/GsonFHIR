package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 */
public class DataRequirementCodeFilter extends BackboneElement {
	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
	 */
	public void setPath(String value) { path = value; }


	@Expose
	private String valueSetString;

	/**
	 * Getter for valueSetString
	 * @return The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
	 */
	public String getValueSetString() { return valueSetString; }

	/**
	 * Setter for valueSetString
	 * @param value The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
	 */
	public void setValueSetString(String value) { valueSetString = value; }


	@Expose
	private Reference valueSetReference;

	/**
	 * Getter for valueSetReference
	 * @return The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
	 */
	public Reference getValueSetReference() { return valueSetReference; }

	/**
	 * Setter for valueSetReference
	 * @param value The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
	 */
	public void setValueSetReference(Reference value) { valueSetReference = value; }


	@Expose
	private ArrayList<String> valueCode;

	/**
	 * Getter for valueCode
	 * @return The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.
	 */
	public ArrayList<String> getValueCode() { return valueCode; }

	/**
	 * Setter for valueCode
	 * @param value The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.
	 */
	public void setValueCode(ArrayList<String> value) { valueCode = value; }


	@Expose
	private ArrayList<Coding> valueCoding;

	/**
	 * Getter for valueCoding
	 * @return The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings.
	 */
	public ArrayList<Coding> getValueCoding() { return valueCoding; }

	/**
	 * Setter for valueCoding
	 * @param value The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings.
	 */
	public void setValueCoding(ArrayList<Coding> value) { valueCoding = value; }


	@Expose
	private ArrayList<CodeableConcept> valueCodeableConcept;

	/**
	 * Getter for valueCodeableConcept
	 * @return The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts.
	 */
	public ArrayList<CodeableConcept> getValueCodeableConcept() { return valueCodeableConcept; }

	/**
	 * Setter for valueCodeableConcept
	 * @param value The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts.
	 */
	public void setValueCodeableConcept(ArrayList<CodeableConcept> value) { valueCodeableConcept = value; }


}
