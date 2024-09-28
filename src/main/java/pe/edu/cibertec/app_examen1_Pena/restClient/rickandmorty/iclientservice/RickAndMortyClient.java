package pe.edu.cibertec.app_examen1_Pena.restClient.rickandmorty.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import pe.edu.cibertec.app_examen1_Pena.restClient.rickandmorty.model.PersonajesRM;

@FeignClient(name = "rickAndMortyClient",
        url = "https://rickandmortyapi.com/")
public interface RickAndMortyClient {

    @GetMapping("api/character/{id}")
    PersonajesRM obtenerPersonajesRMXid(@PathVariable("id") Long id,
                                        @RequestHeader("Authorization") String token);
}
