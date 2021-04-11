package com.springrest.springrest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.springrest.springrest.entity.Resume;
import com.springrest.springrest.service.MyService;

@RestController
@CrossOrigin(origins="*")
public class MyController {
	
	@Autowired
	private MyService service;
	
	@GetMapping("/resume")
	public List<Resume> list() {
	    return service.listAll();
	}
	
	@PostMapping("/resume")
	  private Map<String,String> saveResume(@RequestBody Resume resume)
	{
		service.saveOrUpdate(resume);
		 HashMap<String,String> map=new HashMap<>();
	        map.put("firstname", resume.getFirstName());
		return map;
	}
	
	@GetMapping("/resume/{resumeid}")
	private Resume getResume(@PathVariable("resumeid") String resumeid)
	{    System.out.println(resumeid);
		return service.getResumeById(resumeid);
	}
	
	 @DeleteMapping("/delete/{id}")
	    public Map<String,String> deleteResume(@PathVariable(name = "id") String id) {
	        service.delete(id);
	        HashMap<String,String> map=new HashMap<>();
	        map.put("url", "http://127.0.0.1:5500/MW%20Assignment/Resume.html");
	        return map;
	    }
}


