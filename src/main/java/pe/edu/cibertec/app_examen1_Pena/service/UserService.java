package pe.edu.cibertec.app_examen1_Pena.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_examen1_Pena.restClient.naruto.iclientservice.NarutoClient;
import pe.edu.cibertec.app_examen1_Pena.restClient.naruto.model.PersonajesNR;
import pe.edu.cibertec.app_examen1_Pena.restClient.rickandmorty.iclientservice.RickAndMortyClient;
import pe.edu.cibertec.app_examen1_Pena.restClient.rickandmorty.model.PersonajesRM;
import pe.edu.cibertec.app_examen1_Pena.restClient.spiderman.iclientservice.SpidermanClient;
import pe.edu.cibertec.app_examen1_Pena.restClient.spiderman.model.PersonajesSP;

//@AllArgsConstructor
@RequiredArgsConstructor
@Service
public class UserService {

    private final RickAndMortyClient rickAndMortyClient;
    private final SpidermanClient spidermanClient;
    private final NarutoClient narutoClient;

    public PersonajesRM obtenerPersonajeRMXid(Long id){
        return rickAndMortyClient.obtenerPersonajesRMXid(id,
                "Bearer aqui_token");
    }

    public PersonajesSP obtenerPersonajeSPXid(Long id){
        return spidermanClient.obtenerPersonajesSPXid(id,
                "Bearer aqui_token");
    }

    public PersonajesNR obtenerPersonajeNRXid(Long id){
        return narutoClient.obtenerPersonajesNRXid(id,
                "Bearer aqui_token");
    }
}
