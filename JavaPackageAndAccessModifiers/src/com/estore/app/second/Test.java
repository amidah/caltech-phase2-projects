package com.estore.app.second;

import com.estore.app.App;
import com.estore.app.One;
//import com.estore.app.Two; we can't import the default java class in another package

public class Test{

	public static void main(String[] args) {
		
		App app = new App();
		
		One one = new One();
		
		System.out.println(one.d);
		
		one.showPublic();
		
		//Two two = new Two(); we can't create a default class ref, and object in another package

	}

}
