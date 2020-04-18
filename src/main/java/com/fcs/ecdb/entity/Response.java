package com.fcs.ecdb.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "docs", "numFound", "start" })
public class Response {

	@JsonProperty("docs")
	private List<Doc> docs = null;
	@JsonProperty("numFound")
	private Integer numFound;
	@JsonProperty("start")
	private Integer start;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("docs")
	public List<Doc> getDocs() {
		return docs;
	}

	@JsonProperty("docs")
	public void setDocs(List<Doc> docs) {
		this.docs = docs;
	}

	@JsonProperty("numFound")
	public Integer getNumFound() {
		return numFound;
	}

	@JsonProperty("numFound")
	public void setNumFound(Integer numFound) {
		this.numFound = numFound;
	}

	@JsonProperty("start")
	public Integer getStart() {
		return start;
	}

	@JsonProperty("start")
	public void setStart(Integer start) {
		this.start = start;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}