package com.topgear.fsd;

import java.util.List;

public interface CDService {
	
	List<CD> cdByPublisher(String cdPublisher);
	
	List<CD> findAllCD();

}
