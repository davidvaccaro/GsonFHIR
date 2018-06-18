package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 */
public class ConceptMapUnmapped extends BackboneElement {
	public enum Mode{
		@SerializedName("provided") PROVIDED,
		@SerializedName("fixed") FIXED,
		@SerializedName("other-map") OTHER_MAP
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return Defines which action to take if there is no match in the group. One of 3 actions is possible: use the unmapped code (this is useful when doing a mapping between versions, and only a few codes have changed), use a fixed code (a default code), or alternatively, a reference to a different concept map can be provided (by canonical URL).
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value Defines which action to take if there is no match in the group. One of 3 actions is possible: use the unmapped code (this is useful when doing a mapping between versions, and only a few codes have changed), use a fixed code (a default code), or alternatively, a reference to a different concept map can be provided (by canonical URL).
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return The fixed code to use when the mode = 'fixed'  - all unmapped codes are mapped to a single fixed code.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The fixed code to use when the mode = 'fixed'  - all unmapped codes are mapped to a single fixed code.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return The display for the code. The display is only provided to help editors when editing the concept map.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value The display for the code. The display is only provided to help editors when editing the concept map.
	 */
	public void setDisplay(String value) { display = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return The canonical URL of the map to use if this map contains no mapping.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value The canonical URL of the map to use if this map contains no mapping.
	 */
	public void setUrl(String value) { url = value; }


}
