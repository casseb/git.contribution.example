package com.example.gitExample.execute;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Test1 {
	
	Test2 test2 = new Test2();

	@PostConstruct
	public void inicio() {
		System.out.println("By Casseb----------------------->>>>>>>>>>>>>>>>");
		System.out.println("Comandos sendo executados");
		sayHi();
		sayHello();
		test2.saySpringsRock();
		test2.sayiLoveJava();
		System.out.println("Finalizandos os comandos");
		System.out.println("By Casseb----------------------->>>>>>>>>>>>>>>>");
	}
	
	public void sayHi() {
		System.out.println("Hi");
	}
	
	
	public void sayHello() {
		System.out.println("Hello");
	}
}
