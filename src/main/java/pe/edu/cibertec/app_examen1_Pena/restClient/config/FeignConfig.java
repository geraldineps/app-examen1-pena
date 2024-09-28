package pe.edu.cibertec.app_examen1_Pena.restClient.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.app_examen1_Pena.restClient.errorhandler.CustomErrorDecoder;


@Configuration
public class FeignConfig {
    @Bean
    public ErrorDecoder errorDecoder(){
        return new CustomErrorDecoder();
    }
}
