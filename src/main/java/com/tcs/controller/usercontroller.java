package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.Service.ServiceI;
import com.tcs.model.user;

@Controller
public class usercontroller {
	@Autowired
	private ServiceI serviceI;
	
@GetMapping("/Home")
	public String savedata() {
		return "Home";
		
	}
	@PostMapping("/reg")
	public String savedata(user user, Model model) {
		
		int save = serviceI.savedata(user);
		model.addAttribute("save", save);
		return "reg";
		
	}
	@GetMapping("/get")
	public String getdata(user user,Model model) {
		List<user> list = serviceI.getdata(user);
		model.addAttribute("list", list);
		return "get";
		
	}
	@GetMapping("/edite/{id}")
	public String edite(@PathVariable int id,Model model) {
		user user = serviceI.edite(id);
	    model.addAttribute("user", user);
		return "edite";
		
	}
	
	@GetMapping("/update")
	public String up() {
		return "update";
		
	}
	
       @PostMapping("/up")
	public String updatedata(user user,Model model) {
		user update = serviceI.update(user);
		
		model.addAttribute("update", update);
		
		return "up";
		
	}
       @GetMapping("/login")
       public String log() {
    	   
		return "login";
    	   
    	   
       }
       
       
       @PostMapping("/cheack")
       public String logincheack(user user,Model model) {
    	   
    	com.tcs.model.user user1 = serviceI.logincheack(user); 
    	model.addAttribute("user1", user);
    	if(user1==null) {
    		return "loginfail";
    		
    	}
		return "loginsucess";
    	   
    	   
    	   
       }
	
}
