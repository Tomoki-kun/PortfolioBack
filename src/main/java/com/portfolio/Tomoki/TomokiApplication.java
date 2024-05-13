package com.portfolio.Tomoki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TomokiApplication {

    @GetMapping("/mensaje")
    
    public String mensaje(){
        return "Welcome from Java to Azure";
    }
	public static void main(String[] args) {
		SpringApplication.run(TomokiApplication.class, args);
	}

}
