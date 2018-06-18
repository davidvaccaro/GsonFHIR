package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Base definition for all elements in a resource.
 */
public class Element {
	@Expose
	private String id;

	/**
	 * Getter for id
	 * @return unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
	 */
	public String getId() { return id; }

	/**
	 * Setter for id
	 * @param value unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
	 */
	public void setId(String value) { id = value; }


	@Expose
	private ArrayList<Extension> extension;

	/**
	 * Getter for extension
	 * @return May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
	 */
	public ArrayList<Extension> getExtension() { return extension; }

	/**
	 * Setter for extension
	 * @param value May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
	 */
	public void setExtension(ArrayList<Extension> value) { extension = value; }


}
