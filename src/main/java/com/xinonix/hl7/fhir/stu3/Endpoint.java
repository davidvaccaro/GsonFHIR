package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
 */
public class Endpoint extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Endpoint resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Endpoint resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("suspended") SUSPENDED,
		@SerializedName("error") ERROR,
		@SerializedName("off") OFF,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("test") TEST
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return active | suspended | error | off | test.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value active | suspended | error | off | test.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Coding connectionType;

	/**
	 * Getter for connectionType
	 * @return A coded value that represents the technical details of the usage of this endpoint, such as what WSDLs should be used in what way. (e.g. XDS.b/DICOM/cds-hook).
	 */
	public Coding getConnectionType() { return connectionType; }

	/**
	 * Setter for connectionType
	 * @param value A coded value that represents the technical details of the usage of this endpoint, such as what WSDLs should be used in what way. (e.g. XDS.b/DICOM/cds-hook).
	 */
	public void setConnectionType(Coding value) { connectionType = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A friendly name that this endpoint can be referred to with.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A friendly name that this endpoint can be referred to with.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private Reference managingOrganization;

	/**
	 * Getter for managingOrganization
	 * @return The organization that manages this endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).
	 */
	public Reference getManagingOrganization() { return managingOrganization; }

	/**
	 * Setter for managingOrganization
	 * @param value The organization that manages this endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).
	 */
	public void setManagingOrganization(Reference value) { managingOrganization = value; }


	@Expose
	private ArrayList<ContactPoint> contact;

	/**
	 * Getter for contact
	 * @return Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
	 */
	public ArrayList<ContactPoint> getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
	 */
	public void setContact(ArrayList<ContactPoint> value) { contact = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The interval during which the endpoint is expected to be operational.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The interval during which the endpoint is expected to be operational.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<CodeableConcept> payloadType;

	/**
	 * Getter for payloadType
	 * @return The payload type describes the acceptable content that can be communicated on the endpoint.
	 */
	public ArrayList<CodeableConcept> getPayloadType() { return payloadType; }

	/**
	 * Setter for payloadType
	 * @param value The payload type describes the acceptable content that can be communicated on the endpoint.
	 */
	public void setPayloadType(ArrayList<CodeableConcept> value) { payloadType = value; }


	@Expose
	private ArrayList<String> payloadMimeType;

	/**
	 * Getter for payloadMimeType
	 * @return The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType).
	 */
	public ArrayList<String> getPayloadMimeType() { return payloadMimeType; }

	/**
	 * Setter for payloadMimeType
	 * @param value The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType).
	 */
	public void setPayloadMimeType(ArrayList<String> value) { payloadMimeType = value; }


	@Expose
	private String address;

	/**
	 * Getter for address
	 * @return The uri that describes the actual end-point to connect to.
	 */
	public String getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value The uri that describes the actual end-point to connect to.
	 */
	public void setAddress(String value) { address = value; }


	@Expose
	private ArrayList<String> header;

	/**
	 * Getter for header
	 * @return Additional headers / information to send as part of the notification.
	 */
	public ArrayList<String> getHeader() { return header; }

	/**
	 * Setter for header
	 * @param value Additional headers / information to send as part of the notification.
	 */
	public void setHeader(ArrayList<String> value) { header = value; }


}
