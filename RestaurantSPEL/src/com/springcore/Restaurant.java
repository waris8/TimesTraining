package com.springcore;

import org.springframework.stereotype.Component;

//package com.IOC;
@Component
public class Restaurant {
	iHotDrink h;

	public void serve() {
		h.serving();
	}

	Restaurant(iHotDrink h) {
		this.h=h;
	}
}
