package com.tradingnetworks.dataobjects;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Ana Puiu on 11/8/2016.
 */

public class Game {
	 private String description;
	 private Calendar startDate; 
	 private List<Option> options; 
	 private String id;
	 
	 public Game(String description, Calendar startDate, List<Option> options,String id) {
		this.description = description;
		this.startDate = startDate;
		this.options = options;
		this.setId(id);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
