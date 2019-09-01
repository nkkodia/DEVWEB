package com.projet.GI.inscription;

import java.io.Serializable;
import java.sql.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inscription implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    private int id;

    //@Column(name = "code_postal")
    private String codePostal;

    private String commune;

    //@Column(name = "numero_et_voie")
    private String numeroEtVoie;

    private String pays;

    private String civilite;

    //@Column(name = "date_de_naissance")
    private Date dateDeNaissance;

    private String nom;

    private String prenom;

    //@Column(name = "reference_dossier")
    private String referenceDossier;

    //@Column(name = "diplome_id")
    private Long diplomeId;

    public Inscription() {

    }
    
    public int getId() {
        return id;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getCommune() {
        return commune;
    }

    public String getNumeroEtVoie() {
        return numeroEtVoie;
    }

    public String getPays() {
        return pays;
    }

    public String getCivilite() {
        return civilite;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getReferenceDossier() {
        return referenceDossier;
    }

    public Long getDiplomeId() {
        return diplomeId;
    }

    public Inscription(String referenceDossier) {
        /*this.codePostal = "";
        this.commune = "";
        this.numeroEtVoie = "";
        this.pays = "";
        this.civilite = "";
        this.dateDeNaissance = new Date(new java.util.Date().getTime());
        this.nom = "";
        this.prenom = "";
        this.referenceDossier = referenceDossier;*/
    } 
    public Inscription(int id, String codePostal, String commune, String numeroEtVoie, String pays, String civilite, Date dateDeNaissance, String nom, String prenom, String referenceDossier, Long diplomeId) {
        this.id = id;
        this.codePostal = codePostal;
        this.commune = commune;
        this.numeroEtVoie = numeroEtVoie;
        this.pays = pays;
        this.civilite = civilite;
        this.dateDeNaissance = dateDeNaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.referenceDossier = referenceDossier;
        this.diplomeId = diplomeId;
    }
   

   

    public void setId(int id) {
        this.id = id;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setNumeroEtVoie(String numeroEtVoie) {
        this.numeroEtVoie = numeroEtVoie;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setReferenceDossier(String referenceDossier) {
        this.referenceDossier = referenceDossier;
    }

    public void setDiplomeId(Long diplomeId) {
        this.diplomeId = diplomeId;
    }

}