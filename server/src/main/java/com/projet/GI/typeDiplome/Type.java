package com.projet.GI.typeDiplome;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="type_diplome")
public class Type implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    private int id;

    private String libelle;
    
    public int getId() {
        return this.id;
    }
    
    
    public String getLibelle() {
        return this.libelle;
    }

    

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Type(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }


  


}
