
package com.matthewxu.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matthewxu.tacocloud.model.Order;

/**
 * Description:
 * @author Matthew Xu
 * @date Apr 13, 2021
 */
@Controller
@RequestMapping("/orders")
public class OrderController {

	@GetMapping("/current")
	public String orderForm(Model model){
		model.addAttribute("order", new Order());
		return "orderForm";
	}
	
	@PostMapping
	public String processOrder(@Validated Order order, Errors errors){
		try {
			if(errors.hasErrors())
				return "orderForm";
		} catch (Exception e) {
			System.out.println();
		}
		
		return "redirect:/";
	}
}
