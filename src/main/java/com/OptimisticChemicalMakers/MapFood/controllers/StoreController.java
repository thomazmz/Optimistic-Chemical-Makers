package com.OptimisticChemicalMakers.MapFood.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.Services.StoreService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping(value = "/stores", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Store> getStores() {
        return storeService.findAll();
    }
	
	@RequestMapping(value = "/stores/{latitude}/{longitude}", method = RequestMethod.GET, produces = "application/json")
    public List<Store> getStoreCloser(@PathVariable String latitude,@PathVariable String longitude) {
        return storeService.getCloser(latitude,longitude);
    }
	
	@RequestMapping(value = "/stores/{id}", method = RequestMethod.GET, produces = "application/json")
    public Store getStore(@PathVariable String id) {
        return storeService.findById(id);
    }

}
