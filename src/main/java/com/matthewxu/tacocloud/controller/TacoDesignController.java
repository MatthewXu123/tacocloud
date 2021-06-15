
package com.matthewxu.tacocloud.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.matthewxu.tacocloud.dao.IngredientRepository;
import com.matthewxu.tacocloud.dao.TacoRepository;
import com.matthewxu.tacocloud.model.Ingredient;
import com.matthewxu.tacocloud.model.Ingredient.Type;
import com.matthewxu.tacocloud.model.Order;
import com.matthewxu.tacocloud.model.Taco;

/**
 * Description:
 * @author Matthew Xu
 * @date Mar 29, 2021
 */
@Controller
@RequestMapping("/design")
@SessionAttributes(value = "order")
public class TacoDesignController {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	@Autowired
	private TacoRepository tacoRepository;

	@ModelAttribute(name = "order")
	public Order order(){
		return new Order();
	}
	
	@ModelAttribute(name = "taco")
	public Taco taco(){
		return new Taco();
	}
	
	@GetMapping
	public String showDesignForm(Model model){
		//test
		/*List<Ingredient> ingredients = Arrays.asList(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
				new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
				new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
				new Ingredient("CARN", "Carnitas", Type.PROTEIN),
				new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
				new Ingredient("LETC", "Lettuce", Type.VEGGIES),
				new Ingredient("CHED", "Cheddar", Type.CHEESE),
				new Ingredient("JACK", "MonterreyJack", Type.CHEESE),
				new Ingredient("SLSA", "Salsa", Type.SAUCE),
				new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
		
		Type[] types = Ingredient.Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
		}
		model.addAttribute("design", new Taco());
		return "design";*/
		List<Ingredient> ingredients = new ArrayList<>();
		ingredientRepository.findAll().forEach(i -> ingredients.add(i));
		Type[] types = Ingredient.Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
		}
		return "design";
	}
	
	@PostMapping
	public String processDesign(@Valid Taco design, Errors errors, @ModelAttribute Order order){
		if(errors.hasErrors())
			return "design";
		Taco taco = tacoRepository.save(design);
		//order.addDesign(taco);
		return "redirect:/orders/current";
	}
	
	private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type){
		return ingredients
				.stream()
				.filter(x -> x.getType().equals(type))
				.collect(Collectors.toList());
	}
	
}
