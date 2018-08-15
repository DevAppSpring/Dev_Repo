package com.devappspring.microservices.limitsservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limitservices")
public class LimitServiceController {

	@RequestMapping("/limitcheck")
	public LimitServiceData getLimitData(){
		
		return new LimitServiceData(1000,99);
	}
}
