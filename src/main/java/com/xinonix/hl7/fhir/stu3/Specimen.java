package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A sample to be used for analysis.
 */
public class Specimen extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Specimen resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Specimen resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Id for specimen.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Id for specimen.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private Identifier accessionIdentifier;

	/**
	 * Getter for accessionIdentifier
	 * @return The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
	 */
	public Identifier getAccessionIdentifier() { return accessionIdentifier; }

	/**
	 * Setter for accessionIdentifier
	 * @param value The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
	 */
	public void setAccessionIdentifier(Identifier value) { accessionIdentifier = value; }


	public enum Status{
		@SerializedName("available") AVAILABLE,
		@SerializedName("unavailable") UNAVAILABLE,
		@SerializedName("unsatisfactory") UNSATISFACTORY,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The availability of the specimen.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The availability of the specimen.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return The kind of material that forms the specimen.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value The kind of material that forms the specimen.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Where the specimen came from. This may be from the patient(s) or from the environment or a device.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Where the specimen came from. This may be from the patient(s) or from the environment or a device.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date receivedTime;

	/**
	 * Getter for receivedTime
	 * @return Time when specimen was received for processing or testing.
	 */
	public Date getReceivedTime() { return receivedTime; }

	/**
	 * Setter for receivedTime
	 * @param value Time when specimen was received for processing or testing.
	 */
	public void setReceivedTime(Date value) { receivedTime = value; }


	@Expose
	private ArrayList<Reference> parent;

	/**
	 * Getter for parent
	 * @return Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
	 */
	public ArrayList<Reference> getParent() { return parent; }

	/**
	 * Setter for parent
	 * @param value Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
	 */
	public void setParent(ArrayList<Reference> value) { parent = value; }


	@Expose
	private ArrayList<Reference> request;

	/**
	 * Getter for request
	 * @return Details concerning a test or procedure request that required a specimen to be collected.
	 */
	public ArrayList<Reference> getRequest() { return request; }

	/**
	 * Setter for request
	 * @param value Details concerning a test or procedure request that required a specimen to be collected.
	 */
	public void setRequest(ArrayList<Reference> value) { request = value; }


	@Expose
	private SpecimenCollection collection;

	/**
	 * Getter for collection
	 * @return Details concerning the specimen collection.
	 */
	public SpecimenCollection getCollection() { return collection; }

	/**
	 * Setter for collection
	 * @param value Details concerning the specimen collection.
	 */
	public void setCollection(SpecimenCollection value) { collection = value; }


	@Expose
	private ArrayList<SpecimenProcessing> processing;

	/**
	 * Getter for processing
	 * @return Details concerning processing and processing steps for the specimen.
	 */
	public ArrayList<SpecimenProcessing> getProcessing() { return processing; }

	/**
	 * Setter for processing
	 * @param value Details concerning processing and processing steps for the specimen.
	 */
	public void setProcessing(ArrayList<SpecimenProcessing> value) { processing = value; }


	@Expose
	private ArrayList<SpecimenContainer> container;

	/**
	 * Getter for container
	 * @return The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
	 */
	public ArrayList<SpecimenContainer> getContainer() { return container; }

	/**
	 * Setter for container
	 * @param value The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
	 */
	public void setContainer(ArrayList<SpecimenContainer> value) { container = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
