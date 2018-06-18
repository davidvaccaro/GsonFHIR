package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Map of relationships between 2 structures that can be used to transform data.
 */
public class StructureMapStructure extends BackboneElement {
	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return The canonical URL that identifies the structure.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value The canonical URL that identifies the structure.
	 */
	public void setUrl(String value) { url = value; }


	public enum Mode{
		@SerializedName("source") SOURCE,
		@SerializedName("queried") QUERIED,
		@SerializedName("target") TARGET,
		@SerializedName("produced") PRODUCED
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return How the referenced structure is used in this mapping.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value How the referenced structure is used in this mapping.
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private String alias;

	/**
	 * Getter for alias
	 * @return The name used for this type in the map.
	 */
	public String getAlias() { return alias; }

	/**
	 * Setter for alias
	 * @param value The name used for this type in the map.
	 */
	public void setAlias(String value) { alias = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Documentation that describes how the structure is used in the mapping.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Documentation that describes how the structure is used in the mapping.
	 */
	public void setDocumentation(String value) { documentation = value; }


}
