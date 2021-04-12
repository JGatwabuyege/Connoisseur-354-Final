package com.yourcompany.connoisseur.model;

import javax.persistence.*;

@Embeddable 
public class Address {
 
    @Column(length = 20) 
    private String addressLine1;
    
    @Column(length = 20) 
    private String addressLine2;
    
    @Column(length = 20)
    private String city;

	
    //Getters and setters
    public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
 
    


}