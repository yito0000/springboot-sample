package com.sample.springboot.springbootsample.app;

import com.sample.springboot.springbootsample.dto.Hoge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class HelloController {

	@GetMapping("/api/hello")
	public String showHello() throws JsonProcessingException {
		Hoge hoge = new Hoge(1, "hello");
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(hoge);
		
		return json;
	}
}
