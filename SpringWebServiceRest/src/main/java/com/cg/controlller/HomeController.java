package com.cg.controlller;

import java.util.Date;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Message;

@RestController
@RequestMapping("/test")
public class HomeController {

	@GetMapping(value="/", produces= {"application/json"})
	public Message testGet()
	{
		return new Message("This is get request");
	}
	
	@PostMapping(value="/", produces= {"application/json", "application/xml"})
	public Message testPost()
	{
		return new Message("this is post");
	}
	
	@PutMapping(value="/", produces= {"application/xml", "application/json"})
	public Message testPut()
	{
		return new Message("this is put");
	}
	
	@DeleteMapping(value="/", produces= {"application/json", "application/xml"})
	public Message testDelete()
	{
		return new Message("this is delete");
	}
}
