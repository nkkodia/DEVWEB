package com.projet.GI.ue;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.projet.GI.diplome.Diplome;

@Entity
public class UE implements Serializable {

    //private static final long serialVersionUID = -8842097378115751532L;

 
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    private int id;

    private String code;

    private String libelle;

    private boolean obligatoire;
    
    public String getCode() {
        return this.code;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public boolean getObligatoire() {
        return this.obligatoire;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setObligatoire(boolean obligatoire) {
        this.obligatoire = obligatoire;
    }

    @ManyToMany(mappedBy = "ues", cascade = CascadeType.ALL)
    private Set<Diplome> diplomes;

    public UE(String code, String libelle, boolean obligatoire) {
        this.code = code;
        this.libelle = libelle;
        this.obligatoire = obligatoire;
    }

   

}