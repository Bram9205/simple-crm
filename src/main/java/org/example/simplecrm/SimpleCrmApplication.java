package org.example.simplecrm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to run the application.
 */
@SuppressWarnings({"checkstyle:HideUtilityClassConstructor", "PMD.UseUtilityClass"})
@SpringBootApplication
public class SimpleCrmApplication {

    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleCrmApplication.class);

    /**
     * Main method to run the application.
     */
    public static void main(final String[] args) {
        LOGGER.info("--------------Bootstrapping begins...--------------");
        SpringApplication.run(SimpleCrmApplication.class, args);
    }
}
