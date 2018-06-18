package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different signature approaches have different utilities.
 */
public class Signature extends Element {
	@Expose
	private ArrayList<Coding> type;

	/**
	 * Getter for type
	 * @return An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
	 */
	public ArrayList<Coding> getType() { return type; }

	/**
	 * Setter for type
	 * @param value An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
	 */
	public void setType(ArrayList<Coding> value) { type = value; }


	@Expose
	private String when;

	/**
	 * Getter for when
	 * @return When the digital signature was signed.
	 */
	public String getWhen() { return when; }

	/**
	 * Setter for when
	 * @param value When the digital signature was signed.
	 */
	public void setWhen(String value) { when = value; }


	@Expose
	private String whoUri;

	/**
	 * Getter for whoUri
	 * @return A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key).
	 */
	public String getWhoUri() { return whoUri; }

	/**
	 * Setter for whoUri
	 * @param value A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key).
	 */
	public void setWhoUri(String value) { whoUri = value; }


	@Expose
	private Reference whoReference;

	/**
	 * Getter for whoReference
	 * @return A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key).
	 */
	public Reference getWhoReference() { return whoReference; }

	/**
	 * Setter for whoReference
	 * @param value A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key).
	 */
	public void setWhoReference(Reference value) { whoReference = value; }


	@Expose
	private String onBehalfOfUri;

	/**
	 * Getter for onBehalfOfUri
	 * @return A reference to an application-usable description of the identity that is represented by the signature.
	 */
	public String getOnBehalfOfUri() { return onBehalfOfUri; }

	/**
	 * Setter for onBehalfOfUri
	 * @param value A reference to an application-usable description of the identity that is represented by the signature.
	 */
	public void setOnBehalfOfUri(String value) { onBehalfOfUri = value; }


	@Expose
	private Reference onBehalfOfReference;

	/**
	 * Getter for onBehalfOfReference
	 * @return A reference to an application-usable description of the identity that is represented by the signature.
	 */
	public Reference getOnBehalfOfReference() { return onBehalfOfReference; }

	/**
	 * Setter for onBehalfOfReference
	 * @param value A reference to an application-usable description of the identity that is represented by the signature.
	 */
	public void setOnBehalfOfReference(Reference value) { onBehalfOfReference = value; }


	@Expose
	private String contentType;

	/**
	 * Getter for contentType
	 * @return A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature, etc.
	 */
	public String getContentType() { return contentType; }

	/**
	 * Setter for contentType
	 * @param value A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature, etc.
	 */
	public void setContentType(String value) { contentType = value; }


	@Expose
	private String blob;

	/**
	 * Getter for blob
	 * @return The base64 encoding of the Signature content. When signature is not recorded electronically this element would be empty.
	 */
	public String getBlob() { return blob; }

	/**
	 * Setter for blob
	 * @param value The base64 encoding of the Signature content. When signature is not recorded electronically this element would be empty.
	 */
	public void setBlob(String value) { blob = value; }


}
