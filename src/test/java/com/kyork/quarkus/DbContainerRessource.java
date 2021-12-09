package com.kyork.quarkus;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

import java.util.Map;

public class DbContainerRessource implements QuarkusTestResourceLifecycleManager {
    private static final MySQLContainer<?> MYSQL_CONTAINER;

    static {
        MYSQL_CONTAINER = new MySQLContainer<>(DockerImageName.parse("mysql:5.6"))
                .withDatabaseName("foo")
                .withInitScript("init_db.sql");
    }

    @Override
    public Map<String, String> start() {
        MYSQL_CONTAINER.start();
        return Map.of();
    }

    @Override
    public void stop() {
        MYSQL_CONTAINER.stop();
    }

}
