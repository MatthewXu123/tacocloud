
package com.matthewxu.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * @author Matthew Xu
 * @date Feb 26, 2021
 */
//@Controller
//@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String home(){
		return "home";
	}
}
