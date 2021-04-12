package com.yourcompany.connoisseur.model;

import javax.persistence.*;

import org.openxava.annotations.*;


@View (members = 
"Region Information [" + 
"name;" + "terroir;"  + " ]"
+  "Variety Finder [" + "variety;"  + " ];"
)

@Entity
public class Region extends Identifiable {

	@Column
	@Required
	private String name;
	
	
	//Memo box to give feedback with regards to the terroir of the region. Climate, soil, etc.
	@Stereotype("MEMO")
    private String terroir;
	
	
	//Relationship between Region and variety
	//Many regions can grow a variety
	@ManyToOne
	private Variety variety;
	
	
	
	//Getters and Setters
	

	public String getTerroir() {
		return terroir;
	}
	

	public Variety getVariety() {
		return variety;
	}


	public void setVariety(Variety variety) {
		this.variety = variety;
	}


	public void setTerroir(String terroir) {
		this.terroir = terroir;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
