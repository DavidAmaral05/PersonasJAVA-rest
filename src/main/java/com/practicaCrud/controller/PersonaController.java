
package com.practicaCrud.controller;

import com.practicaCrud.entity.Persona;
import com.practicaCrud.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaservice;
    
    @GetMapping
    public List<Persona> listar(){
        return personaservice.listar();
    }
    
    @PostMapping
    public Persona insertar(@RequestBody Persona per){
        return personaservice.insertar(per);
    }
    
    @PutMapping
    public Persona actualizar(@RequestBody Persona per){
        return personaservice.actualizar(per);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Persona per){
        personaservice.eliminar(per);
    }
}
