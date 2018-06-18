package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 */
public class QuestionnaireItem extends BackboneElement {
	@Expose
	private String linkId;

	/**
	 * Getter for linkId
	 * @return An identifier that is unique within the Questionnaire allowing linkage to the equivalent item in a QuestionnaireResponse resource.
	 */
	public String getLinkId() { return linkId; }

	/**
	 * Setter for linkId
	 * @param value An identifier that is unique within the Questionnaire allowing linkage to the equivalent item in a QuestionnaireResponse resource.
	 */
	public void setLinkId(String value) { linkId = value; }


	@Expose
	private String definition;

	/**
	 * Getter for definition
	 * @return A reference to an [[[ElementDefinition]]] that provides the details for the item. If a definition is provided, then the following element values can be inferred from the definition: 

* code (ElementDefinition.code)
* type (ElementDefinition.type)
* required (ElementDefinition.min)
* repeats (ElementDefinition.max)
* maxLength (ElementDefinition.maxLength)
* options (ElementDefinition.binding)

Any information provided in these elements on a Questionnaire Item overrides the information from the definition.
	 */
	public String getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A reference to an [[[ElementDefinition]]] that provides the details for the item. If a definition is provided, then the following element values can be inferred from the definition: 

* code (ElementDefinition.code)
* type (ElementDefinition.type)
* required (ElementDefinition.min)
* repeats (ElementDefinition.max)
* maxLength (ElementDefinition.maxLength)
* options (ElementDefinition.binding)

Any information provided in these elements on a Questionnaire Item overrides the information from the definition.
	 */
	public void setDefinition(String value) { definition = value; }


	@Expose
	private ArrayList<Coding> code;

	/**
	 * Getter for code
	 * @return A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).
	 */
	public ArrayList<Coding> getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).
	 */
	public void setCode(ArrayList<Coding> value) { code = value; }


	@Expose
	private String prefix;

	/**
	 * Getter for prefix
	 * @return A short label for a particular group, question or set of display text within the questionnaire used for reference by the individual completing the questionnaire.
	 */
	public String getPrefix() { return prefix; }

	/**
	 * Setter for prefix
	 * @param value A short label for a particular group, question or set of display text within the questionnaire used for reference by the individual completing the questionnaire.
	 */
	public void setPrefix(String value) { prefix = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return The name of a section, the text of a question or text content for a display item.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value The name of a section, the text of a question or text content for a display item.
	 */
	public void setText(String value) { text = value; }


	public enum Type{
		@SerializedName("group") GROUP,
		@SerializedName("display") DISPLAY,
		@SerializedName("boolean") BOOLEAN,
		@SerializedName("decimal") DECIMAL,
		@SerializedName("integer") INTEGER,
		@SerializedName("date") DATE,
		@SerializedName("dateTime") DATETIME,
		@SerializedName("time") TIME,
		@SerializedName("string") STRING,
		@SerializedName("text") TEXT,
		@SerializedName("url") URL,
		@SerializedName("choice") CHOICE,
		@SerializedName("open-choice") OPEN_CHOICE,
		@SerializedName("attachment") ATTACHMENT,
		@SerializedName("reference") REFERENCE,
		@SerializedName("quantity") QUANTITY
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private ArrayList<QuestionnaireEnableWhen> enableWhen;

	/**
	 * Getter for enableWhen
	 * @return A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
	 */
	public ArrayList<QuestionnaireEnableWhen> getEnableWhen() { return enableWhen; }

	/**
	 * Setter for enableWhen
	 * @param value A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
	 */
	public void setEnableWhen(ArrayList<QuestionnaireEnableWhen> value) { enableWhen = value; }


	@Expose
	private boolean required;

	/**
	 * Getter for required
	 * @return An indication, if true, that the item must be present in a "completed" QuestionnaireResponse.  If false, the item may be skipped when answering the questionnaire.
	 */
	public boolean getRequired() { return required; }

	/**
	 * Setter for required
	 * @param value An indication, if true, that the item must be present in a "completed" QuestionnaireResponse.  If false, the item may be skipped when answering the questionnaire.
	 */
	public void setRequired(boolean value) { required = value; }


	@Expose
	private boolean repeats;

	/**
	 * Getter for repeats
	 * @return An indication, if true, that the item may occur multiple times in the response, collecting multiple answers answers for questions or multiple sets of answers for groups.
	 */
	public boolean getRepeats() { return repeats; }

	/**
	 * Setter for repeats
	 * @param value An indication, if true, that the item may occur multiple times in the response, collecting multiple answers answers for questions or multiple sets of answers for groups.
	 */
	public void setRepeats(boolean value) { repeats = value; }


	@Expose
	private boolean readOnly;

	/**
	 * Getter for readOnly
	 * @return An indication, when true, that the value cannot be changed by a human respondent to the Questionnaire.
	 */
	public boolean getReadOnly() { return readOnly; }

	/**
	 * Setter for readOnly
	 * @param value An indication, when true, that the value cannot be changed by a human respondent to the Questionnaire.
	 */
	public void setReadOnly(boolean value) { readOnly = value; }


	@Expose
	private Integer maxLength;

	/**
	 * Getter for maxLength
	 * @return The maximum number of characters that are permitted in the answer to be considered a "valid" QuestionnaireResponse.
	 */
	public Integer getMaxLength() { return maxLength; }

	/**
	 * Setter for maxLength
	 * @param value The maximum number of characters that are permitted in the answer to be considered a "valid" QuestionnaireResponse.
	 */
	public void setMaxLength(Integer value) { maxLength = value; }


	@Expose
	private Reference options;

	/**
	 * Getter for options
	 * @return A reference to a value set containing a list of codes representing permitted answers for a "choice" or "open-choice" question.
	 */
	public Reference getOptions() { return options; }

	/**
	 * Setter for options
	 * @param value A reference to a value set containing a list of codes representing permitted answers for a "choice" or "open-choice" question.
	 */
	public void setOptions(Reference value) { options = value; }


	@Expose
	private ArrayList<QuestionnaireOption> option;

	/**
	 * Getter for option
	 * @return One of the permitted answers for a "choice" or "open-choice" question.
	 */
	public ArrayList<QuestionnaireOption> getOption() { return option; }

	/**
	 * Setter for option
	 * @param value One of the permitted answers for a "choice" or "open-choice" question.
	 */
	public void setOption(ArrayList<QuestionnaireOption> value) { option = value; }


	@Expose
	private boolean initialBoolean;

	/**
	 * Getter for initialBoolean
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public boolean getInitialBoolean() { return initialBoolean; }

	/**
	 * Setter for initialBoolean
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialBoolean(boolean value) { initialBoolean = value; }


	@Expose
	private Double initialDecimal;

	/**
	 * Getter for initialDecimal
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Double getInitialDecimal() { return initialDecimal; }

	/**
	 * Setter for initialDecimal
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialDecimal(Double value) { initialDecimal = value; }


	@Expose
	private Integer initialInteger;

	/**
	 * Getter for initialInteger
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Integer getInitialInteger() { return initialInteger; }

	/**
	 * Setter for initialInteger
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialInteger(Integer value) { initialInteger = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date initialDate;

	/**
	 * Getter for initialDate
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Date getInitialDate() { return initialDate; }

	/**
	 * Setter for initialDate
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialDate(Date value) { initialDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date initialDateTime;

	/**
	 * Getter for initialDateTime
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Date getInitialDateTime() { return initialDateTime; }

	/**
	 * Setter for initialDateTime
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialDateTime(Date value) { initialDateTime = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date initialTime;

	/**
	 * Getter for initialTime
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Date getInitialTime() { return initialTime; }

	/**
	 * Setter for initialTime
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialTime(Date value) { initialTime = value; }


	@Expose
	private String initialString;

	/**
	 * Getter for initialString
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public String getInitialString() { return initialString; }

	/**
	 * Setter for initialString
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialString(String value) { initialString = value; }


	@Expose
	private String initialUri;

	/**
	 * Getter for initialUri
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public String getInitialUri() { return initialUri; }

	/**
	 * Setter for initialUri
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialUri(String value) { initialUri = value; }


	@Expose
	private Attachment initialAttachment;

	/**
	 * Getter for initialAttachment
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Attachment getInitialAttachment() { return initialAttachment; }

	/**
	 * Setter for initialAttachment
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialAttachment(Attachment value) { initialAttachment = value; }


	@Expose
	private Coding initialCoding;

	/**
	 * Getter for initialCoding
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Coding getInitialCoding() { return initialCoding; }

	/**
	 * Setter for initialCoding
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialCoding(Coding value) { initialCoding = value; }


	@Expose
	private Quantity initialQuantity;

	/**
	 * Getter for initialQuantity
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Quantity getInitialQuantity() { return initialQuantity; }

	/**
	 * Setter for initialQuantity
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialQuantity(Quantity value) { initialQuantity = value; }


	@Expose
	private Reference initialReference;

	/**
	 * Getter for initialReference
	 * @return The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public Reference getInitialReference() { return initialReference; }

	/**
	 * Setter for initialReference
	 * @param value The value that should be defaulted when initially rendering the questionnaire for user input.
	 */
	public void setInitialReference(Reference value) { initialReference = value; }


	@Expose
	private ArrayList<QuestionnaireItem> item;

	/**
	 * Getter for item
	 * @return Text, questions and other groups to be nested beneath a question or group.
	 */
	public ArrayList<QuestionnaireItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value Text, questions and other groups to be nested beneath a question or group.
	 */
	public void setItem(ArrayList<QuestionnaireItem> value) { item = value; }


}
