package com.hanbit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hanbit.spring.sample.FirstBean;

public class HelloSpring {

	public static void main(String[] args)
	{
		//어플리케이션 콘텍스트는 인터페이스이므로 객체 생성시 구현클래스로 생성해야함
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-core.xml");
		
		FirstBean oldBean = new FirstBean();
		FirstBean oldBean2 = new FirstBean();
		
		System.out.println(oldBean.getValue());
		System.out.println(oldBean2.getValue());
		
		FirstBean springBean = applicationContext.getBean(FirstBean.class);
		FirstBean springBean2 = applicationContext.getBean(FirstBean.class);
		
		System.out.println(springBean.getValue());
		System.out.println(springBean2.getValue());
		
		
		
		FirstBean springBean3 = applicationContext.getBean(FirstBean.class);
		springBean3.callSecond();
		
		
	}
}
