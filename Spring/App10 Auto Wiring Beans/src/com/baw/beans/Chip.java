package com.baw.beans;


public class Chip implements IChip {
	
	private Integer chipId;
	private String chipType;
	
	public Integer getChipId() {
		return chipId;
	}
	public void setChipId(Integer chipId) {
		this.chipId = chipId;
	}
	public String getChipType() {
		return chipType;
	}
	public void setChipType(String chipType) {
		this.chipType = chipType;
	}
	@Override
	public String toString() {
		return "Chip [chipId=" + chipId + ", chipType=" + chipType + "]";
	}
	
	
	
	
	

}
