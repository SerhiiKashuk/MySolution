package com.example.repositiries;

import org.springframework.data.repository.CrudRepository;


import com.example.model.Model;

public interface ModelRepository extends CrudRepository<Model, Integer> {

	Model findOne(Integer id);
	//Model findBySurname(String surname);

}
