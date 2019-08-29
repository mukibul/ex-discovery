package com.example.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mukibul
 * @since 23/08/2019
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class DiscoveryStarter {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DiscoveryStarter.class).web(WebApplicationType.SERVLET).run(args);
    }
}
