package com.info.bean;

public class My2 extends RuntimeException{
	private final String msg="too old";

	@Override
	public String toString() {
		return "My2 [msg=" + msg + "]";
	}
	
}
