package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 */
public class ImagingStudy extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ImagingStudy resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ImagingStudy resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String uid;

	/**
	 * Getter for uid
	 * @return Formal identifier for the study.
	 */
	public String getUid() { return uid; }

	/**
	 * Setter for uid
	 * @param value Formal identifier for the study.
	 */
	public void setUid(String value) { uid = value; }


	@Expose
	private Identifier accession;

	/**
	 * Getter for accession
	 * @return Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).
	 */
	public Identifier getAccession() { return accession; }

	/**
	 * Setter for accession
	 * @param value Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).
	 */
	public void setAccession(Identifier value) { accession = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Other identifiers for the study.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Other identifiers for the study.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Availability{
		@SerializedName("ONLINE") ONLINE,
		@SerializedName("OFFLINE") OFFLINE,
		@SerializedName("NEARLINE") NEARLINE,
		@SerializedName("UNAVAILABLE") UNAVAILABLE
	}

	@Expose
	private Availability availability;

	/**
	 * Getter for availability
	 * @return Availability of study (online, offline, or nearline).
	 */
	public Availability getAvailability() { return availability; }

	/**
	 * Setter for availability
	 * @param value Availability of study (online, offline, or nearline).
	 */
	public void setAvailability(Availability value) { availability = value; }


	@Expose
	private ArrayList<Coding> modalityList;

	/**
	 * Getter for modalityList
	 * @return A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
	 */
	public ArrayList<Coding> getModalityList() { return modalityList; }

	/**
	 * Setter for modalityList
	 * @param value A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
	 */
	public void setModalityList(ArrayList<Coding> value) { modalityList = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The patient imaged in the study.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The patient imaged in the study.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter or episode at which the request is initiated.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter or episode at which the request is initiated.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date started;

	/**
	 * Getter for started
	 * @return Date and time the study started.
	 */
	public Date getStarted() { return started; }

	/**
	 * Setter for started
	 * @param value Date and time the study started.
	 */
	public void setStarted(Date value) { started = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return A list of the diagnostic requests that resulted in this imaging study being performed.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A list of the diagnostic requests that resulted in this imaging study being performed.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private Reference referrer;

	/**
	 * Getter for referrer
	 * @return The requesting/referring physician.
	 */
	public Reference getReferrer() { return referrer; }

	/**
	 * Setter for referrer
	 * @param value The requesting/referring physician.
	 */
	public void setReferrer(Reference value) { referrer = value; }


	@Expose
	private ArrayList<Reference> interpreter;

	/**
	 * Getter for interpreter
	 * @return Who read the study and interpreted the images or other content.
	 */
	public ArrayList<Reference> getInterpreter() { return interpreter; }

	/**
	 * Setter for interpreter
	 * @param value Who read the study and interpreted the images or other content.
	 */
	public void setInterpreter(ArrayList<Reference> value) { interpreter = value; }


	@Expose
	private ArrayList<Reference> endpoint;

	/**
	 * Getter for endpoint
	 * @return The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type.
	 */
	public ArrayList<Reference> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type.
	 */
	public void setEndpoint(ArrayList<Reference> value) { endpoint = value; }


	@Expose
	private Integer numberOfSeries;

	/**
	 * Getter for numberOfSeries
	 * @return Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present.
	 */
	public Integer getNumberOfSeries() { return numberOfSeries; }

	/**
	 * Setter for numberOfSeries
	 * @param value Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present.
	 */
	public void setNumberOfSeries(Integer value) { numberOfSeries = value; }


	@Expose
	private Integer numberOfInstances;

	/**
	 * Getter for numberOfInstances
	 * @return Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
	 */
	public Integer getNumberOfInstances() { return numberOfInstances; }

	/**
	 * Setter for numberOfInstances
	 * @param value Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
	 */
	public void setNumberOfInstances(Integer value) { numberOfInstances = value; }


	@Expose
	private ArrayList<Reference> procedureReference;

	/**
	 * Getter for procedureReference
	 * @return A reference to the performed Procedure.
	 */
	public ArrayList<Reference> getProcedureReference() { return procedureReference; }

	/**
	 * Setter for procedureReference
	 * @param value A reference to the performed Procedure.
	 */
	public void setProcedureReference(ArrayList<Reference> value) { procedureReference = value; }


	@Expose
	private ArrayList<CodeableConcept> procedureCode;

	/**
	 * Getter for procedureCode
	 * @return The code for the performed procedure type.
	 */
	public ArrayList<CodeableConcept> getProcedureCode() { return procedureCode; }

	/**
	 * Setter for procedureCode
	 * @param value The code for the performed procedure type.
	 */
	public void setProcedureCode(ArrayList<CodeableConcept> value) { procedureCode = value; }


	@Expose
	private CodeableConcept reason;

	/**
	 * Getter for reason
	 * @return Description of clinical condition indicating why the ImagingStudy was requested.
	 */
	public CodeableConcept getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value Description of clinical condition indicating why the ImagingStudy was requested.
	 */
	public void setReason(CodeableConcept value) { reason = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Institution-generated description or classification of the Study performed.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Institution-generated description or classification of the Study performed.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<ImagingStudySeries> series;

	/**
	 * Getter for series
	 * @return Each study has one or more series of images or other content.
	 */
	public ArrayList<ImagingStudySeries> getSeries() { return series; }

	/**
	 * Setter for series
	 * @param value Each study has one or more series of images or other content.
	 */
	public void setSeries(ArrayList<ImagingStudySeries> value) { series = value; }


}
