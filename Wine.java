package com.yourcompany.connoisseur.model;

import java.math.*;
import java.util.*;


import javax.persistence.*;
import javax.persistence.Entity;

import org.openxava.annotations.*;


//View editor
@View (members = 
"Bottle details [" + 
"label, year;" +
		"price, dateDrank;" + 
"photo;" + 
		"favorite;" +  " ]"
		//+ "Scoring  ( Ratings out of  10 ) [" +   
		//"score;" + "];"
		
		+"Origin Finder [" +  "estate;" + " ];"
			
		
)

@Entity
public class Wine extends Identifiable{
	
	
	@Column
	@Required
	private String label;
	
	@Column
	private int year;
   
    
    @Temporal(TemporalType.TIMESTAMP)
   	private Date dateDrank;
   
    
    
    @Stereotype("MONEY")
    private BigDecimal price;
    
    @Stereotype("PHOTO")
	private byte[] photo;
    
    
    private boolean favorite = false;
   
 //Relationship between WineBottle and Estate
    // Many Wine Bottles can come from one Estate
    @ManyToOne
    private Estate estate;

	
    public Wine() {
    	
    	
        this.year = 0;
        this.label = "";
        
    }

    
    //Getters and Setters
    public Estate getEstate() {
		return estate;
	}


	public void setEstate(Estate estate) {
		this.estate = estate;
	}

    




	public BigDecimal getPrice() {
		return price;
	}




	public void setPrice(BigDecimal price) {
		this.price = price;
	}




	public byte[] getPhoto() {
		return photo;
	}




	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}




	public Date getDateDrank() {
		return dateDrank;
	}







	public void setDateDrank(Date dateDrank) {
		this.dateDrank = dateDrank;
	}







	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	
	

}
