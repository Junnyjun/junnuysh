package com.example.jdkupdate;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdkupdateApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(JdkupdateApplication.class);
		app.setBannerMode(Banner.Mode.OFF);   //요 부분
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
