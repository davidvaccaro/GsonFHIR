package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Map of relationships between 2 structures that can be used to transform data.
 */
public class StructureMapInput extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Name for this instance of data.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Name for this instance of data.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return Type for this instance of data.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value Type for this instance of data.
	 */
	public void setType(String value) { type = value; }


	public enum Mode{
		@SerializedName("source") SOURCE,
		@SerializedName("target") TARGET
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return Mode for this instance of data.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value Mode for this instance of data.
	 */
	public void setMode(Mode value) { mode = value; }


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
