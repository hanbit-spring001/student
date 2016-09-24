package com.hanbit.spring.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") 이걸 쓰면 싱글톤이 해제됨.(매번 객체 생성)
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
		System.out.println(value++);
		secondBean.printName();
	}
		
	
	
}
