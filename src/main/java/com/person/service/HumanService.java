package com.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.customexception.NameNotFoundException;
import com.person.dao.HumanDao;
import com.person.entity.Human;
@Service
public class HumanService {
@Autowired
HumanDao hd;
	public String setHuman(Human h) throws NameNotFoundException {
		if(h.getName()==null)
			throw new NameNotFoundException("Name is Empty");
		else
		return hd.setHuman(h);
	}
	public String setAllHuman(List<Human> h) {
		return hd.setAllHuman(h);
	}
	public Human getById(int x) {
		return hd.getById(x);
	}
	public List<Human> getAll() {
		return hd.getAll();
	}
	public String deleteById(int x) {
		return hd.deleteById(x);
	}
	public String deleteAll() {
		return hd.deleteAll();
	}
	public List<Human> findByAge(int x, int y) {
		return hd.findByAge(x,y);
	}
	public List<Human> findByNative(String x) {
		return hd.findByNative(x);
	}

}
