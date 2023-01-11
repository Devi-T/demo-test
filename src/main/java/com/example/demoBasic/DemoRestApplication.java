package com.example.demoBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;

import com.example.demoBasic.subProject1.Test1;
import com.example.demoBasic.subProject1.Test2;
import com.example.main.ExternalTestClass;

@SpringBootApplication 
@ComponentScan({"com.example.main","com.example.demoBasic"})
public class DemoRestApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DemoRestApplication.class, args);
		Test1 msg = context.getBean(Test1.class);
		Test2 msg2 = context.getBean(Test2.class);
		ExternalTestClass msg1 = context.getBean(ExternalTestClass.class);
		msg.method1();
		msg2.method1();
		msg1.getPath();
		String s = SpringVersion.getVersion();
		System.out.println("spring version"+ s );
		
	}

}
