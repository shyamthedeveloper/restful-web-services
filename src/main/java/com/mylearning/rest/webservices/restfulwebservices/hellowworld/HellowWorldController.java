package com.mylearning.rest.webservices.restfulwebservices.hellowworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {
	
	@Autowired
	MessageSource messageSource;
	
	@GetMapping(path="/hellow_world")
	public String hellowWorld() {
		return "Hellow World";
	}
	
	@GetMapping(path="/hellow_world_bean")
	public HellowWorldBean hellowWorldBean() {
		return new HellowWorldBean("Hellow World");
	}
	
	@GetMapping(path="/hellow_world/path_variable/{name}")
	public HellowWorldBean hellowWorldPathVariable(@PathVariable String name) {
		return new HellowWorldBean(String.format("Hellow World, %s", name));
	}
	
	@GetMapping(path="/hellow_world_internationalized")
	public String hellowWorldInternationalized() {
		return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
	}

}
