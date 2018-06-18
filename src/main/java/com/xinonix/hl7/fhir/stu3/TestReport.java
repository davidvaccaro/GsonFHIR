package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A summary of information based on the results of executing a TestScript.
 */
public class TestReport extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a TestReport resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a TestReport resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Identifier for the TestScript assigned for external purposes outside the context of FHIR.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier for the TestScript assigned for external purposes outside the context of FHIR.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A free text natural language name identifying the executed TestScript.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A free text natural language name identifying the executed TestScript.
	 */
	public void setName(String value) { name = value; }


	public enum Status{
		@SerializedName("completed") COMPLETED,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("waiting") WAITING,
		@SerializedName("stopped") STOPPED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The current state of this test report.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The current state of this test report.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Reference testScript;

	/**
	 * Getter for testScript
	 * @return Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`.
	 */
	public Reference getTestScript() { return testScript; }

	/**
	 * Setter for testScript
	 * @param value Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`.
	 */
	public void setTestScript(Reference value) { testScript = value; }


	public enum Result{
		@SerializedName("pass") PASS,
		@SerializedName("fail") FAIL,
		@SerializedName("pending") PENDING
	}

	@Expose
	private Result result;

	/**
	 * Getter for result
	 * @return The overall result from the execution of the TestScript.
	 */
	public Result getResult() { return result; }

	/**
	 * Setter for result
	 * @param value The overall result from the execution of the TestScript.
	 */
	public void setResult(Result value) { result = value; }


	@Expose
	private Double score;

	/**
	 * Getter for score
	 * @return The final score (percentage of tests passed) resulting from the execution of the TestScript.
	 */
	public Double getScore() { return score; }

	/**
	 * Setter for score
	 * @param value The final score (percentage of tests passed) resulting from the execution of the TestScript.
	 */
	public void setScore(Double value) { score = value; }


	@Expose
	private String tester;

	/**
	 * Getter for tester
	 * @return Name of the tester producing this report (Organization or individual).
	 */
	public String getTester() { return tester; }

	/**
	 * Setter for tester
	 * @param value Name of the tester producing this report (Organization or individual).
	 */
	public void setTester(String value) { tester = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date issued;

	/**
	 * Getter for issued
	 * @return When the TestScript was executed and this TestReport was generated.
	 */
	public Date getIssued() { return issued; }

	/**
	 * Setter for issued
	 * @param value When the TestScript was executed and this TestReport was generated.
	 */
	public void setIssued(Date value) { issued = value; }


	@Expose
	private ArrayList<TestReportParticipant> participant;

	/**
	 * Getter for participant
	 * @return A participant in the test execution, either the execution engine, a client, or a server.
	 */
	public ArrayList<TestReportParticipant> getParticipant() { return participant; }

	/**
	 * Setter for participant
	 * @param value A participant in the test execution, either the execution engine, a client, or a server.
	 */
	public void setParticipant(ArrayList<TestReportParticipant> value) { participant = value; }


	@Expose
	private TestReportSetup setup;

	/**
	 * Getter for setup
	 * @return The results of the series of required setup operations before the tests were executed.
	 */
	public TestReportSetup getSetup() { return setup; }

	/**
	 * Setter for setup
	 * @param value The results of the series of required setup operations before the tests were executed.
	 */
	public void setSetup(TestReportSetup value) { setup = value; }


	@Expose
	private ArrayList<TestReportTest> test;

	/**
	 * Getter for test
	 * @return A test executed from the test script.
	 */
	public ArrayList<TestReportTest> getTest() { return test; }

	/**
	 * Setter for test
	 * @param value A test executed from the test script.
	 */
	public void setTest(ArrayList<TestReportTest> value) { test = value; }


	@Expose
	private TestReportTeardown teardown;

	/**
	 * Getter for teardown
	 * @return The results of the series of operations required to clean up after the all the tests were executed (successfully or otherwise).
	 */
	public TestReportTeardown getTeardown() { return teardown; }

	/**
	 * Setter for teardown
	 * @param value The results of the series of operations required to clean up after the all the tests were executed (successfully or otherwise).
	 */
	public void setTeardown(TestReportTeardown value) { teardown = value; }


}
