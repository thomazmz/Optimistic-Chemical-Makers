package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.models.GeographicPosition;
import com.OptimisticChemicalMakers.MapFood.models.User;
import com.OptimisticChemicalMakers.MapFood.repositories.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeographicPositionController {

    // GET /distance
    // Return the distance between points
    @GetMapping(value = "/distance")
    public String getDistance(

            @RequestParam("sLatitude") double sLatitude,
            @RequestParam("sLongitude") double sLongitude,
            @RequestParam("eLatitude") double eLatitude,
            @RequestParam("eLongitude") double eLongitude

    ) {

        double distance = GeographicPosition.haversinDistance(sLatitude, sLongitude, eLatitude, eLongitude);

        return Double.toString(distance);

    }

}
