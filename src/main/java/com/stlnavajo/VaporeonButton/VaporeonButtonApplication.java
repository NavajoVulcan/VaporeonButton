package com.stlnavajo.VaporeonButton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class VaporeonButtonApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaporeonButtonApplication.class, args);
	}

}

//test commit