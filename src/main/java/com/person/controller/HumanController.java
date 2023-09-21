package com.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.customexception.NameNotFoundException;
import com.person.entity.Human;
import com.person.service.HumanService;

@RestController
public class HumanController {
@Autowired
HumanService hs;
@RequestMapping("/setHuman")
public String setHuman (@RequestBody Human h) throws NameNotFoundException {
	return hs.setHuman(h);
}
@RequestMapping("/setAllHuman")
public String setAllHuman(@RequestBody List<Human> h) {
	return hs.setAllHuman(h);
}
@RequestMapping("/getById/{x}")
public Human getById(@PathVariable int x) {
	return hs.getById(x);
}
@RequestMapping("/getAll")
public List<Human> getAll() {
	return hs.getAll();
}
@DeleteMapping("/deleteById/{x}")
public String deleteById(@PathVariable int x) {
	return hs.deleteById(x);
}
@DeleteMapping("/deleteAll")
public String deleteAll() {
	return hs.deleteAll();
}
@RequestMapping("/findByAge/{x}/{y}")
public List<Human> findByAge(@PathVariable int x,@PathVariable int y) {
	return hs.findByAge(x,y);
}
@RequestMapping("/findByNative/{x}")
public List<Human> findByNative(@PathVariable String x) {
	return hs.findByNative(x);
}
}