package com.topgear.fsd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CDServiceImpl implements CDService{

	@Autowired
	CDRepository cdRepository; 
	
	@Override
	public List<CD> cdByTitle(String cdTitle){ 	
		return cdRepository.findByCdTitle(cdTitle);
	}

	@Override
	public List<CD> cdByPublisher(String cdPublisher) {
		return cdRepository.findByCdPublisher(cdPublisher);
	}

	@Override
	public List<CD> findAllCD() {
		return cdRepository.findAll();
	}
}