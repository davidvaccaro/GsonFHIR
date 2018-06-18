package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
 */
public class CompositionSection extends BackboneElement {
	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
	 */
	public void setTitle(String value) { title = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A code identifying the kind of content contained within the section. This must be consistent with the section title.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code identifying the kind of content contained within the section. This must be consistent with the section title.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Narrative text;

	/**
	 * Getter for text
	 * @return A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.
	 */
	public Narrative getText() { return text; }

	/**
	 * Setter for text
	 * @param value A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.
	 */
	public void setText(Narrative value) { text = value; }


	@Expose
	private String mode;

	/**
	 * Getter for mode
	 * @return How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
	 */
	public String getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
	 */
	public void setMode(String value) { mode = value; }


	@Expose
	private CodeableConcept orderedBy;

	/**
	 * Getter for orderedBy
	 * @return Specifies the order applied to the items in the section entries.
	 */
	public CodeableConcept getOrderedBy() { return orderedBy; }

	/**
	 * Setter for orderedBy
	 * @param value Specifies the order applied to the items in the section entries.
	 */
	public void setOrderedBy(CodeableConcept value) { orderedBy = value; }


	@Expose
	private ArrayList<Reference> entry;

	/**
	 * Getter for entry
	 * @return A reference to the actual resource from which the narrative in the section is derived.
	 */
	public ArrayList<Reference> getEntry() { return entry; }

	/**
	 * Setter for entry
	 * @param value A reference to the actual resource from which the narrative in the section is derived.
	 */
	public void setEntry(ArrayList<Reference> value) { entry = value; }


	@Expose
	private CodeableConcept emptyReason;

	/**
	 * Getter for emptyReason
	 * @return If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.
	 */
	public CodeableConcept getEmptyReason() { return emptyReason; }

	/**
	 * Setter for emptyReason
	 * @param value If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.
	 */
	public void setEmptyReason(CodeableConcept value) { emptyReason = value; }


	@Expose
	private ArrayList<CompositionSection> section;

	/**
	 * Getter for section
	 * @return A nested sub-section within this section.
	 */
	public ArrayList<CompositionSection> getSection() { return section; }

	/**
	 * Setter for section
	 * @param value A nested sub-section within this section.
	 */
	public void setSection(ArrayList<CompositionSection> value) { section = value; }


}
