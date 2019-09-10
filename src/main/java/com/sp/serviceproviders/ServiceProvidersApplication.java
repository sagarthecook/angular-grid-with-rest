package com.sp.serviceproviders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ServiceProvidersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProvidersApplication.class, args);
	}

}
