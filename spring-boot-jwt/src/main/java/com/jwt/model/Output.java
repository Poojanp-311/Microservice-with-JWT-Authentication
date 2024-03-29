package com.jwt.model;

public class Output {
	
	private String Category;
	private int count;
	
	public Output() {
		
	}
	
	

	public Output(String category, int count) {
		super();
		Category = category;
		this.count = count;
	}



	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

}
