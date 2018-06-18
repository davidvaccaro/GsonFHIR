package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
 */
public class Procedure extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Procedure resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Procedure resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this procedure.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this procedure.
	 */
	public void setDefinition(ArrayList<Reference> value) { definition = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return A reference to a resource that contains details of the request for this procedure.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A reference to a resource that contains details of the request for this procedure.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return A larger event of which this particular procedure is a component or step.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value A larger event of which this particular procedure is a component or step.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return A code specifying the state of the procedure. Generally this will be in-progress or completed state.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code specifying the state of the procedure. Generally this will be in-progress or completed state.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private boolean notDone;

	/**
	 * Getter for notDone
	 * @return Set this to true if the record is saying that the procedure was NOT performed.
	 */
	public boolean getNotDone() { return notDone; }

	/**
	 * Setter for notDone
	 * @param value Set this to true if the record is saying that the procedure was NOT performed.
	 */
	public void setNotDone(boolean value) { notDone = value; }


	@Expose
	private CodeableConcept notDoneReason;

	/**
	 * Getter for notDoneReason
	 * @return A code indicating why the procedure was not performed.
	 */
	public CodeableConcept getNotDoneReason() { return notDoneReason; }

	/**
	 * Setter for notDoneReason
	 * @param value A code indicating why the procedure was not performed.
	 */
	public void setNotDoneReason(CodeableConcept value) { notDoneReason = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The person, animal or group on which the procedure was performed.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The person, animal or group on which the procedure was performed.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter during which the procedure was performed.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter during which the procedure was performed.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date performedDateTime;

	/**
	 * Getter for performedDateTime
	 * @return The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
	 */
	public Date getPerformedDateTime() { return performedDateTime; }

	/**
	 * Setter for performedDateTime
	 * @param value The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
	 */
	public void setPerformedDateTime(Date value) { performedDateTime = value; }


	@Expose
	private Period performedPeriod;

	/**
	 * Getter for performedPeriod
	 * @return The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
	 */
	public Period getPerformedPeriod() { return performedPeriod; }

	/**
	 * Setter for performedPeriod
	 * @param value The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
	 */
	public void setPerformedPeriod(Period value) { performedPeriod = value; }


	@Expose
	private ArrayList<ProcedurePerformer> performer;

	/**
	 * Getter for performer
	 * @return Limited to 'real' people rather than equipment.
	 */
	public ArrayList<ProcedurePerformer> getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value Limited to 'real' people rather than equipment.
	 */
	public void setPerformer(ArrayList<ProcedurePerformer> value) { performer = value; }


	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.
	 */
	public void setLocation(Reference value) { location = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return The coded reason why the procedure was performed. This may be coded entity of some type, or may simply be present as text.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value The coded reason why the procedure was performed. This may be coded entity of some type, or may simply be present as text.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return The condition that is the reason why the procedure was performed.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value The condition that is the reason why the procedure was performed.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<CodeableConcept> bodySite;

	/**
	 * Getter for bodySite
	 * @return Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
	 */
	public ArrayList<CodeableConcept> getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
	 */
	public void setBodySite(ArrayList<CodeableConcept> value) { bodySite = value; }


	@Expose
	private CodeableConcept outcome;

	/**
	 * Getter for outcome
	 * @return The outcome of the procedure - did it resolve reasons for the procedure being performed?
	 */
	public CodeableConcept getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value The outcome of the procedure - did it resolve reasons for the procedure being performed?
	 */
	public void setOutcome(CodeableConcept value) { outcome = value; }


	@Expose
	private ArrayList<Reference> report;

	/**
	 * Getter for report
	 * @return This could be a histology result, pathology report, surgical report, etc..
	 */
	public ArrayList<Reference> getReport() { return report; }

	/**
	 * Setter for report
	 * @param value This could be a histology result, pathology report, surgical report, etc..
	 */
	public void setReport(ArrayList<Reference> value) { report = value; }


	@Expose
	private ArrayList<CodeableConcept> complication;

	/**
	 * Getter for complication
	 * @return Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
	 */
	public ArrayList<CodeableConcept> getComplication() { return complication; }

	/**
	 * Setter for complication
	 * @param value Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
	 */
	public void setComplication(ArrayList<CodeableConcept> value) { complication = value; }


	@Expose
	private ArrayList<Reference> complicationDetail;

	/**
	 * Getter for complicationDetail
	 * @return Any complications that occurred during the procedure, or in the immediate post-performance period.
	 */
	public ArrayList<Reference> getComplicationDetail() { return complicationDetail; }

	/**
	 * Setter for complicationDetail
	 * @param value Any complications that occurred during the procedure, or in the immediate post-performance period.
	 */
	public void setComplicationDetail(ArrayList<Reference> value) { complicationDetail = value; }


	@Expose
	private ArrayList<CodeableConcept> followUp;

	/**
	 * Getter for followUp
	 * @return If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used.
	 */
	public ArrayList<CodeableConcept> getFollowUp() { return followUp; }

	/**
	 * Setter for followUp
	 * @param value If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used.
	 */
	public void setFollowUp(ArrayList<CodeableConcept> value) { followUp = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Any other notes about the procedure.  E.g. the operative notes.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Any other notes about the procedure.  E.g. the operative notes.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<ProcedureFocalDevice> focalDevice;

	/**
	 * Getter for focalDevice
	 * @return A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
	 */
	public ArrayList<ProcedureFocalDevice> getFocalDevice() { return focalDevice; }

	/**
	 * Setter for focalDevice
	 * @param value A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
	 */
	public void setFocalDevice(ArrayList<ProcedureFocalDevice> value) { focalDevice = value; }


	@Expose
	private ArrayList<Reference> usedReference;

	/**
	 * Getter for usedReference
	 * @return Identifies medications, devices and any other substance used as part of the procedure.
	 */
	public ArrayList<Reference> getUsedReference() { return usedReference; }

	/**
	 * Setter for usedReference
	 * @param value Identifies medications, devices and any other substance used as part of the procedure.
	 */
	public void setUsedReference(ArrayList<Reference> value) { usedReference = value; }


	@Expose
	private ArrayList<CodeableConcept> usedCode;

	/**
	 * Getter for usedCode
	 * @return Identifies coded items that were used as part of the procedure.
	 */
	public ArrayList<CodeableConcept> getUsedCode() { return usedCode; }

	/**
	 * Setter for usedCode
	 * @param value Identifies coded items that were used as part of the procedure.
	 */
	public void setUsedCode(ArrayList<CodeableConcept> value) { usedCode = value; }


}
