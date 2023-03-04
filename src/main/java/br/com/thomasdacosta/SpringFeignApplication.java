package br.com.thomasdacosta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignApplication.class, args);
	}

}
