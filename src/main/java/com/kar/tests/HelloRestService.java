package com.kar.tests;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestService {

	private AtomicInteger counter=new AtomicInteger(1);
	private Map<String, String> map=new HashMap<String, String>();
	
	@RequestMapping(method=RequestMethod.PUT,path="/sayHelloTo")
	public String sayHelloTo(@RequestParam(value="name") String name){
		map.put(String.valueOf(counter.getAndIncrement()),name);
		return "success";
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/sayHelloTo")
	public Map<String, String> sayHelloTo(){
		return map;
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/timenow")
	public Time getTimeNow(){
		return new Time(new Date());
	}
	}
	

