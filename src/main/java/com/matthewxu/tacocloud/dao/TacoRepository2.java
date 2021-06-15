package com.matthewxu.tacocloud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matthewxu.tacocloud.model.Taco;

@Repository
public interface TacoRepository2 extends CrudRepository<Taco, Long> {

}
