package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GeographicPosition {

    // Static Properties

    private static final int EARTH_RADIUS = 6371; // Approx Earth radius in KM

    // Class Properties

    @Id                                                 // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.AUTO)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    private double latitude;

    private double longitude;

    // Constructors

    public GeographicPosition(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Static Methods

    public static double haversinDistance(double startingPointLatitude, double startingPointLongitude, double endingPointLatitude, double endingPointLongitude) {

        double dLat  = Math.toRadians((endingPointLatitude - startingPointLatitude));
        double dLong = Math.toRadians((endingPointLongitude - startingPointLongitude));

        startingPointLatitude = Math.toRadians(startingPointLatitude);
        endingPointLatitude   = Math.toRadians(endingPointLatitude);

        double a = haversin(dLat) + Math.cos(startingPointLatitude) * Math.cos(endingPointLatitude) * haversin(dLong);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS * c;
    }

    public static double haversin(double value) {
        return Math.pow(Math.sin(value / 2), 2);
    }

    // Get Methods

    public Long getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // Set Methods

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setPosition(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Class Methods

    public double distanceTo(GeographicPosition geographicPosition) {

        return this.haversinDistance(this.getLatitude(), this.getLongitude(), geographicPosition.getLatitude(), geographicPosition.getLongitude());

    }

}



