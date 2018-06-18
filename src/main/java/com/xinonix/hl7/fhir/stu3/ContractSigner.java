package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class ContractSigner extends BackboneElement {
	@Expose
	private Coding type;

	/**
	 * Getter for type
	 * @return Role of this Contract signer, e.g. notary, grantee.
	 */
	public Coding getType() { return type; }

	/**
	 * Setter for type
	 * @param value Role of this Contract signer, e.g. notary, grantee.
	 */
	public void setType(Coding value) { type = value; }


	@Expose
	private Reference party;

	/**
	 * Getter for party
	 * @return Party which is a signator to this Contract.
	 */
	public Reference getParty() { return party; }

	/**
	 * Setter for party
	 * @param value Party which is a signator to this Contract.
	 */
	public void setParty(Reference value) { party = value; }


	@Expose
	private ArrayList<Signature> signature;

	/**
	 * Getter for signature
	 * @return Legally binding Contract DSIG signature contents in Base64.
	 */
	public ArrayList<Signature> getSignature() { return signature; }

	/**
	 * Setter for signature
	 * @param value Legally binding Contract DSIG signature contents in Base64.
	 */
	public void setSignature(ArrayList<Signature> value) { signature = value; }


}
