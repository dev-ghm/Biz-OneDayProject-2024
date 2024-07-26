package com.callor.student.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.callor.student.models.UserVO;
import com.callor.student.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller

// http://localhost:8080/student/user 源뚯��쓽 �슂泥��쓣 泥섎━�븷 遺�遺�
@RequestMapping(value="/user")
public class UserController {
	
	private final UserService userService;
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	// http://localhost:8080/student/user/join 源뚯��쓽 �슂泥��쓣 泥섎━�븷 遺�遺�
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	// �쉶�썝媛��엯 �솕硫댁뿉 �엯�젰�썑 �쉶�썝媛��엯 �떊泥��쓣 �뻽�쓣�븣 
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(UserVO userVO,Model model) {
		
		// console �뿉 �뵒踰꾧렇 硫붿떆吏�瑜� �몴�떆�븯�뒗 method
		log.debug("�뤌�뿉�꽌 �쟾�떖諛쏆� �뜲�씠�꽣 : {}",userVO.toString());
		
		int ret = userService.join(userVO);
		if(ret < 1) {
			model.addAttribute("JOIN_MSG","FAIL");
			return "user/join";
		}
		return "redirect:/";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(
			@RequestParam(required = false, defaultValue = "") String error,
			Model model) {
		
		if(error.equalsIgnoreCase("NEED")) {
			model.addAttribute("MSG","濡쒓렇�씤�씠 �븘�슂�빀�땲�떎");
		}
		log.debug(model.toString());
		// return user/join �� 媛숈쑝
		return null;
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(UserVO userVO, HttpSession httpSession) {
		httpSession.setAttribute("USER", userVO);
		return "redirect:/";
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String admin() {
		return null;
	}
}
