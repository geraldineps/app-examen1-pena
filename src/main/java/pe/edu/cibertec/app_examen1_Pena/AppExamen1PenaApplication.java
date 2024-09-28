package pe.edu.cibertec.app_examen1_Pena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppExamen1PenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppExamen1PenaApplication.class, args);
	}

}
