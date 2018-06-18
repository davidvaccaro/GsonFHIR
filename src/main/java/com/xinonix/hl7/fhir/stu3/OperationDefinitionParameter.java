package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 */
public class OperationDefinitionParameter extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name of used to identify the parameter.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name of used to identify the parameter.
	 */
	public void setName(String value) { name = value; }


	public enum Use{
		@SerializedName("in") IN,
		@SerializedName("out") OUT
	}

	@Expose
	private Use use;

	/**
	 * Getter for use
	 * @return Whether this is an input or an output parameter.
	 */
	public Use getUse() { return use; }

	/**
	 * Setter for use
	 * @param value Whether this is an input or an output parameter.
	 */
	public void setUse(Use value) { use = value; }


	@Expose
	private Integer min;

	/**
	 * Getter for min
	 * @return The minimum number of times this parameter SHALL appear in the request or response.
	 */
	public Integer getMin() { return min; }

	/**
	 * Setter for min
	 * @param value The minimum number of times this parameter SHALL appear in the request or response.
	 */
	public void setMin(Integer value) { min = value; }


	@Expose
	private String max;

	/**
	 * Getter for max
	 * @return The maximum number of times this element is permitted to appear in the request or response.
	 */
	public String getMax() { return max; }

	/**
	 * Setter for max
	 * @param value The maximum number of times this element is permitted to appear in the request or response.
	 */
	public void setMax(String value) { max = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Describes the meaning or use of this parameter.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Describes the meaning or use of this parameter.
	 */
	public void setDocumentation(String value) { documentation = value; }


	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return The type for this parameter.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type for this parameter.
	 */
	public void setType(String value) { type = value; }


	public enum SearchType{
		@SerializedName("number") NUMBER,
		@SerializedName("date") DATE,
		@SerializedName("string") STRING,
		@SerializedName("token") TOKEN,
		@SerializedName("reference") REFERENCE,
		@SerializedName("composite") COMPOSITE,
		@SerializedName("quantity") QUANTITY,
		@SerializedName("uri") URI
	}

	@Expose
	private SearchType searchType;

	/**
	 * Getter for searchType
	 * @return How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'.
	 */
	public SearchType getSearchType() { return searchType; }

	/**
	 * Setter for searchType
	 * @param value How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'.
	 */
	public void setSearchType(SearchType value) { searchType = value; }


	@Expose
	private Reference profile;

	/**
	 * Getter for profile
	 * @return A profile the specifies the rules that this parameter must conform to.
	 */
	public Reference getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value A profile the specifies the rules that this parameter must conform to.
	 */
	public void setProfile(Reference value) { profile = value; }


	@Expose
	private OperationDefinitionBinding binding;

	/**
	 * Getter for binding
	 * @return Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
	 */
	public OperationDefinitionBinding getBinding() { return binding; }

	/**
	 * Setter for binding
	 * @param value Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
	 */
	public void setBinding(OperationDefinitionBinding value) { binding = value; }


	@Expose
	private ArrayList<OperationDefinitionParameter> part;

	/**
	 * Getter for part
	 * @return The parts of a nested Parameter.
	 */
	public ArrayList<OperationDefinitionParameter> getPart() { return part; }

	/**
	 * Setter for part
	 * @param value The parts of a nested Parameter.
	 */
	public void setPart(ArrayList<OperationDefinitionParameter> value) { part = value; }


}
