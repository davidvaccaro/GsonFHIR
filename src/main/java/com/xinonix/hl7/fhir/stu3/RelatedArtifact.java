package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 */
public class RelatedArtifact extends Element {
	public enum Type{
		@SerializedName("documentation") DOCUMENTATION,
		@SerializedName("justification") JUSTIFICATION,
		@SerializedName("citation") CITATION,
		@SerializedName("predecessor") PREDECESSOR,
		@SerializedName("successor") SUCCESSOR,
		@SerializedName("derived-from") DERIVED_FROM,
		@SerializedName("depends-on") DEPENDS_ON,
		@SerializedName("composed-of") COMPOSED_OF
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of relationship to the related artifact.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of relationship to the related artifact.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
	 */
	public void setDisplay(String value) { display = value; }


	@Expose
	private String citation;

	/**
	 * Getter for citation
	 * @return A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format.
	 */
	public String getCitation() { return citation; }

	/**
	 * Setter for citation
	 * @param value A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format.
	 */
	public void setCitation(String value) { citation = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return A url for the artifact that can be followed to access the actual content.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value A url for the artifact that can be followed to access the actual content.
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private Attachment document;

	/**
	 * Getter for document
	 * @return The document being referenced, represented as an attachment. This is exclusive with the resource element.
	 */
	public Attachment getDocument() { return document; }

	/**
	 * Setter for document
	 * @param value The document being referenced, represented as an attachment. This is exclusive with the resource element.
	 */
	public void setDocument(Attachment value) { document = value; }


	@Expose
	private Reference resource;

	/**
	 * Getter for resource
	 * @return The related resource, such as a library, value set, profile, or other knowledge resource.
	 */
	public Reference getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value The related resource, such as a library, value set, profile, or other knowledge resource.
	 */
	public void setResource(Reference value) { resource = value; }


}
