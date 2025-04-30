package com.ty;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Samsung implements Mobile {

	public void ringing() {
		System.out.println("Samsung is ringing");
	}
}
