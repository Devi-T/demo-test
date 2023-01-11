package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExternalTestClass {
	@Autowired
	Book book;
	
	public void getPath() {
		System.out.print("external package......");
		book.getBook();
	}
	

}
