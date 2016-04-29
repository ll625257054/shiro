package com.atguigu.exer;

public class C extends B implements A{
	
	public static void main(String[] args) {
		A a = new C();
		System.out.println(new B().x);
		System.out.println(a.x);
	}
}

interface A{
	int x = 0;
}

class B{
	int x = 1;
}
