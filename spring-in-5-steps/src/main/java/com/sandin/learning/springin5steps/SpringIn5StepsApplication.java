package com.sandin.learning.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgoritm());

		//Sprint context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearchImpl=  applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int [] {12,4,6},3);

		System.out.println(result);

	}


}
