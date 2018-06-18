package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 */
public class EpisodeOfCare extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a EpisodeOfCare resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a EpisodeOfCare resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("planned") PLANNED,
		@SerializedName("waitlist") WAITLIST,
		@SerializedName("active") ACTIVE,
		@SerializedName("onhold") ONHOLD,
		@SerializedName("finished") FINISHED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return planned | waitlist | active | onhold | finished | cancelled.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value planned | waitlist | active | onhold | finished | cancelled.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<EpisodeOfCareStatusHistory> statusHistory;

	/**
	 * Getter for statusHistory
	 * @return The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
	 */
	public ArrayList<EpisodeOfCareStatusHistory> getStatusHistory() { return statusHistory; }

	/**
	 * Setter for statusHistory
	 * @param value The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
	 */
	public void setStatusHistory(ArrayList<EpisodeOfCareStatusHistory> value) { statusHistory = value; }


	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


	@Expose
	private ArrayList<EpisodeOfCareDiagnosis> diagnosis;

	/**
	 * Getter for diagnosis
	 * @return The list of diagnosis relevant to this episode of care.
	 */
	public ArrayList<EpisodeOfCareDiagnosis> getDiagnosis() { return diagnosis; }

	/**
	 * Setter for diagnosis
	 * @param value The list of diagnosis relevant to this episode of care.
	 */
	public void setDiagnosis(ArrayList<EpisodeOfCareDiagnosis> value) { diagnosis = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The patient who is the focus of this episode of care.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The patient who is the focus of this episode of care.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Reference managingOrganization;

	/**
	 * Getter for managingOrganization
	 * @return The organization that has assumed the specific responsibilities for the specified duration.
	 */
	public Reference getManagingOrganization() { return managingOrganization; }

	/**
	 * Setter for managingOrganization
	 * @param value The organization that has assumed the specific responsibilities for the specified duration.
	 */
	public void setManagingOrganization(Reference value) { managingOrganization = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The interval during which the managing organization assumes the defined responsibility.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The interval during which the managing organization assumes the defined responsibility.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<Reference> referralRequest;

	/**
	 * Getter for referralRequest
	 * @return Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
	 */
	public ArrayList<Reference> getReferralRequest() { return referralRequest; }

	/**
	 * Setter for referralRequest
	 * @param value Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
	 */
	public void setReferralRequest(ArrayList<Reference> value) { referralRequest = value; }


	@Expose
	private Reference careManager;

	/**
	 * Getter for careManager
	 * @return The practitioner that is the care manager/care co-ordinator for this patient.
	 */
	public Reference getCareManager() { return careManager; }

	/**
	 * Setter for careManager
	 * @param value The practitioner that is the care manager/care co-ordinator for this patient.
	 */
	public void setCareManager(Reference value) { careManager = value; }


	@Expose
	private ArrayList<Reference> team;

	/**
	 * Getter for team
	 * @return The list of practitioners that may be facilitating this episode of care for specific purposes.
	 */
	public ArrayList<Reference> getTeam() { return team; }

	/**
	 * Setter for team
	 * @param value The list of practitioners that may be facilitating this episode of care for specific purposes.
	 */
	public void setTeam(ArrayList<Reference> value) { team = value; }


	@Expose
	private ArrayList<Reference> account;

	/**
	 * Getter for account
	 * @return The set of accounts that may be used for billing for this EpisodeOfCare.
	 */
	public ArrayList<Reference> getAccount() { return account; }

	/**
	 * Setter for account
	 * @param value The set of accounts that may be used for billing for this EpisodeOfCare.
	 */
	public void setAccount(ArrayList<Reference> value) { account = value; }


}
