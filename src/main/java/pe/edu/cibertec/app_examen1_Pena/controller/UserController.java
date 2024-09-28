package pe.edu.cibertec.app_examen1_Pena.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_examen1_Pena.restClient.naruto.model.PersonajesNR;
import pe.edu.cibertec.app_examen1_Pena.restClient.rickandmorty.model.PersonajesRM;
import pe.edu.cibertec.app_examen1_Pena.restClient.spiderman.model.PersonajesSP;
import pe.edu.cibertec.app_examen1_Pena.service.UserService;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/rickandmorty/{id}")
    public PersonajesRM obtenerPersonajesRickAndMortyXid(
            @PathVariable("id") Long id){
        return userService.obtenerPersonajeRMXid(id);
    }

    @GetMapping("/spiderman/{id}")
    public PersonajesSP obtenerPersonajesSpidermanXid(
            @PathVariable("id") Long id){
        return userService.obtenerPersonajeSPXid(id);
    }

    @GetMapping("/naruto/{id}")
    public PersonajesNR obtenerPersonajesNarutoXid(
            @PathVariable("id") Long id){
        return userService.obtenerPersonajeNRXid(id);
    }
}
