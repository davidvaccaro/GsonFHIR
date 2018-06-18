package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 */
public class ResearchStudyArm extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Unique, human-readable label for this arm of the study.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Unique, human-readable label for this arm of the study.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Categorization of study arm, e.g. experimental, active comparator, placebo comparater.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Categorization of study arm, e.g. experimental, active comparator, placebo comparater.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A succinct description of the path through the study that would be followed by a subject adhering to this arm.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A succinct description of the path through the study that would be followed by a subject adhering to this arm.
	 */
	public void setDescription(String value) { description = value; }


}
