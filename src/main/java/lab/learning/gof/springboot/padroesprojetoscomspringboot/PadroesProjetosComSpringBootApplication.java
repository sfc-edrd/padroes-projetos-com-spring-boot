package lab.learning.gof.springboot.padroesprojetoscomspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetosComSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetosComSpringBootApplication.class, args);
	}

}
