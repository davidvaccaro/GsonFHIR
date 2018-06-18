package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 */
public class Immunization extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Immunization resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Immunization resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A unique identifier assigned to this immunization record.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A unique identifier assigned to this immunization record.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return Indicates the current status of the vaccination event.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Indicates the current status of the vaccination event.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private boolean notGiven;

	/**
	 * Getter for notGiven
	 * @return Indicates if the vaccination was or was not given.
	 */
	public boolean getNotGiven() { return notGiven; }

	/**
	 * Setter for notGiven
	 * @param value Indicates if the vaccination was or was not given.
	 */
	public void setNotGiven(boolean value) { notGiven = value; }


	@Expose
	private CodeableConcept vaccineCode;

	/**
	 * Getter for vaccineCode
	 * @return Vaccine that was administered or was to be administered.
	 */
	public CodeableConcept getVaccineCode() { return vaccineCode; }

	/**
	 * Setter for vaccineCode
	 * @param value Vaccine that was administered or was to be administered.
	 */
	public void setVaccineCode(CodeableConcept value) { vaccineCode = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The patient who either received or did not receive the immunization.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The patient who either received or did not receive the immunization.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Reference encounter;

	/**
	 * Getter for encounter
	 * @return The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
	 */
	public Reference getEncounter() { return encounter; }

	/**
	 * Setter for encounter
	 * @param value The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
	 */
	public void setEncounter(Reference value) { encounter = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return Date vaccine administered or was to be administered.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value Date vaccine administered or was to be administered.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private boolean primarySource;

	/**
	 * Getter for primarySource
	 * @return An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded.
	 */
	public boolean getPrimarySource() { return primarySource; }

	/**
	 * Setter for primarySource
	 * @param value An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded.
	 */
	public void setPrimarySource(boolean value) { primarySource = value; }


	@Expose
	private CodeableConcept reportOrigin;

	/**
	 * Getter for reportOrigin
	 * @return The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.
	 */
	public CodeableConcept getReportOrigin() { return reportOrigin; }

	/**
	 * Setter for reportOrigin
	 * @param value The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.
	 */
	public void setReportOrigin(CodeableConcept value) { reportOrigin = value; }


	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return The service delivery location where the vaccine administration occurred.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value The service delivery location where the vaccine administration occurred.
	 */
	public void setLocation(Reference value) { location = value; }


	@Expose
	private Reference manufacturer;

	/**
	 * Getter for manufacturer
	 * @return Name of vaccine manufacturer.
	 */
	public Reference getManufacturer() { return manufacturer; }

	/**
	 * Setter for manufacturer
	 * @param value Name of vaccine manufacturer.
	 */
	public void setManufacturer(Reference value) { manufacturer = value; }


	@Expose
	private String lotNumber;

	/**
	 * Getter for lotNumber
	 * @return Lot number of the  vaccine product.
	 */
	public String getLotNumber() { return lotNumber; }

	/**
	 * Setter for lotNumber
	 * @param value Lot number of the  vaccine product.
	 */
	public void setLotNumber(String value) { lotNumber = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date expirationDate;

	/**
	 * Getter for expirationDate
	 * @return Date vaccine batch expires.
	 */
	public Date getExpirationDate() { return expirationDate; }

	/**
	 * Setter for expirationDate
	 * @param value Date vaccine batch expires.
	 */
	public void setExpirationDate(Date value) { expirationDate = value; }


	@Expose
	private CodeableConcept site;

	/**
	 * Getter for site
	 * @return Body site where vaccine was administered.
	 */
	public CodeableConcept getSite() { return site; }

	/**
	 * Setter for site
	 * @param value Body site where vaccine was administered.
	 */
	public void setSite(CodeableConcept value) { site = value; }


	@Expose
	private CodeableConcept route;

	/**
	 * Getter for route
	 * @return The path by which the vaccine product is taken into the body.
	 */
	public CodeableConcept getRoute() { return route; }

	/**
	 * Setter for route
	 * @param value The path by which the vaccine product is taken into the body.
	 */
	public void setRoute(CodeableConcept value) { route = value; }


	@Expose
	private Quantity doseQuantity;

	/**
	 * Getter for doseQuantity
	 * @return The quantity of vaccine product that was administered.
	 */
	public Quantity getDoseQuantity() { return doseQuantity; }

	/**
	 * Setter for doseQuantity
	 * @param value The quantity of vaccine product that was administered.
	 */
	public void setDoseQuantity(Quantity value) { doseQuantity = value; }


	@Expose
	private ArrayList<ImmunizationPractitioner> practitioner;

	/**
	 * Getter for practitioner
	 * @return Indicates who or what performed the event.
	 */
	public ArrayList<ImmunizationPractitioner> getPractitioner() { return practitioner; }

	/**
	 * Setter for practitioner
	 * @param value Indicates who or what performed the event.
	 */
	public void setPractitioner(ArrayList<ImmunizationPractitioner> value) { practitioner = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Extra information about the immunization that is not conveyed by the other attributes.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Extra information about the immunization that is not conveyed by the other attributes.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ImmunizationExplanation explanation;

	/**
	 * Getter for explanation
	 * @return Reasons why a vaccine was or was not administered.
	 */
	public ImmunizationExplanation getExplanation() { return explanation; }

	/**
	 * Setter for explanation
	 * @param value Reasons why a vaccine was or was not administered.
	 */
	public void setExplanation(ImmunizationExplanation value) { explanation = value; }


	@Expose
	private ArrayList<ImmunizationReaction> reaction;

	/**
	 * Getter for reaction
	 * @return Categorical data indicating that an adverse event is associated in time to an immunization.
	 */
	public ArrayList<ImmunizationReaction> getReaction() { return reaction; }

	/**
	 * Setter for reaction
	 * @param value Categorical data indicating that an adverse event is associated in time to an immunization.
	 */
	public void setReaction(ArrayList<ImmunizationReaction> value) { reaction = value; }


	@Expose
	private ArrayList<ImmunizationVaccinationProtocol> vaccinationProtocol;

	/**
	 * Getter for vaccinationProtocol
	 * @return Contains information about the protocol(s) under which the vaccine was administered.
	 */
	public ArrayList<ImmunizationVaccinationProtocol> getVaccinationProtocol() { return vaccinationProtocol; }

	/**
	 * Setter for vaccinationProtocol
	 * @param value Contains information about the protocol(s) under which the vaccine was administered.
	 */
	public void setVaccinationProtocol(ArrayList<ImmunizationVaccinationProtocol> value) { vaccinationProtocol = value; }


}
