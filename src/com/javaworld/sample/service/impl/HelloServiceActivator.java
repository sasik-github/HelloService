package com.javaworld.sample.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.javaworld.sample.helloservice.HelloService;
import com.javaworld.sample.helloservice.HelloServiceFactory;

public class HelloServiceActivator implements BundleActivator{
	ServiceRegistration helloServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		HelloServiceFactory helloServiceFactory = new HelloServiceFactory();
		helloServiceRegistration = context.registerService(HelloService.class.getName(), helloServiceFactory, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		helloServiceRegistration.unregister();
	}
	
	
}
