package com.imooc.web.controller;

import com.imooc.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "imooc");
		return "index";
	}

	@GetMapping("/404")
	public String notFountPage() {
		return "404";
	}

	@GetMapping("403")
	public String accessError() {
		return "403";
	}

	@GetMapping("/500")
	public String internalError() {
		return "500";
	}

	@GetMapping("/logout")
	public String logoutPage() {
		return "logout";
	}

}
