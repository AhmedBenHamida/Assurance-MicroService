package tn.isi.spring;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/assurance/**")
                        .uri("lb://assurance")
                        )  .route(r -> r.path("/api/assurance/**")
                                .uri("lb://api/assurance")
                                )
               
                .build();
    }

}