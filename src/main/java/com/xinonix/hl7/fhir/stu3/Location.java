package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 */
public class Location extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Location resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Location resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Unique code or number identifying the location to its users.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique code or number identifying the location to its users.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("suspended") SUSPENDED,
		@SerializedName("inactive") INACTIVE
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Coding operationalStatus;

	/**
	 * Getter for operationalStatus
	 * @return The Operational status covers operation values most relevant to beds (but can also apply to rooms/units/chair/etc such as an isolation unit/dialisys chair). This typically covers concepts such as contamination, housekeeping and other activities like maintenance.
	 */
	public Coding getOperationalStatus() { return operationalStatus; }

	/**
	 * Setter for operationalStatus
	 * @param value The Operational status covers operation values most relevant to beds (but can also apply to rooms/units/chair/etc such as an isolation unit/dialisys chair). This typically covers concepts such as contamination, housekeeping and other activities like maintenance.
	 */
	public void setOperationalStatus(Coding value) { operationalStatus = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Name of the location as used by humans. Does not need to be unique.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Name of the location as used by humans. Does not need to be unique.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private ArrayList<String> alias;

	/**
	 * Getter for alias
	 * @return A list of alternate names that the location is known as, or was known as in the past.
	 */
	public ArrayList<String> getAlias() { return alias; }

	/**
	 * Setter for alias
	 * @param value A list of alternate names that the location is known as, or was known as in the past.
	 */
	public void setAlias(ArrayList<String> value) { alias = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Description of the Location, which helps in finding or referencing the place.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Description of the Location, which helps in finding or referencing the place.
	 */
	public void setDescription(String value) { description = value; }


	public enum Mode{
		@SerializedName("instance") INSTANCE,
		@SerializedName("kind") KIND
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return Indicates whether a resource instance represents a specific location or a class of locations.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value Indicates whether a resource instance represents a specific location or a class of locations.
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Indicates the type of function performed at the location.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Indicates the type of function performed at the location.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
	 */
	public void setTelecom(ArrayList<ContactPoint> value) { telecom = value; }


	@Expose
	private Address address;

	/**
	 * Getter for address
	 * @return Physical location.
	 */
	public Address getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value Physical location.
	 */
	public void setAddress(Address value) { address = value; }


	@Expose
	private CodeableConcept physicalType;

	/**
	 * Getter for physicalType
	 * @return Physical form of the location, e.g. building, room, vehicle, road.
	 */
	public CodeableConcept getPhysicalType() { return physicalType; }

	/**
	 * Setter for physicalType
	 * @param value Physical form of the location, e.g. building, room, vehicle, road.
	 */
	public void setPhysicalType(CodeableConcept value) { physicalType = value; }


	@Expose
	private LocationPosition position;

	/**
	 * Getter for position
	 * @return The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).
	 */
	public LocationPosition getPosition() { return position; }

	/**
	 * Setter for position
	 * @param value The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).
	 */
	public void setPosition(LocationPosition value) { position = value; }


	@Expose
	private Reference managingOrganization;

	/**
	 * Getter for managingOrganization
	 * @return The organization responsible for the provisioning and upkeep of the location.
	 */
	public Reference getManagingOrganization() { return managingOrganization; }

	/**
	 * Setter for managingOrganization
	 * @param value The organization responsible for the provisioning and upkeep of the location.
	 */
	public void setManagingOrganization(Reference value) { managingOrganization = value; }


	@Expose
	private Reference partOf;

	/**
	 * Getter for partOf
	 * @return Another Location which this Location is physically part of.
	 */
	public Reference getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value Another Location which this Location is physically part of.
	 */
	public void setPartOf(Reference value) { partOf = value; }


	@Expose
	private ArrayList<Reference> endpoint;

	/**
	 * Getter for endpoint
	 * @return Technical endpoints providing access to services operated for the location.
	 */
	public ArrayList<Reference> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value Technical endpoints providing access to services operated for the location.
	 */
	public void setEndpoint(ArrayList<Reference> value) { endpoint = value; }


}
