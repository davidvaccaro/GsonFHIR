package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A task to be performed.
 */
public class TaskInput extends BackboneElement {
	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return A code or description indicating how the input is intended to be used as part of the task execution.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value A code or description indicating how the input is intended to be used as part of the task execution.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return The value of the input parameter as a basic type.
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


	@Expose
	private Integer valueInteger;

	/**
	 * Getter for valueInteger
	 * @return The value of the input parameter as a basic type.
	 */
	public Integer getValueInteger() { return valueInteger; }

	/**
	 * Setter for valueInteger
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueInteger(Integer value) { valueInteger = value; }


	@Expose
	private Double valueDecimal;

	/**
	 * Getter for valueDecimal
	 * @return The value of the input parameter as a basic type.
	 */
	public Double getValueDecimal() { return valueDecimal; }

	/**
	 * Setter for valueDecimal
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueDecimal(Double value) { valueDecimal = value; }


	@Expose
	private String valueBase64Binary;

	/**
	 * Getter for valueBase64Binary
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueBase64Binary() { return valueBase64Binary; }

	/**
	 * Setter for valueBase64Binary
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueBase64Binary(String value) { valueBase64Binary = value; }


	@Expose
	private String valueInstant;

	/**
	 * Getter for valueInstant
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueInstant() { return valueInstant; }

	/**
	 * Setter for valueInstant
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueInstant(String value) { valueInstant = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private String valueUri;

	/**
	 * Getter for valueUri
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueUri() { return valueUri; }

	/**
	 * Setter for valueUri
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueUri(String value) { valueUri = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date valueDate;

	/**
	 * Getter for valueDate
	 * @return The value of the input parameter as a basic type.
	 */
	public Date getValueDate() { return valueDate; }

	/**
	 * Setter for valueDate
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueDate(Date value) { valueDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date valueDateTime;

	/**
	 * Getter for valueDateTime
	 * @return The value of the input parameter as a basic type.
	 */
	public Date getValueDateTime() { return valueDateTime; }

	/**
	 * Setter for valueDateTime
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueDateTime(Date value) { valueDateTime = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date valueTime;

	/**
	 * Getter for valueTime
	 * @return The value of the input parameter as a basic type.
	 */
	public Date getValueTime() { return valueTime; }

	/**
	 * Setter for valueTime
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueTime(Date value) { valueTime = value; }


	@Expose
	private String valueCode;

	/**
	 * Getter for valueCode
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueCode() { return valueCode; }

	/**
	 * Setter for valueCode
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueCode(String value) { valueCode = value; }


	@Expose
	private String valueOid;

	/**
	 * Getter for valueOid
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueOid() { return valueOid; }

	/**
	 * Setter for valueOid
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueOid(String value) { valueOid = value; }


	@Expose
	private String valueUuid;

	/**
	 * Getter for valueUuid
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueUuid() { return valueUuid; }

	/**
	 * Setter for valueUuid
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueUuid(String value) { valueUuid = value; }


	@Expose
	private String valueId;

	/**
	 * Getter for valueId
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueId() { return valueId; }

	/**
	 * Setter for valueId
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueId(String value) { valueId = value; }


	@Expose
	private Integer valueUnsignedInt;

	/**
	 * Getter for valueUnsignedInt
	 * @return The value of the input parameter as a basic type.
	 */
	public Integer getValueUnsignedInt() { return valueUnsignedInt; }

	/**
	 * Setter for valueUnsignedInt
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueUnsignedInt(Integer value) { valueUnsignedInt = value; }


	@Expose
	private Integer valuePositiveInt;

	/**
	 * Getter for valuePositiveInt
	 * @return The value of the input parameter as a basic type.
	 */
	public Integer getValuePositiveInt() { return valuePositiveInt; }

	/**
	 * Setter for valuePositiveInt
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValuePositiveInt(Integer value) { valuePositiveInt = value; }


	@Expose
	private String valueMarkdown;

	/**
	 * Getter for valueMarkdown
	 * @return The value of the input parameter as a basic type.
	 */
	public String getValueMarkdown() { return valueMarkdown; }

	/**
	 * Setter for valueMarkdown
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueMarkdown(String value) { valueMarkdown = value; }


	@Expose
	private Element valueElement;

	/**
	 * Getter for valueElement
	 * @return The value of the input parameter as a basic type.
	 */
	public Element getValueElement() { return valueElement; }

	/**
	 * Setter for valueElement
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueElement(Element value) { valueElement = value; }


	@Expose
	private Extension valueExtension;

	/**
	 * Getter for valueExtension
	 * @return The value of the input parameter as a basic type.
	 */
	public Extension getValueExtension() { return valueExtension; }

	/**
	 * Setter for valueExtension
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueExtension(Extension value) { valueExtension = value; }


	@Expose
	private BackboneElement valueBackboneElement;

	/**
	 * Getter for valueBackboneElement
	 * @return The value of the input parameter as a basic type.
	 */
	public BackboneElement getValueBackboneElement() { return valueBackboneElement; }

	/**
	 * Setter for valueBackboneElement
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueBackboneElement(BackboneElement value) { valueBackboneElement = value; }


	@Expose
	private Narrative valueNarrative;

	/**
	 * Getter for valueNarrative
	 * @return The value of the input parameter as a basic type.
	 */
	public Narrative getValueNarrative() { return valueNarrative; }

	/**
	 * Setter for valueNarrative
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueNarrative(Narrative value) { valueNarrative = value; }


	@Expose
	private Annotation valueAnnotation;

	/**
	 * Getter for valueAnnotation
	 * @return The value of the input parameter as a basic type.
	 */
	public Annotation getValueAnnotation() { return valueAnnotation; }

	/**
	 * Setter for valueAnnotation
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueAnnotation(Annotation value) { valueAnnotation = value; }


	@Expose
	private Attachment valueAttachment;

	/**
	 * Getter for valueAttachment
	 * @return The value of the input parameter as a basic type.
	 */
	public Attachment getValueAttachment() { return valueAttachment; }

	/**
	 * Setter for valueAttachment
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueAttachment(Attachment value) { valueAttachment = value; }


	@Expose
	private Identifier valueIdentifier;

	/**
	 * Getter for valueIdentifier
	 * @return The value of the input parameter as a basic type.
	 */
	public Identifier getValueIdentifier() { return valueIdentifier; }

	/**
	 * Setter for valueIdentifier
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueIdentifier(Identifier value) { valueIdentifier = value; }


	@Expose
	private CodeableConcept valueCodeableConcept;

	/**
	 * Getter for valueCodeableConcept
	 * @return The value of the input parameter as a basic type.
	 */
	public CodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }

	/**
	 * Setter for valueCodeableConcept
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueCodeableConcept(CodeableConcept value) { valueCodeableConcept = value; }


	@Expose
	private Coding valueCoding;

	/**
	 * Getter for valueCoding
	 * @return The value of the input parameter as a basic type.
	 */
	public Coding getValueCoding() { return valueCoding; }

	/**
	 * Setter for valueCoding
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueCoding(Coding value) { valueCoding = value; }


	@Expose
	private Quantity valueQuantity;

	/**
	 * Getter for valueQuantity
	 * @return The value of the input parameter as a basic type.
	 */
	public Quantity getValueQuantity() { return valueQuantity; }

	/**
	 * Setter for valueQuantity
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueQuantity(Quantity value) { valueQuantity = value; }


	@Expose
	private Duration valueDuration;

	/**
	 * Getter for valueDuration
	 * @return The value of the input parameter as a basic type.
	 */
	public Duration getValueDuration() { return valueDuration; }

	/**
	 * Setter for valueDuration
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueDuration(Duration value) { valueDuration = value; }


	@Expose
	private Quantity valueSimpleQuantity;

	/**
	 * Getter for valueSimpleQuantity
	 * @return The value of the input parameter as a basic type.
	 */
	public Quantity getValueSimpleQuantity() { return valueSimpleQuantity; }

	/**
	 * Setter for valueSimpleQuantity
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueSimpleQuantity(Quantity value) { valueSimpleQuantity = value; }


	@Expose
	private Distance valueDistance;

	/**
	 * Getter for valueDistance
	 * @return The value of the input parameter as a basic type.
	 */
	public Distance getValueDistance() { return valueDistance; }

	/**
	 * Setter for valueDistance
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueDistance(Distance value) { valueDistance = value; }


	@Expose
	private Count valueCount;

	/**
	 * Getter for valueCount
	 * @return The value of the input parameter as a basic type.
	 */
	public Count getValueCount() { return valueCount; }

	/**
	 * Setter for valueCount
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueCount(Count value) { valueCount = value; }


	@Expose
	private Money valueMoney;

	/**
	 * Getter for valueMoney
	 * @return The value of the input parameter as a basic type.
	 */
	public Money getValueMoney() { return valueMoney; }

	/**
	 * Setter for valueMoney
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueMoney(Money value) { valueMoney = value; }


	@Expose
	private Age valueAge;

	/**
	 * Getter for valueAge
	 * @return The value of the input parameter as a basic type.
	 */
	public Age getValueAge() { return valueAge; }

	/**
	 * Setter for valueAge
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueAge(Age value) { valueAge = value; }


	@Expose
	private Range valueRange;

	/**
	 * Getter for valueRange
	 * @return The value of the input parameter as a basic type.
	 */
	public Range getValueRange() { return valueRange; }

	/**
	 * Setter for valueRange
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueRange(Range value) { valueRange = value; }


	@Expose
	private Period valuePeriod;

	/**
	 * Getter for valuePeriod
	 * @return The value of the input parameter as a basic type.
	 */
	public Period getValuePeriod() { return valuePeriod; }

	/**
	 * Setter for valuePeriod
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValuePeriod(Period value) { valuePeriod = value; }


	@Expose
	private Ratio valueRatio;

	/**
	 * Getter for valueRatio
	 * @return The value of the input parameter as a basic type.
	 */
	public Ratio getValueRatio() { return valueRatio; }

	/**
	 * Setter for valueRatio
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueRatio(Ratio value) { valueRatio = value; }


	@Expose
	private Reference valueReference;

	/**
	 * Getter for valueReference
	 * @return The value of the input parameter as a basic type.
	 */
	public Reference getValueReference() { return valueReference; }

	/**
	 * Setter for valueReference
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueReference(Reference value) { valueReference = value; }


	@Expose
	private SampledData valueSampledData;

	/**
	 * Getter for valueSampledData
	 * @return The value of the input parameter as a basic type.
	 */
	public SampledData getValueSampledData() { return valueSampledData; }

	/**
	 * Setter for valueSampledData
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueSampledData(SampledData value) { valueSampledData = value; }


	@Expose
	private Signature valueSignature;

	/**
	 * Getter for valueSignature
	 * @return The value of the input parameter as a basic type.
	 */
	public Signature getValueSignature() { return valueSignature; }

	/**
	 * Setter for valueSignature
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueSignature(Signature value) { valueSignature = value; }


	@Expose
	private HumanName valueHumanName;

	/**
	 * Getter for valueHumanName
	 * @return The value of the input parameter as a basic type.
	 */
	public HumanName getValueHumanName() { return valueHumanName; }

	/**
	 * Setter for valueHumanName
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueHumanName(HumanName value) { valueHumanName = value; }


	@Expose
	private Address valueAddress;

	/**
	 * Getter for valueAddress
	 * @return The value of the input parameter as a basic type.
	 */
	public Address getValueAddress() { return valueAddress; }

	/**
	 * Setter for valueAddress
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueAddress(Address value) { valueAddress = value; }


	@Expose
	private ContactPoint valueContactPoint;

	/**
	 * Getter for valueContactPoint
	 * @return The value of the input parameter as a basic type.
	 */
	public ContactPoint getValueContactPoint() { return valueContactPoint; }

	/**
	 * Setter for valueContactPoint
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueContactPoint(ContactPoint value) { valueContactPoint = value; }


	@Expose
	private Timing valueTiming;

	/**
	 * Getter for valueTiming
	 * @return The value of the input parameter as a basic type.
	 */
	public Timing getValueTiming() { return valueTiming; }

	/**
	 * Setter for valueTiming
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueTiming(Timing value) { valueTiming = value; }


	@Expose
	private Meta valueMeta;

	/**
	 * Getter for valueMeta
	 * @return The value of the input parameter as a basic type.
	 */
	public Meta getValueMeta() { return valueMeta; }

	/**
	 * Setter for valueMeta
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueMeta(Meta value) { valueMeta = value; }


	@Expose
	private ElementDefinition valueElementDefinition;

	/**
	 * Getter for valueElementDefinition
	 * @return The value of the input parameter as a basic type.
	 */
	public ElementDefinition getValueElementDefinition() { return valueElementDefinition; }

	/**
	 * Setter for valueElementDefinition
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueElementDefinition(ElementDefinition value) { valueElementDefinition = value; }


	@Expose
	private ContactDetail valueContactDetail;

	/**
	 * Getter for valueContactDetail
	 * @return The value of the input parameter as a basic type.
	 */
	public ContactDetail getValueContactDetail() { return valueContactDetail; }

	/**
	 * Setter for valueContactDetail
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueContactDetail(ContactDetail value) { valueContactDetail = value; }


	@Expose
	private Contributor valueContributor;

	/**
	 * Getter for valueContributor
	 * @return The value of the input parameter as a basic type.
	 */
	public Contributor getValueContributor() { return valueContributor; }

	/**
	 * Setter for valueContributor
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueContributor(Contributor value) { valueContributor = value; }


	@Expose
	private Dosage valueDosage;

	/**
	 * Getter for valueDosage
	 * @return The value of the input parameter as a basic type.
	 */
	public Dosage getValueDosage() { return valueDosage; }

	/**
	 * Setter for valueDosage
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueDosage(Dosage value) { valueDosage = value; }


	@Expose
	private RelatedArtifact valueRelatedArtifact;

	/**
	 * Getter for valueRelatedArtifact
	 * @return The value of the input parameter as a basic type.
	 */
	public RelatedArtifact getValueRelatedArtifact() { return valueRelatedArtifact; }

	/**
	 * Setter for valueRelatedArtifact
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueRelatedArtifact(RelatedArtifact value) { valueRelatedArtifact = value; }


	@Expose
	private UsageContext valueUsageContext;

	/**
	 * Getter for valueUsageContext
	 * @return The value of the input parameter as a basic type.
	 */
	public UsageContext getValueUsageContext() { return valueUsageContext; }

	/**
	 * Setter for valueUsageContext
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueUsageContext(UsageContext value) { valueUsageContext = value; }


	@Expose
	private DataRequirement valueDataRequirement;

	/**
	 * Getter for valueDataRequirement
	 * @return The value of the input parameter as a basic type.
	 */
	public DataRequirement getValueDataRequirement() { return valueDataRequirement; }

	/**
	 * Setter for valueDataRequirement
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueDataRequirement(DataRequirement value) { valueDataRequirement = value; }


	@Expose
	private ParameterDefinition valueParameterDefinition;

	/**
	 * Getter for valueParameterDefinition
	 * @return The value of the input parameter as a basic type.
	 */
	public ParameterDefinition getValueParameterDefinition() { return valueParameterDefinition; }

	/**
	 * Setter for valueParameterDefinition
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueParameterDefinition(ParameterDefinition value) { valueParameterDefinition = value; }


	@Expose
	private TriggerDefinition valueTriggerDefinition;

	/**
	 * Getter for valueTriggerDefinition
	 * @return The value of the input parameter as a basic type.
	 */
	public TriggerDefinition getValueTriggerDefinition() { return valueTriggerDefinition; }

	/**
	 * Setter for valueTriggerDefinition
	 * @param value The value of the input parameter as a basic type.
	 */
	public void setValueTriggerDefinition(TriggerDefinition value) { valueTriggerDefinition = value; }


}
