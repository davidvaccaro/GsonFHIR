package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A reference to a code defined by a terminology system.
 */
public class Coding extends Element {
	@Expose
	private String system;

	/**
	 * Getter for system
	 * @return The identification of the code system that defines the meaning of the symbol in the code.
	 */
	public String getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value The identification of the code system that defines the meaning of the symbol in the code.
	 */
	public void setSystem(String value) { system = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The version of the code system which was used when choosing this code. Note that a well-maintained code system does not need the version reported, because the meaning of codes is consistent across versions. However this cannot consistently be assured. and when the meaning is not guaranteed to be consistent, the version SHOULD be exchanged.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The version of the code system which was used when choosing this code. Note that a well-maintained code system does not need the version reported, because the meaning of codes is consistent across versions. However this cannot consistently be assured. and when the meaning is not guaranteed to be consistent, the version SHOULD be exchanged.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return A symbol in syntax defined by the system. The symbol may be a predefined code or an expression in a syntax defined by the coding system (e.g. post-coordination).
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A symbol in syntax defined by the system. The symbol may be a predefined code or an expression in a syntax defined by the coding system (e.g. post-coordination).
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return A representation of the meaning of the code in the system, following the rules of the system.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value A representation of the meaning of the code in the system, following the rules of the system.
	 */
	public void setDisplay(String value) { display = value; }


	@Expose
	private boolean userSelected;

	/**
	 * Getter for userSelected
	 * @return Indicates that this coding was chosen by a user directly - i.e. off a pick list of available items (codes or displays).
	 */
	public boolean getUserSelected() { return userSelected; }

	/**
	 * Setter for userSelected
	 * @param value Indicates that this coding was chosen by a user directly - i.e. off a pick list of available items (codes or displays).
	 */
	public void setUserSelected(boolean value) { userSelected = value; }


}
