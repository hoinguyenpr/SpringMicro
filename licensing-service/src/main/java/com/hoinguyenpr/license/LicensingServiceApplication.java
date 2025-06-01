package com.hoinguyenpr.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * The type Licensing service application.
 */
@SpringBootApplication
@RefreshScope
public class LicensingServiceApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
		SpringApplication.run(LicensingServiceApplication.class, args);
	}

}
