package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinitionExample extends BackboneElement {
	@Expose
	private String label;

	/**
	 * Getter for label
	 * @return Describes the purpose of this example amoung the set of examples.
	 */
	public String getLabel() { return label; }

	/**
	 * Setter for label
	 * @param value Describes the purpose of this example amoung the set of examples.
	 */
	public void setLabel(String value) { label = value; }


	@Expose
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


	@Expose
	private Integer valueInteger;

	/**
	 * Getter for valueInteger
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Integer getValueInteger() { return valueInteger; }

	/**
	 * Setter for valueInteger
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueInteger(Integer value) { valueInteger = value; }


	@Expose
	private Double valueDecimal;

	/**
	 * Getter for valueDecimal
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Double getValueDecimal() { return valueDecimal; }

	/**
	 * Setter for valueDecimal
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueDecimal(Double value) { valueDecimal = value; }


	@Expose
	private String valueBase64Binary;

	/**
	 * Getter for valueBase64Binary
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueBase64Binary() { return valueBase64Binary; }

	/**
	 * Setter for valueBase64Binary
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueBase64Binary(String value) { valueBase64Binary = value; }


	@Expose
	private String valueInstant;

	/**
	 * Getter for valueInstant
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueInstant() { return valueInstant; }

	/**
	 * Setter for valueInstant
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueInstant(String value) { valueInstant = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private String valueUri;

	/**
	 * Getter for valueUri
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueUri() { return valueUri; }

	/**
	 * Setter for valueUri
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueUri(String value) { valueUri = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date valueDate;

	/**
	 * Getter for valueDate
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Date getValueDate() { return valueDate; }

	/**
	 * Setter for valueDate
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueDate(Date value) { valueDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date valueDateTime;

	/**
	 * Getter for valueDateTime
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Date getValueDateTime() { return valueDateTime; }

	/**
	 * Setter for valueDateTime
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueDateTime(Date value) { valueDateTime = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date valueTime;

	/**
	 * Getter for valueTime
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Date getValueTime() { return valueTime; }

	/**
	 * Setter for valueTime
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueTime(Date value) { valueTime = value; }


	@Expose
	private String valueCode;

	/**
	 * Getter for valueCode
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueCode() { return valueCode; }

	/**
	 * Setter for valueCode
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueCode(String value) { valueCode = value; }


	@Expose
	private String valueOid;

	/**
	 * Getter for valueOid
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueOid() { return valueOid; }

	/**
	 * Setter for valueOid
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueOid(String value) { valueOid = value; }


	@Expose
	private String valueUuid;

	/**
	 * Getter for valueUuid
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueUuid() { return valueUuid; }

	/**
	 * Setter for valueUuid
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueUuid(String value) { valueUuid = value; }


	@Expose
	private String valueId;

	/**
	 * Getter for valueId
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueId() { return valueId; }

	/**
	 * Setter for valueId
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueId(String value) { valueId = value; }


	@Expose
	private Integer valueUnsignedInt;

	/**
	 * Getter for valueUnsignedInt
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Integer getValueUnsignedInt() { return valueUnsignedInt; }

	/**
	 * Setter for valueUnsignedInt
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueUnsignedInt(Integer value) { valueUnsignedInt = value; }


	@Expose
	private Integer valuePositiveInt;

	/**
	 * Getter for valuePositiveInt
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Integer getValuePositiveInt() { return valuePositiveInt; }

	/**
	 * Setter for valuePositiveInt
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValuePositiveInt(Integer value) { valuePositiveInt = value; }


	@Expose
	private String valueMarkdown;

	/**
	 * Getter for valueMarkdown
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public String getValueMarkdown() { return valueMarkdown; }

	/**
	 * Setter for valueMarkdown
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueMarkdown(String value) { valueMarkdown = value; }


	@Expose
	private Element valueElement;

	/**
	 * Getter for valueElement
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Element getValueElement() { return valueElement; }

	/**
	 * Setter for valueElement
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueElement(Element value) { valueElement = value; }


	@Expose
	private Extension valueExtension;

	/**
	 * Getter for valueExtension
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Extension getValueExtension() { return valueExtension; }

	/**
	 * Setter for valueExtension
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueExtension(Extension value) { valueExtension = value; }


	@Expose
	private BackboneElement valueBackboneElement;

	/**
	 * Getter for valueBackboneElement
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public BackboneElement getValueBackboneElement() { return valueBackboneElement; }

	/**
	 * Setter for valueBackboneElement
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueBackboneElement(BackboneElement value) { valueBackboneElement = value; }


	@Expose
	private Narrative valueNarrative;

	/**
	 * Getter for valueNarrative
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Narrative getValueNarrative() { return valueNarrative; }

	/**
	 * Setter for valueNarrative
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueNarrative(Narrative value) { valueNarrative = value; }


	@Expose
	private Annotation valueAnnotation;

	/**
	 * Getter for valueAnnotation
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Annotation getValueAnnotation() { return valueAnnotation; }

	/**
	 * Setter for valueAnnotation
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueAnnotation(Annotation value) { valueAnnotation = value; }


	@Expose
	private Attachment valueAttachment;

	/**
	 * Getter for valueAttachment
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Attachment getValueAttachment() { return valueAttachment; }

	/**
	 * Setter for valueAttachment
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueAttachment(Attachment value) { valueAttachment = value; }


	@Expose
	private Identifier valueIdentifier;

	/**
	 * Getter for valueIdentifier
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Identifier getValueIdentifier() { return valueIdentifier; }

	/**
	 * Setter for valueIdentifier
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueIdentifier(Identifier value) { valueIdentifier = value; }


	@Expose
	private CodeableConcept valueCodeableConcept;

	/**
	 * Getter for valueCodeableConcept
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public CodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }

	/**
	 * Setter for valueCodeableConcept
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueCodeableConcept(CodeableConcept value) { valueCodeableConcept = value; }


	@Expose
	private Coding valueCoding;

	/**
	 * Getter for valueCoding
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Coding getValueCoding() { return valueCoding; }

	/**
	 * Setter for valueCoding
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueCoding(Coding value) { valueCoding = value; }


	@Expose
	private Quantity valueQuantity;

	/**
	 * Getter for valueQuantity
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Quantity getValueQuantity() { return valueQuantity; }

	/**
	 * Setter for valueQuantity
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueQuantity(Quantity value) { valueQuantity = value; }


	@Expose
	private Duration valueDuration;

	/**
	 * Getter for valueDuration
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Duration getValueDuration() { return valueDuration; }

	/**
	 * Setter for valueDuration
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueDuration(Duration value) { valueDuration = value; }


	@Expose
	private Quantity valueSimpleQuantity;

	/**
	 * Getter for valueSimpleQuantity
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Quantity getValueSimpleQuantity() { return valueSimpleQuantity; }

	/**
	 * Setter for valueSimpleQuantity
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueSimpleQuantity(Quantity value) { valueSimpleQuantity = value; }


	@Expose
	private Distance valueDistance;

	/**
	 * Getter for valueDistance
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Distance getValueDistance() { return valueDistance; }

	/**
	 * Setter for valueDistance
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueDistance(Distance value) { valueDistance = value; }


	@Expose
	private Count valueCount;

	/**
	 * Getter for valueCount
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Count getValueCount() { return valueCount; }

	/**
	 * Setter for valueCount
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueCount(Count value) { valueCount = value; }


	@Expose
	private Money valueMoney;

	/**
	 * Getter for valueMoney
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Money getValueMoney() { return valueMoney; }

	/**
	 * Setter for valueMoney
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueMoney(Money value) { valueMoney = value; }


	@Expose
	private Age valueAge;

	/**
	 * Getter for valueAge
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Age getValueAge() { return valueAge; }

	/**
	 * Setter for valueAge
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueAge(Age value) { valueAge = value; }


	@Expose
	private Range valueRange;

	/**
	 * Getter for valueRange
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Range getValueRange() { return valueRange; }

	/**
	 * Setter for valueRange
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueRange(Range value) { valueRange = value; }


	@Expose
	private Period valuePeriod;

	/**
	 * Getter for valuePeriod
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Period getValuePeriod() { return valuePeriod; }

	/**
	 * Setter for valuePeriod
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValuePeriod(Period value) { valuePeriod = value; }


	@Expose
	private Ratio valueRatio;

	/**
	 * Getter for valueRatio
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Ratio getValueRatio() { return valueRatio; }

	/**
	 * Setter for valueRatio
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueRatio(Ratio value) { valueRatio = value; }


	@Expose
	private Reference valueReference;

	/**
	 * Getter for valueReference
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Reference getValueReference() { return valueReference; }

	/**
	 * Setter for valueReference
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueReference(Reference value) { valueReference = value; }


	@Expose
	private SampledData valueSampledData;

	/**
	 * Getter for valueSampledData
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public SampledData getValueSampledData() { return valueSampledData; }

	/**
	 * Setter for valueSampledData
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueSampledData(SampledData value) { valueSampledData = value; }


	@Expose
	private Signature valueSignature;

	/**
	 * Getter for valueSignature
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Signature getValueSignature() { return valueSignature; }

	/**
	 * Setter for valueSignature
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueSignature(Signature value) { valueSignature = value; }


	@Expose
	private HumanName valueHumanName;

	/**
	 * Getter for valueHumanName
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public HumanName getValueHumanName() { return valueHumanName; }

	/**
	 * Setter for valueHumanName
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueHumanName(HumanName value) { valueHumanName = value; }


	@Expose
	private Address valueAddress;

	/**
	 * Getter for valueAddress
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Address getValueAddress() { return valueAddress; }

	/**
	 * Setter for valueAddress
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueAddress(Address value) { valueAddress = value; }


	@Expose
	private ContactPoint valueContactPoint;

	/**
	 * Getter for valueContactPoint
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public ContactPoint getValueContactPoint() { return valueContactPoint; }

	/**
	 * Setter for valueContactPoint
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueContactPoint(ContactPoint value) { valueContactPoint = value; }


	@Expose
	private Timing valueTiming;

	/**
	 * Getter for valueTiming
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Timing getValueTiming() { return valueTiming; }

	/**
	 * Setter for valueTiming
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueTiming(Timing value) { valueTiming = value; }


	@Expose
	private Meta valueMeta;

	/**
	 * Getter for valueMeta
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Meta getValueMeta() { return valueMeta; }

	/**
	 * Setter for valueMeta
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueMeta(Meta value) { valueMeta = value; }


	@Expose
	private ElementDefinition valueElementDefinition;

	/**
	 * Getter for valueElementDefinition
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public ElementDefinition getValueElementDefinition() { return valueElementDefinition; }

	/**
	 * Setter for valueElementDefinition
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueElementDefinition(ElementDefinition value) { valueElementDefinition = value; }


	@Expose
	private ContactDetail valueContactDetail;

	/**
	 * Getter for valueContactDetail
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public ContactDetail getValueContactDetail() { return valueContactDetail; }

	/**
	 * Setter for valueContactDetail
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueContactDetail(ContactDetail value) { valueContactDetail = value; }


	@Expose
	private Contributor valueContributor;

	/**
	 * Getter for valueContributor
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Contributor getValueContributor() { return valueContributor; }

	/**
	 * Setter for valueContributor
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueContributor(Contributor value) { valueContributor = value; }


	@Expose
	private Dosage valueDosage;

	/**
	 * Getter for valueDosage
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public Dosage getValueDosage() { return valueDosage; }

	/**
	 * Setter for valueDosage
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueDosage(Dosage value) { valueDosage = value; }


	@Expose
	private RelatedArtifact valueRelatedArtifact;

	/**
	 * Getter for valueRelatedArtifact
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public RelatedArtifact getValueRelatedArtifact() { return valueRelatedArtifact; }

	/**
	 * Setter for valueRelatedArtifact
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueRelatedArtifact(RelatedArtifact value) { valueRelatedArtifact = value; }


	@Expose
	private UsageContext valueUsageContext;

	/**
	 * Getter for valueUsageContext
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public UsageContext getValueUsageContext() { return valueUsageContext; }

	/**
	 * Setter for valueUsageContext
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueUsageContext(UsageContext value) { valueUsageContext = value; }


	@Expose
	private DataRequirement valueDataRequirement;

	/**
	 * Getter for valueDataRequirement
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public DataRequirement getValueDataRequirement() { return valueDataRequirement; }

	/**
	 * Setter for valueDataRequirement
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueDataRequirement(DataRequirement value) { valueDataRequirement = value; }


	@Expose
	private ParameterDefinition valueParameterDefinition;

	/**
	 * Getter for valueParameterDefinition
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public ParameterDefinition getValueParameterDefinition() { return valueParameterDefinition; }

	/**
	 * Setter for valueParameterDefinition
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueParameterDefinition(ParameterDefinition value) { valueParameterDefinition = value; }


	@Expose
	private TriggerDefinition valueTriggerDefinition;

	/**
	 * Getter for valueTriggerDefinition
	 * @return The actual value for the element, which must be one of the types allowed for this element.
	 */
	public TriggerDefinition getValueTriggerDefinition() { return valueTriggerDefinition; }

	/**
	 * Setter for valueTriggerDefinition
	 * @param value The actual value for the element, which must be one of the types allowed for this element.
	 */
	public void setValueTriggerDefinition(TriggerDefinition value) { valueTriggerDefinition = value; }


}
