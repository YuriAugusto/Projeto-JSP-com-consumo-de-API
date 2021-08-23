package com.brq.internet.projetojspbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.brq.internet.projetojspbase" })
public class ProjetoJspBaseApplication extends SpringBootServletInitializer {
	
	//caminho base da API
	public final static String PATH_API_BASE = "https://api.themoviedb.org/3";
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoJspBaseApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProjetoJspBaseApplication.class);
	}

	@Bean//criação de WebTarget
	public WebTarget webTarget() {
		return ClientBuilder.newClient().target(PATH_API_BASE);
	}
	
}
