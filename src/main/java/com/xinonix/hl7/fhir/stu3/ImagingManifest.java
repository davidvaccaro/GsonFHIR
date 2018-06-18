package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection.
 */
public class ImagingManifest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ImagingManifest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ImagingManifest resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Unique identifier of the DICOM Key Object Selection (KOS) that this resource represents.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique identifier of the DICOM Key Object Selection (KOS) that this resource represents.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingManifest.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingManifest.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date authoringTime;

	/**
	 * Getter for authoringTime
	 * @return Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
	 */
	public Date getAuthoringTime() { return authoringTime; }

	/**
	 * Setter for authoringTime
	 * @param value Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
	 */
	public void setAuthoringTime(Date value) { authoringTime = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return Author of ImagingManifest. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Author of ImagingManifest. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.
	 */
	public void setAuthor(Reference value) { author = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Free text narrative description of the ImagingManifest.  
The value may be derived from the DICOM Standard Part 16, CID-7010 descriptions (e.g. Best in Set, Complete Study Content). Note that those values cover the wide range of uses of the DICOM Key Object Selection object, several of which are not supported by ImagingManifest. Specifically, there is no expected behavior associated with descriptions that suggest referenced images be removed or not used.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Free text narrative description of the ImagingManifest.  
The value may be derived from the DICOM Standard Part 16, CID-7010 descriptions (e.g. Best in Set, Complete Study Content). Note that those values cover the wide range of uses of the DICOM Key Object Selection object, several of which are not supported by ImagingManifest. Specifically, there is no expected behavior associated with descriptions that suggest referenced images be removed or not used.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<ImagingManifestStudy> study;

	/**
	 * Getter for study
	 * @return Study identity and locating information of the DICOM SOP instances in the selection.
	 */
	public ArrayList<ImagingManifestStudy> getStudy() { return study; }

	/**
	 * Setter for study
	 * @param value Study identity and locating information of the DICOM SOP instances in the selection.
	 */
	public void setStudy(ArrayList<ImagingManifestStudy> value) { study = value; }


}
