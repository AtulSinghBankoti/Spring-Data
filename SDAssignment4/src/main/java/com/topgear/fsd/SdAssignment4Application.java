package com.topgear.fsd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaRepositories(basePackages="com.topgear.fsd")
@SpringBootApplication
public class SdAssignment4Application {

	@Autowired
	CDService cDService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public List<CD> save(@RequestBody CD cd){
		 cDService.save(cd);
		 return cDService.findById(cd.getCdId());
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public List<CD> update(@RequestBody CD cd){
		cDService.save(cd);
		return cDService.findById(cd.getCdId());
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")String id){
		 cDService.delete(id);
	}
	
	@RequestMapping("/title/{cdTitle}")
	public List<CD> cdByTitle(@PathVariable("cdTitle") String cdTitle){ 	
		return cDService.findByCdTitleLike(cdTitle);
	}
	
	@RequestMapping("/{id}")
	public List<CD> cdById(@PathVariable("id") String id){ 	
		return cDService.findById(Long.parseLong(id));
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
		SpringApplication.run(SdAssignment4Application.class, args);
	}
}
