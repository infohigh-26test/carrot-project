package com.infohigh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";

	@GetMapping("/sub")
	public String sub() {
		return "sub";
	}	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/seji")
	public String seji() {
		return "seji";
	}
	@GetMapping("/seji2")
	public String seji2() {
		return "seji2";
	}
	@GetMapping("/board")
	public String board() {
		return "board";
	}
}
