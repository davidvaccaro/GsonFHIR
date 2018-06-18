package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc.
 */
public class Device extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Device resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Device resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private DeviceUdi udi;

	/**
	 * Getter for udi
	 * @return [Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package.
	 */
	public DeviceUdi getUdi() { return udi; }

	/**
	 * Setter for udi
	 * @param value [Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package.
	 */
	public void setUdi(DeviceUdi value) { udi = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("inactive") INACTIVE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Status of the Device availability.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Status of the Device availability.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Code or identifier to identify a kind of device.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Code or identifier to identify a kind of device.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private String lotNumber;

	/**
	 * Getter for lotNumber
	 * @return Lot number assigned by the manufacturer.
	 */
	public String getLotNumber() { return lotNumber; }

	/**
	 * Setter for lotNumber
	 * @param value Lot number assigned by the manufacturer.
	 */
	public void setLotNumber(String value) { lotNumber = value; }


	@Expose
	private String manufacturer;

	/**
	 * Getter for manufacturer
	 * @return A name of the manufacturer.
	 */
	public String getManufacturer() { return manufacturer; }

	/**
	 * Setter for manufacturer
	 * @param value A name of the manufacturer.
	 */
	public void setManufacturer(String value) { manufacturer = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date manufactureDate;

	/**
	 * Getter for manufactureDate
	 * @return The date and time when the device was manufactured.
	 */
	public Date getManufactureDate() { return manufactureDate; }

	/**
	 * Setter for manufactureDate
	 * @param value The date and time when the device was manufactured.
	 */
	public void setManufactureDate(Date value) { manufactureDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date expirationDate;

	/**
	 * Getter for expirationDate
	 * @return The date and time beyond which this device is no longer valid or should not be used (if applicable).
	 */
	public Date getExpirationDate() { return expirationDate; }

	/**
	 * Setter for expirationDate
	 * @param value The date and time beyond which this device is no longer valid or should not be used (if applicable).
	 */
	public void setExpirationDate(Date value) { expirationDate = value; }


	@Expose
	private String model;

	/**
	 * Getter for model
	 * @return The "model" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.
	 */
	public String getModel() { return model; }

	/**
	 * Setter for model
	 * @param value The "model" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.
	 */
	public void setModel(String value) { model = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return Patient information, If the device is affixed to a person.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value Patient information, If the device is affixed to a person.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Reference owner;

	/**
	 * Getter for owner
	 * @return An organization that is responsible for the provision and ongoing maintenance of the device.
	 */
	public Reference getOwner() { return owner; }

	/**
	 * Setter for owner
	 * @param value An organization that is responsible for the provision and ongoing maintenance of the device.
	 */
	public void setOwner(Reference value) { owner = value; }


	@Expose
	private ArrayList<ContactPoint> contact;

	/**
	 * Getter for contact
	 * @return Contact details for an organization or a particular human that is responsible for the device.
	 */
	public ArrayList<ContactPoint> getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value Contact details for an organization or a particular human that is responsible for the device.
	 */
	public void setContact(ArrayList<ContactPoint> value) { contact = value; }


	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return The place where the device can be found.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value The place where the device can be found.
	 */
	public void setLocation(Reference value) { location = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return A network address on which the device may be contacted directly.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value A network address on which the device may be contacted directly.
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Descriptive information, usage information or implantation information that is not captured in an existing element.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Descriptive information, usage information or implantation information that is not captured in an existing element.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<CodeableConcept> safety;

	/**
	 * Getter for safety
	 * @return Provides additional safety characteristics about a medical device.  For example devices containing latex.
	 */
	public ArrayList<CodeableConcept> getSafety() { return safety; }

	/**
	 * Setter for safety
	 * @param value Provides additional safety characteristics about a medical device.  For example devices containing latex.
	 */
	public void setSafety(ArrayList<CodeableConcept> value) { safety = value; }


}
