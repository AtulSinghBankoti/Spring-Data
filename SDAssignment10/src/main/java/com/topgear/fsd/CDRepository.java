package com.topgear.fsd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface CDRepository extends JpaRepository<CD, Long>,QueryDslPredicateExecutor<CD>{

}
