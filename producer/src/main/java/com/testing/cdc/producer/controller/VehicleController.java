package com.testing.cdc.producer.controller;

import com.testing.cdc.producer.delegate.VehicleDelegate;
import com.testing.cdc.producer.model.Vehicle;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URISyntaxException;

/**
 * Created by ted on 11/16/15.
 */
@RestController
@EnableAutoConfiguration
public class VehicleController {

    @RequestMapping(value = "/vehicle/{id}", method = RequestMethod.GET, produces = {"application/xml"})
    public Vehicle getVehicle(@PathVariable int id) throws JAXBException, IOException, URISyntaxException {
        return VehicleDelegate.getVehicle(id);
    }

}
