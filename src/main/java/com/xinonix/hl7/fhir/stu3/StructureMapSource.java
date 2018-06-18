package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A Map of relationships between 2 structures that can be used to transform data.
 */
public class StructureMapSource extends BackboneElement {
	@Expose
	private String context;

	/**
	 * Getter for context
	 * @return Type or variable this rule applies to.
	 */
	public String getContext() { return context; }

	/**
	 * Setter for context
	 * @param value Type or variable this rule applies to.
	 */
	public void setContext(String value) { context = value; }


	@Expose
	private Integer min;

	/**
	 * Getter for min
	 * @return Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content.
	 */
	public Integer getMin() { return min; }

	/**
	 * Setter for min
	 * @param value Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content.
	 */
	public void setMin(Integer value) { min = value; }


	@Expose
	private String max;

	/**
	 * Getter for max
	 * @return Specified maximum cardinality for the element - a number or a "*". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value).
	 */
	public String getMax() { return max; }

	/**
	 * Setter for max
	 * @param value Specified maximum cardinality for the element - a number or a "*". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value).
	 */
	public void setMax(String value) { max = value; }


	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return Specified type for the element. This works as a condition on the mapping - use for polymorphic elements.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value Specified type for the element. This works as a condition on the mapping - use for polymorphic elements.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private boolean defaultValueBoolean;

	/**
	 * Getter for defaultValueBoolean
	 * @return A value to use if there is no existing value in the source object.
	 */
	public boolean getDefaultValueBoolean() { return defaultValueBoolean; }

	/**
	 * Setter for defaultValueBoolean
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueBoolean(boolean value) { defaultValueBoolean = value; }


	@Expose
	private Integer defaultValueInteger;

	/**
	 * Getter for defaultValueInteger
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Integer getDefaultValueInteger() { return defaultValueInteger; }

	/**
	 * Setter for defaultValueInteger
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueInteger(Integer value) { defaultValueInteger = value; }


	@Expose
	private Double defaultValueDecimal;

	/**
	 * Getter for defaultValueDecimal
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Double getDefaultValueDecimal() { return defaultValueDecimal; }

	/**
	 * Setter for defaultValueDecimal
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueDecimal(Double value) { defaultValueDecimal = value; }


	@Expose
	private String defaultValueBase64Binary;

	/**
	 * Getter for defaultValueBase64Binary
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueBase64Binary() { return defaultValueBase64Binary; }

	/**
	 * Setter for defaultValueBase64Binary
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueBase64Binary(String value) { defaultValueBase64Binary = value; }


	@Expose
	private String defaultValueInstant;

	/**
	 * Getter for defaultValueInstant
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueInstant() { return defaultValueInstant; }

	/**
	 * Setter for defaultValueInstant
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueInstant(String value) { defaultValueInstant = value; }


	@Expose
	private String defaultValueString;

	/**
	 * Getter for defaultValueString
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueString() { return defaultValueString; }

	/**
	 * Setter for defaultValueString
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueString(String value) { defaultValueString = value; }


	@Expose
	private String defaultValueUri;

	/**
	 * Getter for defaultValueUri
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueUri() { return defaultValueUri; }

	/**
	 * Setter for defaultValueUri
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueUri(String value) { defaultValueUri = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date defaultValueDate;

	/**
	 * Getter for defaultValueDate
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Date getDefaultValueDate() { return defaultValueDate; }

	/**
	 * Setter for defaultValueDate
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueDate(Date value) { defaultValueDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date defaultValueDateTime;

	/**
	 * Getter for defaultValueDateTime
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Date getDefaultValueDateTime() { return defaultValueDateTime; }

	/**
	 * Setter for defaultValueDateTime
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueDateTime(Date value) { defaultValueDateTime = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date defaultValueTime;

	/**
	 * Getter for defaultValueTime
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Date getDefaultValueTime() { return defaultValueTime; }

	/**
	 * Setter for defaultValueTime
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueTime(Date value) { defaultValueTime = value; }


	@Expose
	private String defaultValueCode;

	/**
	 * Getter for defaultValueCode
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueCode() { return defaultValueCode; }

	/**
	 * Setter for defaultValueCode
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueCode(String value) { defaultValueCode = value; }


	@Expose
	private String defaultValueOid;

	/**
	 * Getter for defaultValueOid
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueOid() { return defaultValueOid; }

	/**
	 * Setter for defaultValueOid
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueOid(String value) { defaultValueOid = value; }


	@Expose
	private String defaultValueUuid;

	/**
	 * Getter for defaultValueUuid
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueUuid() { return defaultValueUuid; }

	/**
	 * Setter for defaultValueUuid
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueUuid(String value) { defaultValueUuid = value; }


	@Expose
	private String defaultValueId;

	/**
	 * Getter for defaultValueId
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueId() { return defaultValueId; }

	/**
	 * Setter for defaultValueId
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueId(String value) { defaultValueId = value; }


	@Expose
	private Integer defaultValueUnsignedInt;

	/**
	 * Getter for defaultValueUnsignedInt
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Integer getDefaultValueUnsignedInt() { return defaultValueUnsignedInt; }

	/**
	 * Setter for defaultValueUnsignedInt
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueUnsignedInt(Integer value) { defaultValueUnsignedInt = value; }


	@Expose
	private Integer defaultValuePositiveInt;

	/**
	 * Getter for defaultValuePositiveInt
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Integer getDefaultValuePositiveInt() { return defaultValuePositiveInt; }

	/**
	 * Setter for defaultValuePositiveInt
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValuePositiveInt(Integer value) { defaultValuePositiveInt = value; }


	@Expose
	private String defaultValueMarkdown;

	/**
	 * Getter for defaultValueMarkdown
	 * @return A value to use if there is no existing value in the source object.
	 */
	public String getDefaultValueMarkdown() { return defaultValueMarkdown; }

	/**
	 * Setter for defaultValueMarkdown
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueMarkdown(String value) { defaultValueMarkdown = value; }


	@Expose
	private Element defaultValueElement;

	/**
	 * Getter for defaultValueElement
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Element getDefaultValueElement() { return defaultValueElement; }

	/**
	 * Setter for defaultValueElement
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueElement(Element value) { defaultValueElement = value; }


	@Expose
	private Extension defaultValueExtension;

	/**
	 * Getter for defaultValueExtension
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Extension getDefaultValueExtension() { return defaultValueExtension; }

	/**
	 * Setter for defaultValueExtension
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueExtension(Extension value) { defaultValueExtension = value; }


	@Expose
	private BackboneElement defaultValueBackboneElement;

	/**
	 * Getter for defaultValueBackboneElement
	 * @return A value to use if there is no existing value in the source object.
	 */
	public BackboneElement getDefaultValueBackboneElement() { return defaultValueBackboneElement; }

	/**
	 * Setter for defaultValueBackboneElement
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueBackboneElement(BackboneElement value) { defaultValueBackboneElement = value; }


	@Expose
	private Narrative defaultValueNarrative;

	/**
	 * Getter for defaultValueNarrative
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Narrative getDefaultValueNarrative() { return defaultValueNarrative; }

	/**
	 * Setter for defaultValueNarrative
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueNarrative(Narrative value) { defaultValueNarrative = value; }


	@Expose
	private Annotation defaultValueAnnotation;

	/**
	 * Getter for defaultValueAnnotation
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Annotation getDefaultValueAnnotation() { return defaultValueAnnotation; }

	/**
	 * Setter for defaultValueAnnotation
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueAnnotation(Annotation value) { defaultValueAnnotation = value; }


	@Expose
	private Attachment defaultValueAttachment;

	/**
	 * Getter for defaultValueAttachment
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Attachment getDefaultValueAttachment() { return defaultValueAttachment; }

	/**
	 * Setter for defaultValueAttachment
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueAttachment(Attachment value) { defaultValueAttachment = value; }


	@Expose
	private Identifier defaultValueIdentifier;

	/**
	 * Getter for defaultValueIdentifier
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Identifier getDefaultValueIdentifier() { return defaultValueIdentifier; }

	/**
	 * Setter for defaultValueIdentifier
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueIdentifier(Identifier value) { defaultValueIdentifier = value; }


	@Expose
	private CodeableConcept defaultValueCodeableConcept;

	/**
	 * Getter for defaultValueCodeableConcept
	 * @return A value to use if there is no existing value in the source object.
	 */
	public CodeableConcept getDefaultValueCodeableConcept() { return defaultValueCodeableConcept; }

	/**
	 * Setter for defaultValueCodeableConcept
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueCodeableConcept(CodeableConcept value) { defaultValueCodeableConcept = value; }


	@Expose
	private Coding defaultValueCoding;

	/**
	 * Getter for defaultValueCoding
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Coding getDefaultValueCoding() { return defaultValueCoding; }

	/**
	 * Setter for defaultValueCoding
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueCoding(Coding value) { defaultValueCoding = value; }


	@Expose
	private Quantity defaultValueQuantity;

	/**
	 * Getter for defaultValueQuantity
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Quantity getDefaultValueQuantity() { return defaultValueQuantity; }

	/**
	 * Setter for defaultValueQuantity
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueQuantity(Quantity value) { defaultValueQuantity = value; }


	@Expose
	private Duration defaultValueDuration;

	/**
	 * Getter for defaultValueDuration
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Duration getDefaultValueDuration() { return defaultValueDuration; }

	/**
	 * Setter for defaultValueDuration
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueDuration(Duration value) { defaultValueDuration = value; }


	@Expose
	private Quantity defaultValueSimpleQuantity;

	/**
	 * Getter for defaultValueSimpleQuantity
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Quantity getDefaultValueSimpleQuantity() { return defaultValueSimpleQuantity; }

	/**
	 * Setter for defaultValueSimpleQuantity
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueSimpleQuantity(Quantity value) { defaultValueSimpleQuantity = value; }


	@Expose
	private Distance defaultValueDistance;

	/**
	 * Getter for defaultValueDistance
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Distance getDefaultValueDistance() { return defaultValueDistance; }

	/**
	 * Setter for defaultValueDistance
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueDistance(Distance value) { defaultValueDistance = value; }


	@Expose
	private Count defaultValueCount;

	/**
	 * Getter for defaultValueCount
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Count getDefaultValueCount() { return defaultValueCount; }

	/**
	 * Setter for defaultValueCount
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueCount(Count value) { defaultValueCount = value; }


	@Expose
	private Money defaultValueMoney;

	/**
	 * Getter for defaultValueMoney
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Money getDefaultValueMoney() { return defaultValueMoney; }

	/**
	 * Setter for defaultValueMoney
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueMoney(Money value) { defaultValueMoney = value; }


	@Expose
	private Age defaultValueAge;

	/**
	 * Getter for defaultValueAge
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Age getDefaultValueAge() { return defaultValueAge; }

	/**
	 * Setter for defaultValueAge
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueAge(Age value) { defaultValueAge = value; }


	@Expose
	private Range defaultValueRange;

	/**
	 * Getter for defaultValueRange
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Range getDefaultValueRange() { return defaultValueRange; }

	/**
	 * Setter for defaultValueRange
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueRange(Range value) { defaultValueRange = value; }


	@Expose
	private Period defaultValuePeriod;

	/**
	 * Getter for defaultValuePeriod
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Period getDefaultValuePeriod() { return defaultValuePeriod; }

	/**
	 * Setter for defaultValuePeriod
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValuePeriod(Period value) { defaultValuePeriod = value; }


	@Expose
	private Ratio defaultValueRatio;

	/**
	 * Getter for defaultValueRatio
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Ratio getDefaultValueRatio() { return defaultValueRatio; }

	/**
	 * Setter for defaultValueRatio
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueRatio(Ratio value) { defaultValueRatio = value; }


	@Expose
	private Reference defaultValueReference;

	/**
	 * Getter for defaultValueReference
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Reference getDefaultValueReference() { return defaultValueReference; }

	/**
	 * Setter for defaultValueReference
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueReference(Reference value) { defaultValueReference = value; }


	@Expose
	private SampledData defaultValueSampledData;

	/**
	 * Getter for defaultValueSampledData
	 * @return A value to use if there is no existing value in the source object.
	 */
	public SampledData getDefaultValueSampledData() { return defaultValueSampledData; }

	/**
	 * Setter for defaultValueSampledData
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueSampledData(SampledData value) { defaultValueSampledData = value; }


	@Expose
	private Signature defaultValueSignature;

	/**
	 * Getter for defaultValueSignature
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Signature getDefaultValueSignature() { return defaultValueSignature; }

	/**
	 * Setter for defaultValueSignature
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueSignature(Signature value) { defaultValueSignature = value; }


	@Expose
	private HumanName defaultValueHumanName;

	/**
	 * Getter for defaultValueHumanName
	 * @return A value to use if there is no existing value in the source object.
	 */
	public HumanName getDefaultValueHumanName() { return defaultValueHumanName; }

	/**
	 * Setter for defaultValueHumanName
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueHumanName(HumanName value) { defaultValueHumanName = value; }


	@Expose
	private Address defaultValueAddress;

	/**
	 * Getter for defaultValueAddress
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Address getDefaultValueAddress() { return defaultValueAddress; }

	/**
	 * Setter for defaultValueAddress
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueAddress(Address value) { defaultValueAddress = value; }


	@Expose
	private ContactPoint defaultValueContactPoint;

	/**
	 * Getter for defaultValueContactPoint
	 * @return A value to use if there is no existing value in the source object.
	 */
	public ContactPoint getDefaultValueContactPoint() { return defaultValueContactPoint; }

	/**
	 * Setter for defaultValueContactPoint
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueContactPoint(ContactPoint value) { defaultValueContactPoint = value; }


	@Expose
	private Timing defaultValueTiming;

	/**
	 * Getter for defaultValueTiming
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Timing getDefaultValueTiming() { return defaultValueTiming; }

	/**
	 * Setter for defaultValueTiming
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueTiming(Timing value) { defaultValueTiming = value; }


	@Expose
	private Meta defaultValueMeta;

	/**
	 * Getter for defaultValueMeta
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Meta getDefaultValueMeta() { return defaultValueMeta; }

	/**
	 * Setter for defaultValueMeta
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueMeta(Meta value) { defaultValueMeta = value; }


	@Expose
	private ElementDefinition defaultValueElementDefinition;

	/**
	 * Getter for defaultValueElementDefinition
	 * @return A value to use if there is no existing value in the source object.
	 */
	public ElementDefinition getDefaultValueElementDefinition() { return defaultValueElementDefinition; }

	/**
	 * Setter for defaultValueElementDefinition
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueElementDefinition(ElementDefinition value) { defaultValueElementDefinition = value; }


	@Expose
	private ContactDetail defaultValueContactDetail;

	/**
	 * Getter for defaultValueContactDetail
	 * @return A value to use if there is no existing value in the source object.
	 */
	public ContactDetail getDefaultValueContactDetail() { return defaultValueContactDetail; }

	/**
	 * Setter for defaultValueContactDetail
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueContactDetail(ContactDetail value) { defaultValueContactDetail = value; }


	@Expose
	private Contributor defaultValueContributor;

	/**
	 * Getter for defaultValueContributor
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Contributor getDefaultValueContributor() { return defaultValueContributor; }

	/**
	 * Setter for defaultValueContributor
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueContributor(Contributor value) { defaultValueContributor = value; }


	@Expose
	private Dosage defaultValueDosage;

	/**
	 * Getter for defaultValueDosage
	 * @return A value to use if there is no existing value in the source object.
	 */
	public Dosage getDefaultValueDosage() { return defaultValueDosage; }

	/**
	 * Setter for defaultValueDosage
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueDosage(Dosage value) { defaultValueDosage = value; }


	@Expose
	private RelatedArtifact defaultValueRelatedArtifact;

	/**
	 * Getter for defaultValueRelatedArtifact
	 * @return A value to use if there is no existing value in the source object.
	 */
	public RelatedArtifact getDefaultValueRelatedArtifact() { return defaultValueRelatedArtifact; }

	/**
	 * Setter for defaultValueRelatedArtifact
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueRelatedArtifact(RelatedArtifact value) { defaultValueRelatedArtifact = value; }


	@Expose
	private UsageContext defaultValueUsageContext;

	/**
	 * Getter for defaultValueUsageContext
	 * @return A value to use if there is no existing value in the source object.
	 */
	public UsageContext getDefaultValueUsageContext() { return defaultValueUsageContext; }

	/**
	 * Setter for defaultValueUsageContext
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueUsageContext(UsageContext value) { defaultValueUsageContext = value; }


	@Expose
	private DataRequirement defaultValueDataRequirement;

	/**
	 * Getter for defaultValueDataRequirement
	 * @return A value to use if there is no existing value in the source object.
	 */
	public DataRequirement getDefaultValueDataRequirement() { return defaultValueDataRequirement; }

	/**
	 * Setter for defaultValueDataRequirement
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueDataRequirement(DataRequirement value) { defaultValueDataRequirement = value; }


	@Expose
	private ParameterDefinition defaultValueParameterDefinition;

	/**
	 * Getter for defaultValueParameterDefinition
	 * @return A value to use if there is no existing value in the source object.
	 */
	public ParameterDefinition getDefaultValueParameterDefinition() { return defaultValueParameterDefinition; }

	/**
	 * Setter for defaultValueParameterDefinition
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueParameterDefinition(ParameterDefinition value) { defaultValueParameterDefinition = value; }


	@Expose
	private TriggerDefinition defaultValueTriggerDefinition;

	/**
	 * Getter for defaultValueTriggerDefinition
	 * @return A value to use if there is no existing value in the source object.
	 */
	public TriggerDefinition getDefaultValueTriggerDefinition() { return defaultValueTriggerDefinition; }

	/**
	 * Setter for defaultValueTriggerDefinition
	 * @param value A value to use if there is no existing value in the source object.
	 */
	public void setDefaultValueTriggerDefinition(TriggerDefinition value) { defaultValueTriggerDefinition = value; }


	@Expose
	private String element;

	/**
	 * Getter for element
	 * @return Optional field for this source.
	 */
	public String getElement() { return element; }

	/**
	 * Setter for element
	 * @param value Optional field for this source.
	 */
	public void setElement(String value) { element = value; }


	public enum ListMode{
		@SerializedName("first") FIRST,
		@SerializedName("not_first") NOT_FIRST,
		@SerializedName("last") LAST,
		@SerializedName("not_last") NOT_LAST,
		@SerializedName("only_one") ONLY_ONE
	}

	@Expose
	private ListMode listMode;

	/**
	 * Getter for listMode
	 * @return How to handle the list mode for this element.
	 */
	public ListMode getListMode() { return listMode; }

	/**
	 * Setter for listMode
	 * @param value How to handle the list mode for this element.
	 */
	public void setListMode(ListMode value) { listMode = value; }


	@Expose
	private String variable;

	/**
	 * Getter for variable
	 * @return Named context for field, if a field is specified.
	 */
	public String getVariable() { return variable; }

	/**
	 * Setter for variable
	 * @param value Named context for field, if a field is specified.
	 */
	public void setVariable(String value) { variable = value; }


	@Expose
	private String condition;

	/**
	 * Getter for condition
	 * @return FHIRPath expression  - must be true or the rule does not apply.
	 */
	public String getCondition() { return condition; }

	/**
	 * Setter for condition
	 * @param value FHIRPath expression  - must be true or the rule does not apply.
	 */
	public void setCondition(String value) { condition = value; }


	@Expose
	private String check;

	/**
	 * Getter for check
	 * @return FHIRPath expression  - must be true or the mapping engine throws an error instead of completing.
	 */
	public String getCheck() { return check; }

	/**
	 * Setter for check
	 * @param value FHIRPath expression  - must be true or the mapping engine throws an error instead of completing.
	 */
	public void setCheck(String value) { check = value; }


}
