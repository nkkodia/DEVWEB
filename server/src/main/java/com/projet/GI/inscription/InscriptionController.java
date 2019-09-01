package com.projet.GI.inscription;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscriptionController {
    @PersistenceContext(name="main")
    private EntityManager manager;

    @Autowired
    InscriptionDao inscriptionDao;
    @RequestMapping(value = "/StartInsc")
    @Transactional
    @CrossOrigin(origins = "http://localhost:8080")

    public Inscription StartInsc() {
	
    	String P = "GK0000";
        Inscription newInscription = new Inscription(P);
        manager.persist(newInscription);

        System.out.println(newInscription.getId());

        return newInscription;
    }
    
    @RequestMapping(value = "/getInscriptions")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Inscription> getInscriptions() {
        return inscriptionDao.findAll();
    }

    @RequestMapping(value = "/saveInscription", method = RequestMethod.POST)
    @Transactional
    @CrossOrigin(origins = "http://localhost:8080")
    public Inscription saveInscription( Inscription setting) {
        
        Inscription miseAjour = inscriptionDao.getOne((long) setting.getId());

        miseAjour.setCivilite(setting.getCivilite());
        miseAjour.setCodePostal(setting.getCodePostal());
        miseAjour.setCommune(setting.getCommune());
        miseAjour.setDateDeNaissance(setting.getDateDeNaissance());
        miseAjour.setDiplomeId(setting.getDiplomeId());
        miseAjour.setNom(setting.getNom());
        miseAjour.setNumeroEtVoie(setting.getNumeroEtVoie());
        miseAjour.setPays(setting.getPays());
        miseAjour.setPrenom(setting.getPrenom());
        miseAjour.setReferenceDossier(setting.getReferenceDossier());

        inscriptionDao.save(miseAjour);

        return miseAjour;
    }
}