package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 */
public class ImplementationGuideResource extends BackboneElement {
	@Expose
	private boolean example;

	/**
	 * Getter for example
	 * @return Whether a resource is included in the guide as part of the rules defined by the guide, or just as an example of a resource that conforms to the rules and/or help implementers understand the intent of the guide.
	 */
	public boolean getExample() { return example; }

	/**
	 * Setter for example
	 * @param value Whether a resource is included in the guide as part of the rules defined by the guide, or just as an example of a resource that conforms to the rules and/or help implementers understand the intent of the guide.
	 */
	public void setExample(boolean value) { example = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A description of the reason that a resource has been included in the implementation guide.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A description of the reason that a resource has been included in the implementation guide.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String acronym;

	/**
	 * Getter for acronym
	 * @return A short code that may be used to identify the resource throughout the implementation guide.
	 */
	public String getAcronym() { return acronym; }

	/**
	 * Setter for acronym
	 * @param value A short code that may be used to identify the resource throughout the implementation guide.
	 */
	public void setAcronym(String value) { acronym = value; }


	@Expose
	private String sourceUri;

	/**
	 * Getter for sourceUri
	 * @return Where this resource is found.
	 */
	public String getSourceUri() { return sourceUri; }

	/**
	 * Setter for sourceUri
	 * @param value Where this resource is found.
	 */
	public void setSourceUri(String value) { sourceUri = value; }


	@Expose
	private Reference sourceReference;

	/**
	 * Getter for sourceReference
	 * @return Where this resource is found.
	 */
	public Reference getSourceReference() { return sourceReference; }

	/**
	 * Setter for sourceReference
	 * @param value Where this resource is found.
	 */
	public void setSourceReference(Reference value) { sourceReference = value; }


	@Expose
	private Reference exampleFor;

	/**
	 * Getter for exampleFor
	 * @return Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.
	 */
	public Reference getExampleFor() { return exampleFor; }

	/**
	 * Setter for exampleFor
	 * @param value Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.
	 */
	public void setExampleFor(Reference value) { exampleFor = value; }


}
