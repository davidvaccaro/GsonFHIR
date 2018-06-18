package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSetContains extends BackboneElement {
	@Expose
	private String system;

	/**
	 * Getter for system
	 * @return An absolute URI which is the code system in which the code for this item in the expansion is defined.
	 */
	public String getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value An absolute URI which is the code system in which the code for this item in the expansion is defined.
	 */
	public void setSystem(String value) { system = value; }


	@Expose
	@SerializedName("abstract")
	private boolean abstractValue;

	/**
	 * Getter for abstractValue
	 * @return If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.
	 */
	public boolean getAbstract() { return abstractValue; }

	/**
	 * Setter for abstractValue
	 * @param value If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.
	 */
	public void setAbstract(boolean value) { abstractValue = value; }


	@Expose
	private boolean inactive;

	/**
	 * Getter for inactive
	 * @return If the concept is inactive in the code system that defines it. Inactive codes are those that are no longer to be used, but are maintained by the code system for understanding legacy data.
	 */
	public boolean getInactive() { return inactive; }

	/**
	 * Setter for inactive
	 * @param value If the concept is inactive in the code system that defines it. Inactive codes are those that are no longer to be used, but are maintained by the code system for understanding legacy data.
	 */
	public void setInactive(boolean value) { inactive = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return The recommended display for this item in the expansion.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value The recommended display for this item in the expansion.
	 */
	public void setDisplay(String value) { display = value; }


	@Expose
	private ArrayList<ValueSetDesignation> designation;

	/**
	 * Getter for designation
	 * @return Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation.
	 */
	public ArrayList<ValueSetDesignation> getDesignation() { return designation; }

	/**
	 * Setter for designation
	 * @param value Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation.
	 */
	public void setDesignation(ArrayList<ValueSetDesignation> value) { designation = value; }


	@Expose
	private ArrayList<ValueSetContains> contains;

	/**
	 * Getter for contains
	 * @return Other codes and entries contained under this entry in the hierarchy.
	 */
	public ArrayList<ValueSetContains> getContains() { return contains; }

	/**
	 * Setter for contains
	 * @param value Other codes and entries contained under this entry in the hierarchy.
	 */
	public void setContains(ArrayList<ValueSetContains> value) { contains = value; }


}
