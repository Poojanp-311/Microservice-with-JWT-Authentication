package com.jwt.model;

import java.util.List;

public class ApiModel {
	
	private int count;
	private List<CategoryCount> entries;
	
	public ApiModel() {
		
	}
	
	public ApiModel(int count, List<CategoryCount> entries) {
		super();
		this.count = count;
		this.entries = entries;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<CategoryCount> getEntries() {
		return entries;
	}

	public void setEntries(List<CategoryCount> entries) {
		this.entries = entries;
	}
	
	
	
	
	

}
