package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinitionSlicing extends BackboneElement {
	@Expose
	private ArrayList<ElementDefinitionDiscriminator> discriminator;

	/**
	 * Getter for discriminator
	 * @return Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.
	 */
	public ArrayList<ElementDefinitionDiscriminator> getDiscriminator() { return discriminator; }

	/**
	 * Setter for discriminator
	 * @param value Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.
	 */
	public void setDiscriminator(ArrayList<ElementDefinitionDiscriminator> value) { discriminator = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private boolean ordered;

	/**
	 * Getter for ordered
	 * @return If the matching elements have to occur in the same order as defined in the profile.
	 */
	public boolean getOrdered() { return ordered; }

	/**
	 * Setter for ordered
	 * @param value If the matching elements have to occur in the same order as defined in the profile.
	 */
	public void setOrdered(boolean value) { ordered = value; }


	public enum Rules{
		@SerializedName("closed") CLOSED,
		@SerializedName("open") OPEN,
		@SerializedName("openAtEnd") OPENATEND
	}

	@Expose
	private Rules rules;

	/**
	 * Getter for rules
	 * @return Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.
	 */
	public Rules getRules() { return rules; }

	/**
	 * Setter for rules
	 * @param value Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.
	 */
	public void setRules(Rules value) { rules = value; }


}
