package com.topgear.fsd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;

@Service
public class CDServiceImpl implements CDService{

	@Autowired
	CDRepository cdRepository; 
	

	@Override
	public List<CD> cdByPublisher(String cdPublisher) {
		List<CD> li=new ArrayList<>();
		QCD cd=QCD.cD;
		Predicate predicate=cd.cdPublisher.eq(cdPublisher);
		Iterable<CD> itr=cdRepository.findAll(predicate);
		for(CD c:itr) {
			li.add(c);
		}
		return li;
	}

	@Override
	public List<CD> findAllCD() {
		return cdRepository.findAll();
	}
}