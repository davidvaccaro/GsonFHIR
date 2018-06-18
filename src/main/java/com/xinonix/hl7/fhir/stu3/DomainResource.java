package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A resource that includes narrative, extensions, and contained resources.
 */
public class DomainResource extends Resource {
	@Expose
	private Narrative text;

	/**
	 * Getter for text
	 * @return A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
	 */
	public Narrative getText() { return text; }

	/**
	 * Setter for text
	 * @param value A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
	 */
	public void setText(Narrative value) { text = value; }


	@Expose
	private ArrayList<ResourceList> contained;

	/**
	 * Getter for contained
	 * @return These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
	 */
	public ArrayList<ResourceList> getContained() { return contained; }

	/**
	 * Setter for contained
	 * @param value These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
	 */
	public void setContained(ArrayList<ResourceList> value) { contained = value; }


	@Expose
	private ArrayList<Extension> modifierExtension;

	/**
	 * Getter for modifierExtension
	 * @return May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
	 */
	public ArrayList<Extension> getModifierExtension() { return modifierExtension; }

	/**
	 * Setter for modifierExtension
	 * @param value May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
	 */
	public void setModifierExtension(ArrayList<Extension> value) { modifierExtension = value; }


}
