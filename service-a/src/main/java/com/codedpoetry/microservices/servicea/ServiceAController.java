package com.codedpoetry.microservices.servicea;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

	private static final Logger logger = LoggerFactory.getLogger(ServiceAController.class);


	@RequestMapping(method = RequestMethod.GET, value = "/person")
	public Person ping(HttpServletRequest request) {

		logger.debug("got a request!");
		return new Person("Dave");
	}
}
