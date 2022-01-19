package com.vinay.cicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdBasicAppApplicationTests {

	@Autowired
	private SmsController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}

}
