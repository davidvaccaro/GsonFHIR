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
public class ImagingStudySeries extends BackboneElement {
	@Expose
	private String uid;

	/**
	 * Getter for uid
	 * @return Formal identifier for this series.
	 */
	public String getUid() { return uid; }

	/**
	 * Setter for uid
	 * @param value Formal identifier for this series.
	 */
	public void setUid(String value) { uid = value; }


	@Expose
	private Integer number;

	/**
	 * Getter for number
	 * @return The numeric identifier of this series in the study.
	 */
	public Integer getNumber() { return number; }

	/**
	 * Setter for number
	 * @param value The numeric identifier of this series in the study.
	 */
	public void setNumber(Integer value) { number = value; }


	@Expose
	private Coding modality;

	/**
	 * Getter for modality
	 * @return The modality of this series sequence.
	 */
	public Coding getModality() { return modality; }

	/**
	 * Setter for modality
	 * @param value The modality of this series sequence.
	 */
	public void setModality(Coding value) { modality = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A description of the series.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A description of the series.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private Integer numberOfInstances;

	/**
	 * Getter for numberOfInstances
	 * @return Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
	 */
	public Integer getNumberOfInstances() { return numberOfInstances; }

	/**
	 * Setter for numberOfInstances
	 * @param value Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
	 */
	public void setNumberOfInstances(Integer value) { numberOfInstances = value; }


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
	 * @return Availability of series (online, offline or nearline).
	 */
	public Availability getAvailability() { return availability; }

	/**
	 * Setter for availability
	 * @param value Availability of series (online, offline or nearline).
	 */
	public void setAvailability(Availability value) { availability = value; }


	@Expose
	private ArrayList<Reference> endpoint;

	/**
	 * Getter for endpoint
	 * @return The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type.
	 */
	public ArrayList<Reference> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type.
	 */
	public void setEndpoint(ArrayList<Reference> value) { endpoint = value; }


	@Expose
	private Coding bodySite;

	/**
	 * Getter for bodySite
	 * @return The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.laterality.
	 */
	public Coding getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.laterality.
	 */
	public void setBodySite(Coding value) { bodySite = value; }


	@Expose
	private Coding laterality;

	/**
	 * Getter for laterality
	 * @return The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite.
	 */
	public Coding getLaterality() { return laterality; }

	/**
	 * Setter for laterality
	 * @param value The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite.
	 */
	public void setLaterality(Coding value) { laterality = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date started;

	/**
	 * Getter for started
	 * @return The date and time the series was started.
	 */
	public Date getStarted() { return started; }

	/**
	 * Setter for started
	 * @param value The date and time the series was started.
	 */
	public void setStarted(Date value) { started = value; }


	@Expose
	private ArrayList<Reference> performer;

	/**
	 * Getter for performer
	 * @return The physician or operator (often the radiology technician)  who performed the series. The performer is recorded at the series level, since each series in a study may be performed by a different practitioner, at different times, and using different devices. A series may be performed by multiple practitioners.
	 */
	public ArrayList<Reference> getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value The physician or operator (often the radiology technician)  who performed the series. The performer is recorded at the series level, since each series in a study may be performed by a different practitioner, at different times, and using different devices. A series may be performed by multiple practitioners.
	 */
	public void setPerformer(ArrayList<Reference> value) { performer = value; }


	@Expose
	private ArrayList<ImagingStudyInstance> instance;

	/**
	 * Getter for instance
	 * @return A single SOP instance within the series, e.g. an image, or presentation state.
	 */
	public ArrayList<ImagingStudyInstance> getInstance() { return instance; }

	/**
	 * Setter for instance
	 * @param value A single SOP instance within the series, e.g. an image, or presentation state.
	 */
	public void setInstance(ArrayList<ImagingStudyInstance> value) { instance = value; }


}
