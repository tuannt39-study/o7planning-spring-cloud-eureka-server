package vn.its.o7planningspringcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class O7planningSpringCloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(O7planningSpringCloudEurekaServerApplication.class, args);
    }
}
