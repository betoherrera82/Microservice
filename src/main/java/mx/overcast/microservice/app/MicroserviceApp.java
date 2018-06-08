package mx.overcast.microservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "mx.overcast.microservice")
public class MicroserviceApp {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApp.class, args);
	}
}
