package com.hanbit.spring.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstBean {

	private int value;
		
		public int getValue(){
		return  value++;}
		
	private SecondBean secondBean;
	
	@Autowired
	public void setSecontBean (SecondBean secondBean)
	{
		this.secondBean = secondBean;
	}
	
	public void callSecond() {
		secondBean.printName();
	}
		
	
	
}
