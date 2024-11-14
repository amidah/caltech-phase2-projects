package com.estore.app;

// Only public or default access modifiers are permitted with class but not the private or protected

// public class - entire java project visibility
public class One {

	// we can have all the access modifiers before the class attributes
	private int a;
	int b;
	protected int c;
	public int d;
	
	// we can have all the access modifiers before the class functions
	private void showPrivate() {
		System.out.println("[One] This is a private function");
	}
	
	void showDefault() {
		System.out.println("[One] This is a default function");
	}
	
	protected void showProtected() {
		System.out.println("[One] This is a protected function");
	}
	
	public void showPublic() {
		System.out.println("[One] This is a public function");
	}
	
}

// default class - only visible inside the package in which it is created
class Two{
	// we can have all the access modifiers before the class attributes
		private int a;
		int b;
		protected int c;
		public int d;
		
		// we can have all the access modifiers before the class functions
		private void showPrivate() {
			System.out.println("[Two] This is a private function");
		}
		
		void showDefault() {
			System.out.println("[Two] This is a default function");
		}
		
		protected void showProtected() {
			System.out.println("[Two] This is a protected function");
		}
		
		public void showPublic() {
			System.out.println("[Two] This is a public function");
		}
}

// Not permitted
//private class Three{
//	
//}

// Not permitted
//protected class Four{
//	
//}