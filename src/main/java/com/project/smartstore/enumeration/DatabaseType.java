package com.project.smartstore.enumeration;

public enum DatabaseType {
  MASTER("master"), SLAVE("slave");
	
	final private String type;
	
	public String getType() {
		return type;
	}
	
	private DatabaseType(String type) {
		this.type = type;
	}
}
