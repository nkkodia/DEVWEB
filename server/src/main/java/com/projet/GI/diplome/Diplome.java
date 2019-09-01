package com.projet.GI.diplome;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.projet.GI.typeDiplome.Type;
import com.projet.GI.ue.UE;

@Entity
public class Diplome implements Serializable {

 
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    private int id;

    private String code;
    private String libelle;
    private String descriptif;
    @ManyToOne
    private Type type;
    
    @Column(name="enseignant_responsable")
    private String responsable;

    @ManyToMany
    @JoinTable(
        name = "diplome_unites",
        joinColumns = @JoinColumn(name = "diplome_id") ,
        inverseJoinColumns = @JoinColumn(name = "unites_id")
    )
    private Set<UE> ues;
    
    public int getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public String getDescriptif() {
        return this.descriptif;
    }

    public Type getType() {
        return this.type;
    }

    public String getResponsable() {
        return this.responsable;
    }

    public Set<UE> getUes() {
        return this.ues;
    }
    
    


    public void setId(int id) {
        this.id = id;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setUes(Set<UE> ues) {
        this.ues = ues;
    }

    public Diplome(String code, String libelle, String descriptif, Type type, String responsable, Set<UE> ues) {
        this.code = code;
        this.libelle = libelle;
        this.descriptif = descriptif;
        this.type = type;
        this.responsable = responsable;
    }


};
