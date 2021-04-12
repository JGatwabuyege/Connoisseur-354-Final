package com.yourcompany.connoisseur.model;



import javax.persistence.*;
import org.hibernate.annotations.*;
import org.openxava.annotations.*;
 
@MappedSuperclass
public class Identifiable {
 
    @Id @GeneratedValue(generator="system-uuid") @Hidden
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @Column(length=32)
	protected String oid;
 
    
    //Getters and Setters
    public String getOid() {
        return oid;
    }
 
    public void setOid(String oid) {
        this.oid = oid;
    }
 
}