package com.yourcompany.connoisseur.model;


import javax.persistence.*;

import org.openxava.annotations.*;

@View (members = 
"Variety Information [" + 
"varietyName;" + "category;" + " ]"
+  "Estate Finder [" + "estate;"  + " ];"
)


@Entity
public class Variety extends Identifiable{
	
	@Column
	@Required
	private String varietyName;
	
	
	//Drop-down menu functions for categories
	private Category category;
	public  enum Category{red,white, pink, bubbly,sweetRed, sweetWhite};
	
	
	//Relationship between Variety and Estate
	//Many varieties can come from one estate.
	@ManyToOne
	private Estate estate;
	

	
	//Getters and setters
	public Estate getEstate() {
		return estate;
	}

	public void setEstate(Estate estate) {
		this.estate = estate;
	}

	public String getVarietyName() {
		return varietyName;
	}

	public void setVarietyName(String varietyName) {
		this.varietyName = varietyName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
	
	
	

}
