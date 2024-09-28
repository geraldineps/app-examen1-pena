package pe.edu.cibertec.app_examen1_Pena.restClient.naruto.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import pe.edu.cibertec.app_examen1_Pena.restClient.naruto.model.PersonajesNR;

@FeignClient(name = "narutoClient",
        url = "http://localhost:8081/naruto/")
public interface NarutoClient {

    @GetMapping("api/v1/personajeNR/{id}")
    PersonajesNR obtenerPersonajesNRXid(@PathVariable("id") Long codigo,
                                        @RequestHeader("Authorization") String token);
}
