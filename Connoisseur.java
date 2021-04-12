package com.yourcompany.connoisseur.model;



import javax.persistence.*;

import org.openxava.annotations.*;

//View editor
@View (members = 
"Connoisseur Details [" + 
"firstName;" + "lastName;" + "profilePhoto;" + " ]"
+  "Wine Finder [" + "wine;"  + " ];"
)

@Entity
public class Connoisseur extends Identifiable {
	
	@Column
	@Required
	private String firstName;
	private String lastName;
	
	@Stereotype("PHOTO")
	private byte[] profilePhoto;
	
	
	
	//Relationship between Connoisseur and Bottle
	//Many wine bottles can be drank by one connoisseur
	@ManyToOne
  private Wine wine;
	
	
	
	
	//Getters and Setters
	
	public Wine getWine() {
		return wine;
	}


	public void setWine(Wine wine) {
		this.wine = wine;
	}

	
	
	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public byte[] getProfilePhoto() {
		return profilePhoto;
	}


	public void setProfilePhoto(byte[] profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	
	
	

}
