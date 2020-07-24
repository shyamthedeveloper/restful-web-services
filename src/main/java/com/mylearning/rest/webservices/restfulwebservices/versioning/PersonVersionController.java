package com.mylearning.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {
	
	@GetMapping("/V1/person")
	public PersonV1 retrievePersonV1() {
		return new PersonV1("Shyam Chincholkar");
	}

	@GetMapping("/V2/person")
	public PersonV2 retrievePersonV2() {
		return new PersonV2(new Name("Shyam", "Chincholkar"));
	}
	
	
	//using params
	/**
	 * @GetMapping("/person/params, params="version=1") //pasa as param
	 * @GetMapping("/person/params, params="version=2")
	 */
	//using headers
	/**
	 * @GetMapping("/person/headers, headers="X-API-VERSIOn=1") //pass as X-API-VERSION=1
	 * @GetMapping("/person/headers, headers="X-API-VERSIOn=2")
	 */
	//using  produces
	/**
	 * @GetMapping("/person/produces, produces="application/vnd.company.app-v1+json")  //pass as Accept =
	 * @GetMapping("/person/produces, produces="application/vnd.company.app-v2+json")
	 */
}
