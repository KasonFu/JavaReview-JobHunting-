package com.interfaceTest;
public class Lowercase implements changeCase {
	String a;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	@Override
	public String change() {
		// TODO Auto-generated method stub
		return a.toLowerCase();
	}

}
