package com.commons;


import org.junit.Test;


public class StrKitTest {

	@Test
	public void testIsBlank(){
		String str = "http://localhost:8080/ssh/listUsersByPage?pageNumber=2";
		str = str.substring(0, str.lastIndexOf("pageNumber="));
		System.out.println(str);
	}
	@Test
	public void testIsNotBlank(){
		boolean bl = StrKit.notBlank("");
		System.out.println(bl);
	}
	@Test
	public void testJoin(){
		String a = StrKit.join(new String[]{"hello","fuck"});
		System.out.println(a);
	}
	@Test
	public void testJoin2(){
		String a = StrKit.join(new String[]{"hello","fuck"},"&");
		System.out.println(a);
	}
	@Test
	public void testUuid(){
		System.out.println(StrKit.uuid());
	}
}
