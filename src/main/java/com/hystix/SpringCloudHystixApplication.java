package com.hystix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableTurbineStream
@EnableDiscoveryClient
@RestController
public class SpringCloudHystixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystixApplication.class, args);
	}

	@HystrixCommand(fallbackMethod = "defaultStores")
	@RequestMapping(value = "/stores", method = RequestMethod.GET)
	public Object getStores() {

		throw new RuntimeException();

	}

	@RequestMapping(value = "/newStores", method = RequestMethod.GET)
	public Object defaultStores() {
		return "Success";
	}
}
