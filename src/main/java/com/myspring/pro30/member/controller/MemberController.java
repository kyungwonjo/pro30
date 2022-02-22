package com.myspring.pro30.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.pro30.member.vo.MemberVO;



public interface MemberController {
	
	ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView addMember(MemberVO member, HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView removeMember(String id, HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView updateMember(MemberVO member, HttpServletRequest request, HttpServletResponse response)
			throws Exception;

	ModelAndView modMember(String id, HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView login(@ModelAttribute("member") MemberVO member, RedirectAttributes rAttr, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView form(String result, String action, HttpServletRequest request, HttpServletResponse response)
			throws Exception;
}