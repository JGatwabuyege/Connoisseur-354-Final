package com.yourcompany.connoisseur.model;



import javax.persistence.*;

import org.openxava.annotations.*;

@View (members =
"Connoisseur [ " + "connoisseur;" +"]" +
"Scoring (Max Rating out of 10) [" + "sweetness;" + "dryness;" + "tartness;" + "aroma;" 
+ "body;" + "taste;" + "finish;" + "total;" + "notes;" + " ]"
		+ "Wine Finder [" + " wine;" + " ]"
		)


@Entity
public class Score extends Identifiable {
	
		@Required
	 	private int sweetness;
	    private int dryness;
	    private int tartness;
	    private int aroma;
	    private int body;
	    private int taste;
	    private int finish;
	    
	    
	    @ReadOnly
	    @Calculation( "sweetness + dryness + tartness + aroma  + body + taste + finish")
	    private int total;
	    
	    @ManyToOne
	    private Connoisseur connoisseur;
	    
	    @Stereotype("MEMO")
	    private String notes;
	    
	    @ManyToOne
	    private Wine wine;
	    

		//Getters and Setters
	    public int getAroma() {
			return aroma;
		}

		public void setAroma(int aroma) {
			this.aroma = aroma;
		}

		public int getBody() {
			return body;
		}

		public void setBody(int body) {
			this.body = body;
		}

		public int getTaste() {
			return taste;
		}

		public void setTaste(int taste) {
			this.taste = taste;
		}

		public int getFinish() {
			return finish;
		}

		public void setFinish(int finish) {
			this.finish = finish;
		}
		
		public int getSweetness() {
			return sweetness;
		}

		public void setSweetness(int sweetness) {
			this.sweetness = sweetness;
		}

		public int getDryness() {
			return dryness;
		}

		public void setDryness(int dryness) {
			this.dryness = dryness;
		}

		public int getTartness() {
			return tartness;
		}

		public void setTartness(int tartness) {
			this.tartness = tartness;
		}
		public Connoisseur getConnoisseur() {
			return connoisseur;
		}

		public void setConnoisseur(Connoisseur connoisseur) {
			this.connoisseur = connoisseur;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total = 70;
		}

  
	    public String getNotes() {
			return notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}
	    
	    
	    
	 
		public Wine getWine() {
			return wine;
		}

		public void setWine(Wine wine) {
			this.wine = wine;
		}

}
