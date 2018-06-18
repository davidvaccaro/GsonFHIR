package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Raw data describing a biological sequence.
 */
public class SequenceQuality extends BackboneElement {
	public enum Type{
		@SerializedName("indel") INDEL,
		@SerializedName("snp") SNP,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return INDEL / SNP / Undefined variant.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value INDEL / SNP / Undefined variant.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private CodeableConcept standardSequence;

	/**
	 * Getter for standardSequence
	 * @return Gold standard sequence used for comparing against.
	 */
	public CodeableConcept getStandardSequence() { return standardSequence; }

	/**
	 * Setter for standardSequence
	 * @param value Gold standard sequence used for comparing against.
	 */
	public void setStandardSequence(CodeableConcept value) { standardSequence = value; }


	@Expose
	private Integer start;

	/**
	 * Getter for start
	 * @return Start position of the sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
	 */
	public Integer getStart() { return start; }

	/**
	 * Setter for start
	 * @param value Start position of the sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
	 */
	public void setStart(Integer value) { start = value; }


	@Expose
	private Integer end;

	/**
	 * Getter for end
	 * @return End position of the sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
	 */
	public Integer getEnd() { return end; }

	/**
	 * Setter for end
	 * @param value End position of the sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
	 */
	public void setEnd(Integer value) { end = value; }


	@Expose
	private Quantity score;

	/**
	 * Getter for score
	 * @return The score of an experimentally derived feature such as a p-value ([SO:0001685](http://www.sequenceontology.org/browser/current_svn/term/SO:0001685)).
	 */
	public Quantity getScore() { return score; }

	/**
	 * Setter for score
	 * @param value The score of an experimentally derived feature such as a p-value ([SO:0001685](http://www.sequenceontology.org/browser/current_svn/term/SO:0001685)).
	 */
	public void setScore(Quantity value) { score = value; }


	@Expose
	private CodeableConcept method;

	/**
	 * Getter for method
	 * @return Which method is used to get sequence quality.
	 */
	public CodeableConcept getMethod() { return method; }

	/**
	 * Setter for method
	 * @param value Which method is used to get sequence quality.
	 */
	public void setMethod(CodeableConcept value) { method = value; }


	@Expose
	private Double truthTP;

	/**
	 * Getter for truthTP
	 * @return True positives, from the perspective of the truth data, i.e. the number of sites in the Truth Call Set for which there are paths through the Query Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event.
	 */
	public Double getTruthTP() { return truthTP; }

	/**
	 * Setter for truthTP
	 * @param value True positives, from the perspective of the truth data, i.e. the number of sites in the Truth Call Set for which there are paths through the Query Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event.
	 */
	public void setTruthTP(Double value) { truthTP = value; }


	@Expose
	private Double queryTP;

	/**
	 * Getter for queryTP
	 * @return True positives, from the perspective of the query data, i.e. the number of sites in the Query Call Set for which there are paths through the Truth Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event.
	 */
	public Double getQueryTP() { return queryTP; }

	/**
	 * Setter for queryTP
	 * @param value True positives, from the perspective of the query data, i.e. the number of sites in the Query Call Set for which there are paths through the Truth Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event.
	 */
	public void setQueryTP(Double value) { queryTP = value; }


	@Expose
	private Double truthFN;

	/**
	 * Getter for truthFN
	 * @return False negatives, i.e. the number of sites in the Truth Call Set for which there is no path through the Query Call Set that is consistent with all of the alleles at this site, or sites for which there is an inaccurate genotype call for the event. Sites with correct variant but incorrect genotype are counted here.
	 */
	public Double getTruthFN() { return truthFN; }

	/**
	 * Setter for truthFN
	 * @param value False negatives, i.e. the number of sites in the Truth Call Set for which there is no path through the Query Call Set that is consistent with all of the alleles at this site, or sites for which there is an inaccurate genotype call for the event. Sites with correct variant but incorrect genotype are counted here.
	 */
	public void setTruthFN(Double value) { truthFN = value; }


	@Expose
	private Double queryFP;

	/**
	 * Getter for queryFP
	 * @return False positives, i.e. the number of sites in the Query Call Set for which there is no path through the Truth Call Set that is consistent with this site. Sites with correct variant but incorrect genotype are counted here.
	 */
	public Double getQueryFP() { return queryFP; }

	/**
	 * Setter for queryFP
	 * @param value False positives, i.e. the number of sites in the Query Call Set for which there is no path through the Truth Call Set that is consistent with this site. Sites with correct variant but incorrect genotype are counted here.
	 */
	public void setQueryFP(Double value) { queryFP = value; }


	@Expose
	private Double gtFP;

	/**
	 * Getter for gtFP
	 * @return The number of false positives where the non-REF alleles in the Truth and Query Call Sets match (i.e. cases where the truth is 1/1 and the query is 0/1 or similar).
	 */
	public Double getGtFP() { return gtFP; }

	/**
	 * Setter for gtFP
	 * @param value The number of false positives where the non-REF alleles in the Truth and Query Call Sets match (i.e. cases where the truth is 1/1 and the query is 0/1 or similar).
	 */
	public void setGtFP(Double value) { gtFP = value; }


	@Expose
	private Double precision;

	/**
	 * Getter for precision
	 * @return QUERY.TP / (QUERY.TP + QUERY.FP).
	 */
	public Double getPrecision() { return precision; }

	/**
	 * Setter for precision
	 * @param value QUERY.TP / (QUERY.TP + QUERY.FP).
	 */
	public void setPrecision(Double value) { precision = value; }


	@Expose
	private Double recall;

	/**
	 * Getter for recall
	 * @return TRUTH.TP / (TRUTH.TP + TRUTH.FN).
	 */
	public Double getRecall() { return recall; }

	/**
	 * Setter for recall
	 * @param value TRUTH.TP / (TRUTH.TP + TRUTH.FN).
	 */
	public void setRecall(Double value) { recall = value; }


	@Expose
	private Double fScore;

	/**
	 * Getter for fScore
	 * @return Harmonic mean of Recall and Precision, computed as: 2 * precision * recall / (precision + recall).
	 */
	public Double getFScore() { return fScore; }

	/**
	 * Setter for fScore
	 * @param value Harmonic mean of Recall and Precision, computed as: 2 * precision * recall / (precision + recall).
	 */
	public void setFScore(Double value) { fScore = value; }


}
