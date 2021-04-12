package com.yourcompany.connoisseur.model;

import javax.persistence.*;

import org.openxava.annotations.*;




@View (members = 
"Estate Information [" + 
"estateName;" + "wineMaker;" + "established;" + "logo;" + "address;" + " ]"
+  "Country Finder [" + "country;" + "region;"  + " ];"
)



@Entity
public class Estate extends Identifiable {
	
	@Column
	@Required
	private String estateName;
	
	@Column
	private String wineMaker;
	private String established;
	
	 @Stereotype("PHOTO")
		private byte[] logo;
	 
	 @Embedded 
	    private Address address; 
	
	
	

	public Address getAddress() {
		if (address == null) address = new Address();
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	//Relationship between Estate and Region
	//many wine Estates can belong to one region
	@ManyToOne
	@DescriptionsList
	private Region region;
	
	@ManyToOne
	@DescriptionsList
	private Country country;
	
	
	

	

	
	//Getters and setters
	public String getEstateName() {
		return estateName;
	}

	public void setEstateName(String estateName) {
		this.estateName = estateName;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	public String getWineMaker() {
		return wineMaker;
	}

	public void setWineMaker(String wineMaker) {
		this.wineMaker = wineMaker;
	}

	public String getEstablished() {
		return established;
	}

	public void setEstablished(String established) {
		this.established = established;
	}
	
	public byte[] getLogo() {
		return logo;
	}


	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}