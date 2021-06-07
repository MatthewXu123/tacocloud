
package com.matthewxu.tacocloud.dao;

import com.matthewxu.tacocloud.model.Taco;

/**
 * Description:
 * @author Matthew Xu
 * @date Jun 7, 2021
 */
public interface TacoRepository {

	Taco save(Taco taco);
}
