
package com.matthewxu.tacocloud.controller;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Description:
 * @author Matthew Xu
 * @date Mar 1, 2021
 */
@RunWith(SpringRunner.class)
@WebMvcTest
public class HomeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	/**
	 * Test method for {@link com.matthewxu.tacocloud.controller.HomeController#home()}.
	 * @throws Exception 
	 */
	@Test
	public void testHome() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.view().name("home"))
			.andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Welcome")));
	}

}
