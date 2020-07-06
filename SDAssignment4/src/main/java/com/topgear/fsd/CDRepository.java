package com.topgear.fsd;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CDRepository extends JpaRepository<CD, Long>{
		
		@Query(value="select * from CD where CDTITLE like :cdTitle",nativeQuery=true)
		List<CD> findByCdTitle(@Param("cdTitle")String cdTitle);
		
		List<CD> findByCdPublisher(String cdPublisher);
		
		@Query("select x from  CD x where x.cdPrice between :p1 and :p2")
		List<CD> findByCdPriceBetween(@Param("p1")Float p1,@Param("p2")Float p2);
		
		List<CD> findPriceRangeNamedParams(@Param("p1")Float p1,@Param("p2")Float p2);
		
		@Query("select x from CD x where x.cdTitle like :cdTitle")
		List<CD> findByCdTitleLike(@Param("cdTitle")String cdTitle);
		
		@Query("from CD order by cdTitle")
		//@Query("from CD order by cdPrice desc")
		List<CD> findAllSorted();

}
