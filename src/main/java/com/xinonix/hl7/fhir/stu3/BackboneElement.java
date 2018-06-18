package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Base definition for all elements that are defined inside a resource - but not those in a data type.
 */
public class BackboneElement extends Element {
	@Expose
	private ArrayList<Extension> modifierExtension;

	/**
	 * Getter for modifierExtension
	 * @return May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
	 */
	public ArrayList<Extension> getModifierExtension() { return modifierExtension; }

	/**
	 * Setter for modifierExtension
	 * @param value May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
	 */
	public void setModifierExtension(ArrayList<Extension> value) { modifierExtension = value; }


}
