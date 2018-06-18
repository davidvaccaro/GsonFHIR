package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Map of relationships between 2 structures that can be used to transform data.
 */
public class StructureMapGroup extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A unique name for the group for the convenience of human readers.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A unique name for the group for the convenience of human readers.
	 */
	public void setName(String value) { name = value; }


	@Expose
	@SerializedName("extends")
	private String extendsValue;

	/**
	 * Getter for extendsValue
	 * @return Another group that this group adds rules to.
	 */
	public String getExtends() { return extendsValue; }

	/**
	 * Setter for extendsValue
	 * @param value Another group that this group adds rules to.
	 */
	public void setExtends(String value) { extendsValue = value; }


	public enum TypeMode{
		@SerializedName("none") NONE,
		@SerializedName("types") TYPES,
		@SerializedName("type-and-types") TYPE_AND_TYPES
	}

	@Expose
	private TypeMode typeMode;

	/**
	 * Getter for typeMode
	 * @return If this is the default rule set to apply for thie source type, or this combination of types.
	 */
	public TypeMode getTypeMode() { return typeMode; }

	/**
	 * Setter for typeMode
	 * @param value If this is the default rule set to apply for thie source type, or this combination of types.
	 */
	public void setTypeMode(TypeMode value) { typeMode = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Additional supporting documentation that explains the purpose of the group and the types of mappings within it.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Additional supporting documentation that explains the purpose of the group and the types of mappings within it.
	 */
	public void setDocumentation(String value) { documentation = value; }


	@Expose
	private ArrayList<StructureMapInput> input;

	/**
	 * Getter for input
	 * @return A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
	 */
	public ArrayList<StructureMapInput> getInput() { return input; }

	/**
	 * Setter for input
	 * @param value A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
	 */
	public void setInput(ArrayList<StructureMapInput> value) { input = value; }


	@Expose
	private ArrayList<StructureMapRule> rule;

	/**
	 * Getter for rule
	 * @return Transform Rule from source to target.
	 */
	public ArrayList<StructureMapRule> getRule() { return rule; }

	/**
	 * Setter for rule
	 * @param value Transform Rule from source to target.
	 */
	public void setRule(ArrayList<StructureMapRule> value) { rule = value; }


}
