package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
 */
public class Media extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Media resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Media resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return A procedure that is fulfilled in whole or in part by the creation of this media.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A procedure that is fulfilled in whole or in part by the creation of this media.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	public enum Type{
		@SerializedName("photo") PHOTO,
		@SerializedName("video") VIDEO,
		@SerializedName("audio") AUDIO
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Whether the media is a photo (still image), an audio recording, or a video recording.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Whether the media is a photo (still image), an audio recording, or a video recording.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private CodeableConcept subtype;

	/**
	 * Getter for subtype
	 * @return Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.
	 */
	public CodeableConcept getSubtype() { return subtype; }

	/**
	 * Setter for subtype
	 * @param value Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.
	 */
	public void setSubtype(CodeableConcept value) { subtype = value; }


	@Expose
	private CodeableConcept view;

	/**
	 * Getter for view
	 * @return The name of the imaging view e.g. Lateral or Antero-posterior (AP).
	 */
	public CodeableConcept getView() { return view; }

	/**
	 * Setter for view
	 * @param value The name of the imaging view e.g. Lateral or Antero-posterior (AP).
	 */
	public void setView(CodeableConcept value) { view = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Who/What this Media is a record of.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Who/What this Media is a record of.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter or episode of care that establishes the context for this media.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter or episode of care that establishes the context for this media.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return The date and time(s) at which the media was collected.
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value The date and time(s) at which the media was collected.
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Period occurrencePeriod;

	/**
	 * Getter for occurrencePeriod
	 * @return The date and time(s) at which the media was collected.
	 */
	public Period getOccurrencePeriod() { return occurrencePeriod; }

	/**
	 * Setter for occurrencePeriod
	 * @param value The date and time(s) at which the media was collected.
	 */
	public void setOccurrencePeriod(Period value) { occurrencePeriod = value; }


	@Expose
	private Reference operator;

	/**
	 * Getter for operator
	 * @return The person who administered the collection of the image.
	 */
	public Reference getOperator() { return operator; }

	/**
	 * Setter for operator
	 * @param value The person who administered the collection of the image.
	 */
	public void setOperator(Reference value) { operator = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return Describes why the event occurred in coded or textual form.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value Describes why the event occurred in coded or textual form.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private CodeableConcept bodySite;

	/**
	 * Getter for bodySite
	 * @return Indicates the site on the subject's body where the media was collected (i.e. the target site).
	 */
	public CodeableConcept getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value Indicates the site on the subject's body where the media was collected (i.e. the target site).
	 */
	public void setBodySite(CodeableConcept value) { bodySite = value; }


	@Expose
	private Reference device;

	/**
	 * Getter for device
	 * @return The device used to collect the media.
	 */
	public Reference getDevice() { return device; }

	/**
	 * Setter for device
	 * @param value The device used to collect the media.
	 */
	public void setDevice(Reference value) { device = value; }


	@Expose
	private Integer height;

	/**
	 * Getter for height
	 * @return Height of the image in pixels (photo/video).
	 */
	public Integer getHeight() { return height; }

	/**
	 * Setter for height
	 * @param value Height of the image in pixels (photo/video).
	 */
	public void setHeight(Integer value) { height = value; }


	@Expose
	private Integer width;

	/**
	 * Getter for width
	 * @return Width of the image in pixels (photo/video).
	 */
	public Integer getWidth() { return width; }

	/**
	 * Setter for width
	 * @param value Width of the image in pixels (photo/video).
	 */
	public void setWidth(Integer value) { width = value; }


	@Expose
	private Integer frames;

	/**
	 * Getter for frames
	 * @return The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
	 */
	public Integer getFrames() { return frames; }

	/**
	 * Setter for frames
	 * @param value The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
	 */
	public void setFrames(Integer value) { frames = value; }


	@Expose
	private Integer duration;

	/**
	 * Getter for duration
	 * @return The duration of the recording in seconds - for audio and video.
	 */
	public Integer getDuration() { return duration; }

	/**
	 * Setter for duration
	 * @param value The duration of the recording in seconds - for audio and video.
	 */
	public void setDuration(Integer value) { duration = value; }


	@Expose
	private Attachment content;

	/**
	 * Getter for content
	 * @return The actual content of the media - inline or by direct reference to the media source file.
	 */
	public Attachment getContent() { return content; }

	/**
	 * Setter for content
	 * @param value The actual content of the media - inline or by direct reference to the media source file.
	 */
	public void setContent(Attachment value) { content = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Comments made about the media by the performer, subject or other participants.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Comments made about the media by the performer, subject or other participants.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
