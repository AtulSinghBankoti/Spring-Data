package com.topgear.fsd;

import java.util.List;

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
public class SdAssignment10Application {

	@Autowired
	CDService cDService;  
	
	@RequestMapping("/all")
	public List<CD> getAll(){
		return cDService.findAllCD();
	}
	
	@RequestMapping("/publisher/{cdPublisher}")
	public List<CD> getById(@PathVariable("cdPublisher")String cdPublisher){
		return cDService.cdByPublisher(cdPublisher);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SdAssignment10Application.class, args);
	}
}
