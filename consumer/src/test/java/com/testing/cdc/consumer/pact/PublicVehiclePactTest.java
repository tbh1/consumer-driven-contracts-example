package com.testing.cdc.consumer.pact;

import au.com.dius.pact.consumer.*;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.PactFragment;
import com.testing.cdc.consumer.ConsumerApp;
import com.testing.cdc.consumer.delegate.VehicleDelegate;
import com.testing.cdc.consumer.model.PublicVehicle;
import com.testing.cdc.consumer.util.FileUtils;
import org.apache.http.entity.ContentType;
import org.junit.Rule;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

/**
 * Created by ted on 11/16/15.
 */
public class PublicVehiclePactTest {
    @Rule
    public PactProviderRule rule = new PactProviderRule("VehicleProvider", "localhost", 8080, this);

    @Pact(consumer="PublicVehicleConsumer")
    public PactFragment createFragment(PactDslWithProvider builder) {
        Map<String, String> headers = new HashMap<String, String>();

        // headers.put("Accept", "application/xml");
        // headers.put("Accept", "application/json");

        String responseBody = null;
        try {
            responseBody = FileUtils.getInputFromFile(ConsumerApp.class
                    .getClassLoader()
                   .getResource("expectedVehicleResponse.xml").toURI());
                    // .getResource("expectedVehicleResponse.json").toURI());
        } catch (IOException|URISyntaxException e) {
            e.printStackTrace();
        }

        return builder
                // .given("Some state")
                .uponReceiving("a request for the public vehicle")
                    .path("/vehicle/1")
                    .method("GET")
                    .headers(headers)
                .willRespondWith()
                    .status(200)
                    .matchHeader("Content-Type", "^.*xml.*$")
                    .body(responseBody, ContentType.APPLICATION_XML)
                    // .body(responseBody, ContentType.APPLICATION_JSON)
                .toFragment();
    }

    @Test
    @PactVerification
    public void runTest() throws JAXBException {
        String input = null;
        try {
            input = FileUtils.getInputFromFile(ConsumerApp.class
                    .getClassLoader()
                    .getResource("expectedVehicleResponse.xml").toURI());
        } catch (IOException|URISyntaxException e) {
            e.printStackTrace();
        }
        JAXBContext jaxbContext = JAXBContext.newInstance(PublicVehicle.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(input);
        Object obj = unmarshaller.unmarshal(reader);
        PublicVehicle expected = (PublicVehicle) obj;

        PublicVehicle actual = VehicleDelegate.getPublicVehicle(1);
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getColor(), actual.getColor());
        assertEquals(expected.getConfiguration(), actual.getConfiguration());
        // all other fields this consumer requires
    }
}
