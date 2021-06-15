
package com.matthewxu.tacocloud.config;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Description:
 * @author Matthew Xu
 * @date Jun 15, 2021
 */
@Component
public class MyPasswordEncoder implements PasswordEncoder{

	@Override
	public String encode(CharSequence arg0) {
		return arg0.toString();
	}

	@Override
	public boolean matches(CharSequence arg0, String arg1) {
		return arg0.toString().equals(arg1);
	}

}
