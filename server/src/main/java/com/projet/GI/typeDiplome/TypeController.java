package com.projet.GI.typeDiplome;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypeController {

    @PersistenceContext(name="main")
    private EntityManager manager;
    TypeDao typeDao;
    
    @RequestMapping(value="/typesDiplomes")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Type> getTypes() {
        return typeDao.findAll();
    }
    
    @RequestMapping(value="ajouterunType", method = RequestMethod.POST)
    @Transactional
    @CrossOrigin(origins = "http://localhost:8080")
    public Type ajouterunType(String libelle) {
        int id = 0;
		Type nouveauType = new Type(id, libelle);
        manager.persist(nouveauType);

        return nouveauType;
    }
   

}
