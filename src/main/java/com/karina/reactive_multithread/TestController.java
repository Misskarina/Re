package com.karina.reactive_multithread;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/sleep")
	public String test() throws InterruptedException
	//syncronised program
	{
	   for (int n=0;n<=10;n++)
	   {
		   System.out.println("n is"+n);
		   Thread.sleep(2000);
	   }
	   return "after thread";
	}

}
