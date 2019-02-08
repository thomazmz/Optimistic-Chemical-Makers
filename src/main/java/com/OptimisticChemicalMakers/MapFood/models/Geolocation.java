package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

@Embeddable
@MappedSuperclass
public class Geolocation {

    // Static Properties

    private static final int EARTH_RADIUS = 6371; // Approx Earth radius in KM

    // Class Properties

    private Float latitude;

    private Float longitude;

    // Constructors
    public Geolocation() {
    }

    
    public Geolocation(Float latitude, Float longitude) {

        if (latitude < -90 || latitude > 90) {
            throw new NullPointerException("Latitude values must be between -90 and 90!");
        } else if (longitude < -180 || longitude > 180) {
            throw new NullPointerException("Longitude values must be between -180 and 180!");
        } else {
            this.latitude = latitude;
            this.longitude = longitude;
        }
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

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    // Set Methods

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public void setPosition(Float latitude, Float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
  
    // Class Methods

    public double distanceTo(Float latitude, Float longitude) {
        return this.distanceTo(new Geolocation(latitude, longitude));
    }

    @SuppressWarnings("static-access")
	public double distanceTo(Geolocation geolocation) {
        return this.haversinDistance(this.latitude, this.longitude, geolocation.getLatitude(), geolocation.getLongitude());
    }
}
