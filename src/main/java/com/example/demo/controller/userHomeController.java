package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller// ctrl + shift + o 를 누르면 자동으로 import 생성 
public class userHomeController {
	@RequestMapping("/usr/home/main") // /usr/home/main 주소로 요청이 들어오면 아래 showMain function 이 실행된다.
	@ResponseBody
	public String showMain() {
		return "Hello";
	}
}
