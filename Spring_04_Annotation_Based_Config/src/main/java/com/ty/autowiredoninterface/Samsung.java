package com.ty.autowiredoninterface;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile {

	public void ringing() {
		System.out.println("Samsung is ringing");
	}

}
