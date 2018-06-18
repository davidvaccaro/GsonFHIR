package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 */
public class ConceptMapGroup extends BackboneElement {
	@Expose
	private String source;

	/**
	 * Getter for source
	 * @return An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).
	 */
	public String getSource() { return source; }

	/**
	 * Setter for source
	 * @param value An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).
	 */
	public void setSource(String value) { source = value; }


	@Expose
	private String sourceVersion;

	/**
	 * Getter for sourceVersion
	 * @return The specific version of the code system, as determined by the code system authority.
	 */
	public String getSourceVersion() { return sourceVersion; }

	/**
	 * Setter for sourceVersion
	 * @param value The specific version of the code system, as determined by the code system authority.
	 */
	public void setSourceVersion(String value) { sourceVersion = value; }


	@Expose
	private String target;

	/**
	 * Getter for target
	 * @return An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).
	 */
	public String getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).
	 */
	public void setTarget(String value) { target = value; }


	@Expose
	private String targetVersion;

	/**
	 * Getter for targetVersion
	 * @return The specific version of the code system, as determined by the code system authority.
	 */
	public String getTargetVersion() { return targetVersion; }

	/**
	 * Setter for targetVersion
	 * @param value The specific version of the code system, as determined by the code system authority.
	 */
	public void setTargetVersion(String value) { targetVersion = value; }


	@Expose
	private ArrayList<ConceptMapElement> element;

	/**
	 * Getter for element
	 * @return Mappings for an individual concept in the source to one or more concepts in the target.
	 */
	public ArrayList<ConceptMapElement> getElement() { return element; }

	/**
	 * Setter for element
	 * @param value Mappings for an individual concept in the source to one or more concepts in the target.
	 */
	public void setElement(ArrayList<ConceptMapElement> value) { element = value; }


	@Expose
	private ConceptMapUnmapped unmapped;

	/**
	 * Getter for unmapped
	 * @return What to do when there is no match in the mappings in the group.
	 */
	public ConceptMapUnmapped getUnmapped() { return unmapped; }

	/**
	 * Setter for unmapped
	 * @param value What to do when there is no match in the mappings in the group.
	 */
	public void setUnmapped(ConceptMapUnmapped value) { unmapped = value; }


}
