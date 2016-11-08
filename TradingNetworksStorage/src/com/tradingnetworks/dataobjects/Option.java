package com.tradingnetworks.dataobjects;

/**
 * Created by Ana Puiu on 11/8/2016.
 */

public class Option {
	private String description;
	private Double share;
	private String id;
	
	public Option(String description, Double share,String id) {
		this.description = description;
		this.share = share;
		this.id=id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getShare() {
		return share;
	}
	public void setShare(Double share) {
		this.share = share;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
