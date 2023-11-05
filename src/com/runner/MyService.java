package com.runner;

import org.apache.logging.log4j.Logger;
import com.main.LoggerConfiguration;

public class MyService {
	
	private Logger LOGGER = LoggerConfiguration.Configurator(MyService.class.getName());
	
	public void method1() {
		int a = 1;
		LOGGER.info("inside method1():: a: [{}]",a);
	}
	
	public void method2() {
		int b = 2;
		LOGGER.info("inside method1():: b: [{}]",b);
	}
	
	public void method3() {
		int c = 3;
		LOGGER.info("inside method1():: c: [{}]",c);
	}
	
	public void method4() {
		int d = 4;
		LOGGER.info("inside method1():: d: [{}]",d);
	}
	
	public void method5() {
		int e = 5;
		LOGGER.info("inside method1():: e: [{}]",e);
	}
	

	public static void main(String[] args) {
		
		MyService myService = new MyService();	
		myService.method1();
		myService.method2();
		myService.method3();
		myService.method4();
		myService.method5();	
		
	}
}
