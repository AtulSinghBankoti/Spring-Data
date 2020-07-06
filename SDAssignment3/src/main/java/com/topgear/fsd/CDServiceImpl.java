package com.topgear.fsd;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CDServiceImpl implements CDService{

	@Autowired
	CDRepository cdRepository; 
	
	@Override
	@Transactional(readOnly=true)
	public List<CD> cdByTitle(String cdTitle){ 	
		return cdRepository.findByCdTitle(cdTitle);
	}

	@Override
	@Transactional(readOnly=true)
	public List<CD> cdByPublisher(String cdPublisher) {
		return cdRepository.findByCdPublisher(cdPublisher);
	}

	@Override
	@Transactional(readOnly=true,timeout=1000)
	public List<CD> findAllCD() {
		return cdRepository.findAll();
	}
	

	@Modifying
	@Transactional
	public void save(CD cd) {
		cdRepository.save(cd);
	}

	@Modifying
	@Transactional(rollbackFor=SQLException.class)
	public void update(CD cd) {
		cdRepository.save(cd);
	}

	@Modifying
	@Transactional(rollbackFor=SQLException.class)
	public void delete(String id) {
		Long cid=Long.parseLong(id);
		cdRepository.delete(cid);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<CD> findById(Long id){
		List<CD> list=new ArrayList<>();
		list.add(cdRepository.findOne(id));
		return list;
	}
}