package com.inhatc.cs;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.ProductVO;

@Controller
public class CsController3 {
	
	@RequestMapping("doD")
	public String doD(  Model model   ) {
		
		System.out.println("doD Called !~~~~~~~~");
		ProductVO product = new ProductVO("inhatc Product", 1000);
		
		
		model.addAttribute(product);
		
		
		return "productDetail"; 
	}
	
	@RequestMapping("doE")
	public String doE( Model model) {
		
		System.out.println("doE Called !~~~~~~~~");
		MemberVO membervo = new MemberVO("«—øÎ¡ÿ");
		
		model.addAttribute(membervo);
		
		return "memberDetail"; 
	}

}
