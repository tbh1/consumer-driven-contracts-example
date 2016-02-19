package com.testing.cdc.producer.delegate;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.runner.RunWith;

/**
 * Created by ted on 2/19/16.
 */
@RunWith(PactRunner.class)
@Provider("VehicleProvider")
@PactBroker(host = "local.dm", port = 80)
public class TestPactConsumers {

    @TestTarget
    public final Target target = new HttpTarget(8080);

}
