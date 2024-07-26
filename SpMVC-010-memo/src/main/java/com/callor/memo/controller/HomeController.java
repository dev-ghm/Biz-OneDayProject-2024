package com.callor.memo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.memo.models.MemoVO;
import com.callor.memo.persistance.MemoDao;
import com.callor.memo.service.MemoService;



/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {
	
	private final MemoDao memoDao;
	
	public HomeController(MemoService memoService, MemoDao memoDao) {
		super();
		this.memoDao = memoDao;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insert() {
		return "memo/input";
	}
	

	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(MemoVO memoVO,Model model) {
		model.addAttribute("STD",memoVO);
		
		int result = memoDao.insert(memoVO);
		
//		List<StudentVO> stList = studentDao.selectAll();
//		model.addAttribute("ST_LIST",stList);
//		return "home";
		
		return "redirect:/";
		
	}
	
}
