package com.topgear.fsd;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CDRepository extends JpaRepository<CD, Long>{

		List<CD> findByCdTitle(String cdTitle);
		
		List<CD> findByCdPublisher(String cdPublisher);
}
