package com.testing.cdc.producer.delegate;

import com.testing.cdc.producer.ProducerApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by ted on 11/16/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProducerApp.class)
@WebAppConfiguration
public class VehicleDelegateTest {

    @Test
    public void testGetVehicle() {
        int id = 1;

    }

}
