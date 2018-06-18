package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Optional Extension Element - found in all resources.
 */
public class Extension extends Element {
	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return Source of the definition for the extension code - a logical name or a URL.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value Source of the definition for the extension code - a logical name or a URL.
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


	@Expose
	private Integer valueInteger;

	/**
	 * Getter for valueInteger
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Integer getValueInteger() { return valueInteger; }

	/**
	 * Setter for valueInteger
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueInteger(Integer value) { valueInteger = value; }


	@Expose
	private Double valueDecimal;

	/**
	 * Getter for valueDecimal
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Double getValueDecimal() { return valueDecimal; }

	/**
	 * Setter for valueDecimal
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueDecimal(Double value) { valueDecimal = value; }


	@Expose
	private String valueBase64Binary;

	/**
	 * Getter for valueBase64Binary
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueBase64Binary() { return valueBase64Binary; }

	/**
	 * Setter for valueBase64Binary
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueBase64Binary(String value) { valueBase64Binary = value; }


	@Expose
	private String valueInstant;

	/**
	 * Getter for valueInstant
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueInstant() { return valueInstant; }

	/**
	 * Setter for valueInstant
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueInstant(String value) { valueInstant = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private String valueUri;

	/**
	 * Getter for valueUri
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueUri() { return valueUri; }

	/**
	 * Setter for valueUri
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueUri(String value) { valueUri = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date valueDate;

	/**
	 * Getter for valueDate
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Date getValueDate() { return valueDate; }

	/**
	 * Setter for valueDate
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueDate(Date value) { valueDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date valueDateTime;

	/**
	 * Getter for valueDateTime
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Date getValueDateTime() { return valueDateTime; }

	/**
	 * Setter for valueDateTime
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueDateTime(Date value) { valueDateTime = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date valueTime;

	/**
	 * Getter for valueTime
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Date getValueTime() { return valueTime; }

	/**
	 * Setter for valueTime
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueTime(Date value) { valueTime = value; }


	@Expose
	private String valueCode;

	/**
	 * Getter for valueCode
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueCode() { return valueCode; }

	/**
	 * Setter for valueCode
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueCode(String value) { valueCode = value; }


	@Expose
	private String valueOid;

	/**
	 * Getter for valueOid
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueOid() { return valueOid; }

	/**
	 * Setter for valueOid
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueOid(String value) { valueOid = value; }


	@Expose
	private String valueUuid;

	/**
	 * Getter for valueUuid
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueUuid() { return valueUuid; }

	/**
	 * Setter for valueUuid
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueUuid(String value) { valueUuid = value; }


	@Expose
	private String valueId;

	/**
	 * Getter for valueId
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueId() { return valueId; }

	/**
	 * Setter for valueId
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueId(String value) { valueId = value; }


	@Expose
	private Integer valueUnsignedInt;

	/**
	 * Getter for valueUnsignedInt
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Integer getValueUnsignedInt() { return valueUnsignedInt; }

	/**
	 * Setter for valueUnsignedInt
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueUnsignedInt(Integer value) { valueUnsignedInt = value; }


	@Expose
	private Integer valuePositiveInt;

	/**
	 * Getter for valuePositiveInt
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Integer getValuePositiveInt() { return valuePositiveInt; }

	/**
	 * Setter for valuePositiveInt
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValuePositiveInt(Integer value) { valuePositiveInt = value; }


	@Expose
	private String valueMarkdown;

	/**
	 * Getter for valueMarkdown
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public String getValueMarkdown() { return valueMarkdown; }

	/**
	 * Setter for valueMarkdown
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueMarkdown(String value) { valueMarkdown = value; }


	@Expose
	private Element valueElement;

	/**
	 * Getter for valueElement
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Element getValueElement() { return valueElement; }

	/**
	 * Setter for valueElement
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueElement(Element value) { valueElement = value; }


	@Expose
	private Extension valueExtension;

	/**
	 * Getter for valueExtension
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Extension getValueExtension() { return valueExtension; }

	/**
	 * Setter for valueExtension
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueExtension(Extension value) { valueExtension = value; }


	@Expose
	private BackboneElement valueBackboneElement;

	/**
	 * Getter for valueBackboneElement
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public BackboneElement getValueBackboneElement() { return valueBackboneElement; }

	/**
	 * Setter for valueBackboneElement
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueBackboneElement(BackboneElement value) { valueBackboneElement = value; }


	@Expose
	private Narrative valueNarrative;

	/**
	 * Getter for valueNarrative
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Narrative getValueNarrative() { return valueNarrative; }

	/**
	 * Setter for valueNarrative
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueNarrative(Narrative value) { valueNarrative = value; }


	@Expose
	private Annotation valueAnnotation;

	/**
	 * Getter for valueAnnotation
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Annotation getValueAnnotation() { return valueAnnotation; }

	/**
	 * Setter for valueAnnotation
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueAnnotation(Annotation value) { valueAnnotation = value; }


	@Expose
	private Attachment valueAttachment;

	/**
	 * Getter for valueAttachment
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Attachment getValueAttachment() { return valueAttachment; }

	/**
	 * Setter for valueAttachment
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueAttachment(Attachment value) { valueAttachment = value; }


	@Expose
	private Identifier valueIdentifier;

	/**
	 * Getter for valueIdentifier
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Identifier getValueIdentifier() { return valueIdentifier; }

	/**
	 * Setter for valueIdentifier
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueIdentifier(Identifier value) { valueIdentifier = value; }


	@Expose
	private CodeableConcept valueCodeableConcept;

	/**
	 * Getter for valueCodeableConcept
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public CodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }

	/**
	 * Setter for valueCodeableConcept
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueCodeableConcept(CodeableConcept value) { valueCodeableConcept = value; }


	@Expose
	private Coding valueCoding;

	/**
	 * Getter for valueCoding
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Coding getValueCoding() { return valueCoding; }

	/**
	 * Setter for valueCoding
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueCoding(Coding value) { valueCoding = value; }


	@Expose
	private Quantity valueQuantity;

	/**
	 * Getter for valueQuantity
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Quantity getValueQuantity() { return valueQuantity; }

	/**
	 * Setter for valueQuantity
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueQuantity(Quantity value) { valueQuantity = value; }


	@Expose
	private Duration valueDuration;

	/**
	 * Getter for valueDuration
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Duration getValueDuration() { return valueDuration; }

	/**
	 * Setter for valueDuration
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueDuration(Duration value) { valueDuration = value; }


	@Expose
	private Quantity valueSimpleQuantity;

	/**
	 * Getter for valueSimpleQuantity
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Quantity getValueSimpleQuantity() { return valueSimpleQuantity; }

	/**
	 * Setter for valueSimpleQuantity
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueSimpleQuantity(Quantity value) { valueSimpleQuantity = value; }


	@Expose
	private Distance valueDistance;

	/**
	 * Getter for valueDistance
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Distance getValueDistance() { return valueDistance; }

	/**
	 * Setter for valueDistance
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueDistance(Distance value) { valueDistance = value; }


	@Expose
	private Count valueCount;

	/**
	 * Getter for valueCount
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Count getValueCount() { return valueCount; }

	/**
	 * Setter for valueCount
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueCount(Count value) { valueCount = value; }


	@Expose
	private Money valueMoney;

	/**
	 * Getter for valueMoney
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Money getValueMoney() { return valueMoney; }

	/**
	 * Setter for valueMoney
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueMoney(Money value) { valueMoney = value; }


	@Expose
	private Age valueAge;

	/**
	 * Getter for valueAge
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Age getValueAge() { return valueAge; }

	/**
	 * Setter for valueAge
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueAge(Age value) { valueAge = value; }


	@Expose
	private Range valueRange;

	/**
	 * Getter for valueRange
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Range getValueRange() { return valueRange; }

	/**
	 * Setter for valueRange
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueRange(Range value) { valueRange = value; }


	@Expose
	private Period valuePeriod;

	/**
	 * Getter for valuePeriod
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Period getValuePeriod() { return valuePeriod; }

	/**
	 * Setter for valuePeriod
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValuePeriod(Period value) { valuePeriod = value; }


	@Expose
	private Ratio valueRatio;

	/**
	 * Getter for valueRatio
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Ratio getValueRatio() { return valueRatio; }

	/**
	 * Setter for valueRatio
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueRatio(Ratio value) { valueRatio = value; }


	@Expose
	private Reference valueReference;

	/**
	 * Getter for valueReference
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Reference getValueReference() { return valueReference; }

	/**
	 * Setter for valueReference
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueReference(Reference value) { valueReference = value; }


	@Expose
	private SampledData valueSampledData;

	/**
	 * Getter for valueSampledData
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public SampledData getValueSampledData() { return valueSampledData; }

	/**
	 * Setter for valueSampledData
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueSampledData(SampledData value) { valueSampledData = value; }


	@Expose
	private Signature valueSignature;

	/**
	 * Getter for valueSignature
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Signature getValueSignature() { return valueSignature; }

	/**
	 * Setter for valueSignature
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueSignature(Signature value) { valueSignature = value; }


	@Expose
	private HumanName valueHumanName;

	/**
	 * Getter for valueHumanName
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public HumanName getValueHumanName() { return valueHumanName; }

	/**
	 * Setter for valueHumanName
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueHumanName(HumanName value) { valueHumanName = value; }


	@Expose
	private Address valueAddress;

	/**
	 * Getter for valueAddress
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Address getValueAddress() { return valueAddress; }

	/**
	 * Setter for valueAddress
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueAddress(Address value) { valueAddress = value; }


	@Expose
	private ContactPoint valueContactPoint;

	/**
	 * Getter for valueContactPoint
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public ContactPoint getValueContactPoint() { return valueContactPoint; }

	/**
	 * Setter for valueContactPoint
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueContactPoint(ContactPoint value) { valueContactPoint = value; }


	@Expose
	private Timing valueTiming;

	/**
	 * Getter for valueTiming
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Timing getValueTiming() { return valueTiming; }

	/**
	 * Setter for valueTiming
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueTiming(Timing value) { valueTiming = value; }


	@Expose
	private Meta valueMeta;

	/**
	 * Getter for valueMeta
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Meta getValueMeta() { return valueMeta; }

	/**
	 * Setter for valueMeta
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueMeta(Meta value) { valueMeta = value; }


	@Expose
	private ElementDefinition valueElementDefinition;

	/**
	 * Getter for valueElementDefinition
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public ElementDefinition getValueElementDefinition() { return valueElementDefinition; }

	/**
	 * Setter for valueElementDefinition
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueElementDefinition(ElementDefinition value) { valueElementDefinition = value; }


	@Expose
	private ContactDetail valueContactDetail;

	/**
	 * Getter for valueContactDetail
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public ContactDetail getValueContactDetail() { return valueContactDetail; }

	/**
	 * Setter for valueContactDetail
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueContactDetail(ContactDetail value) { valueContactDetail = value; }


	@Expose
	private Contributor valueContributor;

	/**
	 * Getter for valueContributor
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Contributor getValueContributor() { return valueContributor; }

	/**
	 * Setter for valueContributor
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueContributor(Contributor value) { valueContributor = value; }


	@Expose
	private Dosage valueDosage;

	/**
	 * Getter for valueDosage
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public Dosage getValueDosage() { return valueDosage; }

	/**
	 * Setter for valueDosage
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueDosage(Dosage value) { valueDosage = value; }


	@Expose
	private RelatedArtifact valueRelatedArtifact;

	/**
	 * Getter for valueRelatedArtifact
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public RelatedArtifact getValueRelatedArtifact() { return valueRelatedArtifact; }

	/**
	 * Setter for valueRelatedArtifact
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueRelatedArtifact(RelatedArtifact value) { valueRelatedArtifact = value; }


	@Expose
	private UsageContext valueUsageContext;

	/**
	 * Getter for valueUsageContext
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public UsageContext getValueUsageContext() { return valueUsageContext; }

	/**
	 * Setter for valueUsageContext
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueUsageContext(UsageContext value) { valueUsageContext = value; }


	@Expose
	private DataRequirement valueDataRequirement;

	/**
	 * Getter for valueDataRequirement
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public DataRequirement getValueDataRequirement() { return valueDataRequirement; }

	/**
	 * Setter for valueDataRequirement
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueDataRequirement(DataRequirement value) { valueDataRequirement = value; }


	@Expose
	private ParameterDefinition valueParameterDefinition;

	/**
	 * Getter for valueParameterDefinition
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public ParameterDefinition getValueParameterDefinition() { return valueParameterDefinition; }

	/**
	 * Setter for valueParameterDefinition
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueParameterDefinition(ParameterDefinition value) { valueParameterDefinition = value; }


	@Expose
	private TriggerDefinition valueTriggerDefinition;

	/**
	 * Getter for valueTriggerDefinition
	 * @return Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public TriggerDefinition getValueTriggerDefinition() { return valueTriggerDefinition; }

	/**
	 * Setter for valueTriggerDefinition
	 * @param value Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list).
	 */
	public void setValueTriggerDefinition(TriggerDefinition value) { valueTriggerDefinition = value; }


}
