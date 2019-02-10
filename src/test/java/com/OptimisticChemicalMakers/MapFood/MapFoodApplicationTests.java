package com.OptimisticChemicalMakers.MapFood;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;
import com.optimisticchemicalmakers.mapfood.models.DeliveryRoute;
import com.optimisticchemicalmakers.mapfood.models.Geolocation;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.services.DeliveryOrderService;
import com.optimisticchemicalmakers.mapfood.services.DeliveryRouteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapFoodApplicationTests {


	@Autowired
	private MockMvc mvc;

	@Test
	public void storesCloserTeste() throws Exception {

		mvc.perform(get("/api/stores/-30.07997904/-51.18289546")
	               .accept(MediaType.APPLICATION_JSON))
	               .andExpect(status().isOk())
	               .andExpect(jsonPath("$", notNullValue()));
	}

	@Test
	public void productByStoreTeste() throws Exception {

		mvc.perform(get("/api/productByStore/d5bb47709b5ea9d797a937b0a82728a3490c7845551200434bde3f10c0abccff")
	               .accept(MediaType.APPLICATION_JSON))
	               .andExpect(status().isOk())
	               .andExpect(jsonPath("$", notNullValue()));
	}



}

