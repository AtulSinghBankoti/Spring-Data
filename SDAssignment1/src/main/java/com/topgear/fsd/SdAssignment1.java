package com.topgear.fsd;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableJpaRepositories(basePackages="com.topgear.fsd")
@SpringBootApplication
public class SdAssignment1 {

	@Autowired
	CDService cDService;
	
	
	@RequestMapping("/title/{cdTitle}")
	public List<CD> cdByTitle(@PathVariable("cdTitle") String cdTitle){ 	
		return cDService.cdByTitle(cdTitle);
	}

	@RequestMapping("/publisher/{cdPublisher}")
	public List<CD> cdByPublisher(@PathVariable("cdPublisher") String cdPublisher) {
		return cDService.cdByPublisher(cdPublisher);
	}

	@RequestMapping("/all")
	public List<CD> findAllCD() {
		return cDService.findAllCD();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SdAssignment1.class, args);
	}
}
