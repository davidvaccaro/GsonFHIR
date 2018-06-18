package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementResource extends BackboneElement {
	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return A type of resource exposed via the restful interface.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value A type of resource exposed via the restful interface.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private Reference profile;

	/**
	 * Getter for profile
	 * @return A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles](profiling.html#profile-uses).
	 */
	public Reference getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles](profiling.html#profile-uses).
	 */
	public void setProfile(Reference value) { profile = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Additional information about the resource type used by the system.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Additional information about the resource type used by the system.
	 */
	public void setDocumentation(String value) { documentation = value; }


	@Expose
	private ArrayList<CapabilityStatementInteraction> interaction;

	/**
	 * Getter for interaction
	 * @return Identifies a restful operation supported by the solution.
	 */
	public ArrayList<CapabilityStatementInteraction> getInteraction() { return interaction; }

	/**
	 * Setter for interaction
	 * @param value Identifies a restful operation supported by the solution.
	 */
	public void setInteraction(ArrayList<CapabilityStatementInteraction> value) { interaction = value; }


	public enum Versioning{
		@SerializedName("no-version") NO_VERSION,
		@SerializedName("versioned") VERSIONED,
		@SerializedName("versioned-update") VERSIONED_UPDATE
	}

	@Expose
	private Versioning versioning;

	/**
	 * Getter for versioning
	 * @return This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
	 */
	public Versioning getVersioning() { return versioning; }

	/**
	 * Setter for versioning
	 * @param value This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
	 */
	public void setVersioning(Versioning value) { versioning = value; }


	@Expose
	private boolean readHistory;

	/**
	 * Getter for readHistory
	 * @return A flag for whether the server is able to return past versions as part of the vRead operation.
	 */
	public boolean getReadHistory() { return readHistory; }

	/**
	 * Setter for readHistory
	 * @param value A flag for whether the server is able to return past versions as part of the vRead operation.
	 */
	public void setReadHistory(boolean value) { readHistory = value; }


	@Expose
	private boolean updateCreate;

	/**
	 * Getter for updateCreate
	 * @return A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
	 */
	public boolean getUpdateCreate() { return updateCreate; }

	/**
	 * Setter for updateCreate
	 * @param value A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
	 */
	public void setUpdateCreate(boolean value) { updateCreate = value; }


	@Expose
	private boolean conditionalCreate;

	/**
	 * Getter for conditionalCreate
	 * @return A flag that indicates that the server supports conditional create.
	 */
	public boolean getConditionalCreate() { return conditionalCreate; }

	/**
	 * Setter for conditionalCreate
	 * @param value A flag that indicates that the server supports conditional create.
	 */
	public void setConditionalCreate(boolean value) { conditionalCreate = value; }


	public enum ConditionalRead{
		@SerializedName("not-supported") NOT_SUPPORTED,
		@SerializedName("modified-since") MODIFIED_SINCE,
		@SerializedName("not-match") NOT_MATCH,
		@SerializedName("full-support") FULL_SUPPORT
	}

	@Expose
	private ConditionalRead conditionalRead;

	/**
	 * Getter for conditionalRead
	 * @return A code that indicates how the server supports conditional read.
	 */
	public ConditionalRead getConditionalRead() { return conditionalRead; }

	/**
	 * Setter for conditionalRead
	 * @param value A code that indicates how the server supports conditional read.
	 */
	public void setConditionalRead(ConditionalRead value) { conditionalRead = value; }


	@Expose
	private boolean conditionalUpdate;

	/**
	 * Getter for conditionalUpdate
	 * @return A flag that indicates that the server supports conditional update.
	 */
	public boolean getConditionalUpdate() { return conditionalUpdate; }

	/**
	 * Setter for conditionalUpdate
	 * @param value A flag that indicates that the server supports conditional update.
	 */
	public void setConditionalUpdate(boolean value) { conditionalUpdate = value; }


	public enum ConditionalDelete{
		@SerializedName("not-supported") NOT_SUPPORTED,
		@SerializedName("single") SINGLE,
		@SerializedName("multiple") MULTIPLE
	}

	@Expose
	private ConditionalDelete conditionalDelete;

	/**
	 * Getter for conditionalDelete
	 * @return A code that indicates how the server supports conditional delete.
	 */
	public ConditionalDelete getConditionalDelete() { return conditionalDelete; }

	/**
	 * Setter for conditionalDelete
	 * @param value A code that indicates how the server supports conditional delete.
	 */
	public void setConditionalDelete(ConditionalDelete value) { conditionalDelete = value; }


	@Expose
	private ArrayList<String> referencePolicy;

	/**
	 * Getter for referencePolicy
	 * @return A set of flags that defines how references are supported.
	 */
	public ArrayList<String> getReferencePolicy() { return referencePolicy; }

	/**
	 * Setter for referencePolicy
	 * @param value A set of flags that defines how references are supported.
	 */
	public void setReferencePolicy(ArrayList<String> value) { referencePolicy = value; }


	@Expose
	private ArrayList<String> searchInclude;

	/**
	 * Getter for searchInclude
	 * @return A list of _include values supported by the server.
	 */
	public ArrayList<String> getSearchInclude() { return searchInclude; }

	/**
	 * Setter for searchInclude
	 * @param value A list of _include values supported by the server.
	 */
	public void setSearchInclude(ArrayList<String> value) { searchInclude = value; }


	@Expose
	private ArrayList<String> searchRevInclude;

	/**
	 * Getter for searchRevInclude
	 * @return A list of _revinclude (reverse include) values supported by the server.
	 */
	public ArrayList<String> getSearchRevInclude() { return searchRevInclude; }

	/**
	 * Setter for searchRevInclude
	 * @param value A list of _revinclude (reverse include) values supported by the server.
	 */
	public void setSearchRevInclude(ArrayList<String> value) { searchRevInclude = value; }


	@Expose
	private ArrayList<CapabilityStatementSearchParam> searchParam;

	/**
	 * Getter for searchParam
	 * @return Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
	 */
	public ArrayList<CapabilityStatementSearchParam> getSearchParam() { return searchParam; }

	/**
	 * Setter for searchParam
	 * @param value Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
	 */
	public void setSearchParam(ArrayList<CapabilityStatementSearchParam> value) { searchParam = value; }


}
