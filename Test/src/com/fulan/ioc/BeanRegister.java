package com.fulan.ioc;


public class BeanRegister {

	public TestBean getBean(){
		return new TestBean(1,"123",1);
	}
}
