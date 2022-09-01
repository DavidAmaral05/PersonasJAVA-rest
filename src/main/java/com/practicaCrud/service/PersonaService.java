
package com.practicaCrud.service;

import com.practicaCrud.entity.Persona;
import com.practicaCrud.repo.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepo personarepo;
    
    public Persona insertar (Persona per){
        return personarepo.save(per);
    }
    
    public Persona actualizar (Persona per){
        return personarepo.save(per);
    }
    
    public List<Persona> listar (){
        return personarepo.findAll();
    }
    
    public void eliminar (Persona per){
        personarepo.delete(per);
    }
}
