package com.projet.GI.ue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UEController {

    @PersistenceContext(name="main")
    private EntityManager manager;

    private UEDao uniteEnseignementDao;
    @RequestMapping(value="/ues")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<UE> getUes(){
        return uniteEnseignementDao.findAll();
    }
    
    @RequestMapping(value="/ajouterUE")
    @Transactional
    @CrossOrigin(origins = "http://localhost:8080")
    public UE ajouterUE( String code, String libelle, boolean obligatoire) {
        UE nouveauUE = new UE(code, libelle, obligatoire);
        manager.persist(nouveauUE);
        
        return nouveauUE;
    }
}