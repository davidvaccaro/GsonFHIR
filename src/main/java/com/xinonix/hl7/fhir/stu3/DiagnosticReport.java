package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 */
public class DiagnosticReport extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DiagnosticReport resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DiagnosticReport resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers assigned to this report by the performer or other systems.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers assigned to this report by the performer or other systems.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return Details concerning a test or procedure requested.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value Details concerning a test or procedure requested.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	public enum Status{
		@SerializedName("registered") REGISTERED,
		@SerializedName("partial") PARTIAL,
		@SerializedName("preliminary") PRELIMINARY,
		@SerializedName("final") FINAL,
		@SerializedName("amended") AMENDED,
		@SerializedName("corrected") CORRECTED,
		@SerializedName("appended") APPENDED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of the diagnostic report as a whole.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the diagnostic report as a whole.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A code or name that describes this diagnostic report.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code or name that describes this diagnostic report.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The healthcare event  (e.g. a patient and healthcare provider interaction) which this DiagnosticReport per is about.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The healthcare event  (e.g. a patient and healthcare provider interaction) which this DiagnosticReport per is about.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date effectiveDateTime;

	/**
	 * Getter for effectiveDateTime
	 * @return The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
	 */
	public Date getEffectiveDateTime() { return effectiveDateTime; }

	/**
	 * Setter for effectiveDateTime
	 * @param value The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
	 */
	public void setEffectiveDateTime(Date value) { effectiveDateTime = value; }


	@Expose
	private Period effectivePeriod;

	/**
	 * Getter for effectivePeriod
	 * @return The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	private String issued;

	/**
	 * Getter for issued
	 * @return The date and time that this version of the report was released from the source diagnostic service.
	 */
	public String getIssued() { return issued; }

	/**
	 * Setter for issued
	 * @param value The date and time that this version of the report was released from the source diagnostic service.
	 */
	public void setIssued(String value) { issued = value; }


	@Expose
	private ArrayList<DiagnosticReportPerformer> performer;

	/**
	 * Getter for performer
	 * @return Indicates who or what participated in producing the report.
	 */
	public ArrayList<DiagnosticReportPerformer> getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value Indicates who or what participated in producing the report.
	 */
	public void setPerformer(ArrayList<DiagnosticReportPerformer> value) { performer = value; }


	@Expose
	private ArrayList<Reference> specimen;

	/**
	 * Getter for specimen
	 * @return Details about the specimens on which this diagnostic report is based.
	 */
	public ArrayList<Reference> getSpecimen() { return specimen; }

	/**
	 * Setter for specimen
	 * @param value Details about the specimens on which this diagnostic report is based.
	 */
	public void setSpecimen(ArrayList<Reference> value) { specimen = value; }


	@Expose
	private ArrayList<Reference> result;

	/**
	 * Getter for result
	 * @return Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").
	 */
	public ArrayList<Reference> getResult() { return result; }

	/**
	 * Setter for result
	 * @param value Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").
	 */
	public void setResult(ArrayList<Reference> value) { result = value; }


	@Expose
	private ArrayList<Reference> imagingStudy;

	/**
	 * Getter for imagingStudy
	 * @return One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
	 */
	public ArrayList<Reference> getImagingStudy() { return imagingStudy; }

	/**
	 * Setter for imagingStudy
	 * @param value One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
	 */
	public void setImagingStudy(ArrayList<Reference> value) { imagingStudy = value; }


	@Expose
	private ArrayList<DiagnosticReportImage> image;

	/**
	 * Getter for image
	 * @return A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
	 */
	public ArrayList<DiagnosticReportImage> getImage() { return image; }

	/**
	 * Setter for image
	 * @param value A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
	 */
	public void setImage(ArrayList<DiagnosticReportImage> value) { image = value; }


	@Expose
	private String conclusion;

	/**
	 * Getter for conclusion
	 * @return Concise and clinically contextualized impression / summary of the diagnostic report.
	 */
	public String getConclusion() { return conclusion; }

	/**
	 * Setter for conclusion
	 * @param value Concise and clinically contextualized impression / summary of the diagnostic report.
	 */
	public void setConclusion(String value) { conclusion = value; }


	@Expose
	private ArrayList<CodeableConcept> codedDiagnosis;

	/**
	 * Getter for codedDiagnosis
	 * @return Codes for the conclusion.
	 */
	public ArrayList<CodeableConcept> getCodedDiagnosis() { return codedDiagnosis; }

	/**
	 * Setter for codedDiagnosis
	 * @param value Codes for the conclusion.
	 */
	public void setCodedDiagnosis(ArrayList<CodeableConcept> value) { codedDiagnosis = value; }


	@Expose
	private ArrayList<Attachment> presentedForm;

	/**
	 * Getter for presentedForm
	 * @return Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
	 */
	public ArrayList<Attachment> getPresentedForm() { return presentedForm; }

	/**
	 * Setter for presentedForm
	 * @param value Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
	 */
	public void setPresentedForm(ArrayList<Attachment> value) { presentedForm = value; }


}
