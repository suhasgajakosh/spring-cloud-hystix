/*package com.hystix.store;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class StoreIntegration {

	@HystrixCommand(fallbackMethod = "defaultStores")
	@RequestMapping("/stores")
    public Object getStores() {
		
		return null;
    }

	@RequestMapping("/newStores")
    public Object defaultStores() {
        return "Success";
    }	
	
}
*/