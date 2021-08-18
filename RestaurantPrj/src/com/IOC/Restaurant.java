package com.IOC;

//package com.IOC;

public class Restaurant {
	iHotDrink h;

	public void serve() {
		h.serving();
	}

	Restaurant(iHotDrink h) {
		this.h=h;
	}
}
