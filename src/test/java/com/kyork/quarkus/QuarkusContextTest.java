package com.kyork.quarkus;

import io.quarkus.test.common.QuarkusTestResource;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@QuarkusTestResource(DbContainerRessource.class)
class QuarkusContextTest {
    @Test
    @SuppressWarnings("squid:S2699")
    void applicationContextLoads() {
        // Tester juste le chargement correct du contexte CDI
    }
}
