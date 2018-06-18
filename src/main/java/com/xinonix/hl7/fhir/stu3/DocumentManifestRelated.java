package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
 */
public class DocumentManifestRelated extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private Reference ref;

	/**
	 * Getter for ref
	 * @return Related Resource to this DocumentManifest. For example, Order, ProcedureRequest,  Procedure, EligibilityRequest, etc.
	 */
	public Reference getRef() { return ref; }

	/**
	 * Setter for ref
	 * @param value Related Resource to this DocumentManifest. For example, Order, ProcedureRequest,  Procedure, EligibilityRequest, etc.
	 */
	public void setRef(Reference value) { ref = value; }


}
