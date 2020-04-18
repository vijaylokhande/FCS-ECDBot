package com.fcs.ecdb.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pc_name", "st_code", "ps_lat_long_1_coordinate", "gender", "rln_name_v2", "rln_name_v1",
		"rln_name_v3", "name_v1", "epic_no", "ac_name", "name_v2", "name_v3", "ps_lat_long", "pc_no", "last_update",
		"id", "dist_no", "ps_no", "ps_name", "ps_name_v1", "st_name", "dist_name", "rln_type", "pc_name_v1",
		"part_name_v1", "ac_name_v1", "part_no", "dist_name_v1", "ps_lat_long_0_coordinate", "_version_", "name",
		"section_no", "ac_no", "slno_inpart", "rln_name", "age", "part_name" })
public class Doc {

	@JsonProperty("pc_name")
	private String pcName;
	@JsonProperty("st_code")
	private String stCode;
	@JsonProperty("ps_lat_long_1_coordinate")
	private Integer psLatLong1Coordinate;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("rln_name_v2")
	private String rlnNameV2;
	@JsonProperty("rln_name_v1")
	private String rlnNameV1;
	@JsonProperty("rln_name_v3")
	private String rlnNameV3;
	@JsonProperty("name_v1")
	private String nameV1;
	@JsonProperty("epic_no")
	private String epicNo;
	@JsonProperty("ac_name")
	private String acName;
	@JsonProperty("name_v2")
	private String nameV2;
	@JsonProperty("name_v3")
	private String nameV3;
	@JsonProperty("ps_lat_long")
	private String psLatLong;
	@JsonProperty("pc_no")
	private String pcNo;
	@JsonProperty("last_update")
	private String lastUpdate;
	@JsonProperty("id")
	private String id;
	@JsonProperty("dist_no")
	private String distNo;
	@JsonProperty("ps_no")
	private String psNo;
	@JsonProperty("ps_name")
	private String psName;
	@JsonProperty("ps_name_v1")
	private String psNameV1;
	@JsonProperty("st_name")
	private String stName;
	@JsonProperty("dist_name")
	private String distName;
	@JsonProperty("rln_type")
	private String rlnType;
	@JsonProperty("pc_name_v1")
	private String pcNameV1;
	@JsonProperty("part_name_v1")
	private String partNameV1;
	@JsonProperty("ac_name_v1")
	private String acNameV1;
	@JsonProperty("part_no")
	private String partNo;
	@JsonProperty("dist_name_v1")
	private String distNameV1;
	@JsonProperty("ps_lat_long_0_coordinate")
	private Number psLatLong0Coordinate;
	@JsonProperty("_version_")
	private Number version;
	@JsonProperty("name")
	private String name;
	@JsonProperty("section_no")
	private String sectionNo;
	@JsonProperty("ac_no")
	private String acNo;
	@JsonProperty("slno_inpart")
	private String slnoInpart;
	@JsonProperty("rln_name")
	private String rlnName;
	@JsonProperty("age")
	private Integer age;
	@JsonProperty("part_name")
	private String partName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("pc_name")
	public String getPcName() {
		return pcName;
	}

	@JsonProperty("pc_name")
	public void setPcName(String pcName) {
		this.pcName = pcName;
	}

	@JsonProperty("st_code")
	public String getStCode() {
		return stCode;
	}

	@JsonProperty("st_code")
	public void setStCode(String stCode) {
		this.stCode = stCode;
	}

	@JsonProperty("ps_lat_long_1_coordinate")
	public Integer getPsLatLong1Coordinate() {
		return psLatLong1Coordinate;
	}

	@JsonProperty("ps_lat_long_1_coordinate")
	public void setPsLatLong1Coordinate(Integer psLatLong1Coordinate) {
		this.psLatLong1Coordinate = psLatLong1Coordinate;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("rln_name_v2")
	public String getRlnNameV2() {
		return rlnNameV2;
	}

	@JsonProperty("rln_name_v2")
	public void setRlnNameV2(String rlnNameV2) {
		this.rlnNameV2 = rlnNameV2;
	}

	@JsonProperty("rln_name_v1")
	public String getRlnNameV1() {
		return rlnNameV1;
	}

	@JsonProperty("rln_name_v1")
	public void setRlnNameV1(String rlnNameV1) {
		this.rlnNameV1 = rlnNameV1;
	}

	@JsonProperty("rln_name_v3")
	public String getRlnNameV3() {
		return rlnNameV3;
	}

	@JsonProperty("rln_name_v3")
	public void setRlnNameV3(String rlnNameV3) {
		this.rlnNameV3 = rlnNameV3;
	}

	@JsonProperty("name_v1")
	public String getNameV1() {
		return nameV1;
	}

	@JsonProperty("name_v1")
	public void setNameV1(String nameV1) {
		this.nameV1 = nameV1;
	}

	@JsonProperty("epic_no")
	public String getEpicNo() {
		return epicNo;
	}

	@JsonProperty("epic_no")
	public void setEpicNo(String epicNo) {
		this.epicNo = epicNo;
	}

	@JsonProperty("ac_name")
	public String getAcName() {
		return acName;
	}

	@JsonProperty("ac_name")
	public void setAcName(String acName) {
		this.acName = acName;
	}

	@JsonProperty("name_v2")
	public String getNameV2() {
		return nameV2;
	}

	@JsonProperty("name_v2")
	public void setNameV2(String nameV2) {
		this.nameV2 = nameV2;
	}

	@JsonProperty("name_v3")
	public String getNameV3() {
		return nameV3;
	}

	@JsonProperty("name_v3")
	public void setNameV3(String nameV3) {
		this.nameV3 = nameV3;
	}

	@JsonProperty("ps_lat_long")
	public String getPsLatLong() {
		return psLatLong;
	}

	@JsonProperty("ps_lat_long")
	public void setPsLatLong(String psLatLong) {
		this.psLatLong = psLatLong;
	}

	@JsonProperty("pc_no")
	public String getPcNo() {
		return pcNo;
	}

	@JsonProperty("pc_no")
	public void setPcNo(String pcNo) {
		this.pcNo = pcNo;
	}

	@JsonProperty("last_update")
	public String getLastUpdate() {
		return lastUpdate;
	}

	@JsonProperty("last_update")
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("dist_no")
	public String getDistNo() {
		return distNo;
	}

	@JsonProperty("dist_no")
	public void setDistNo(String distNo) {
		this.distNo = distNo;
	}

	@JsonProperty("ps_no")
	public String getPsNo() {
		return psNo;
	}

	@JsonProperty("ps_no")
	public void setPsNo(String psNo) {
		this.psNo = psNo;
	}

	@JsonProperty("ps_name")
	public String getPsName() {
		return psName;
	}

	@JsonProperty("ps_name")
	public void setPsName(String psName) {
		this.psName = psName;
	}

	@JsonProperty("ps_name_v1")
	public String getPsNameV1() {
		return psNameV1;
	}

	@JsonProperty("ps_name_v1")
	public void setPsNameV1(String psNameV1) {
		this.psNameV1 = psNameV1;
	}

	@JsonProperty("st_name")
	public String getStName() {
		return stName;
	}

	@JsonProperty("st_name")
	public void setStName(String stName) {
		this.stName = stName;
	}

	@JsonProperty("dist_name")
	public String getDistName() {
		return distName;
	}

	@JsonProperty("dist_name")
	public void setDistName(String distName) {
		this.distName = distName;
	}

	@JsonProperty("rln_type")
	public String getRlnType() {
		return rlnType;
	}

	@JsonProperty("rln_type")
	public void setRlnType(String rlnType) {
		this.rlnType = rlnType;
	}

	@JsonProperty("pc_name_v1")
	public String getPcNameV1() {
		return pcNameV1;
	}

	@JsonProperty("pc_name_v1")
	public void setPcNameV1(String pcNameV1) {
		this.pcNameV1 = pcNameV1;
	}

	@JsonProperty("part_name_v1")
	public String getPartNameV1() {
		return partNameV1;
	}

	@JsonProperty("part_name_v1")
	public void setPartNameV1(String partNameV1) {
		this.partNameV1 = partNameV1;
	}

	@JsonProperty("ac_name_v1")
	public String getAcNameV1() {
		return acNameV1;
	}

	@JsonProperty("ac_name_v1")
	public void setAcNameV1(String acNameV1) {
		this.acNameV1 = acNameV1;
	}

	@JsonProperty("part_no")
	public String getPartNo() {
		return partNo;
	}

	@JsonProperty("part_no")
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	@JsonProperty("dist_name_v1")
	public String getDistNameV1() {
		return distNameV1;
	}

	@JsonProperty("dist_name_v1")
	public void setDistNameV1(String distNameV1) {
		this.distNameV1 = distNameV1;
	}

	@JsonProperty("ps_lat_long_0_coordinate")
	public Number getPsLatLong0Coordinate() {
		return psLatLong0Coordinate;
	}

	@JsonProperty("ps_lat_long_0_coordinate")
	public void setPsLatLong0Coordinate(Number psLatLong0Coordinate) {
		this.psLatLong0Coordinate = psLatLong0Coordinate;
	}

	@JsonProperty("_version_")
	public Number getVersion() {
		return version;
	}

	@JsonProperty("_version_")
	public void setVersion(Number version) {
		this.version = version;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("section_no")
	public String getSectionNo() {
		return sectionNo;
	}

	@JsonProperty("section_no")
	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}

	@JsonProperty("ac_no")
	public String getAcNo() {
		return acNo;
	}

	@JsonProperty("ac_no")
	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	@JsonProperty("slno_inpart")
	public String getSlnoInpart() {
		return slnoInpart;
	}

	@JsonProperty("slno_inpart")
	public void setSlnoInpart(String slnoInpart) {
		this.slnoInpart = slnoInpart;
	}

	@JsonProperty("rln_name")
	public String getRlnName() {
		return rlnName;
	}

	@JsonProperty("rln_name")
	public void setRlnName(String rlnName) {
		this.rlnName = rlnName;
	}

	@JsonProperty("age")
	public Integer getAge() {
		return age;
	}

	@JsonProperty("age")
	public void setAge(Integer age) {
		this.age = age;
	}

	@JsonProperty("part_name")
	public String getPartName() {
		return partName;
	}

	@JsonProperty("part_name")
	public void setPartName(String partName) {
		this.partName = partName;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@Override
	public String toString() {
		return   id.trim() + ","
				+ sectionNo.trim() + "," 
				+ slnoInpart.trim() + ","
	            + stCode.trim() + ","
	            + stName.trim() + "," 
	    	    + distNo.trim() + ","
	            + distName.trim() + ","
	            + distNameV1.trim() + ","
	            
	            + pcNo.trim()+","
	            + pcName.trim() + ","
	            + pcNameV1.trim() + ","
	            
	            + acNo.trim() + "," 
	            + acName.trim() + ","
	            + acNameV1.trim() + ","
	            
	            + partNo.trim() + ","
	            + partName.trim() + ","
	            + partNameV1.trim() + ","
	            
				+ epicNo.trim() + ","	
				+ name.trim() + ","
				+ nameV1.trim() + ","	
				+ nameV2.trim() + "," 
				+ nameV3.trim() + ","
				
			    + gender.trim() + ","
			    + age + ","
			    
			    + rlnName.trim() + ","
				+ rlnType.trim() + "," 
				+ rlnNameV1.trim() + "," 
				+ rlnNameV2.trim() + ","
				+ rlnNameV3.trim() + "," 
				
				+ psNo.trim() + ","
				+ psName.trim() + "," 
				+ psNameV1.trim() + "," 
				
				+ psLatLong1Coordinate + ","
				+ psLatLong0Coordinate + "," 
				
				+ lastUpdate.trim() + ","  
				+ version + ","				
			    + additionalProperties;
	}
	

	public String toString1() {
		return   "id,sectionNo,slnoInpart,stCode,stName,distNo,distName,distNameV1,pcNo,pcName,pcNameV1,acNo,acName,acNameV1,partNo,partName,partNameV1,epicNo,name,nameV1,nameV2,nameV3,gender,age,rlnName,rlnType,rlnNameV1,rlnNameV2,rlnNameV3,psNo,psName,psNameV1,psLatLong1Coordinate,psLatLong0Coordinate,lastUpdate,version,additionalProperties";
	}

//	@Override
//	public String toString() {
//		return pcName.trim() + "," + stCode.trim() + "," + psLatLong1Coordinate + "," + gender.trim() + ","
//				+ rlnNameV2.trim() + "," + rlnNameV1.trim() + "," + rlnNameV3.trim() + "," + nameV1.trim() + ","
//				+ epicNo.trim() + "," + acName.trim() + "," + nameV2.trim() + "," + nameV3.trim() + ","
//				+ pcNo.trim() + "," + lastUpdate.trim() + "," + id.trim() + "," + distNo.trim()
//				+ "," + psNo.trim() + "," + psName.trim() + "," + psNameV1.trim() + "," + stName.trim() + ","
//				+ distName.trim() + "," + rlnType.trim() + "," + pcNameV1.trim() + "," + partNameV1.trim() + ","
//				+ acNameV1.trim() + "," + partNo.trim() + "," + distNameV1.trim() + "," + psLatLong0Coordinate + ","
//				+ version + "," + name.trim() + "," + sectionNo.trim() + "," + acNo.trim() + "," + slnoInpart.trim()
//				+ "," + rlnName.trim() + "," + age + "," + partName.trim() + "," + additionalProperties;
//	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}