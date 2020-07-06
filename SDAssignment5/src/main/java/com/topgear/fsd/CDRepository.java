package com.topgear.fsd;

import java.util.List;

import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface CDRepository extends JpaRepository<CD, Long>{

		List<CD> findByCdTitle(String cdTitle);
		
		List<CD> findByCdPublisher(String cdPublisher);
		
		List<CD> findCdByPrice(@Param("cdPrice")Float cdPrice); 
}
