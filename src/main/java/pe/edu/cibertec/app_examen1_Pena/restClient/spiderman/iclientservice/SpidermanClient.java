package pe.edu.cibertec.app_examen1_Pena.restClient.spiderman.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import pe.edu.cibertec.app_examen1_Pena.restClient.spiderman.model.PersonajesSP;

@FeignClient(name = "spidermanClient",
        url = "http://localhost:8055/spiderman/")
public interface SpidermanClient {

    @GetMapping("api/v1/personajeSP/{id}")
    PersonajesSP obtenerPersonajesSPXid(@PathVariable("id") Long codigo,
                                        @RequestHeader("Authorization") String token);
}
