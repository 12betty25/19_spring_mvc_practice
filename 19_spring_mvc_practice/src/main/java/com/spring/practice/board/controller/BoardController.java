package com.spring.practice.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.practice.board.service.BoardService;

@Controller
public class BoardController {
		
	@Autowired
	private BoardService boardService; //service에서 가져오기
	
	//1. 글쓰기화면으로 보내기

	
}
