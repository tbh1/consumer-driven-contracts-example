package com.testing.cdc.producer.delegate;

import com.testing.cdc.producer.ProducerApp;
import com.testing.cdc.producer.model.Vehicle;
import com.testing.cdc.producer.util.FileUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by ted on 11/16/15.
 */
public class VehicleDelegate {

    public static Vehicle getVehicle(int id) throws JAXBException, URISyntaxException, IOException {
//        InputStream inputStream =
//            VehicleDelegate.class.getClassLoader().getResourceAsStream("/resources/sampleVehicle.xml");
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream));
//        String input = readBigStringIn(buffer);
         String input = FileUtils.getInputFromFile(ProducerApp.class
                 .getClassLoader()
                 .getResource("sampleVehicle.xml").toURI());

        JAXBContext jaxbContext = JAXBContext.newInstance(Vehicle.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(input);
        Vehicle vehicle = (Vehicle) unmarshaller.unmarshal(reader);
        vehicle.setId(id);
        return vehicle;
    }

    private static String readBigStringIn(BufferedReader buffIn) throws IOException {
        StringBuilder everything = new StringBuilder();
        String line;
        while( (line = buffIn.readLine()) != null) {
            everything.append(line);
        }
        return everything.toString();
    }
}
