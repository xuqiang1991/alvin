package com.alvin.demo;

import com.alvin.demo.service.TsetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	TsetService tsetService;

	@Test
	public void contextLoads() {
		tsetService.selsetOne();
	}

}
