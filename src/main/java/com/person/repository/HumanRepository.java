package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.person.entity.Human;

public interface HumanRepository extends JpaRepository<Human, Integer>{
	@Query(value="select * from human_details where age>=? and age<=?",nativeQuery=true)
	List<Human> findByAge(int x, int y);
	@Query(value="select * from human_details where natiive=?",nativeQuery=true)
	List<Human> findByNative(String x);

}
