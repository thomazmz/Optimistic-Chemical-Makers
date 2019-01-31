package com.OptimisticChemicalMakers.MapFood.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.StoreRepository;

@CrossOrigin(origins = "http://localhost:4200")
@Service
public class StoreService {
	
	@Autowired
	public StoreRepository storeRepository;

	public Iterable<Store> findAll() {
		Iterable<Store> stores = storeRepository.findAll();
		return stores;
	}

	public List<Store> getCloser(String latitude, String longitude) {
		List<Store> stores = storeRepository.getCloser(latitude, longitude,5);
		return stores;
	}

	public Store findById(String id) {
		Store store = storeRepository.findById(id).get();
		return store;
	}
	
	

}
