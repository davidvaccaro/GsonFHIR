package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A reference to a document.
 */
public class DocumentReferenceContext extends BackboneElement {
	@Expose
	private Reference encounter;

	/**
	 * Getter for encounter
	 * @return Describes the clinical encounter or type of care that the document content is associated with.
	 */
	public Reference getEncounter() { return encounter; }

	/**
	 * Setter for encounter
	 * @param value Describes the clinical encounter or type of care that the document content is associated with.
	 */
	public void setEncounter(Reference value) { encounter = value; }


	@Expose
	private ArrayList<CodeableConcept> event;

	/**
	 * Getter for event
	 * @return This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
	 */
	public ArrayList<CodeableConcept> getEvent() { return event; }

	/**
	 * Setter for event
	 * @param value This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
	 */
	public void setEvent(ArrayList<CodeableConcept> value) { event = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The time period over which the service that is described by the document was provided.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The time period over which the service that is described by the document was provided.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private CodeableConcept facilityType;

	/**
	 * Getter for facilityType
	 * @return The kind of facility where the patient was seen.
	 */
	public CodeableConcept getFacilityType() { return facilityType; }

	/**
	 * Setter for facilityType
	 * @param value The kind of facility where the patient was seen.
	 */
	public void setFacilityType(CodeableConcept value) { facilityType = value; }


	@Expose
	private CodeableConcept practiceSetting;

	/**
	 * Getter for practiceSetting
	 * @return This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.
	 */
	public CodeableConcept getPracticeSetting() { return practiceSetting; }

	/**
	 * Setter for practiceSetting
	 * @param value This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.
	 */
	public void setPracticeSetting(CodeableConcept value) { practiceSetting = value; }


	@Expose
	private Reference sourcePatientInfo;

	/**
	 * Getter for sourcePatientInfo
	 * @return The Patient Information as known when the document was published. May be a reference to a version specific, or contained.
	 */
	public Reference getSourcePatientInfo() { return sourcePatientInfo; }

	/**
	 * Setter for sourcePatientInfo
	 * @param value The Patient Information as known when the document was published. May be a reference to a version specific, or contained.
	 */
	public void setSourcePatientInfo(Reference value) { sourcePatientInfo = value; }


	@Expose
	private ArrayList<DocumentReferenceRelated> related;

	/**
	 * Getter for related
	 * @return Related identifiers or resources associated with the DocumentReference.
	 */
	public ArrayList<DocumentReferenceRelated> getRelated() { return related; }

	/**
	 * Setter for related
	 * @param value Related identifiers or resources associated with the DocumentReference.
	 */
	public void setRelated(ArrayList<DocumentReferenceRelated> value) { related = value; }


}
