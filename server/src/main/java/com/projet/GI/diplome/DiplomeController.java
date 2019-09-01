package com.projet.GI.diplome;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DiplomeController {

    @PersistenceContext(name="main")
    private EntityManager manager;


    DiplomeDao diplomeDao;
    @RequestMapping(value="/diplomes")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Diplome> getDiplomes() {
       
        return diplomeDao.findAll();
    }
    
    @RequestMapping(value="/addDiplome", method = RequestMethod.POST)
    @Transactional
    @CrossOrigin(origins = "http://localhost:8080")
    public Diplome addDiplome( Diplome dip) {
        System.out.println(dip.getUes().size());
        Diplome nouveauDiplome = new Diplome(null, null, null, null, null, null);


        manager.persist(nouveauDiplome);

        return nouveauDiplome;
    }
}
