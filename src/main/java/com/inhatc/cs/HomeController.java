package com.inhatc.cs;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // *mvc �� ������̼ǿ� ����
public class HomeController { 
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET) // ������� ��û�� �������� �� ������� ��û�� �����ϴ� ������̼�
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; //
	}
	
	@RequestMapping(value = "/gugudan", method = RequestMethod.GET) // ������� ��û�� �������� �� ������� ��û�� �����ϴ� ������̼�
	public String gugudan() {	
		return "gugudan"; //
	}
	
	@RequestMapping(value = "/1to10", method = RequestMethod.GET) // ������� ��û�� �������� �� ������� ��û�� �����ϴ� ������̼�
	public String Ototen() {	
		return "1to10"; //
	}
	
	@RequestMapping(value = "/lotto", method = RequestMethod.GET) // ������� ��û�� �������� �� ������� ��û�� �����ϴ� ������̼�
	public String lotto() {	
		return "lotto"; //
	}
	
	@RequestMapping(value = "/sosu", method = RequestMethod.GET) // ������� ��û�� �������� �� ������� ��û�� �����ϴ� ������̼�
	public String sosu() {	
		return "sosu"; //
	}
	
	
}
