package com.hanbit.spring.sample;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {

	public void printName(){
		System.out.println(getClass().getName());
	}
}
