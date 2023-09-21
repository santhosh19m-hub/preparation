package com.person.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.person.entity.Human;
import com.person.repository.HumanRepository;
@Repository
public class HumanDao {
@Autowired
HumanRepository hr;
	public String setHuman(Human h) {
		hr.save(h);
		return "Success";
	}
	public String setAllHuman(List<Human> h) {
		for(Human x:h) {
			if(x.getName()==null)
				continue;
			else
				hr.save(x);
		}
		return "Success";
	}
	public Human getById(int x) {
		return hr.findById(x).get();
	}
	public List<Human> getAll() {
		return hr.findAll();
	}
	public String deleteById(int x) {
		hr.deleteById(x);
		return "Deleted";
	}
	public String deleteAll() {
		hr.deleteAll();
		return "All Deleted";
	}
	public List<Human> findByAge(int x, int y) {
		return hr.findByAge(x,y);
	}
	public List<Human> findByNative(String x) {
		return hr.findByNative(x);
	}
	

}
