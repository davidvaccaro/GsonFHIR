package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementSupportedMessage extends BackboneElement {
	public enum Mode{
		@SerializedName("sender") SENDER,
		@SerializedName("receiver") RECEIVER
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return The mode of this event declaration - whether application is sender or receiver.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value The mode of this event declaration - whether application is sender or receiver.
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private Reference definition;

	/**
	 * Getter for definition
	 * @return Points to a message definition that identifies the messaging event, message structure, allowed responses, etc.
	 */
	public Reference getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value Points to a message definition that identifies the messaging event, message structure, allowed responses, etc.
	 */
	public void setDefinition(Reference value) { definition = value; }


}
