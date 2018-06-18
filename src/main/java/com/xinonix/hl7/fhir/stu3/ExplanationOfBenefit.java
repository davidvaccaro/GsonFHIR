package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefit extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ExplanationOfBenefit resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ExplanationOfBenefit resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return The EOB Business Identifier.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The EOB Business Identifier.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("draft") DRAFT,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of the resource instance.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the resource instance.
	 */
	public void setStatus(Status value) { status = value; }


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
	 * @return The date when the EOB was created.
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value The date when the EOB was created.
	 */
	public void setCreated(Date value) { created = value; }


	@Expose
	private Reference enterer;

	/**
	 * Getter for enterer
	 * @return The person who created the explanation of benefit.
	 */
	public Reference getEnterer() { return enterer; }

	/**
	 * Setter for enterer
	 * @param value The person who created the explanation of benefit.
	 */
	public void setEnterer(Reference value) { enterer = value; }


	@Expose
	private Reference insurer;

	/**
	 * Getter for insurer
	 * @return The insurer which is responsible for the explanation of benefit.
	 */
	public Reference getInsurer() { return insurer; }

	/**
	 * Setter for insurer
	 * @param value The insurer which is responsible for the explanation of benefit.
	 */
	public void setInsurer(Reference value) { insurer = value; }


	@Expose
	private Reference provider;

	/**
	 * Getter for provider
	 * @return The provider which is responsible for the claim.
	 */
	public Reference getProvider() { return provider; }

	/**
	 * Setter for provider
	 * @param value The provider which is responsible for the claim.
	 */
	public void setProvider(Reference value) { provider = value; }


	@Expose
	private Reference organization;

	/**
	 * Getter for organization
	 * @return The provider which is responsible for the claim.
	 */
	public Reference getOrganization() { return organization; }

	/**
	 * Setter for organization
	 * @param value The provider which is responsible for the claim.
	 */
	public void setOrganization(Reference value) { organization = value; }


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
	private Reference claim;

	/**
	 * Getter for claim
	 * @return The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 */
	public Reference getClaim() { return claim; }

	/**
	 * Setter for claim
	 * @param value The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 */
	public void setClaim(Reference value) { claim = value; }


	@Expose
	private Reference claimResponse;

	/**
	 * Getter for claimResponse
	 * @return The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 */
	public Reference getClaimResponse() { return claimResponse; }

	/**
	 * Setter for claimResponse
	 * @param value The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 */
	public void setClaimResponse(Reference value) { claimResponse = value; }


	@Expose
	private CodeableConcept outcome;

	/**
	 * Getter for outcome
	 * @return Processing outcome errror, partial or complete processing.
	 */
	public CodeableConcept getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value Processing outcome errror, partial or complete processing.
	 */
	public void setOutcome(CodeableConcept value) { outcome = value; }


	@Expose
	private String disposition;

	/**
	 * Getter for disposition
	 * @return A description of the status of the adjudication.
	 */
	public String getDisposition() { return disposition; }

	/**
	 * Setter for disposition
	 * @param value A description of the status of the adjudication.
	 */
	public void setDisposition(String value) { disposition = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitRelated> related;

	/**
	 * Getter for related
	 * @return Other claims which are related to this claim such as prior claim versions or for related services.
	 */
	public ArrayList<ExplanationOfBenefitRelated> getRelated() { return related; }

	/**
	 * Setter for related
	 * @param value Other claims which are related to this claim such as prior claim versions or for related services.
	 */
	public void setRelated(ArrayList<ExplanationOfBenefitRelated> value) { related = value; }


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
	private ExplanationOfBenefitPayee payee;

	/**
	 * Getter for payee
	 * @return The party to be reimbursed for the services.
	 */
	public ExplanationOfBenefitPayee getPayee() { return payee; }

	/**
	 * Setter for payee
	 * @param value The party to be reimbursed for the services.
	 */
	public void setPayee(ExplanationOfBenefitPayee value) { payee = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitInformation> information;

	/**
	 * Getter for information
	 * @return Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
	 */
	public ArrayList<ExplanationOfBenefitInformation> getInformation() { return information; }

	/**
	 * Setter for information
	 * @param value Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
	 */
	public void setInformation(ArrayList<ExplanationOfBenefitInformation> value) { information = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitCareTeam> careTeam;

	/**
	 * Getter for careTeam
	 * @return The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
	 */
	public ArrayList<ExplanationOfBenefitCareTeam> getCareTeam() { return careTeam; }

	/**
	 * Setter for careTeam
	 * @param value The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
	 */
	public void setCareTeam(ArrayList<ExplanationOfBenefitCareTeam> value) { careTeam = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitDiagnosis> diagnosis;

	/**
	 * Getter for diagnosis
	 * @return Ordered list of patient diagnosis for which care is sought.
	 */
	public ArrayList<ExplanationOfBenefitDiagnosis> getDiagnosis() { return diagnosis; }

	/**
	 * Setter for diagnosis
	 * @param value Ordered list of patient diagnosis for which care is sought.
	 */
	public void setDiagnosis(ArrayList<ExplanationOfBenefitDiagnosis> value) { diagnosis = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitProcedure> procedure;

	/**
	 * Getter for procedure
	 * @return Ordered list of patient procedures performed to support the adjudication.
	 */
	public ArrayList<ExplanationOfBenefitProcedure> getProcedure() { return procedure; }

	/**
	 * Setter for procedure
	 * @param value Ordered list of patient procedures performed to support the adjudication.
	 */
	public void setProcedure(ArrayList<ExplanationOfBenefitProcedure> value) { procedure = value; }


	@Expose
	private Integer precedence;

	/**
	 * Getter for precedence
	 * @return Precedence (primary, secondary, etc.).
	 */
	public Integer getPrecedence() { return precedence; }

	/**
	 * Setter for precedence
	 * @param value Precedence (primary, secondary, etc.).
	 */
	public void setPrecedence(Integer value) { precedence = value; }


	@Expose
	private ExplanationOfBenefitInsurance insurance;

	/**
	 * Getter for insurance
	 * @return Financial instrument by which payment information for health care.
	 */
	public ExplanationOfBenefitInsurance getInsurance() { return insurance; }

	/**
	 * Setter for insurance
	 * @param value Financial instrument by which payment information for health care.
	 */
	public void setInsurance(ExplanationOfBenefitInsurance value) { insurance = value; }


	@Expose
	private ExplanationOfBenefitAccident accident;

	/**
	 * Getter for accident
	 * @return An accident which resulted in the need for healthcare services.
	 */
	public ExplanationOfBenefitAccident getAccident() { return accident; }

	/**
	 * Setter for accident
	 * @param value An accident which resulted in the need for healthcare services.
	 */
	public void setAccident(ExplanationOfBenefitAccident value) { accident = value; }


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
	private ArrayList<ExplanationOfBenefitItem> item;

	/**
	 * Getter for item
	 * @return First tier of goods and services.
	 */
	public ArrayList<ExplanationOfBenefitItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value First tier of goods and services.
	 */
	public void setItem(ArrayList<ExplanationOfBenefitItem> value) { item = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitAddItem> addItem;

	/**
	 * Getter for addItem
	 * @return The first tier service adjudications for payor added services.
	 */
	public ArrayList<ExplanationOfBenefitAddItem> getAddItem() { return addItem; }

	/**
	 * Setter for addItem
	 * @param value The first tier service adjudications for payor added services.
	 */
	public void setAddItem(ArrayList<ExplanationOfBenefitAddItem> value) { addItem = value; }


	@Expose
	private Money totalCost;

	/**
	 * Getter for totalCost
	 * @return The total cost of the services reported.
	 */
	public Money getTotalCost() { return totalCost; }

	/**
	 * Setter for totalCost
	 * @param value The total cost of the services reported.
	 */
	public void setTotalCost(Money value) { totalCost = value; }


	@Expose
	private Money unallocDeductable;

	/**
	 * Getter for unallocDeductable
	 * @return The amount of deductable applied which was not allocated to any particular service line.
	 */
	public Money getUnallocDeductable() { return unallocDeductable; }

	/**
	 * Setter for unallocDeductable
	 * @param value The amount of deductable applied which was not allocated to any particular service line.
	 */
	public void setUnallocDeductable(Money value) { unallocDeductable = value; }


	@Expose
	private Money totalBenefit;

	/**
	 * Getter for totalBenefit
	 * @return Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductable).
	 */
	public Money getTotalBenefit() { return totalBenefit; }

	/**
	 * Setter for totalBenefit
	 * @param value Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductable).
	 */
	public void setTotalBenefit(Money value) { totalBenefit = value; }


	@Expose
	private ExplanationOfBenefitPayment payment;

	/**
	 * Getter for payment
	 * @return Payment details for the claim if the claim has been paid.
	 */
	public ExplanationOfBenefitPayment getPayment() { return payment; }

	/**
	 * Setter for payment
	 * @param value Payment details for the claim if the claim has been paid.
	 */
	public void setPayment(ExplanationOfBenefitPayment value) { payment = value; }


	@Expose
	private CodeableConcept form;

	/**
	 * Getter for form
	 * @return The form to be used for printing the content.
	 */
	public CodeableConcept getForm() { return form; }

	/**
	 * Setter for form
	 * @param value The form to be used for printing the content.
	 */
	public void setForm(CodeableConcept value) { form = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitProcessNote> processNote;

	/**
	 * Getter for processNote
	 * @return Note text.
	 */
	public ArrayList<ExplanationOfBenefitProcessNote> getProcessNote() { return processNote; }

	/**
	 * Setter for processNote
	 * @param value Note text.
	 */
	public void setProcessNote(ArrayList<ExplanationOfBenefitProcessNote> value) { processNote = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitBenefitBalance> benefitBalance;

	/**
	 * Getter for benefitBalance
	 * @return Balance by Benefit Category.
	 */
	public ArrayList<ExplanationOfBenefitBenefitBalance> getBenefitBalance() { return benefitBalance; }

	/**
	 * Setter for benefitBalance
	 * @param value Balance by Benefit Category.
	 */
	public void setBenefitBalance(ArrayList<ExplanationOfBenefitBenefitBalance> value) { benefitBalance = value; }


}
