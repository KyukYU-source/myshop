package com.myshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myshop.dao.MemberDAO;
import com.myshop.domain.MemberDTO;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("member")
	public String insert(MemberDTO memberDTO) {
		dao.insert(memberDTO);
		return "redirect:start.jsp";
	}
}

