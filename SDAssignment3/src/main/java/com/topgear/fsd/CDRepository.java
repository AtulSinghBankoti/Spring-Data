package com.topgear.fsd;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

public interface CDRepository extends JpaRepository<CD, Long>{

		List<CD> findByCdTitle(String cdTitle);
		
		List<CD> findByCdPublisher(String cdPublisher);
}
