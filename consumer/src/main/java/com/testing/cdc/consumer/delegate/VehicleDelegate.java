package com.testing.cdc.consumer.delegate;

import com.testing.cdc.consumer.model.InternalVehicle;
import com.testing.cdc.consumer.model.PublicVehicle;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ted on 11/16/15.
 */
public class VehicleDelegate {

    private static RestTemplate restTemplate = new RestTemplate();
    private final static String producerUrl = "http://localhost:8080/vehicle/";

    public static PublicVehicle getPublicVehicle(int id) {
        return restTemplate.getForObject(producerUrl + id, PublicVehicle.class);
    }

    public static InternalVehicle getInternalVehicle(int id) {
        return restTemplate.getForObject(producerUrl + id, InternalVehicle.class);
    }

}
