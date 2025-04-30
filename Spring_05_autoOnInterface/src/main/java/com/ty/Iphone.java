package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Iphone implements Mobile{

	public void ringing() {
		System.out.println("Iphone is ringing");
	}

}
