package com.example.service;


import com.example.model.Model;

public interface ModelService {
	Model getModelById(Integer id);
	
	 Iterable<Model> listAllModels();

}
