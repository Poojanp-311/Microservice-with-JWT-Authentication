package com.jwt.model;


public class CategoryCount {
	
	private String API;
    private String Description;
    private String Auth;
    private boolean HTTPS;
    private String Cors;
    private String Link;
    private String Category;
    
    public CategoryCount() {
    	
    }

	public CategoryCount(String aPI, String description, String auth, boolean hTTPS, String cors, String link,
			String category) {
		super();
		API = aPI;
		Description = description;
		Auth = auth;
		HTTPS = hTTPS;
		Cors = cors;
		Link = link;
		Category = category;
	}

	public String getAPI() {
		return API;
	}

	public void setAPI(String aPI) {
		API = aPI;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getAuth() {
		return Auth;
	}

	public void setAuth(String auth) {
		Auth = auth;
	}

	public boolean isHTTPS() {
		return HTTPS;
	}

	public void setHTTPS(boolean hTTPS) {
		HTTPS = hTTPS;
	}

	public String getCors() {
		return Cors;
	}

	public void setCors(String cors) {
		Cors = cors;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
    
    

}
