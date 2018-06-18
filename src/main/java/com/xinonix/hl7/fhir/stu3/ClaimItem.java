package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class ClaimItem extends BackboneElement {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return A service line number.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value A service line number.
	 */
	public void setSequence(Integer value) { sequence = value; }


	@Expose
	private ArrayList<Integer> careTeamLinkId;

	/**
	 * Getter for careTeamLinkId
	 * @return CareTeam applicable for this service or product line.
	 */
	public ArrayList<Integer> getCareTeamLinkId() { return careTeamLinkId; }

	/**
	 * Setter for careTeamLinkId
	 * @param value CareTeam applicable for this service or product line.
	 */
	public void setCareTeamLinkId(ArrayList<Integer> value) { careTeamLinkId = value; }


	@Expose
	private ArrayList<Integer> diagnosisLinkId;

	/**
	 * Getter for diagnosisLinkId
	 * @return Diagnosis applicable for this service or product line.
	 */
	public ArrayList<Integer> getDiagnosisLinkId() { return diagnosisLinkId; }

	/**
	 * Setter for diagnosisLinkId
	 * @param value Diagnosis applicable for this service or product line.
	 */
	public void setDiagnosisLinkId(ArrayList<Integer> value) { diagnosisLinkId = value; }


	@Expose
	private ArrayList<Integer> procedureLinkId;

	/**
	 * Getter for procedureLinkId
	 * @return Procedures applicable for this service or product line.
	 */
	public ArrayList<Integer> getProcedureLinkId() { return procedureLinkId; }

	/**
	 * Setter for procedureLinkId
	 * @param value Procedures applicable for this service or product line.
	 */
	public void setProcedureLinkId(ArrayList<Integer> value) { procedureLinkId = value; }


	@Expose
	private ArrayList<Integer> informationLinkId;

	/**
	 * Getter for informationLinkId
	 * @return Exceptions, special conditions and supporting information pplicable for this service or product line.
	 */
	public ArrayList<Integer> getInformationLinkId() { return informationLinkId; }

	/**
	 * Setter for informationLinkId
	 * @param value Exceptions, special conditions and supporting information pplicable for this service or product line.
	 */
	public void setInformationLinkId(ArrayList<Integer> value) { informationLinkId = value; }


	@Expose
	private CodeableConcept revenue;

	/**
	 * Getter for revenue
	 * @return The type of reveneu or cost center providing the product and/or service.
	 */
	public CodeableConcept getRevenue() { return revenue; }

	/**
	 * Setter for revenue
	 * @param value The type of reveneu or cost center providing the product and/or service.
	 */
	public void setRevenue(CodeableConcept value) { revenue = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Health Care Service Type Codes  to identify the classification of service or benefits.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Health Care Service Type Codes  to identify the classification of service or benefits.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept service;

	/**
	 * Getter for service
	 * @return If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,RXNorm,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
	 */
	public CodeableConcept getService() { return service; }

	/**
	 * Setter for service
	 * @param value If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,RXNorm,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
	 */
	public void setService(CodeableConcept value) { service = value; }


	@Expose
	private ArrayList<CodeableConcept> modifier;

	/**
	 * Getter for modifier
	 * @return Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
	 */
	public ArrayList<CodeableConcept> getModifier() { return modifier; }

	/**
	 * Setter for modifier
	 * @param value Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
	 */
	public void setModifier(ArrayList<CodeableConcept> value) { modifier = value; }


	@Expose
	private ArrayList<CodeableConcept> programCode;

	/**
	 * Getter for programCode
	 * @return For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program.
	 */
	public ArrayList<CodeableConcept> getProgramCode() { return programCode; }

	/**
	 * Setter for programCode
	 * @param value For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program.
	 */
	public void setProgramCode(ArrayList<CodeableConcept> value) { programCode = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date servicedDate;

	/**
	 * Getter for servicedDate
	 * @return The date or dates when the enclosed suite of services were performed or completed.
	 */
	public Date getServicedDate() { return servicedDate; }

	/**
	 * Setter for servicedDate
	 * @param value The date or dates when the enclosed suite of services were performed or completed.
	 */
	public void setServicedDate(Date value) { servicedDate = value; }


	@Expose
	private Period servicedPeriod;

	/**
	 * Getter for servicedPeriod
	 * @return The date or dates when the enclosed suite of services were performed or completed.
	 */
	public Period getServicedPeriod() { return servicedPeriod; }

	/**
	 * Setter for servicedPeriod
	 * @param value The date or dates when the enclosed suite of services were performed or completed.
	 */
	public void setServicedPeriod(Period value) { servicedPeriod = value; }


	@Expose
	private CodeableConcept locationCodeableConcept;

	/**
	 * Getter for locationCodeableConcept
	 * @return Where the service was provided.
	 */
	public CodeableConcept getLocationCodeableConcept() { return locationCodeableConcept; }

	/**
	 * Setter for locationCodeableConcept
	 * @param value Where the service was provided.
	 */
	public void setLocationCodeableConcept(CodeableConcept value) { locationCodeableConcept = value; }


	@Expose
	private Address locationAddress;

	/**
	 * Getter for locationAddress
	 * @return Where the service was provided.
	 */
	public Address getLocationAddress() { return locationAddress; }

	/**
	 * Setter for locationAddress
	 * @param value Where the service was provided.
	 */
	public void setLocationAddress(Address value) { locationAddress = value; }


	@Expose
	private Reference locationReference;

	/**
	 * Getter for locationReference
	 * @return Where the service was provided.
	 */
	public Reference getLocationReference() { return locationReference; }

	/**
	 * Setter for locationReference
	 * @param value Where the service was provided.
	 */
	public void setLocationReference(Reference value) { locationReference = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The number of repetitions of a service or product.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The number of repetitions of a service or product.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private Money unitPrice;

	/**
	 * Getter for unitPrice
	 * @return If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
	 */
	public Money getUnitPrice() { return unitPrice; }

	/**
	 * Setter for unitPrice
	 * @param value If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
	 */
	public void setUnitPrice(Money value) { unitPrice = value; }


	@Expose
	private Double factor;

	/**
	 * Getter for factor
	 * @return A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 */
	public Double getFactor() { return factor; }

	/**
	 * Setter for factor
	 * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 */
	public void setFactor(Double value) { factor = value; }


	@Expose
	private Money net;

	/**
	 * Getter for net
	 * @return The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 */
	public Money getNet() { return net; }

	/**
	 * Setter for net
	 * @param value The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 */
	public void setNet(Money value) { net = value; }


	@Expose
	private ArrayList<Reference> udi;

	/**
	 * Getter for udi
	 * @return List of Unique Device Identifiers associated with this line item.
	 */
	public ArrayList<Reference> getUdi() { return udi; }

	/**
	 * Setter for udi
	 * @param value List of Unique Device Identifiers associated with this line item.
	 */
	public void setUdi(ArrayList<Reference> value) { udi = value; }


	@Expose
	private CodeableConcept bodySite;

	/**
	 * Getter for bodySite
	 * @return Physical service site on the patient (limb, tooth, etc).
	 */
	public CodeableConcept getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value Physical service site on the patient (limb, tooth, etc).
	 */
	public void setBodySite(CodeableConcept value) { bodySite = value; }


	@Expose
	private ArrayList<CodeableConcept> subSite;

	/**
	 * Getter for subSite
	 * @return A region or surface of the site, eg. limb region or tooth surface(s).
	 */
	public ArrayList<CodeableConcept> getSubSite() { return subSite; }

	/**
	 * Setter for subSite
	 * @param value A region or surface of the site, eg. limb region or tooth surface(s).
	 */
	public void setSubSite(ArrayList<CodeableConcept> value) { subSite = value; }


	@Expose
	private ArrayList<Reference> encounter;

	/**
	 * Getter for encounter
	 * @return A billed item may include goods or services provided in multiple encounters.
	 */
	public ArrayList<Reference> getEncounter() { return encounter; }

	/**
	 * Setter for encounter
	 * @param value A billed item may include goods or services provided in multiple encounters.
	 */
	public void setEncounter(ArrayList<Reference> value) { encounter = value; }


	@Expose
	private ArrayList<ClaimDetail> detail;

	/**
	 * Getter for detail
	 * @return Second tier of goods and services.
	 */
	public ArrayList<ClaimDetail> getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value Second tier of goods and services.
	 */
	public void setDetail(ArrayList<ClaimDetail> value) { detail = value; }


}
