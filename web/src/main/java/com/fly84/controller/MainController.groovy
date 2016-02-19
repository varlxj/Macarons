package com.fly84.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

import com.fly84.dao.UserDao
import com.fly84.service.UserService

@Controller
class MainController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/frame")
	public String show(Model model){
		model.addAttribute("title","PON后台管理系统")
			
		return "frame";
	}
}
