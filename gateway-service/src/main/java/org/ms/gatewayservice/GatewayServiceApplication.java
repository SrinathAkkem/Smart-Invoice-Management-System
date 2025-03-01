package org.ms.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {
//	@Bean
//	RouteLocator routeLocator (RouteLocatorBuilder
//	builder) {
//	return builder.routes()
//	.route(r -> r
//	.path("/clients/**")
//	.uri("lb://CLIENT-SERVICE"))
//	.route(r -> r
//	.path("/produits/**")
//	.uri("lb://PRODUIT-SERVICE"))
//	.build();
//	}
	@Bean
	DiscoveryClientRouteDefinitionLocator definitionLocator
	(ReactiveDiscoveryClient rdc , DiscoveryLocatorProperties dlp)
	{
	return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
	}
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

}
