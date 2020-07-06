package com.topgear.fsd;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CDService {
	List<CD> cdByTitle(String cdTitle);
	
	List<CD> cdByPublisher(String cdPublisher);
	
	List<CD> findAllCD();

	void save(CD cd);
	
	void update(CD cd);
	
	void delete(String id);
	
	List<CD> findById(Long id); 
	
	List<CD> findByCdTitleLike(String cdTitle);
}
