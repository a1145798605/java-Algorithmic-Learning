package com.fulan.ioc;

public class TestBean {

	private int id;
	private String name;
	private Integer sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "TestBean [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	public TestBean(int id, String name, Integer sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public TestBean() {
		super();
	}
	
}
