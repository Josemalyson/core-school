package com.br.josemalyson.school.config;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/")
public class ConfigApp {

	@PostConstruct
	public void init() {
		System.out.println("Inicialization Application School By Josemalyson");
	}
}
