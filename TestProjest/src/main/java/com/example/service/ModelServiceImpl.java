package com.example.service;

import org.springframework.stereotype.Service;
import com.example.model.Model;
import com.example.repositiries.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService {

	private ModelRepository modelRepository;

	@Override
	public Model getModelById(Integer id) {
		// TODO Auto-generated method stub
		return modelRepository.findOne(id);
	}

	@Override
	public Iterable<Model> listAllModels() {
		// TODO Auto-generated method stub
		return modelRepository.findAll();

	}
}
