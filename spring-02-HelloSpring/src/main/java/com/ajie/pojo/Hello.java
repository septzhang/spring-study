package com.ajie.pojo;

/**
 * @author Sept Zhang
 * @create 2021-05-06 14:15
 */
public class Hello {
	private String string;

	public Hello() {
		System.out.println("这是无参构造");
	}

	public void getStr(){
		System.out.println("String:"+string);
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
