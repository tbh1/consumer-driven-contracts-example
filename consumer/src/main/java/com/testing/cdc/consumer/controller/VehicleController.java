package com.testing.cdc.consumer.controller;

import com.testing.cdc.consumer.delegate.VehicleDelegate;
import com.testing.cdc.consumer.model.InternalVehicle;
import com.testing.cdc.consumer.model.PublicVehicle;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by ted on 11/16/15.
 */
@RestController
@EnableAutoConfiguration
public class VehicleController {

    @RequestMapping(value = "/publicVehicle/{id}", method = RequestMethod.GET)
    public PublicVehicle getPublicVehicle(@PathVariable int id) throws JAXBException, IOException, URISyntaxException {
        return VehicleDelegate.getPublicVehicle(id);
    }

    @RequestMapping(value = "/internalVehicle/{id}", method = RequestMethod.GET)
    public InternalVehicle getInternalVehicle(@PathVariable int id) throws JAXBException, IOException, URISyntaxException {
        return VehicleDelegate.getInternalVehicle(id);
    }
}
