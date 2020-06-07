package com.example.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/instances/{applicationName}")
	public List<ServiceInstance> serviceInstanceByApplication(@PathVariable String applicationName){
		return this.discoveryClient.getInstances(applicationName);
	}

}
