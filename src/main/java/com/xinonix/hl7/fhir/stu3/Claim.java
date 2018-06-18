package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class Claim extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Claim resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Claim resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return The business identifier for the instance: claim number, pre-determination or pre-authorization number.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The business identifier for the instance: claim number, pre-determination or pre-authorization number.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the resource instance.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the resource instance.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return The category of claim, eg, oral, pharmacy, vision, insitutional, professional.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value The category of claim, eg, oral, pharmacy, vision, insitutional, professional.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private ArrayList<CodeableConcept> subType;

	/**
	 * Getter for subType
	 * @return A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType.
	 */
	public ArrayList<CodeableConcept> getSubType() { return subType; }

	/**
	 * Setter for subType
	 * @param value A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType.
	 */
	public void setSubType(ArrayList<CodeableConcept> value) { subType = value; }


	public enum Use{
		@SerializedName("complete") COMPLETE,
		@SerializedName("proposed") PROPOSED,
		@SerializedName("exploratory") EXPLORATORY,
		@SerializedName("other") OTHER
	}

	@Expose
	private Use use;

	/**
	 * Getter for use
	 * @return Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
	 */
	public Use getUse() { return use; }

	/**
	 * Setter for use
	 * @param value Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
	 */
	public void setUse(Use value) { use = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return Patient Resource.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value Patient Resource.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Period billablePeriod;

	/**
	 * Getter for billablePeriod
	 * @return The billable period for which charges are being submitted.
	 */
	public Period getBillablePeriod() { return billablePeriod; }

	/**
	 * Setter for billablePeriod
	 * @param value The billable period for which charges are being submitted.
	 */
	public void setBillablePeriod(Period value) { billablePeriod = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date created;

	/**
	 * Getter for created
	 * @return The date when the enclosed suite of services were performed or completed.
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value The date when the enclosed suite of services were performed or completed.
	 */
	public void setCreated(Date value) { created = value; }


	@Expose
	private Reference enterer;

	/**
	 * Getter for enterer
	 * @return Person who created the invoice/claim/pre-determination or pre-authorization.
	 */
	public Reference getEnterer() { return enterer; }

	/**
	 * Setter for enterer
	 * @param value Person who created the invoice/claim/pre-determination or pre-authorization.
	 */
	public void setEnterer(Reference value) { enterer = value; }


	@Expose
	private Reference insurer;

	/**
	 * Getter for insurer
	 * @return The Insurer who is target of the request.
	 */
	public Reference getInsurer() { return insurer; }

	/**
	 * Setter for insurer
	 * @param value The Insurer who is target of the request.
	 */
	public void setInsurer(Reference value) { insurer = value; }


	@Expose
	private Reference provider;

	/**
	 * Getter for provider
	 * @return The provider which is responsible for the bill, claim pre-determination, pre-authorization.
	 */
	public Reference getProvider() { return provider; }

	/**
	 * Setter for provider
	 * @param value The provider which is responsible for the bill, claim pre-determination, pre-authorization.
	 */
	public void setProvider(Reference value) { provider = value; }


	@Expose
	private Reference organization;

	/**
	 * Getter for organization
	 * @return The organization which is responsible for the bill, claim pre-determination, pre-authorization.
	 */
	public Reference getOrganization() { return organization; }

	/**
	 * Setter for organization
	 * @param value The organization which is responsible for the bill, claim pre-determination, pre-authorization.
	 */
	public void setOrganization(Reference value) { organization = value; }


	@Expose
	private CodeableConcept priority;

	/**
	 * Getter for priority
	 * @return Immediate (STAT), best effort (NORMAL), deferred (DEFER).
	 */
	public CodeableConcept getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Immediate (STAT), best effort (NORMAL), deferred (DEFER).
	 */
	public void setPriority(CodeableConcept value) { priority = value; }


	@Expose
	private CodeableConcept fundsReserve;

	/**
	 * Getter for fundsReserve
	 * @return In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.
	 */
	public CodeableConcept getFundsReserve() { return fundsReserve; }

	/**
	 * Setter for fundsReserve
	 * @param value In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.
	 */
	public void setFundsReserve(CodeableConcept value) { fundsReserve = value; }


	@Expose
	private ArrayList<ClaimRelated> related;

	/**
	 * Getter for related
	 * @return Other claims which are related to this claim such as prior claim versions or for related services.
	 */
	public ArrayList<ClaimRelated> getRelated() { return related; }

	/**
	 * Setter for related
	 * @param value Other claims which are related to this claim such as prior claim versions or for related services.
	 */
	public void setRelated(ArrayList<ClaimRelated> value) { related = value; }


	@Expose
	private Reference prescription;

	/**
	 * Getter for prescription
	 * @return Prescription to support the dispensing of Pharmacy or Vision products.
	 */
	public Reference getPrescription() { return prescription; }

	/**
	 * Setter for prescription
	 * @param value Prescription to support the dispensing of Pharmacy or Vision products.
	 */
	public void setPrescription(Reference value) { prescription = value; }


	@Expose
	private Reference originalPrescription;

	/**
	 * Getter for originalPrescription
	 * @return Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new precription for an alternate medication which has the same theraputic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'.
	 */
	public Reference getOriginalPrescription() { return originalPrescription; }

	/**
	 * Setter for originalPrescription
	 * @param value Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new precription for an alternate medication which has the same theraputic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'.
	 */
	public void setOriginalPrescription(Reference value) { originalPrescription = value; }


	@Expose
	private ClaimPayee payee;

	/**
	 * Getter for payee
	 * @return The party to be reimbursed for the services.
	 */
	public ClaimPayee getPayee() { return payee; }

	/**
	 * Setter for payee
	 * @param value The party to be reimbursed for the services.
	 */
	public void setPayee(ClaimPayee value) { payee = value; }


	@Expose
	private Reference referral;

	/**
	 * Getter for referral
	 * @return The referral resource which lists the date, practitioner, reason and other supporting information.
	 */
	public Reference getReferral() { return referral; }

	/**
	 * Setter for referral
	 * @param value The referral resource which lists the date, practitioner, reason and other supporting information.
	 */
	public void setReferral(Reference value) { referral = value; }


	@Expose
	private Reference facility;

	/**
	 * Getter for facility
	 * @return Facility where the services were provided.
	 */
	public Reference getFacility() { return facility; }

	/**
	 * Setter for facility
	 * @param value Facility where the services were provided.
	 */
	public void setFacility(Reference value) { facility = value; }


	@Expose
	private ArrayList<ClaimCareTeam> careTeam;

	/**
	 * Getter for careTeam
	 * @return The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
	 */
	public ArrayList<ClaimCareTeam> getCareTeam() { return careTeam; }

	/**
	 * Setter for careTeam
	 * @param value The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
	 */
	public void setCareTeam(ArrayList<ClaimCareTeam> value) { careTeam = value; }


	@Expose
	private ArrayList<ClaimInformation> information;

	/**
	 * Getter for information
	 * @return Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
	 */
	public ArrayList<ClaimInformation> getInformation() { return information; }

	/**
	 * Setter for information
	 * @param value Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
	 */
	public void setInformation(ArrayList<ClaimInformation> value) { information = value; }


	@Expose
	private ArrayList<ClaimDiagnosis> diagnosis;

	/**
	 * Getter for diagnosis
	 * @return List of patient diagnosis for which care is sought.
	 */
	public ArrayList<ClaimDiagnosis> getDiagnosis() { return diagnosis; }

	/**
	 * Setter for diagnosis
	 * @param value List of patient diagnosis for which care is sought.
	 */
	public void setDiagnosis(ArrayList<ClaimDiagnosis> value) { diagnosis = value; }


	@Expose
	private ArrayList<ClaimProcedure> procedure;

	/**
	 * Getter for procedure
	 * @return Ordered list of patient procedures performed to support the adjudication.
	 */
	public ArrayList<ClaimProcedure> getProcedure() { return procedure; }

	/**
	 * Setter for procedure
	 * @param value Ordered list of patient procedures performed to support the adjudication.
	 */
	public void setProcedure(ArrayList<ClaimProcedure> value) { procedure = value; }


	@Expose
	private ArrayList<ClaimInsurance> insurance;

	/**
	 * Getter for insurance
	 * @return Financial instrument by which payment information for health care.
	 */
	public ArrayList<ClaimInsurance> getInsurance() { return insurance; }

	/**
	 * Setter for insurance
	 * @param value Financial instrument by which payment information for health care.
	 */
	public void setInsurance(ArrayList<ClaimInsurance> value) { insurance = value; }


	@Expose
	private ClaimAccident accident;

	/**
	 * Getter for accident
	 * @return An accident which resulted in the need for healthcare services.
	 */
	public ClaimAccident getAccident() { return accident; }

	/**
	 * Setter for accident
	 * @param value An accident which resulted in the need for healthcare services.
	 */
	public void setAccident(ClaimAccident value) { accident = value; }


	@Expose
	private Period employmentImpacted;

	/**
	 * Getter for employmentImpacted
	 * @return The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).
	 */
	public Period getEmploymentImpacted() { return employmentImpacted; }

	/**
	 * Setter for employmentImpacted
	 * @param value The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).
	 */
	public void setEmploymentImpacted(Period value) { employmentImpacted = value; }


	@Expose
	private Period hospitalization;

	/**
	 * Getter for hospitalization
	 * @return The start and optional end dates of when the patient was confined to a treatment center.
	 */
	public Period getHospitalization() { return hospitalization; }

	/**
	 * Setter for hospitalization
	 * @param value The start and optional end dates of when the patient was confined to a treatment center.
	 */
	public void setHospitalization(Period value) { hospitalization = value; }


	@Expose
	private ArrayList<ClaimItem> item;

	/**
	 * Getter for item
	 * @return First tier of goods and services.
	 */
	public ArrayList<ClaimItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value First tier of goods and services.
	 */
	public void setItem(ArrayList<ClaimItem> value) { item = value; }


	@Expose
	private Money total;

	/**
	 * Getter for total
	 * @return The total value of the claim.
	 */
	public Money getTotal() { return total; }

	/**
	 * Setter for total
	 * @param value The total value of the claim.
	 */
	public void setTotal(Money value) { total = value; }


}
