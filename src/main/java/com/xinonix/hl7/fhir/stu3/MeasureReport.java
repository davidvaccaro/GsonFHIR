package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * The MeasureReport resource contains the results of evaluating a measure.
 */
public class MeasureReport extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a MeasureReport resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a MeasureReport resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this report when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this report when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	public enum Status{
		@SerializedName("complete") COMPLETE,
		@SerializedName("pending") PENDING,
		@SerializedName("error") ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The report status. No data will be available until the report status is complete.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The report status. No data will be available until the report status is complete.
	 */
	public void setStatus(Status value) { status = value; }


	public enum Type{
		@SerializedName("individual") INDIVIDUAL,
		@SerializedName("patient-list") PATIENT_LIST,
		@SerializedName("summary") SUMMARY
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of measure report. This may be an individual report, which provides a single patient's score for the measure; a patient listing, which returns the list of patients that meet the various criteria in the measure; or a summary report, which returns a population count for each of the criteria in the measure.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of measure report. This may be an individual report, which provides a single patient's score for the measure; a patient listing, which returns the list of patients that meet the various criteria in the measure; or a summary report, which returns a population count for each of the criteria in the measure.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private Reference measure;

	/**
	 * Getter for measure
	 * @return A reference to the Measure that was evaluated to produce this report.
	 */
	public Reference getMeasure() { return measure; }

	/**
	 * Setter for measure
	 * @param value A reference to the Measure that was evaluated to produce this report.
	 */
	public void setMeasure(Reference value) { measure = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return Optional Patient if the report was requested for a single patient.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value Optional Patient if the report was requested for a single patient.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date this measure report was generated.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date this measure report was generated.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Reference reportingOrganization;

	/**
	 * Getter for reportingOrganization
	 * @return Reporting Organization.
	 */
	public Reference getReportingOrganization() { return reportingOrganization; }

	/**
	 * Setter for reportingOrganization
	 * @param value Reporting Organization.
	 */
	public void setReportingOrganization(Reference value) { reportingOrganization = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The reporting period for which the report was calculated.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The reporting period for which the report was calculated.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<MeasureReportGroup> group;

	/**
	 * Getter for group
	 * @return The results of the calculation, one for each population group in the measure.
	 */
	public ArrayList<MeasureReportGroup> getGroup() { return group; }

	/**
	 * Setter for group
	 * @param value The results of the calculation, one for each population group in the measure.
	 */
	public void setGroup(ArrayList<MeasureReportGroup> value) { group = value; }


	@Expose
	private Reference evaluatedResources;

	/**
	 * Getter for evaluatedResources
	 * @return A reference to a Bundle containing the Resources that were used in the evaluation of this report.
	 */
	public Reference getEvaluatedResources() { return evaluatedResources; }

	/**
	 * Setter for evaluatedResources
	 * @param value A reference to a Bundle containing the Resources that were used in the evaluation of this report.
	 */
	public void setEvaluatedResources(Reference value) { evaluatedResources = value; }


}
