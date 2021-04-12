package com.yourcompany.connoisseur.model;




import javax.persistence.*;

import org.openxava.annotations.*;


//View editor
@View (members = 
"Country Details [" + 
"name;" + "continent;" + " ]"
+  "Region Finder [" + "region;"  + " ];"
)



@Entity
public class Country extends Identifiable {
	
	@Column
	@Required
	private String name;

	
	
	//drop-down menu function for continents
	@Enumerated(EnumType.STRING)
	private Continent continent;
	public  enum Continent{africa, asia, europe, northAmerica,  oceania,  southAmerica };
	
	//Relationship between Country and Estate
	//Many wine estates can exist in one country
	@ManyToOne
	@DescriptionsList
	private Region region;
	
	
	
	
//Getters and setters

	public Continent getContinent() {
		return continent;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
