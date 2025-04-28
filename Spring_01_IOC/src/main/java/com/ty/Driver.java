package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("config.xml");

		// core container
		BeanFactory factory = new XmlBeanFactory(resource);//Deprecated

		Person person = (Person) factory.getBean("myPerson");

		person.play();
	}
}
